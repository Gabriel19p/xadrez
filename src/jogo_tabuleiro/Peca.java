package jogo_tabuleiro;

public class Peca {

    protected Positions position;
    private Board board;

    public Peca(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
