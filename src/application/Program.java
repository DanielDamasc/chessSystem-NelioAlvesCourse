package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		/* teste */
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
