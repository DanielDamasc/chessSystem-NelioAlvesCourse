package boardgame;

public class Piece {
	/* protected porque a posi��o n�o deve ser vista na 
	 * cadama de xadrez. N�o representa uma posi��o real do xadrez */
	protected Position position;
	
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		/* posi��o de um pe�a rec�m criada � nula */
		position = null;
	}

	/* o tabuleiro deve ser vis�vel somente dentro da 
	 * camada border */
	protected Board getBoard() {
		return board;
	}
	
}
