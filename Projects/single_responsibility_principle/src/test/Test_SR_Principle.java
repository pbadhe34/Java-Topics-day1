package test;

import java.util.ArrayList;

import app.Board;
import app.BoardPresenter;
import app.BoardShaper;

public class Test_SR_Principle {

	public static void main(String[] args) {
		BoardShaper shaper = new BoardShaper(8);
		Board boardObj = new Board(8);
		
		ArrayList<ArrayList<Integer>> list = shaper.rowIndexes();
		ArrayList <String> list2=  boardObj.valuesAt(list.get(0));
		BoardPresenter presenter = new BoardPresenter(boardObj);
		
		presenter.displayBoard();
		
 
		
		 // System.out.println("The board list1 is "+list);
		  
		 // System.out.println("The board list2 is "+list2);
	}

}
