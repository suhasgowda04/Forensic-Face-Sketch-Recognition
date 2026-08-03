
package thirdeye.v2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class DashboardController implements Initializable {

    
    @FXML
    private ImageView eyeb_e_13;
    @FXML
    private ImageView eyeb_e_14;
    @FXML
    private ImageView eyeb_e_15;
    @FXML
    private ImageView eyeb_e_16;

    @FXML
    private ImageView eyeb_s_13;
    @FXML
    private ImageView eyeb_s_14;
    @FXML
    private ImageView eyeb_s_15;
    @FXML
    private ImageView eyeb_s_16;
    @FXML private ImageView eyeb_e_17;
    @FXML private ImageView eyeb_e_18;
    @FXML private ImageView eyeb_e_19;
    @FXML private ImageView eyeb_e_20;
    @FXML private ImageView eyeb_e_21;
    @FXML private ImageView eyeb_e_22;
    @FXML private ImageView eyeb_e_23;
    @FXML private ImageView eyeb_e_24;
    @FXML private ImageView eyeb_e_25;
    @FXML private ImageView eyeb_e_26;
    
    @FXML private ImageView eyeb_s_17;
    @FXML private ImageView eyeb_s_18;
    @FXML private ImageView eyeb_s_19;
    @FXML private ImageView eyeb_s_20;
    @FXML private ImageView eyeb_s_21;
    @FXML private ImageView eyeb_s_22;
    @FXML private ImageView eyeb_s_23;
    @FXML private ImageView eyeb_s_24;
    @FXML private ImageView eyeb_s_25;
    @FXML private ImageView eyeb_s_26;
    

    @FXML private ImageView eyes_s_21, eyes_s_22, eyes_s_23, eyes_s_24,
                       eyes_s_25, eyes_s_26, eyes_s_27;

    @FXML private ImageView eyes_e_21, eyes_e_22, eyes_e_23, eyes_e_24,
                       eyes_e_25, eyes_e_26, eyes_e_27;

    
    

    
    
    @FXML 
    private ImageView head_e_11;
    @FXML 
    private ImageView head_e_12;
    @FXML 
    private ImageView head_e_13;
    @FXML 
    private ImageView head_e_14;
    @FXML 
    private ImageView head_e_15;

    @FXML 
    private ImageView head_s_11;
    @FXML 
    private ImageView head_s_12;
    @FXML 
    private ImageView head_s_13;
    @FXML 
    private ImageView head_s_14;
    @FXML 
    private ImageView head_s_15;

    @FXML private ImageView hair_e_13;
    @FXML private ImageView hair_e_14;
    @FXML private ImageView hair_e_15;
    @FXML private ImageView hair_e_16;
    @FXML private ImageView hair_e_17;
    @FXML private ImageView hair_e_18;
    @FXML private ImageView hair_e_19;
    @FXML private ImageView hair_e_20;
    
    
    
    @FXML private ImageView head_e_16;
    @FXML private ImageView head_e_17;
    @FXML private ImageView head_e_18;
    @FXML private ImageView head_e_19;
    @FXML private ImageView head_e_20;
    @FXML private ImageView head_e_21;
    @FXML private ImageView head_e_22;
    @FXML private ImageView head_e_23;
    @FXML private ImageView head_e_24;
    @FXML private ImageView head_e_25;
    @FXML private ImageView head_e_26;
    @FXML private ImageView head_e_27;
    @FXML private ImageView head_e_28;
    @FXML private ImageView head_e_29;
    @FXML private ImageView head_e_30;
    @FXML private ImageView head_e_31;
    @FXML private ImageView head_e_32;
    @FXML private ImageView head_e_33;
    @FXML private ImageView head_e_34;
    @FXML private ImageView head_e_35;

    
    @FXML private ImageView head_s_16;
    @FXML private ImageView head_s_17;
    @FXML private ImageView head_s_18;
    @FXML private ImageView head_s_19;
    @FXML private ImageView head_s_20;
    @FXML private ImageView head_s_21;
    @FXML private ImageView head_s_22;
    @FXML private ImageView head_s_23;
    @FXML private ImageView head_s_24;
    @FXML private ImageView head_s_25;
    @FXML private ImageView head_s_26;
    @FXML private ImageView head_s_27;
    @FXML private ImageView head_s_28;
    @FXML private ImageView head_s_29;
    @FXML private ImageView head_s_30;
    @FXML private ImageView head_s_31;
    @FXML private ImageView head_s_32;
    @FXML private ImageView head_s_33;
    @FXML private ImageView head_s_34;
    @FXML private ImageView head_s_35;
   
    

   


    @FXML private ImageView hair_s_13;
    @FXML private ImageView hair_s_14;
    @FXML private ImageView hair_s_15;
    @FXML private ImageView hair_s_16;
    @FXML private ImageView hair_s_17;
    @FXML private ImageView hair_s_18;
    @FXML private ImageView hair_s_19;
    @FXML private ImageView hair_s_20;

    
    @FXML private ImageView eyes_e_13;
    @FXML private ImageView eyes_e_14;
    @FXML private ImageView eyes_e_15;
    @FXML private ImageView eyes_e_16;
    @FXML private ImageView eyes_e_17;
    @FXML private ImageView eyes_e_18;
    @FXML private ImageView eyes_e_19;
    @FXML private ImageView eyes_e_20;

    @FXML private ImageView eyes_s_13;
    @FXML private ImageView eyes_s_14;
    @FXML private ImageView eyes_s_15;
    @FXML private ImageView eyes_s_16;
    @FXML private ImageView eyes_s_17;
    @FXML private ImageView eyes_s_18;
    @FXML private ImageView eyes_s_19;
    @FXML private ImageView eyes_s_20;

    
    @FXML private ImageView lips_e_13;
    @FXML private ImageView lips_e_14;
    @FXML private ImageView lips_e_15;
    @FXML private ImageView lips_e_16;
    @FXML private ImageView lips_e_17;
    @FXML private ImageView lips_e_18;
    @FXML private ImageView lips_e_19;
    @FXML private ImageView lips_e_20;

    @FXML private ImageView lips_s_13;
    @FXML private ImageView lips_s_14;
    @FXML private ImageView lips_s_15;
    @FXML private ImageView lips_s_16;
    @FXML private ImageView lips_s_17;
    @FXML private ImageView lips_s_18;
    @FXML private ImageView lips_s_19;
    @FXML private ImageView lips_s_20;



    @FXML private ImageView nose_s_13;
    @FXML private ImageView nose_s_14;
    @FXML private ImageView nose_s_15;
    @FXML private ImageView nose_s_16;
    @FXML private ImageView nose_s_17;
    @FXML private ImageView nose_s_18;
    @FXML private ImageView nose_s_19;
    @FXML private ImageView nose_s_20;
    @FXML private ImageView nose_s_21;
    @FXML private ImageView nose_s_22;
    @FXML private ImageView nose_s_23;
    @FXML private ImageView nose_s_24;
    @FXML private ImageView nose_s_25;
    @FXML private ImageView nose_s_26;
    @FXML private ImageView nose_s_27;
    
    
    @FXML private ImageView more_e_7;
    @FXML private ImageView more_e_8;
    @FXML private ImageView more_e_9;
    @FXML private ImageView more_e_10;
    @FXML private ImageView more_e_11;
    @FXML private ImageView more_e_12;
    @FXML private ImageView more_e_13;
    @FXML private ImageView more_e_14;
    @FXML private ImageView more_e_15;
    @FXML private ImageView more_e_16;
    @FXML private ImageView more_e_17;
    @FXML private ImageView more_e_18;

    @FXML private ImageView more_s_7;
    @FXML private ImageView more_s_8;
    @FXML private ImageView more_s_9;
    @FXML private ImageView more_s_10;
    @FXML private ImageView more_s_11;
    @FXML private ImageView more_s_12;
    @FXML private ImageView more_s_13;
    @FXML private ImageView more_s_14;
    @FXML private ImageView more_s_15;
    @FXML private ImageView more_s_16;
    @FXML private ImageView more_s_17;
    @FXML private ImageView more_s_18;


    
    @FXML
    private ImageView nose_e_13;
    @FXML
    private ImageView nose_e_14;
    @FXML
    private ImageView nose_e_15;
    @FXML
    private ImageView nose_e_16;
    @FXML
    private ImageView nose_e_17;
    @FXML
    private ImageView nose_e_18;
    @FXML
    private ImageView nose_e_19;
    @FXML
    private ImageView nose_e_20;
    @FXML
    private ImageView nose_e_21;
    @FXML
    private ImageView nose_e_22;
    @FXML
    private ImageView nose_e_23;
    @FXML
    private ImageView nose_e_24;
    @FXML
    private ImageView nose_e_25;
    @FXML
    private ImageView nose_e_26;
    @FXML
    private ImageView nose_e_27;
    
    
    
    @FXML
    private AnchorPane guideline;
    @FXML
    private AnchorPane toolkit;
    @FXML
    private ImageView head;
    @FXML
    private ImageView hair;
    @FXML
    private ImageView eyes;
    @FXML
    private ImageView eyebrows;
    @FXML
    private ImageView nose;
    @FXML
    private ImageView lips;
    @FXML
    private ImageView mustach;
    @FXML
    private ImageView more;
    @FXML
    private ScrollPane elements_panel;
    @FXML
    private AnchorPane head_elements;
    @FXML
    private AnchorPane sketch;
    @FXML
    private AnchorPane menu_tab;
    @FXML
    private Rectangle save_btn;
    @FXML
    private Rectangle reset_btn;
    @FXML
    private Rectangle compare_btn;
    @FXML
    private AnchorPane element_anchor;
    @FXML
    private AnchorPane hair_elements;
    @FXML
    private AnchorPane eyes_elements;
    @FXML
    private AnchorPane eyebrows_elements;
    @FXML
    private AnchorPane nose_elements;
    @FXML
    private AnchorPane lips_elements;
    @FXML
    private AnchorPane mustach_elements;
    @FXML
    private AnchorPane more_elements;
    @FXML
    private ImageView head_e_1;
    @FXML
    private ImageView head_e_2;
    @FXML
    private ImageView hair_e_1;
    @FXML
    private ImageView hair_e_2;
    @FXML
    private ImageView eyes_e_1;
    @FXML
    private ImageView eyes_e_2;
    @FXML
    private ImageView eyeb_e_1;
    @FXML
    private ImageView eyeb_e_2;
    @FXML
    private ImageView nose_e_1;
    @FXML
    private ImageView nose_e_2;
    @FXML
    private ImageView lips_e_1;
    @FXML
    private ImageView lips_e_2;
    @FXML
    private ImageView must_e_1;
    @FXML
    private ImageView must_e_2;
    @FXML
    private ImageView more_e_1;
    @FXML
    private ImageView more_e_2;
    @FXML
    private AnchorPane alignment;
    @FXML
    private ImageView head_s_1;
    @FXML
    private ImageView head_s_2;
    @FXML
    private ImageView hair_s_1;
    @FXML
    private ImageView hair_s_2;
    @FXML
    private ImageView eyes_s_1;
    @FXML
    private ImageView eyes_s_2;
    @FXML
    private ImageView eyeb_s_1;
    @FXML
    private ImageView eyeb_s_2;
    @FXML
    private ImageView nose_s_1;
    @FXML
    private ImageView nose_s_2;
    @FXML
    private ImageView lips_s_1;
    @FXML
    private ImageView lips_s_2;
    @FXML
    private ImageView must_s_1;
    @FXML
    private ImageView must_s_2;
    @FXML
    private ImageView more_s_1;
    @FXML
    private ImageView more_s_2;
    @FXML
    private Rectangle head_del;
    @FXML
    private Rectangle hair_del;
    @FXML
    private Rectangle eyes_del;
    @FXML
    private Rectangle eyeb_del;
    @FXML
    private Rectangle nose_del;
    @FXML
    private Rectangle lips_del;
    @FXML
    private Rectangle must_del;
    @FXML
    private Rectangle more_del;
    @FXML
    private ImageView head_e_3;
    @FXML
    private ImageView head_e_4;
    @FXML
    private ImageView head_e_5;
    @FXML
    private ImageView head_e_6;
    @FXML
    private ImageView head_e_7;
    @FXML
    private ImageView head_e_8;
    @FXML
    private ImageView head_e_9;
    @FXML
    private ImageView head_e_10;
    @FXML
    private ImageView hair_e_3;
    @FXML
    private ImageView hair_e_4;
    @FXML
    private ImageView hair_e_5;
    @FXML
    private ImageView hair_e_6;
    @FXML
    private ImageView hair_e_7;
    @FXML
    private ImageView hair_e_8;
    @FXML
    private ImageView hair_e_9;
    @FXML
    private ImageView hair_e_10;
    @FXML
    private ImageView hair_e_11;
    @FXML
    private ImageView hair_e_12;
    @FXML
    private ImageView eyes_e_3;
    @FXML
    private ImageView eyes_e_4;
    @FXML
    private ImageView eyes_e_5;
    @FXML
    private ImageView eyes_e_6;
    @FXML
    private ImageView eyes_e_7;
    @FXML
    private ImageView eyes_e_8;
    @FXML
    private ImageView eyes_e_9;
    @FXML
    private ImageView eyes_e_10;
    @FXML
    private ImageView eyes_e_11;
    @FXML
    private ImageView eyes_e_12;
    @FXML
    private ImageView eyeb_e_3;
    @FXML
    private ImageView eyeb_e_4;
    @FXML
    private ImageView eyeb_e_5;
    @FXML
    private ImageView eyeb_e_6;
    @FXML
    private ImageView eyeb_e_7;
    @FXML
    private ImageView eyeb_e_8;
    @FXML
    private ImageView eyeb_e_9;
    @FXML
    private ImageView eyeb_e_10;
    @FXML
    private ImageView eyeb_e_11;
    @FXML
    private ImageView eyeb_e_12;
    @FXML
    private ImageView nose_e_3;
    @FXML
    private ImageView nose_e_4;
    @FXML
    private ImageView nose_e_5;
    @FXML
    private ImageView nose_e_6;
    @FXML
    private ImageView nose_e_7;
    @FXML
    private ImageView nose_e_8;
    @FXML
    private ImageView nose_e_9;
    @FXML
    private ImageView nose_e_10;
    @FXML
    private ImageView nose_e_11;
    @FXML
    private ImageView nose_e_12;
    @FXML
    private ImageView lips_e_3;
    @FXML
    private ImageView lips_e_4;
    @FXML
    private ImageView lips_e_5;
    @FXML
    private ImageView lips_e_6;
    @FXML
    private ImageView lips_e_7;
    @FXML
    private ImageView lips_e_8;
    @FXML
    private ImageView lips_e_9;
    @FXML
    private ImageView lips_e_10;
    @FXML
    private ImageView lips_e_11;
    @FXML
    private ImageView lips_e_12;
    @FXML
    private ImageView must_e_3;
    @FXML
    private ImageView must_e_4;
    @FXML
    private ImageView must_e_5;
    @FXML
    private ImageView must_e_6;
    @FXML
    private ImageView must_e_7;
    @FXML
    private ImageView must_e_8;
    @FXML
    private ImageView must_e_9;
    @FXML
    private ImageView must_e_10;
    @FXML
    private ImageView must_e_11;
    @FXML
    private ImageView must_e_12;
    @FXML
    private ImageView more_s_5;
    @FXML
    private ImageView more_s_6;
    @FXML
    private ImageView head_s_3;
    @FXML
    private ImageView head_s_4;
    @FXML
    private ImageView head_s_5;
    @FXML
    private ImageView head_s_6;
    @FXML
    private ImageView head_s_7;
    @FXML
    private ImageView head_s_8;
    @FXML
    private ImageView head_s_9;
    @FXML
    private ImageView head_s_10;
    @FXML
    private ImageView more_s_3;
    @FXML
    private ImageView more_s_4;
    @FXML
    private ImageView hair_s_3;
    @FXML
    private ImageView hair_s_4;
    @FXML
    private ImageView hair_s_5;
    @FXML
    private ImageView hair_s_6;
    @FXML
    private ImageView hair_s_7;
    @FXML
    private ImageView hair_s_8;
    @FXML
    private ImageView hair_s_9;
    @FXML
    private ImageView hair_s_10;
    @FXML
    private ImageView hair_s_11;
    @FXML
    private ImageView hair_s_12;
    @FXML
    private ImageView eyes_s_3;
    @FXML
    private ImageView eyes_s_4;
    @FXML
    private ImageView eyes_s_5;
    @FXML
    private ImageView eyes_s_6;
    @FXML
    private ImageView eyes_s_7;
    @FXML
    private ImageView eyes_s_8;
    @FXML
    private ImageView eyes_s_9;
    @FXML
    private ImageView eyes_s_10;
    @FXML
    private ImageView eyes_s_11;
    @FXML
    private ImageView eyes_s_12;
    @FXML
    private ImageView eyeb_s_3;
    @FXML
    private ImageView eyeb_s_4;
    @FXML
    private ImageView eyeb_s_5;
    @FXML
    private ImageView eyeb_s_6;
    @FXML
    private ImageView eyeb_s_7;
    @FXML
    private ImageView eyeb_s_8;
    @FXML
    private ImageView eyeb_s_9;
    @FXML
    private ImageView eyeb_s_10;
    @FXML
    private ImageView eyeb_s_11;
    @FXML
    private ImageView eyeb_s_12;
    @FXML
    private ImageView nose_s_3;
    @FXML
    private ImageView nose_s_4;
    @FXML
    private ImageView nose_s_5;
    @FXML
    private ImageView nose_s_6;
    @FXML
    private ImageView nose_s_7;
    @FXML
    private ImageView nose_s_8;
    @FXML
    private ImageView nose_s_9;
    @FXML
    private ImageView nose_s_10;
    @FXML
    private ImageView nose_s_11;
    @FXML
    private ImageView nose_s_12;
    @FXML
    private ImageView lips_s_3;
    @FXML
    private ImageView lips_s_4;
    @FXML
    private ImageView lips_s_5;
    @FXML
    private ImageView lips_s_6;
    @FXML
    private ImageView lips_s_7;
    @FXML
    private ImageView lips_s_8;
    @FXML
    private ImageView lips_s_9;
    @FXML
    private ImageView lips_s_10;
    @FXML
    private ImageView lips_s_11;
    @FXML
    private ImageView lips_s_12;
    @FXML
    private ImageView must_s_3;
    @FXML
    private ImageView must_s_4;
    @FXML
    private ImageView must_s_5;
    @FXML
    private ImageView must_s_6;
    @FXML
    private ImageView must_s_7;
    @FXML
    private ImageView must_s_8;
    @FXML
    private ImageView must_s_9;
    @FXML
    private ImageView must_s_10;
    @FXML
    private ImageView must_s_11;
    @FXML
    private ImageView must_s_12;
    @FXML
    private ImageView more_e_3;
    @FXML
    private ImageView more_e_4;
    @FXML
    private ImageView more_e_5;
    @FXML
    private ImageView more_e_6;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //DECLARE DRAG AND MOVE TO FX:ID
        dragSketch();
    }    
    
    //DRAG AND MOVE CODE Class
    public void drag(MouseEvent event) {
        Node n = (Node)event.getSource();
        n.setTranslateX(n.getTranslateX() + event.getX());
        n.setTranslateY(n.getTranslateY() + event.getY());
    }
    
    //Drag Event assigned to each fx:id in the canvas
    public void dragSketch() {
        if (head_s_1 != null) head_s_1.setOnMouseDragged(event -> drag(event));
        if (head_s_2 != null) head_s_2.setOnMouseDragged(event -> drag(event));
        if (head_s_3 != null) head_s_3.setOnMouseDragged(event -> drag(event));
        if (head_s_4 != null) head_s_4.setOnMouseDragged(event -> drag(event));
        if (head_s_5 != null) head_s_5.setOnMouseDragged(event -> drag(event));
        if (head_s_6 != null) head_s_6.setOnMouseDragged(event -> drag(event));
        if (head_s_7 != null) head_s_7.setOnMouseDragged(event -> drag(event));
        if (head_s_8 != null) head_s_8.setOnMouseDragged(event -> drag(event));
        if (head_s_9 != null) head_s_9.setOnMouseDragged(event -> drag(event));
        if (head_s_10 != null) head_s_10.setOnMouseDragged(event -> drag(event));
        if (head_s_11 != null) head_s_11.setOnMouseDragged(event -> drag(event));
        if (head_s_12 != null) head_s_12.setOnMouseDragged(event -> drag(event));
        if (head_s_13 != null) head_s_13.setOnMouseDragged(event -> drag(event));
        if (head_s_14 != null) head_s_14.setOnMouseDragged(event -> drag(event));
        if (head_s_15 != null) head_s_15.setOnMouseDragged(event -> drag(event));
        if (head_s_16 != null) head_s_16.setOnMouseDragged(event -> drag(event));
        if (head_s_17 != null) head_s_17.setOnMouseDragged(event -> drag(event));
        if (head_s_18 != null) head_s_18.setOnMouseDragged(event -> drag(event));
        if (head_s_19 != null) head_s_19.setOnMouseDragged(event -> drag(event));
        if (head_s_20 != null) head_s_20.setOnMouseDragged(event -> drag(event));
        if (head_s_21 != null) head_s_21.setOnMouseDragged(event -> drag(event));
        if (head_s_22 != null) head_s_22.setOnMouseDragged(event -> drag(event));
        if (head_s_23 != null) head_s_23.setOnMouseDragged(event -> drag(event));
        if (head_s_24 != null) head_s_24.setOnMouseDragged(event -> drag(event));
        if (head_s_25 != null) head_s_25.setOnMouseDragged(event -> drag(event));
        if (head_s_26 != null) head_s_26.setOnMouseDragged(event -> drag(event));
        if (head_s_27 != null) head_s_27.setOnMouseDragged(event -> drag(event));
        if (head_s_28 != null) head_s_28.setOnMouseDragged(event -> drag(event));
        if (head_s_29 != null) head_s_29.setOnMouseDragged(event -> drag(event));
        if (head_s_30 != null) head_s_30.setOnMouseDragged(event -> drag(event));
        if (head_s_31 != null) head_s_31.setOnMouseDragged(event -> drag(event));
        if (head_s_32 != null) head_s_32.setOnMouseDragged(event -> drag(event));
        if (head_s_33 != null) head_s_33.setOnMouseDragged(event -> drag(event));
        if (head_s_34 != null) head_s_34.setOnMouseDragged(event -> drag(event));
        if (head_s_35 != null) head_s_35.setOnMouseDragged(event -> drag(event));


             
        if (hair_s_1 != null) hair_s_1.setOnMouseDragged(event -> drag(event));
        if (hair_s_2 != null) hair_s_2.setOnMouseDragged(event -> drag(event));
        if (hair_s_3 != null) hair_s_3.setOnMouseDragged(event -> drag(event));
        if (hair_s_4 != null) hair_s_4.setOnMouseDragged(event -> drag(event));
        if (hair_s_5 != null) hair_s_5.setOnMouseDragged(event -> drag(event));
        if (hair_s_6 != null) hair_s_6.setOnMouseDragged(event -> drag(event));
        if (hair_s_7 != null) hair_s_7.setOnMouseDragged(event -> drag(event));
        if (hair_s_8 != null) hair_s_8.setOnMouseDragged(event -> drag(event));
        if (hair_s_9 != null) hair_s_9.setOnMouseDragged(event -> drag(event));
        if (hair_s_10 != null) hair_s_10.setOnMouseDragged(event -> drag(event));
        if (hair_s_11 != null) hair_s_11.setOnMouseDragged(event -> drag(event));
        if (hair_s_12 != null) hair_s_12.setOnMouseDragged(event -> drag(event));
        if (hair_s_13 != null) hair_s_13.setOnMouseDragged(event -> drag(event));
        if (hair_s_14 != null) hair_s_14.setOnMouseDragged(event -> drag(event));
        if (hair_s_15 != null) hair_s_15.setOnMouseDragged(event -> drag(event));
        if (hair_s_16 != null) hair_s_16.setOnMouseDragged(event -> drag(event));
        if (hair_s_17 != null) hair_s_17.setOnMouseDragged(event -> drag(event));
        if (hair_s_18 != null) hair_s_18.setOnMouseDragged(event -> drag(event));
        if (hair_s_19 != null) hair_s_19.setOnMouseDragged(event -> drag(event));
        if (hair_s_20 != null) hair_s_20.setOnMouseDragged(event -> drag(event));

        
        if (eyes_s_1 != null) eyes_s_1.setOnMouseDragged(event -> drag(event));
        if (eyes_s_2 != null) eyes_s_2.setOnMouseDragged(event -> drag(event));
        if (eyes_s_3 != null) eyes_s_3.setOnMouseDragged(event -> drag(event));
        if (eyes_s_4 != null) eyes_s_4.setOnMouseDragged(event -> drag(event));
        if (eyes_s_5 != null) eyes_s_5.setOnMouseDragged(event -> drag(event));
        if (eyes_s_6 != null) eyes_s_6.setOnMouseDragged(event -> drag(event));
        if (eyes_s_7 != null) eyes_s_7.setOnMouseDragged(event -> drag(event));
        if (eyes_s_8 != null) eyes_s_8.setOnMouseDragged(event -> drag(event));
        if (eyes_s_9 != null) eyes_s_9.setOnMouseDragged(event -> drag(event));
        if (eyes_s_10 != null) eyes_s_10.setOnMouseDragged(event -> drag(event));
        if (eyes_s_11 != null) eyes_s_11.setOnMouseDragged(event -> drag(event));
        if (eyes_s_12 != null) eyes_s_12.setOnMouseDragged(event -> drag(event));
        if (eyes_s_13 != null) eyes_s_13.setOnMouseDragged(event -> drag(event));
        if (eyes_s_14 != null) eyes_s_14.setOnMouseDragged(event -> drag(event));
        if (eyes_s_15 != null) eyes_s_15.setOnMouseDragged(event -> drag(event));
        if (eyes_s_16 != null) eyes_s_16.setOnMouseDragged(event -> drag(event));
        if (eyes_s_17 != null) eyes_s_17.setOnMouseDragged(event -> drag(event));
        if (eyes_s_18 != null) eyes_s_18.setOnMouseDragged(event -> drag(event));
        if (eyes_s_19 != null) eyes_s_19.setOnMouseDragged(event -> drag(event));
        if (eyes_s_20 != null) eyes_s_20.setOnMouseDragged(event -> drag(event));
        if (eyes_s_21 != null) eyes_s_21.setOnMouseDragged(event -> drag(event));
        if (eyes_s_22 != null) eyes_s_22.setOnMouseDragged(event -> drag(event));
        if (eyes_s_23 != null) eyes_s_23.setOnMouseDragged(event -> drag(event));
        if (eyes_s_24 != null) eyes_s_24.setOnMouseDragged(event -> drag(event));
        if (eyes_s_25 != null) eyes_s_25.setOnMouseDragged(event -> drag(event));
        if (eyes_s_26 != null) eyes_s_26.setOnMouseDragged(event -> drag(event));


        
        eyeb_s_1.setOnMouseDragged(event -> drag(event));
        eyeb_s_2.setOnMouseDragged(event -> drag(event));
        eyeb_s_3.setOnMouseDragged(event -> drag(event));
        eyeb_s_4.setOnMouseDragged(event -> drag(event));
        eyeb_s_5.setOnMouseDragged(event -> drag(event));
        eyeb_s_6.setOnMouseDragged(event -> drag(event));
        eyeb_s_7.setOnMouseDragged(event -> drag(event));
        eyeb_s_8.setOnMouseDragged(event -> drag(event));
        eyeb_s_9.setOnMouseDragged(event -> drag(event));
        eyeb_s_10.setOnMouseDragged(event -> drag(event));
        eyeb_s_11.setOnMouseDragged(event -> drag(event));
        eyeb_s_12.setOnMouseDragged(event -> drag(event));
        eyeb_s_13.setOnMouseDragged(event -> drag(event));
        eyeb_s_14.setOnMouseDragged(event -> drag(event));
        eyeb_s_15.setOnMouseDragged(event -> drag(event));
        eyeb_s_16.setOnMouseDragged(event -> drag(event));
        eyeb_s_17.setOnMouseDragged(event -> drag(event));
        eyeb_s_18.setOnMouseDragged(event -> drag(event));
        eyeb_s_19.setOnMouseDragged(event -> drag(event));
        eyeb_s_20.setOnMouseDragged(event -> drag(event));
        eyeb_s_21.setOnMouseDragged(event -> drag(event));
        eyeb_s_22.setOnMouseDragged(event -> drag(event));
        eyeb_s_23.setOnMouseDragged(event -> drag(event));
        eyeb_s_24.setOnMouseDragged(event -> drag(event));
        eyeb_s_25.setOnMouseDragged(event -> drag(event));
        eyeb_s_26.setOnMouseDragged(event -> drag(event));


        
        
        
        
        lips_s_1.setOnMouseDragged(event -> drag(event));
        lips_s_2.setOnMouseDragged(event -> drag(event));
        lips_s_3.setOnMouseDragged(event -> drag(event));
        lips_s_4.setOnMouseDragged(event -> drag(event));
        lips_s_5.setOnMouseDragged(event -> drag(event));
        lips_s_6.setOnMouseDragged(event -> drag(event));
        lips_s_7.setOnMouseDragged(event -> drag(event));
        lips_s_8.setOnMouseDragged(event -> drag(event));
        lips_s_9.setOnMouseDragged(event -> drag(event));
        lips_s_10.setOnMouseDragged(event -> drag(event));
        lips_s_11.setOnMouseDragged(event -> drag(event));
        lips_s_12.setOnMouseDragged(event -> drag(event));
        lips_s_13.setOnMouseDragged(e -> drag(e));
        lips_s_14.setOnMouseDragged(e -> drag(e));
        lips_s_15.setOnMouseDragged(e -> drag(e));
        lips_s_16.setOnMouseDragged(e -> drag(e));
        lips_s_17.setOnMouseDragged(e -> drag(e));
        lips_s_18.setOnMouseDragged(e -> drag(e));
        lips_s_19.setOnMouseDragged(e -> drag(e));
        lips_s_20.setOnMouseDragged(e -> drag(e));

        
        
        
        nose_s_1.setOnMouseDragged(event -> drag(event));
        nose_s_2.setOnMouseDragged(event -> drag(event));
        nose_s_3.setOnMouseDragged(event -> drag(event));
        nose_s_4.setOnMouseDragged(event -> drag(event));
        nose_s_5.setOnMouseDragged(event -> drag(event));
        nose_s_6.setOnMouseDragged(event -> drag(event));
        nose_s_7.setOnMouseDragged(event -> drag(event));
        nose_s_8.setOnMouseDragged(event -> drag(event));
        nose_s_9.setOnMouseDragged(event -> drag(event));
        nose_s_10.setOnMouseDragged(event -> drag(event));
        nose_s_11.setOnMouseDragged(event -> drag(event));
        nose_s_12.setOnMouseDragged(event -> drag(event));
        nose_s_13.setOnMouseDragged(event -> drag(event));
        nose_s_14.setOnMouseDragged(event -> drag(event));
        nose_s_15.setOnMouseDragged(event -> drag(event));
        nose_s_16.setOnMouseDragged(event -> drag(event));
        nose_s_17.setOnMouseDragged(event -> drag(event));
        nose_s_18.setOnMouseDragged(event -> drag(event));
        nose_s_19.setOnMouseDragged(event -> drag(event));
        nose_s_20.setOnMouseDragged(event -> drag(event));
        nose_s_21.setOnMouseDragged(event -> drag(event));
        nose_s_22.setOnMouseDragged(event -> drag(event));
        nose_s_23.setOnMouseDragged(event -> drag(event));
        nose_s_24.setOnMouseDragged(event -> drag(event));
        nose_s_25.setOnMouseDragged(event -> drag(event));
        nose_s_26.setOnMouseDragged(event -> drag(event));
        nose_s_27.setOnMouseDragged(event -> drag(event));

        
       
        
        must_s_1.setOnMouseDragged(event -> drag(event));
        must_s_2.setOnMouseDragged(event -> drag(event));
        must_s_3.setOnMouseDragged(event -> drag(event));
        must_s_4.setOnMouseDragged(event -> drag(event));
        must_s_5.setOnMouseDragged(event -> drag(event));
        must_s_6.setOnMouseDragged(event -> drag(event));
        must_s_7.setOnMouseDragged(event -> drag(event));
        must_s_8.setOnMouseDragged(event -> drag(event));
        must_s_9.setOnMouseDragged(event -> drag(event));
        must_s_10.setOnMouseDragged(event -> drag(event));
        must_s_11.setOnMouseDragged(event -> drag(event));
        must_s_12.setOnMouseDragged(event -> drag(event));
        
        more_s_1.setOnMouseDragged(event -> drag(event));
        more_s_2.setOnMouseDragged(event -> drag(event));
        more_s_3.setOnMouseDragged(event -> drag(event));
        more_s_4.setOnMouseDragged(event -> drag(event));
        more_s_5.setOnMouseDragged(event -> drag(event));
        more_s_6.setOnMouseDragged(event -> drag(event));
        more_s_7.setOnMouseDragged(event -> drag(event));
        more_s_8.setOnMouseDragged(event -> drag(event));
        more_s_9.setOnMouseDragged(event -> drag(event));
        more_s_10.setOnMouseDragged(event -> drag(event));
        more_s_11.setOnMouseDragged(event -> drag(event));
        more_s_12.setOnMouseDragged(event -> drag(event));
        more_s_13.setOnMouseDragged(event -> drag(event));
        more_s_14.setOnMouseDragged(event -> drag(event));
        more_s_15.setOnMouseDragged(event -> drag(event));
        more_s_16.setOnMouseDragged(event -> drag(event));
        more_s_17.setOnMouseDragged(event -> drag(event));
        more_s_18.setOnMouseDragged(event -> drag(event));

    }

    //Save Sketch to Image Code Class
    public void save_img(){
            Stage stage = new Stage();
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Image");
            //Directory 
//            fileChooser.setInitialDirectory(new File("E:/NetBeans/ThirdEye v2/src/thirdeye/v2/elements/output/"));
            fileChooser.setInitialDirectory(new File("src/thirdeye/v2/elements/output"));

            //Extension Filter
            FileChooser.ExtensionFilter extFilter;
            extFilter = new FileChooser.ExtensionFilter("PNG", "*.png");
            fileChooser.getExtensionFilters().add(extFilter);
            Image snapshot = sketch.snapshot(null, null); //Convert Anchor Pane to image i.e. fx_id of anchorpane
            File file = fileChooser.showSaveDialog(stage);
                       
            if (file != null) {
                try {
                    ImageIO.write(SwingFXUtils.fromFXImage(snapshot,null), "png", file);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
    }

    @FXML //toolkit elements to show
    private void toolKit(MouseEvent event) {
        if(event.getSource()==head) {
            head_elements.setVisible(true);
            hair_elements.setVisible(false);
            eyes_elements.setVisible(false);
            eyebrows_elements.setVisible(false);
            nose_elements.setVisible(false);
            lips_elements.setVisible(false);
            mustach_elements.setVisible(false);
            more_elements.setVisible(false);
        } else if(event.getSource()==hair) {
            head_elements.setVisible(false);
            hair_elements.setVisible(true);
            eyes_elements.setVisible(false);
            eyebrows_elements.setVisible(false);
            nose_elements.setVisible(false);
            lips_elements.setVisible(false);
            mustach_elements.setVisible(false);
            more_elements.setVisible(false);
        } else if(event.getSource()==eyes) {
            head_elements.setVisible(false);
            hair_elements.setVisible(false);
            eyes_elements.setVisible(true);
            eyebrows_elements.setVisible(false);
            nose_elements.setVisible(false);
            lips_elements.setVisible(false);
            mustach_elements.setVisible(false);
            more_elements.setVisible(false);
        } else if(event.getSource()==eyebrows) {
            head_elements.setVisible(false);
            hair_elements.setVisible(false);
            eyes_elements.setVisible(false);
            eyebrows_elements.setVisible(true);
            nose_elements.setVisible(false);
            lips_elements.setVisible(false);
            mustach_elements.setVisible(false);
            more_elements.setVisible(false);
        } else if(event.getSource()==nose) {
            head_elements.setVisible(false);
            hair_elements.setVisible(false);
            eyes_elements.setVisible(false);
            eyebrows_elements.setVisible(false);
            nose_elements.setVisible(true);
            lips_elements.setVisible(false);
            mustach_elements.setVisible(false);
            more_elements.setVisible(false);
        } else if(event.getSource()==lips) {
            head_elements.setVisible(false);
            hair_elements.setVisible(false);
            eyes_elements.setVisible(false);
            eyebrows_elements.setVisible(false);
            nose_elements.setVisible(false);
            lips_elements.setVisible(true);
            mustach_elements.setVisible(false);
            more_elements.setVisible(false);
        } else if(event.getSource()==mustach) {
            head_elements.setVisible(false);
            hair_elements.setVisible(false);
            eyes_elements.setVisible(false);
            eyebrows_elements.setVisible(false);
            nose_elements.setVisible(false);
            lips_elements.setVisible(false);
            mustach_elements.setVisible(true);
            more_elements.setVisible(false);
        } else if(event.getSource()==more) {
            head_elements.setVisible(false);
            hair_elements.setVisible(false);
            eyes_elements.setVisible(false);
            eyebrows_elements.setVisible(false);
            nose_elements.setVisible(false);
            lips_elements.setVisible(false);
            mustach_elements.setVisible(false);
            more_elements.setVisible(true);
        }
    }

    @FXML //Save the sketch to image
    private void onSave(MouseEvent event) {
        save_img(); //save image
    }
    
    @FXML //Open the upload and compare page
    private void onCompare(MouseEvent event) {
        save_img(); //Save image
        
        // open the upload the sketch page
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("upload_sketch.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("New Window");
                stage.setScene(scene);
                stage.resizableProperty().setValue(false); //Disable maximize button
                stage.show();
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
            }
    }

    
    
    @FXML //Reset the sketch and delete all element
    private void onReset(MouseEvent event) {
        
        
         // This finds ALL ImageView inside the sketch area and hides them
    for (Node n : sketch.getChildren()) {
        if (n instanceof ImageView) {
            n.setVisible(false);
        }
    }
         
//        head_s_1.setVisible(false);
//        head_s_2.setVisible(false);
//        head_s_3.setVisible(false);
//        head_s_4.setVisible(false);
//        head_s_5.setVisible(false);
//        head_s_6.setVisible(false);
//        head_s_7.setVisible(false);
//        head_s_8.setVisible(false);
//        head_s_9.setVisible(false);
//        head_s_10.setVisible(false);
//        head_s_11.setVisible(false);
//        head_s_12.setVisible(false);
//        head_s_13.setVisible(false);
//        head_s_14.setVisible(false);
//        head_s_15.setVisible(false);
//        
//        head_s_16.setVisible(false);
//        head_s_17.setVisible(false);
//        head_s_18.setVisible(false);
//        head_s_19.setVisible(false);
//        head_s_20.setVisible(false);
//        head_s_21.setVisible(false);
//        head_s_22.setVisible(false);
//        head_s_23.setVisible(false);
//        head_s_24.setVisible(false);
//        head_s_25.setVisible(false);
//        head_s_26.setVisible(false);
//        head_s_27.setVisible(false);
//        head_s_28.setVisible(false);
//        head_s_29.setVisible(false);
//        head_s_30.setVisible(false);
//        head_s_31.setVisible(false);
//        head_s_32.setVisible(false);
//        head_s_33.setVisible(false);
//        head_s_34.setVisible(false);
//        head_s_35.setVisible(false);
//                
//        hair_s_1.setVisible(false);
//        hair_s_2.setVisible(false);
//        hair_s_3.setVisible(false);
//        hair_s_4.setVisible(false);
//        hair_s_5.setVisible(false);
//        hair_s_6.setVisible(false);
//        hair_s_7.setVisible(false);
//        hair_s_8.setVisible(false);
//        hair_s_9.setVisible(false);
//        hair_s_10.setVisible(false);
//        hair_s_11.setVisible(false);
//        hair_s_12.setVisible(false);
//        hair_s_13.setVisible(false);
//        hair_s_14.setVisible(false);
//        hair_s_15.setVisible(false);
//        hair_s_16.setVisible(false);
//        hair_s_17.setVisible(false);
//        hair_s_18.setVisible(false);
//        hair_s_19.setVisible(false);
//        hair_s_20.setVisible(false);
//                
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//        eyeb_s_1.setVisible(false);
//        eyeb_s_2.setVisible(false);
//        eyeb_s_3.setVisible(false);
//        eyeb_s_4.setVisible(false);
//        eyeb_s_5.setVisible(false);
//        eyeb_s_6.setVisible(false);
//        eyeb_s_7.setVisible(false);
//        eyeb_s_8.setVisible(false);
//        eyeb_s_9.setVisible(false);
//        eyeb_s_10.setVisible(false);
//        eyeb_s_11.setVisible(false);
//        eyeb_s_12.setVisible(false);
//        eyeb_s_13.setVisible(false);
//        eyeb_s_14.setVisible(false);
//        eyeb_s_15.setVisible(false);
//        eyeb_s_16.setVisible(false);
//        eyeb_s_17.setVisible(false);
//        eyeb_s_18.setVisible(false);
//        eyeb_s_19.setVisible(false);
//        eyeb_s_20.setVisible(false);
//        eyeb_s_21.setVisible(false);
//        eyeb_s_22.setVisible(false);
//        eyeb_s_23.setVisible(false);
//        eyeb_s_24.setVisible(false);
//        eyeb_s_25.setVisible(false);
//        eyeb_s_26.setVisible(false);
//
//     
//       
//                
//        lips_s_1.setVisible(false);
//        lips_s_2.setVisible(false);
//        lips_s_3.setVisible(false);
//        lips_s_4.setVisible(false);
//        lips_s_5.setVisible(false);
//        lips_s_6.setVisible(false);
//        lips_s_7.setVisible(false);
//        lips_s_8.setVisible(false);
//        lips_s_9.setVisible(false);
//        lips_s_10.setVisible(false);
//        lips_s_11.setVisible(false);
//        lips_s_12.setVisible(false);
//        lips_s_13.setVisible(false);
//        lips_s_14.setVisible(false);
//        lips_s_15.setVisible(false);
//        lips_s_16.setVisible(false);
//        lips_s_17.setVisible(false);
//        lips_s_18.setVisible(false);
//        lips_s_19.setVisible(false);
//        lips_s_20.setVisible(false);
//
//                
//        nose_s_1.setVisible(false);
//    nose_s_2.setVisible(false);
//    nose_s_3.setVisible(false);
//    nose_s_4.setVisible(false);
//    nose_s_5.setVisible(false);
//    nose_s_6.setVisible(false);
//    nose_s_7.setVisible(false);
//    nose_s_8.setVisible(false);
//    nose_s_9.setVisible(false);
//    nose_s_10.setVisible(false);
//    nose_s_11.setVisible(false);
//    nose_s_12.setVisible(false);
//    nose_s_13.setVisible(false);
//    nose_s_14.setVisible(false);
//    nose_s_15.setVisible(false);
//    nose_s_16.setVisible(false);
//    nose_s_17.setVisible(false);
//    nose_s_18.setVisible(false);
//    nose_s_19.setVisible(false);
//    nose_s_20.setVisible(false);
//    nose_s_21.setVisible(false);
//    nose_s_22.setVisible(false);
//    nose_s_23.setVisible(false);
//    nose_s_24.setVisible(false);
//    nose_s_25.setVisible(false);
//    nose_s_26.setVisible(false);
//    nose_s_27.setVisible(false);
//
//                
//    must_s_1.setVisible(false);
//    must_s_2.setVisible(false);
//    must_s_3.setVisible(false);
//    must_s_4.setVisible(false);
//    must_s_5.setVisible(false);
//    must_s_6.setVisible(false);
//    must_s_7.setVisible(false);
//    must_s_8.setVisible(false);
//    must_s_9.setVisible(false);
//    must_s_10.setVisible(false);
//    must_s_11.setVisible(false);
//    must_s_12.setVisible(false);
//
//    more_s_1.setVisible(false);
//    more_s_2.setVisible(false);
//    more_s_3.setVisible(false);
//    more_s_4.setVisible(false);
//    more_s_5.setVisible(false);
//    more_s_6.setVisible(false);
//    more_s_7.setVisible(false);
//    more_s_8.setVisible(false);
//    more_s_9.setVisible(false);
//    more_s_10.setVisible(false);
//    more_s_11.setVisible(false);
//    more_s_12.setVisible(false);
//    more_s_13.setVisible(false);
//    more_s_14.setVisible(false);
//    more_s_15.setVisible(false);
//    more_s_16.setVisible(false);
//    more_s_17.setVisible(false);
//    more_s_18.setVisible(false);

    }

        // Select the Elements to Show on CANVAS
        @FXML
private void onHeadSelect(MouseEvent event) {

    if(event.getSource()==head_del) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_1) {
        head_s_1.setVisible(true);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_2) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(true);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_3) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(true);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    }
        else if(event.getSource()==head_e_4) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(true);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_5) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(true);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_6) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(true);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_7) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(true);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_8) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(true);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_9) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(true);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_10) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(true);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);
    }
    else if(event.getSource()==head_e_11) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(true);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_12) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(true);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_13) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(true);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_14) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(true);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_15) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(true);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_16) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(true);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_17) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(true);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_18) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(true);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_19) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(true);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_20) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(true);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);
    }
        else if(event.getSource()==head_e_21) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(true);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_22) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(true);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_23) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(true);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_24) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(true);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_25) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(true);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_26) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(true);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_27) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(true);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_28) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(true);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);
    }
        else if(event.getSource()==head_e_29) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(true);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_30) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(true);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_31) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(true);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_32) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(true);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_33) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(true);
        head_s_34.setVisible(false);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_34) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(true);
        head_s_35.setVisible(false);

    } else if(event.getSource()==head_e_35) {
        head_s_1.setVisible(false);
        head_s_2.setVisible(false);
        head_s_3.setVisible(false);
        head_s_4.setVisible(false);
        head_s_5.setVisible(false);
        head_s_6.setVisible(false);
        head_s_7.setVisible(false);
        head_s_8.setVisible(false);
        head_s_9.setVisible(false);
        head_s_10.setVisible(false);
        head_s_11.setVisible(false);
        head_s_12.setVisible(false);
        head_s_13.setVisible(false);
        head_s_14.setVisible(false);
        head_s_15.setVisible(false);
        head_s_16.setVisible(false);
        head_s_17.setVisible(false);
        head_s_18.setVisible(false);
        head_s_19.setVisible(false);
        head_s_20.setVisible(false);
        head_s_21.setVisible(false);
        head_s_22.setVisible(false);
        head_s_23.setVisible(false);
        head_s_24.setVisible(false);
        head_s_25.setVisible(false);
        head_s_26.setVisible(false);
        head_s_27.setVisible(false);
        head_s_28.setVisible(false);
        head_s_29.setVisible(false);
        head_s_30.setVisible(false);
        head_s_31.setVisible(false);
        head_s_32.setVisible(false);
        head_s_33.setVisible(false);
        head_s_34.setVisible(false);
        head_s_35.setVisible(true);
    }
}

        @FXML
