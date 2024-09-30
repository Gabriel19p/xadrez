package chess;

import jogo_tabuleiro.Board;
import jogo_tabuleiro.Positions;
import chess.pecas.*;

public class PartidaXadrez {

    private Board board;

    public PartidaXadrez() {
        board = new Board(8,8);
        iniciaPartida();
    }

    public PecaXadrez [][] getPecas() {
        PecaXadrez[][] mat = new PecaXadrez[board.getLinhas()][board.getColunas()];
        for (int i=0; i<board.getLinhas(); i++){
            for (int j=0; j< board.getColunas(); j++){
                mat[i][j] = (PecaXadrez) board.peca(i,j);
            }
        }
return mat;
    }


    private void iniciaPartida() {
        board.lugarPeca(new Torre(board, Cor.BRANCO), new Positions(2,1));
        board.lugarPeca(new Rei(board, Cor.PRETO), new Positions(0,4));
        board.lugarPeca(new Rei(board, Cor.BRANCO), new Positions(7,4));
    }
}
