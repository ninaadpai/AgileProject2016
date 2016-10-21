package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApplication extends Application {
	private Stage GameOverview;
	private AnchorPane RootLayout;
	private ObservableList<Player> playerData = FXCollections.observableArrayList();
	@Override
	public void start(Stage GameOverview) throws IOException {
		this.GameOverview = GameOverview;
		this.GameOverview.setTitle("Killer Cutthroat Spades");
		
		initRootLayout();
		
//		showGameOverview();
	}

//	public void showGameOverview() throws IOException {
//		FXMLLoader loader = new FXMLLoader();
//		loader.setLocation(MainApplication.class.getResource("GameOverview.fxml"));
//		AnchorPane gameOverview = (AnchorPane) loader.load();
//		RootLayout.s
//	}

	public void initRootLayout() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApplication.class.getResource("gamelayout.fxml"));
		RootLayout = (AnchorPane) loader.load();	
		
		Scene scene = new Scene(RootLayout);
		GameOverview.setScene(scene);
		GameOverview.show();
	}
	
	public Stage gameOverviewStage() {
		return GameOverview;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
