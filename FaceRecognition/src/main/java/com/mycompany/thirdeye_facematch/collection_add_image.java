package com.mycompany.thirdeye_facematch;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;
import com.amazonaws.services.rekognition.model.FaceRecord;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.IndexFacesRequest;
import com.amazonaws.services.rekognition.model.IndexFacesResult;
import com.amazonaws.services.rekognition.model.S3Object;

import java.io.File;
import java.util.List;

public class collection_add_image {
    public static final String collectionId = "Records"; // your existing collection
    public static final String bucket = "final-project-bucket-suhas"; // your S3 bucket (us-east-1)
    public static final String localFolder =
            "C:\\Users\\SUHAS D S\\Desktop\\project\\Project Code (forensic face sketch)\\Project Code (forensic face sketch)\\ThirdEye_FaceMatch\\src\\main\\java\\com\\mycompany\\thirdeye_facematch\\faces";

    public static void main(String[] args) throws Exception {

        AmazonRekognition rekognitionClient = AmazonRekognitionClientBuilder.standard()
                .withRegion(Regions.US_EAST_1) // make sure region matches your bucket
                .build();

        File folder = new File(localFolder);
        File[] files = folder.listFiles((dir, name) ->
                name.toLowerCase().endsWith(".jpg") ||
                name.toLowerCase().endsWith(".jpeg") ||
                name.toLowerCase().endsWith(".png"));

        if (files == null || files.length == 0) {
            System.out.println("⚠️ No images found in local folder: " + localFolder);
            return;
        }

        for (File file : files) {
            String fileName = file.getName();
            System.out.println("\n📸 Indexing image: " + fileName);

            // Rekognition indexes the file from S3 — fileName must already exist in the bucket
            Image image = new Image()
                    .withS3Object(new S3Object()
                            .withBucket(bucket)
                            .withName(fileName));

            IndexFacesRequest request = new IndexFacesRequest()
                    .withImage(image)
                    .withCollectionId(collectionId)
                    .withExternalImageId(fileName)
                    .withDetectionAttributes("DEFAULT");

            try {
                IndexFacesResult result = rekognitionClient.indexFaces(request);
                List<FaceRecord> faceRecords = result.getFaceRecords();
                if (faceRecords.isEmpty()) {
                    System.out.println("   ⚠️ No face detected in " + fileName);
                } else {
                    faceRecords.forEach(record -> {
                        System.out.println("   ✅ Face indexed: " + record.getFace().getFaceId());
                        System.out.println("      Location: " + record.getFaceDetail().getBoundingBox());
                    });
                }
            } catch (Exception e) {
                System.out.println("   ❌ Failed to index " + fileName + " : " + e.getMessage());
            }
        }

        System.out.println("\n✅ Finished indexing all images from folder.");
    }
}
