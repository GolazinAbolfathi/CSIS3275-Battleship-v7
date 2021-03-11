package com.example.battleshipv7;

import com.example.battleshipv7.entity.Battleship;
import com.example.battleshipv7.GUI.Update_view;
import com.example.battleshipv7.controller.BattleshipGUIController;
import com.example.battleshipv7.model.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.*;

@SpringBootApplication
public class BattleshipV7Application extends JFrame {

	public static void main(String[] args) {
		int xShip1Position = 0;
		int yShip1Position = 0;

		int xShip2Position = 0;
		int yShip2Position = 0;

		int xShip3Position = 0;
		int yShip3Position = 0;

		boolean hit = false;
		boolean miss = false;
		int row = 0;
		int col = 0;

		SpringApplication.run(BattleshipV7Application.class, args);

		//open main board
		Update_view update_view = new Update_view();
		update_view.displayBoard();

//		//create 3 Battleships:
		Battleship ship1 = new Battleship(1, 1, 0, 0);
		Battleship ship2 = new Battleship(1, 0, 1, 0);
		Battleship ship3 = new Battleship(1, 2, 2, 0);

		xShip1Position = ship1.getX();
		yShip1Position = ship1.getY();

		xShip2Position = ship2.getX();
		yShip2Position = ship2.getY();

		xShip3Position = ship3.getX();
		yShip3Position = ship3.getY();

		BattleshipGUIController battleshipGUIController = new BattleshipGUIController(xShip1Position,yShip1Position,xShip2Position,yShip2Position,xShip3Position,yShip3Position);


	}
}
