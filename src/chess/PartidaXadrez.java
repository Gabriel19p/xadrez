package chess;

import jogo_tabuleiro.Board;
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

    private void lugarNovoPeca(char coluna, int linha, PecaXadrez peca){
        board.lugarPeca(peca, new ChessPosition(coluna, linha).toPositions());
    }

    private void iniciaPartida() {
       lugarNovoPeca('b', 6, new Torre(board, Cor.BRANCO));
       lugarNovoPeca('e', 8, new Rei(board, Cor.BRANCO));
       lugarNovoPeca('e', 1, new Rei(board, Cor.BRANCO));
    }
}
