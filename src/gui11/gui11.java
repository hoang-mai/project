package gui11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class gui11 implements Initializable  {
   
    @FXML
    private Label kiemtracuoikimonit1;
    @FXML
    private VBox vbox1;
    public void setvob1(String text){
        Label label=new Label(text);
        ImageView imageview1=new ImageView(new Image("C:/Users/Laptop/Desktop/javaFx/project1/src/ImageView/iconchuv.jpg"));
        label.setEffect(new ColorAdjust(0, 0, 0.43, 0));
        label.setOnMouseClicked(event->{
            label.setEffect(null);
        });
        label.setGraphic(imageview1);
      vbox1.getChildren().add(label);        
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
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
       
    }
    }

   


    


