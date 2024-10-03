package chess;

import jogotabuleiro.Board;
import chess.pecas.*;
import jogotabuleiro.Peca;
import jogotabuleiro.Positions;

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

    public PecaXadrez performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){
        Positions source = sourcePosition.toPositions();
        Positions target = targetPosition.toPositions();
        validateSourcePosition(source);
        Peca pecaCapturada = makeMove(source, target);
        return (PecaXadrez)pecaCapturada;
    }

    private Peca makeMove(Positions source, Positions target){
        Peca p = board.removerPeca(source);
        Peca pecaCapturada = board.removerPeca(target);
        board.lugarPeca(p, target);
        return pecaCapturada;
    }

    private void validateSourcePosition (Positions positions){
        if (!board.thereIsAPiece(positions)){
            throw new ChassException("Não existe peça nessa posição");
        }
    }

    private void lugarNovoPeca(char coluna, int linha, PecaXadrez peca){
        board.lugarPeca(peca, new ChessPosition(coluna, linha).toPositions());
    }

    private void iniciaPartida() {
        lugarNovoPeca('c', 1, new Torre(board, Cor.BRANCO));
        lugarNovoPeca('c', 2, new Torre(board, Cor.BRANCO));
        lugarNovoPeca('d', 2, new Torre(board, Cor.BRANCO));
        lugarNovoPeca('e', 2, new Torre(board, Cor.BRANCO));
        lugarNovoPeca('e', 1, new Torre(board, Cor.BRANCO));
        lugarNovoPeca('d', 1, new Rei(board, Cor.BRANCO));

        lugarNovoPeca('c', 7, new Torre(board, Cor.PRETO));
        lugarNovoPeca('c', 8, new Torre(board, Cor.PRETO));
        lugarNovoPeca('d', 7, new Torre(board, Cor.PRETO));
        lugarNovoPeca('e', 7, new Torre(board, Cor.PRETO));
        lugarNovoPeca('e', 8, new Torre(board, Cor.PRETO));
        lugarNovoPeca('d', 8, new Rei(board, Cor.PRETO));
    }
}