private void onHairSelect(MouseEvent event) {
    if(event.getSource()==hair_del) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    } 
    else if(event.getSource()==hair_e_1) {
        hair_s_1.setVisible(true);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_2) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(true);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_3) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(true);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_4) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(true);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_5) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(true);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_6) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(true);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_7) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(true);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_8) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(true);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_9) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(true);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_10) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(true);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_11) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(true);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_12) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(true);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_13) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(true);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_14) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(true);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_15) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(true);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_16) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(true);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_17) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(true);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_18) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(true);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_19) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(true);
        hair_s_20.setVisible(false);
    }
    else if(event.getSource()==hair_e_20) {
        hair_s_1.setVisible(false);
        hair_s_2.setVisible(false);
        hair_s_3.setVisible(false);
        hair_s_4.setVisible(false);
        hair_s_5.setVisible(false);
        hair_s_6.setVisible(false);
        hair_s_7.setVisible(false);
        hair_s_8.setVisible(false);
        hair_s_9.setVisible(false);
        hair_s_10.setVisible(false);
        hair_s_11.setVisible(false);
        hair_s_12.setVisible(false);
        hair_s_13.setVisible(false);
        hair_s_14.setVisible(false);
        hair_s_15.setVisible(false);
        hair_s_16.setVisible(false);
        hair_s_17.setVisible(false);
        hair_s_18.setVisible(false);
        hair_s_19.setVisible(false);
        hair_s_20.setVisible(true);
    }
}

