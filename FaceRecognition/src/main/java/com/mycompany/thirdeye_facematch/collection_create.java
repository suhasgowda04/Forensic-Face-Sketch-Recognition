package com.mycompany.thirdeye_facematch;

import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;
import com.amazonaws.services.rekognition.model.CreateCollectionRequest;
import com.amazonaws.services.rekognition.model.CreateCollectionResult;
import com.amazonaws.regions.Regions;

public class collection_create {
    public static void main(String[] args) {
        // ✅ Always specify the correct region where your bucket/collection should exist
        AmazonRekognition rekognitionClient = AmazonRekognitionClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)  // Your bucket is in us-east-1 (N. Virginia)
                .build();

        String collectionId = "Records"; // Name of the collection

        System.out.println("Creating collection: " + collectionId);

        try {
            CreateCollectionRequest request = new CreateCollectionRequest()
                    .withCollectionId(collectionId);

            CreateCollectionResult createCollectionResult = rekognitionClient.createCollection(request);

            System.out.println("CollectionArn : " + createCollectionResult.getCollectionArn());
            System.out.println("Status code   : " + createCollectionResult.getStatusCode());
        } catch (Exception e) {
            System.out.println("Error creating collection: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
