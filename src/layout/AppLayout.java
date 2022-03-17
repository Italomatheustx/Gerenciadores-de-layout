package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent raiz = null;
		
		raiz = new TesteAnchorPane();
		raiz = new TesteBorderPane();
		raiz = new TesteFlowPane();
		raiz = new TesteGridPane();
		raiz = new TesteStackPane();
		raiz = new TesteTilePane();
		
		// Scene Principal = new Scene(new TesteAnchorPane(), 800, 600);
		Scene Principal = new Scene(raiz, 800, 600);
		
		primaryStage.setScene(Principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