//        @FXML
//private void onEyesSelect(MouseEvent event) {
//
//    if(event.getSource() == eyes_del) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_1) {
//        eyes_s_1.setVisible(true);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_2) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(true);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_3) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(true);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_4) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(true);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_5) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(true);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_6) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(true);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_7) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(true);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_8) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(true);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_9) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(true);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_10) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(true);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_11) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(true);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_12) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(true);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_13) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(true);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_14) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(true);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_15) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(true);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_16) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(true);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_17) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(true);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_18) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(true);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_19) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(true);
//        eyes_s_20.setVisible(false);
//
//    } else if(event.getSource() == eyes_e_20) {
//        eyes_s_1.setVisible(false);
//        eyes_s_2.setVisible(false);
//        eyes_s_3.setVisible(false);
//        eyes_s_4.setVisible(false);
//        eyes_s_5.setVisible(false);
//        eyes_s_6.setVisible(false);
//        eyes_s_7.setVisible(false);
//        eyes_s_8.setVisible(false);
//        eyes_s_9.setVisible(false);
//        eyes_s_10.setVisible(false);
//        eyes_s_11.setVisible(false);
//        eyes_s_12.setVisible(false);
//        eyes_s_13.setVisible(false);
//        eyes_s_14.setVisible(false);
//        eyes_s_15.setVisible(false);
//        eyes_s_16.setVisible(false);
//        eyes_s_17.setVisible(false);
//        eyes_s_18.setVisible(false);
//        eyes_s_19.setVisible(false);
//        eyes_s_20.setVisible(true);
//    }
//}


