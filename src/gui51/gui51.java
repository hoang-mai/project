package gui51;

import java.net.URL;

import java.util.ResourceBundle;

import gui11.gui11;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
public class gui51 implements Initializable {
    @FXML
    private ImageView canhbao1;
   
    @FXML
    private TextField textfile1;
    @FXML
    private ComboBox<String> closequiz2;
    @FXML
    private ComboBox<String> openquiz2;
    @FXML
    private ComboBox<Integer> closequiz3;
    @FXML
    private ComboBox<Integer> openquiz3;
    @FXML
    private ComboBox<Integer> closequiz4;

    @FXML
    private ComboBox<Integer> closequiz5;
    @FXML
    private ComboBox<Integer> openquiz4;

    @FXML
    private ComboBox<Integer> openquiz5;
    @FXML
    private TextField namename;
    @FXML
    private ComboBox<Integer> openquiz1;
    @FXML
    private ComboBox<Integer> closequiz1;
    @FXML
    private ComboBox<String> timelimit1;
    @FXML
    private ComboBox<String> whentim1;
    @FXML
    private CheckBox enable3;
   
    @FXML
    void timeenable3(ActionEvent event) {
        if(enable3.isSelected()){
            textfile1.setDisable(false);
            timelimit1.setDisable(false);
           }
           else{ textfile1.setDisable(true);
             timelimit1.setDisable(true);}
         }
         @FXML
         private CheckBox enable1;
     
         @FXML
         private CheckBox enable2;
         @FXML
         void timeenable1(ActionEvent event) {
            if(enable1.isSelected()){
             openquiz1.setDisable(false);
             openquiz2.setDisable(false);
             openquiz3.setDisable(false);
             openquiz4.setDisable(false);
             openquiz5.setDisable(false);
               }
               else{    openquiz1.setDisable(true);
                openquiz2.setDisable(true);
                openquiz3.setDisable(true);
                openquiz4.setDisable(true);
                openquiz5.setDisable(true);

            }
             }
         
     
         @FXML
         void timeenable2(ActionEvent event) {
            if(enable2.isSelected()){
             closequiz1.setDisable(false);
             closequiz2.setDisable(false);
             closequiz3.setDisable(false);
             closequiz4.setDisable(false);
             closequiz5.setDisable(false);
               }
               else{ 
                closequiz1.setDisable(true);
                closequiz2.setDisable(true);
                closequiz3.setDisable(true);
                closequiz4.setDisable(true);
                closequiz5.setDisable(true);
               }
             }
         
     

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
            savedata.addLabelValue(namename.getText());
      controller.initialize();
           
        } catch (Exception e) {
       System.out.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {   
    namename.textProperty().addListener((Observable,oldvalue,newValue)->{
        if(newValue.isEmpty()){
            canhbao1.setVisible(true);
        }
        else{ canhbao1.setVisible(false);
            }
        });
    
ObservableList<Integer>list1=FXCollections.observableArrayList();
for(int i =1;i<=31;i++){
list1.addAll(i);
openquiz1.setItems(list1);
closequiz1.setItems(list1);
}
ObservableList<String>list2=FXCollections.observableArrayList();

list2.addAll("January","February","March","April","May","June","July","August","September","October","November","December");
openquiz2.setItems(list2);
closequiz2.setItems(list2);
ObservableList<Integer>list3=FXCollections.observableArrayList();
for(int i=2030;i>2000;i--){
    list3.add(i);
    openquiz3.setItems(list3);
    closequiz3.setItems(list3);
}
ObservableList<Integer>list4=FXCollections.observableArrayList();
for(int i=0;i<=24;i++){
    list4.addAll(i);
    openquiz4.setItems(list4);
    closequiz4.setItems(list4);
}
ObservableList<Integer>list5=FXCollections.observableArrayList();
for(int i=0;i<=60;i++){
    list5.addAll(i);
    openquiz5.setItems(list5);
    closequiz5.setItems(list5);
}
timelimit1.setItems(FXCollections.observableArrayList("minutes"));
whentim1.setItems(FXCollections.observableArrayList(" Open attempts are submitted automatically"));
       
    }
}


