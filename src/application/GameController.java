package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GameController {
	private ObservableList<Player> playerData = FXCollections.observableArrayList();
	public List<Integer> cards = new ArrayList<Integer>();
	public List<Integer> cardList = new ArrayList<Integer>();
	private Stage stage;
	private Parent root;
	@FXML
	private Button NewGameButton;

	@FXML
	private Button DealButton;

	@FXML
	private Button ExitButton;
	
	@FXML
	private HBox cardBox;
	
	@FXML
	private ImageView card1;

	@FXML
	private ImageView card2;
	@FXML
	private ImageView card3;
	@FXML
	private ImageView card4;
	@FXML
	private ImageView card5;
	@FXML
	private ImageView card6;
	@FXML
	private ImageView card7;
	@FXML
	private ImageView card8;
	@FXML
	private ImageView card9;
	@FXML
	private ImageView card10;
	@FXML
	private ImageView card11;
	@FXML
	private ImageView card12;
	@FXML
	private ImageView card13;
	
	@FXML
	void DealClick(MouseEvent event) {
		System.out.println("New Deal");
	}

	@FXML
	void ExitClick(MouseEvent event) {
		System.out.println("Goodbye");
		System.exit(0);
	}
	

	@FXML
	void NewGameClick(MouseEvent event) {
		System.out.println("New Game Button Clicked");
		playerData.add(new Player("Mark", 0, 0, 0, root));
		playerData.add(new Player("Tim", 0, 0, 0, root));
		playerData.add(new Player("Gary", 0, 0, 0, root));
		playerData.add(new Player("Sam", 0, 0, 0, root));
//		System.out.println(playerData);
//		cards.add("10c");
//		cards.add("11c");
//		cards.add("3d");
//		cards.add("6h");
//		cards.add("8h");
//		cards.add("2d");
//		cards.add("4c");
//		cards.add("8h");
//		cards.add("12c");
//		cards.add("13c");
//		cards.add("11d");
//		cards.add("3h");
//		cards.add("7h");
//		cards.add("9d");
//		cards.add("11h");
//		cards.add("8d");
		for(int i=102; i<=114; i++){
			cards.add(i);
		}
		for(int i=202; i<=214; i++){
			cards.add(i);
		}
		for(int i=302; i<=314; i++){
			cards.add(i);
		}
		for(int i=402; i<=414; i++){
			cards.add(i);
		}
		Collections.shuffle(cards);
		for(int i=0; i<13; i++){
			cardList.add(cards.get(i));
		}
		Collections.sort(cardList);
		 card1.setImage(new Image("file:cards/"+cardList.get(12)+".gif"));
		 card2.setImage(new Image("file:cards/"+cardList.get(11)+".gif")); 
		 card3.setImage(new Image("file:cards/"+cardList.get(10)+".gif")); 
		 card4.setImage(new Image("file:cards/"+cardList.get(9)+".gif")); 
		 card5.setImage(new Image("file:cards/"+cardList.get(8)+".gif")); 
		 card6.setImage(new Image("file:cards/"+cardList.get(7)+".gif")); 
		 card7.setImage(new Image("file:cards/"+cardList.get(6)+".gif")); 
		 card8.setImage(new Image("file:cards/"+cardList.get(5)+".gif")); 
		 card9.setImage(new Image("file:cards/"+cardList.get(4)+".gif")); 
		 card10.setImage(new Image("file:cards/"+cardList.get(3)+".gif")); 
		 card11.setImage(new Image("file:cards/"+cardList.get(2)+".gif")); 
		 card12.setImage(new Image("file:cards/"+cardList.get(1)+".gif")); 
		 card13.setImage(new Image("file:cards/"+cardList.get(0)+".gif")); 
		
		
//		cardBox.getChildren().add(card1);
//		cardBox.getChildren().add(card2);
//		cardBox.getChildren().add(card3);
//		cardBox.getChildren().add(card4);

//		cards.add("10c");
//		cards.add("11d");
//		cards.add("3d");
//		cards.add("4h");
//		Collections.shuffle(cards);
//		System.out.println(card1);
	}
}