@FXML
private void onEyesSelect(MouseEvent event) {

    // ------- HIDE ALL (1 → 27) -------
    eyes_s_1.setVisible(false);
    eyes_s_2.setVisible(false);
    eyes_s_3.setVisible(false);
    eyes_s_4.setVisible(false);
    eyes_s_5.setVisible(false);
    eyes_s_6.setVisible(false);
    eyes_s_7.setVisible(false);
    eyes_s_8.setVisible(false);
    eyes_s_9.setVisible(false);
    eyes_s_10.setVisible(false);
    eyes_s_11.setVisible(false);
    eyes_s_12.setVisible(false);
    eyes_s_13.setVisible(false);
    eyes_s_14.setVisible(false);
    eyes_s_15.setVisible(false);
    eyes_s_16.setVisible(false);
    eyes_s_17.setVisible(false);
    eyes_s_18.setVisible(false);
    eyes_s_19.setVisible(false);
    eyes_s_20.setVisible(false);
    eyes_s_21.setVisible(false);
    eyes_s_22.setVisible(false);
    eyes_s_23.setVisible(false);
    eyes_s_24.setVisible(false);
    eyes_s_25.setVisible(false);
    eyes_s_26.setVisible(false);
    eyes_s_27.setVisible(false);

    // ------- DELETE BUTTON -------
    if (event.getSource() == eyes_del) {
        return;
    }

    // ------- OLD 1–12 -------
    if (event.getSource() == eyes_e_1) eyes_s_1.setVisible(true);
    else if (event.getSource() == eyes_e_2) eyes_s_2.setVisible(true);
    else if (event.getSource() == eyes_e_3) eyes_s_3.setVisible(true);
    else if (event.getSource() == eyes_e_4) eyes_s_4.setVisible(true);
    else if (event.getSource() == eyes_e_5) eyes_s_5.setVisible(true);
    else if (event.getSource() == eyes_e_6) eyes_s_6.setVisible(true);
    else if (event.getSource() == eyes_e_7) eyes_s_7.setVisible(true);
    else if (event.getSource() == eyes_e_8) eyes_s_8.setVisible(true);
    else if (event.getSource() == eyes_e_9) eyes_s_9.setVisible(true);
    else if (event.getSource() == eyes_e_10) eyes_s_10.setVisible(true);
    else if (event.getSource() == eyes_e_11) eyes_s_11.setVisible(true);
    else if (event.getSource() == eyes_e_12) eyes_s_12.setVisible(true);

    // ------- NEW 13–27 -------
    else if (event.getSource() == eyes_e_13) eyes_s_13.setVisible(true);
    else if (event.getSource() == eyes_e_14) eyes_s_14.setVisible(true);
    else if (event.getSource() == eyes_e_15) eyes_s_15.setVisible(true);
    else if (event.getSource() == eyes_e_16) eyes_s_16.setVisible(true);
    else if (event.getSource() == eyes_e_17) eyes_s_17.setVisible(true);
    else if (event.getSource() == eyes_e_18) eyes_s_18.setVisible(true);
    else if (event.getSource() == eyes_e_19) eyes_s_19.setVisible(true);
    else if (event.getSource() == eyes_e_20) eyes_s_20.setVisible(true);
    else if (event.getSource() == eyes_e_21) eyes_s_21.setVisible(true);
    else if (event.getSource() == eyes_e_22) eyes_s_22.setVisible(true);
    else if (event.getSource() == eyes_e_23) eyes_s_23.setVisible(true);
    else if (event.getSource() == eyes_e_24) eyes_s_24.setVisible(true);
    else if (event.getSource() == eyes_e_25) eyes_s_25.setVisible(true);
    else if (event.getSource() == eyes_e_26) eyes_s_26.setVisible(true);
    else if (event.getSource() == eyes_e_27) eyes_s_27.setVisible(true);
}



 @FXML
