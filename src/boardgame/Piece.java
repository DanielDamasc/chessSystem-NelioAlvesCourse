package boardgame;

public class Piece {
	/* protected porque a posição não deve ser vista na 
	 * cadama de xadrez. Não representa uma posição real do xadrez */
	protected Position position;
	
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		/* posição de um peça recém criada é nula */
		position = null;
	}

	/* o tabuleiro deve ser visível somente dentro da 
	 * camada border */
	protected Board getBoard() {
		return board;
	}
	
}
