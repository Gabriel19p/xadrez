package chess.pecas;

import chess.Cor;
import chess.PecaXadrez;
import jogotabuleiro.Board;

public class Rei extends PecaXadrez {

    public Rei(Board board, Cor cor) {
        super(board, cor);
    }
    @Override
    public String toString(){
        return "R";
    }
}