private void onEyeBSelect(MouseEvent event) {

    // ------- HIDE ALL (1 → 26) -------
    eyeb_s_1.setVisible(false);
    eyeb_s_2.setVisible(false);
    eyeb_s_3.setVisible(false);
    eyeb_s_4.setVisible(false);
    eyeb_s_5.setVisible(false);
    eyeb_s_6.setVisible(false);
    eyeb_s_7.setVisible(false);
    eyeb_s_8.setVisible(false);
    eyeb_s_9.setVisible(false);
    eyeb_s_10.setVisible(false);
    eyeb_s_11.setVisible(false);
    eyeb_s_12.setVisible(false);
    eyeb_s_13.setVisible(false);
    eyeb_s_14.setVisible(false);
    eyeb_s_15.setVisible(false);
    eyeb_s_16.setVisible(false);
    eyeb_s_17.setVisible(false);
    eyeb_s_18.setVisible(false);
    eyeb_s_19.setVisible(false);
    eyeb_s_20.setVisible(false);
    eyeb_s_21.setVisible(false);
    eyeb_s_22.setVisible(false);
    eyeb_s_23.setVisible(false);
    eyeb_s_24.setVisible(false);
    eyeb_s_25.setVisible(false);
    eyeb_s_26.setVisible(false);

    // ------- DELETE BUTTON -------
    if(event.getSource() == eyeb_del) {
        return;
    }

    // ------- OLD 1–16 SELECTORS -------
    if(event.getSource() == eyeb_e_1) eyeb_s_1.setVisible(true);
    else if(event.getSource() == eyeb_e_2) eyeb_s_2.setVisible(true);
    else if(event.getSource() == eyeb_e_3) eyeb_s_3.setVisible(true);
    else if(event.getSource() == eyeb_e_4) eyeb_s_4.setVisible(true);
    else if(event.getSource() == eyeb_e_5) eyeb_s_5.setVisible(true);
    else if(event.getSource() == eyeb_e_6) eyeb_s_6.setVisible(true);
    else if(event.getSource() == eyeb_e_7) eyeb_s_7.setVisible(true);
    else if(event.getSource() == eyeb_e_8) eyeb_s_8.setVisible(true);
    else if(event.getSource() == eyeb_e_9) eyeb_s_9.setVisible(true);
    else if(event.getSource() == eyeb_e_10) eyeb_s_10.setVisible(true);
    else if(event.getSource() == eyeb_e_11) eyeb_s_11.setVisible(true);
    else if(event.getSource() == eyeb_e_12) eyeb_s_12.setVisible(true);
    else if(event.getSource() == eyeb_e_13) eyeb_s_13.setVisible(true);
    else if(event.getSource() == eyeb_e_14) eyeb_s_14.setVisible(true);
    else if(event.getSource() == eyeb_e_15) eyeb_s_15.setVisible(true);
    else if(event.getSource() == eyeb_e_16) eyeb_s_16.setVisible(true);

    // ------- NEW 17–26 SELECTORS -------
    else if(event.getSource() == eyeb_e_17) eyeb_s_17.setVisible(true);
    else if(event.getSource() == eyeb_e_18) eyeb_s_18.setVisible(true);
    else if(event.getSource() == eyeb_e_19) eyeb_s_19.setVisible(true);
    else if(event.getSource() == eyeb_e_20) eyeb_s_20.setVisible(true);
    else if(event.getSource() == eyeb_e_21) eyeb_s_21.setVisible(true);
    else if(event.getSource() == eyeb_e_22) eyeb_s_22.setVisible(true);
    else if(event.getSource() == eyeb_e_23) eyeb_s_23.setVisible(true);
    else if(event.getSource() == eyeb_e_24) eyeb_s_24.setVisible(true);
    else if(event.getSource() == eyeb_e_25) eyeb_s_25.setVisible(true);
    else if(event.getSource() == eyeb_e_26) eyeb_s_26.setVisible(true);
}


       @FXML
