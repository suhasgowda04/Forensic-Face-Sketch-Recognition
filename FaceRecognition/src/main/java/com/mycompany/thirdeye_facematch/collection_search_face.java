package com.mycompany.thirdeye_facematch;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;
import com.amazonaws.services.rekognition.model.FaceMatch;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.services.rekognition.model.SearchFacesByImageRequest;
import com.amazonaws.services.rekognition.model.SearchFacesByImageResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class collection_search_face {
    public static final String collectionId = "Records";
    public static final String bucket = "final-project-bucket-suhas";
    public static final String photo = "f1-003-01-sz1.jpg"; // <-- your sketch file name in S3

    public static void main(String[] args) throws Exception {

        // ✅ Explicitly set region to match your bucket
        AmazonRekognition rekognitionClient = AmazonRekognitionClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .build();

        ObjectMapper objectMapper = new ObjectMapper();

        // Build image object from S3
        Image image = new Image()
                .withS3Object(new S3Object()
                        .withBucket(bucket)
                        .withName(photo));

        // Search for similar faces
        SearchFacesByImageRequest searchFacesByImageRequest = new SearchFacesByImageRequest()
                .withCollectionId(collectionId)
                .withImage(image)
                .withFaceMatchThreshold(70F)  // 70% similarity threshold
                .withMaxFaces(2);

        System.out.println("🔍 Searching for matches for: " + photo);
        SearchFacesByImageResult searchFacesByImageResult = rekognitionClient.searchFacesByImage(searchFacesByImageRequest);

        List<FaceMatch> faceImageMatches = searchFacesByImageResult.getFaceMatches();

        if (faceImageMatches.isEmpty()) {
            System.out.println("❌ No matches found for " + photo);
        } else {
            System.out.println("✅ Matches found:");
            for (FaceMatch face : faceImageMatches) {
                System.out.println(objectMapper.writerWithDefaultPrettyPrinter()
                        .writeValueAsString(face));
            }
        }
    }
}
