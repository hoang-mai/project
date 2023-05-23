package gui51;

import gui11.gui11;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
public class gui51 {
    @FXML
    private TextField namename;
    @FXML
    void cancel(ActionEvent event) {
        try {
            Stage ag0r1= (Stage) ((Node) event.getSource()).getScene().getWindow();
            Parent root=FXMLLoader.load(getClass().getResource("/gui11/gui(1.1).fxml"));
            Scene scene=new Scene(root); 
            ag0r1.setScene(scene);
            ag0r1.show();
           
        } catch (Exception e) {
       System.out.println(e.getMessage());
        }
    }

    @FXML
    void create(ActionEvent event) {
        try {
            Stage ag0r1= (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui11/gui(1.1).fxml"));
            Parent root = loader.load();
            Scene scene=new Scene(root);
            ag0r1.setScene(scene);
            ag0r1.show();
            gui11 controller = loader.getController();
       controller.setvob1(namename.getText());
           
        } catch (Exception e) {
       System.out.println(e.getMessage());
        }
    }
}


