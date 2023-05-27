package gui11;


import java.util.List;
import gui51.savedata;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class gui11  {
   
    @FXML
    private ImageView kiemtracuoikimonit1;
    @FXML
    private VBox vbox1;
    @FXML
    void kiemtracuoikimonit(ActionEvent event) {
        try {   
            Parent root=FXMLLoader.load(getClass().getResource("/gui61/gui(6.1).fxml"));
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
    
    // Thêm các label mới vào VBox
    for (String value : labelValues) {
        Label label = new Label(value);
        ImageView imageview1=new ImageView(new Image("C:/Users/Laptop/Desktop/javaFx/project1/src/ImageView/iconchuv.jpg"));
        label.setGraphic(imageview1);
        
        vbox1.getChildren().add(label); // Thêm label vào VBox
    }
      
    }
    }

   


    


