 package thirdeye.v2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class MenuController implements Initializable {

    @FXML
    private Rectangle sketch;
    @FXML
    private Rectangle upload;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @FXML
private void sketch(MouseEvent event) {
    try {
        System.out.println("Sketch button clicked"); // Debug line
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Sketch Dashboard");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    } catch (IOException e) {
        e.printStackTrace(); // show any error in console
    }
}


  @FXML
private void upload(MouseEvent event) {
    try {
        // Path to your FaceMatch JAR file
        String jarPath = "C:\\Users\\SUHAS D S\\Desktop\\New folder\\Project forensic\\ThirdEye_FaceMatch\\target\\ThirdEye_FaceMatch-1.0-SNAPSHOT.jar";

        // Command to run the JAR's main class
        ProcessBuilder pb = new ProcessBuilder(
            "java", "-cp", jarPath, "com.mycompany.thirdeye_facematch.face_rekognition"
        );
        pb.inheritIO(); // shows console output
        pb.start();

        // Close current window
        ((Node)(event.getSource())).getScene().getWindow().hide();

    } catch (Exception e) {
        e.printStackTrace();
    }
}



}