private void onNoseSelect(MouseEvent event) {

    if (event.getSource() == nose_del) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_1) {
        nose_s_1.setVisible(true);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_2) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(true);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_3) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(true);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_4) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(true);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_5) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(true);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_6) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(true);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_7) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(true);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_8) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(true);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_9) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(true);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_10) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(true);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_11) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(true);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_12) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(true);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource()==nose_e_13) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(true);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_14) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(true);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_15) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(true);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_16) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(true);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_17) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(true);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_18) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(true);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_19) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(true);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_20) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(true);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_21) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(true);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_22) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(true);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_23) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(true);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_24) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(true);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_25) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(true);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource() == nose_e_26) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(true);
        nose_s_27.setVisible(false);
    }

    else if (event.getSource()==nose_e_27) {
        nose_s_1.setVisible(false);
        nose_s_2.setVisible(false);
        nose_s_3.setVisible(false);
        nose_s_4.setVisible(false);
        nose_s_5.setVisible(false);
        nose_s_6.setVisible(false);
        nose_s_7.setVisible(false);
        nose_s_8.setVisible(false);
        nose_s_9.setVisible(false);
        nose_s_10.setVisible(false);
        nose_s_11.setVisible(false);
        nose_s_12.setVisible(false);
        nose_s_13.setVisible(false);
        nose_s_14.setVisible(false);
        nose_s_15.setVisible(false);
        nose_s_16.setVisible(false);
        nose_s_17.setVisible(false);
        nose_s_18.setVisible(false);
        nose_s_19.setVisible(false);
        nose_s_20.setVisible(false);
        nose_s_21.setVisible(false);
        nose_s_22.setVisible(false);
        nose_s_23.setVisible(false);
        nose_s_24.setVisible(false);
        nose_s_25.setVisible(false);
        nose_s_26.setVisible(false);
        nose_s_27.setVisible(true);
    }
}

