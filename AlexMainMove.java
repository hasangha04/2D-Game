import java.util.*;

public class AlexMainMove {

	public static void main(String[] args) {
		boolean endgame = false;

		Board Board = new Board(3);

		char move = 'n';// creates new board
		if (move == 'n') {
			Board.populateEmptyBoard(Board);
			Board.printBoard(Board);
		}

		while (!endgame) {
			System.out.println("W - up\nS - down\nA - left\nD - Right");

			Scanner input = new Scanner(System.in);
			move = input.next().charAt(0);

			if (move == 'w') {
				//if GetTile grid.tile[d][getHeroYPos-1] == empty){
					//grid.[getHeroXPos, getHeroYPos] == empty;
					//grid[getHeroXPos][getHeroYPos - 1] = player icon
				//
				System.out.println("pressed w");
			} else if (move == 's') {
				System.out.println("pressed s");
			} else if (move == 'a') {
				System.out.println("pressed a");
			} else if (move == 'd') {
				System.out.println("pressed d");
			}
		}
	}
}