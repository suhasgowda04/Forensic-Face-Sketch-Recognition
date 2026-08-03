 package thirdeye.v2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Upload_sketchController implements Initializable {

    @FXML
    private Button btnDummy;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize if needed
    }

    @FXML
    private void onDummyClick() {
        System.out.println("✅ Upload Sketch window is working.");
}
}