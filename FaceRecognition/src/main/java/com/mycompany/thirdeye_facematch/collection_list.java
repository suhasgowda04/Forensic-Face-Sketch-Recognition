package com.mycompany.thirdeye_facematch;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;
import com.amazonaws.services.rekognition.model.Face;
import com.amazonaws.services.rekognition.model.ListFacesRequest;
import com.amazonaws.services.rekognition.model.ListFacesResult;
import java.util.List;

public class collection_list {
    public static final String collectionId = "Records"; // Your collection name

    public static void main(String[] args) throws Exception {
        AmazonRekognition rekognitionClient = AmazonRekognitionClientBuilder.standard()
                .withRegion(Regions.US_EAST_1) // ✅ Explicitly set region
                .build();

        System.out.println("Faces in collection: " + collectionId);
        String paginationToken = null;

        do {
            ListFacesRequest request = new ListFacesRequest()
                    .withCollectionId(collectionId)
                    .withMaxResults(50) // ✅ Show 50 at a time
                    .withNextToken(paginationToken);

            ListFacesResult result = rekognitionClient.listFaces(request);
            List<Face> faces = result.getFaces();

            for (Face face : faces) {
                System.out.println("FaceId: " + face.getFaceId());
                System.out.println("ExternalImageId: " + face.getExternalImageId());
                System.out.println("-----------------------------------");
            }

            paginationToken = result.getNextToken();
        } while (paginationToken != null);
    }
}