@FXML
private void onLipsSelect(MouseEvent event) {

    if(event.getSource()==lips_del) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_1) {
        lips_s_1.setVisible(true);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_2) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(true);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_3) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(true);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_4) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(true);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_5) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(true);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_6) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(true);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_7) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(true);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_8) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(true);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_9) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(true);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_10) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(true);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_11) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(true);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_12) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(true);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_13) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(true);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_14) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(true);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_15) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(true);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_16) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(true);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_17) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(true);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_18) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(true);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_19) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(true);
        lips_s_20.setVisible(false);

    } else if(event.getSource()==lips_e_20) {
        lips_s_1.setVisible(false);
        lips_s_2.setVisible(false);
        lips_s_3.setVisible(false);
        lips_s_4.setVisible(false);
        lips_s_5.setVisible(false);
        lips_s_6.setVisible(false);
        lips_s_7.setVisible(false);
        lips_s_8.setVisible(false);
        lips_s_9.setVisible(false);
        lips_s_10.setVisible(false);
        lips_s_11.setVisible(false);
        lips_s_12.setVisible(false);
        lips_s_13.setVisible(false);
        lips_s_14.setVisible(false);
        lips_s_15.setVisible(false);
        lips_s_16.setVisible(false);
        lips_s_17.setVisible(false);
        lips_s_18.setVisible(false);
        lips_s_19.setVisible(false);
        lips_s_20.setVisible(true);
    }
}

        
        
        @FXML
        private void onMustSelect(MouseEvent event) {
            if(event.getSource()==must_del) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_1) {
                must_s_1.setVisible(true);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_2) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(true);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_3) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(true);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_4) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(true);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_5) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(true);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_6) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(true);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_7) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(true);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_8) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(true);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_9) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(true);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_10) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(true);
                must_s_11.setVisible(false);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_11) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(true);
                must_s_12.setVisible(false);
            } else if(event.getSource()==must_e_12) {
                must_s_1.setVisible(false);
                must_s_2.setVisible(false);
                must_s_3.setVisible(false);
                must_s_4.setVisible(false);
                must_s_5.setVisible(false);
                must_s_6.setVisible(false);
                must_s_7.setVisible(false);
                must_s_8.setVisible(false);
                must_s_9.setVisible(false);
                must_s_10.setVisible(false);
                must_s_11.setVisible(false);
                must_s_12.setVisible(true);
            } 
        }

        @FXML
