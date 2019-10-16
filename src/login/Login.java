/*
Nombre: Daniel Gonzalez Lopez
Fecha: 24/09/2019
 */
package login;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
     public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Bienvenido");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label userName = new Label("Usuario: ");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Contraseña:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        
        
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
