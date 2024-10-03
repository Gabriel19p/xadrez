package chess.pecas;

import chess.PecaXadrez;
import jogotabuleiro.Board;
import chess.Cor;

public class Torre extends PecaXadrez {

    public Torre (Board board, Cor cor) {
        super(board, cor);
    }
    @Override
    public String toString() {
        return "T";
    }
}