private void onMoreSelect(MouseEvent event) {
    if(event.getSource() == more_del) {
        more_s_1.setVisible(false);
        more_s_2.setVisible(false);
        more_s_3.setVisible(false);
        more_s_4.setVisible(false);
        more_s_5.setVisible(false);
        more_s_6.setVisible(false);
        more_s_7.setVisible(false);
        more_s_8.setVisible(false);
        more_s_9.setVisible(false);
        more_s_10.setVisible(false);
        more_s_11.setVisible(false);
        more_s_12.setVisible(false);
        more_s_13.setVisible(false);
        more_s_14.setVisible(false);
        more_s_15.setVisible(false);
        more_s_16.setVisible(false);
        more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_1) {
        more_s_1.setVisible(true);
        more_s_2.setVisible(false);
        more_s_3.setVisible(false);
        more_s_4.setVisible(false);
        more_s_5.setVisible(false);
        more_s_6.setVisible(false);
        more_s_7.setVisible(false);
        more_s_8.setVisible(false);
        more_s_9.setVisible(false);
        more_s_10.setVisible(false);
        more_s_11.setVisible(false);
        more_s_12.setVisible(false);
        more_s_13.setVisible(false);
        more_s_14.setVisible(false);
        more_s_15.setVisible(false);
        more_s_16.setVisible(false);
        more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_2) {
        more_s_1.setVisible(true);
        more_s_2.setVisible(true);
        more_s_3.setVisible(false);
        more_s_4.setVisible(false);
        more_s_5.setVisible(false);
        more_s_6.setVisible(false);
        more_s_7.setVisible(false);
        more_s_8.setVisible(false);
        more_s_9.setVisible(false);
        more_s_10.setVisible(false);
        more_s_11.setVisible(false);
        more_s_12.setVisible(false);
        more_s_13.setVisible(false);
        more_s_14.setVisible(false);
        more_s_15.setVisible(false);
        more_s_16.setVisible(false);
        more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_3) {
        more_s_1.setVisible(false);
        more_s_2.setVisible(false);
        more_s_3.setVisible(true);
        more_s_4.setVisible(false);
        more_s_5.setVisible(false);
        more_s_6.setVisible(false);
        more_s_7.setVisible(false);
        more_s_8.setVisible(false);
        more_s_9.setVisible(false);
        more_s_10.setVisible(false);
        more_s_11.setVisible(false);
        more_s_12.setVisible(false);
        more_s_13.setVisible(false);
        more_s_14.setVisible(false);
        more_s_15.setVisible(false);
        more_s_16.setVisible(false);
        more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_4) {
        more_s_1.setVisible(false);
        more_s_2.setVisible(false);
        more_s_3.setVisible(true);
        more_s_4.setVisible(true);
        more_s_5.setVisible(false);
        more_s_6.setVisible(false);
        more_s_7.setVisible(false);
        more_s_8.setVisible(false);
        more_s_9.setVisible(false);
        more_s_10.setVisible(false);
        more_s_11.setVisible(false);
        more_s_12.setVisible(false);
        more_s_13.setVisible(false);
        more_s_14.setVisible(false);
        more_s_15.setVisible(false);
        more_s_16.setVisible(false);
        more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_5) {
        more_s_1.setVisible(false);
        more_s_2.setVisible(false);
        more_s_3.setVisible(false);
        more_s_4.setVisible(false);
        more_s_5.setVisible(true);
        more_s_6.setVisible(false);
        more_s_7.setVisible(false);
        more_s_8.setVisible(false);
        more_s_9.setVisible(false);
        more_s_10.setVisible(false);
        more_s_11.setVisible(false);
        more_s_12.setVisible(false);
        more_s_13.setVisible(false);
        more_s_14.setVisible(false);
        more_s_15.setVisible(false);
        more_s_16.setVisible(false);
        more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_6) {
        more_s_1.setVisible(false);
        more_s_2.setVisible(false);
        more_s_3.setVisible(false);
        more_s_4.setVisible(false);
        more_s_5.setVisible(false);
        more_s_6.setVisible(true);
        more_s_7.setVisible(false);
        more_s_8.setVisible(false);
        more_s_9.setVisible(false);
        more_s_10.setVisible(false);
        more_s_11.setVisible(false);
        more_s_12.setVisible(false);
        more_s_13.setVisible(false);
        more_s_14.setVisible(false);
        more_s_15.setVisible(false);
        more_s_16.setVisible(false);
        more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_7) {
        // show only more_s_7
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(true);
        more_s_8.setVisible(true); more_s_9.setVisible(false); more_s_10.setVisible(false);
        more_s_11.setVisible(false); more_s_12.setVisible(false); more_s_13.setVisible(false);
        more_s_14.setVisible(false); more_s_15.setVisible(false); more_s_16.setVisible(false);
        more_s_17.setVisible(false); more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_8) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(true);
        more_s_8.setVisible(true);
        more_s_9.setVisible(false); more_s_10.setVisible(false); more_s_11.setVisible(false);
        more_s_12.setVisible(false); more_s_13.setVisible(false); more_s_14.setVisible(false);
        more_s_15.setVisible(false); more_s_16.setVisible(false); more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_9) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false);
        more_s_9.setVisible(true);
        more_s_10.setVisible(true); more_s_11.setVisible(false); more_s_12.setVisible(false);
        more_s_13.setVisible(false); more_s_14.setVisible(false); more_s_15.setVisible(false);
        more_s_16.setVisible(false); more_s_17.setVisible(false); more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_10) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(true);
        more_s_10.setVisible(true);
        more_s_11.setVisible(false); more_s_12.setVisible(false); more_s_13.setVisible(false);
        more_s_14.setVisible(false); more_s_15.setVisible(false); more_s_16.setVisible(false);
        more_s_17.setVisible(false); more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_11) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(false);
        more_s_10.setVisible(false);
        more_s_11.setVisible(true);
        more_s_12.setVisible(true); more_s_13.setVisible(false); more_s_14.setVisible(false);
        more_s_15.setVisible(false); more_s_16.setVisible(false); more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_12) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(false);
        more_s_10.setVisible(false); more_s_11.setVisible(false);
        more_s_12.setVisible(true);
        more_s_13.setVisible(false); more_s_14.setVisible(false); more_s_15.setVisible(false);
        more_s_16.setVisible(false); more_s_17.setVisible(false); more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_13) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(false);
        more_s_10.setVisible(false); more_s_11.setVisible(false); more_s_12.setVisible(false);
        more_s_13.setVisible(true);
        more_s_14.setVisible(false); more_s_15.setVisible(false); more_s_16.setVisible(false);
        more_s_17.setVisible(false); more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_14) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(false);
        more_s_10.setVisible(false); more_s_11.setVisible(false); more_s_12.setVisible(false);
        more_s_13.setVisible(false);
        more_s_14.setVisible(true);
        more_s_15.setVisible(false); more_s_16.setVisible(false); more_s_17.setVisible(false);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_15) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(false);
        more_s_10.setVisible(false); more_s_11.setVisible(false); more_s_12.setVisible(false);
        more_s_13.setVisible(false); more_s_14.setVisible(false);
        more_s_15.setVisible(true);
        more_s_16.setVisible(false); more_s_17.setVisible(false); more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_16) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(false);
        more_s_10.setVisible(false); more_s_11.setVisible(false); more_s_12.setVisible(false);
        more_s_13.setVisible(false); more_s_14.setVisible(false); more_s_15.setVisible(false);
        more_s_16.setVisible(true);
        more_s_17.setVisible(false); more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_17) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(false);
        more_s_10.setVisible(false); more_s_11.setVisible(false); more_s_12.setVisible(false);
        more_s_13.setVisible(false); more_s_14.setVisible(false); more_s_15.setVisible(false);
        more_s_16.setVisible(false);
        more_s_17.setVisible(true);
        more_s_18.setVisible(false);
    } else if(event.getSource() == more_e_18) {
        more_s_1.setVisible(false); more_s_2.setVisible(false); more_s_3.setVisible(false); more_s_4.setVisible(false);
        more_s_5.setVisible(false); more_s_6.setVisible(false);
        more_s_7.setVisible(false); more_s_8.setVisible(false); more_s_9.setVisible(false);
        more_s_10.setVisible(false); more_s_11.setVisible(false); more_s_12.setVisible(false);
        more_s_13.setVisible(false); more_s_14.setVisible(false); more_s_15.setVisible(false);
        more_s_16.setVisible(false); more_s_17.setVisible(false);
        more_s_18.setVisible(true);
    }
}

// newly added
        
      @FXML
    private void onBack(ActionEvent event) {
    try {
        // Load the menu screen
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
        Parent root = loader.load();

        // Get current stage
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        // Set new scene (menu)
        stage.setScene(scene);
        stage.show();

    } catch (IOException e) {
        e.printStackTrace();
    }
}


        
}
