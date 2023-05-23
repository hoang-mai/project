package gui11;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import gui51.savedata;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class gui11  {
   
    @FXML
    private Label kiemtracuoikimonit1;
    @FXML
    private VBox vbox1;
    
    @FXML
    void turneditingon(ActionEvent event) {
        try {   
          
            Parent root=FXMLLoader.load(getClass().getResource("/gui51/gui(5.1).fxml"));
            Scene scene=new Scene(root);
            Stage ag0r=new Stage();
           ag0r.setScene(scene);
           ag0r.show();
           Stage a=(Stage)kiemtracuoikimonit1.getScene().getWindow();
           a.hide();
        } catch (Exception e) {
       System.out.println(e.getMessage());
    }
    }
    @FXML
    void kiemtracuoikimonit(MouseEvent event) {
kiemtracuoikimonit1.setEffect(null);
    }
    @FXML
    void handle(ActionEvent event) {
        try {
            
            Parent root=FXMLLoader.load(getClass().getResource("/popup/pop up.fxml"));
            Scene scene=new Scene(root);
            Stage arg01=new Stage();
            arg01.setScene(scene);
            arg01.show();
           
        } catch (Exception e) {
       System.out.println(e.getMessage());
        }   
        }
  
    public void initialize() {
        List<String> labelValues = savedata.getLabelValues();
    String labelTag = "oldLabel"; // Đánh dấu cho các label cũ đã được thêm vào VBox trước đó
    
    // Xóa các label cũ từ VBox
    List<Node> nodesToRemove = new ArrayList<>();
    for (Node node : vbox1.getChildren()) {
        if (node instanceof Label && labelTag.equals(node.getUserData())) {
            nodesToRemove.add(node);
        }
    }
    vbox1.getChildren().removeAll(nodesToRemove);

    // Thêm các label mới vào VBox
    for (String value : labelValues) {
        Label label = new Label(value);
        ImageView imageview1=new ImageView(new Image("C:/Users/Laptop/Desktop/javaFx/project1/src/ImageView/iconchuv.jpg"));
        label.setEffect(new ColorAdjust(0, 0, 0.43, 0));
        label.setOnMouseClicked(event->{
            label.setEffect(null);
        });
        label.setGraphic(imageview1);
        label.setUserData(labelTag); // Đánh dấu label mới để xác định là label mới
        vbox1.getChildren().add(label); // Thêm label vào VBox
    }
      
    }
    }

   


    


