package chess;

import jogo_tabuleiro.Board;
import jogo_tabuleiro.Peca;

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
