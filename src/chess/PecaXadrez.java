package chess;

import jogotabuleiro.Board;
import jogotabuleiro.Peca;

public class PecaXadrez extends Peca {

    private Cor cor;

    public PecaXadrez(Board board, Cor cor) {
        super(board);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
