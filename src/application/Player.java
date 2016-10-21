package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Player {
	private StringProperty playerName;
	private IntegerProperty score;
	private IntegerProperty tricksBid;
	private IntegerProperty tricksWon;
	private static int getXMark = 400;
	private static int getYMark = 500;
	
	public Player(String playerName, int score, int tricksBid, int tricksWon, final Node node){
		this.playerName = new SimpleStringProperty(playerName);
		this.score = new SimpleIntegerProperty(score);
		this.tricksBid = new SimpleIntegerProperty(tricksBid);
		this.tricksWon = new SimpleIntegerProperty(tricksWon);
	}
	public String getName() { 
		return playerName.get();
	}
	
	public Integer getScore() { 
		return score.get();
	}
	
	public Integer getTricksBid() { 
		return tricksBid.get();
	}
	
	public Integer getTricksWon() { 
		return tricksWon.get();
	}
	
}
