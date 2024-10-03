package chess;

import jogo_tabuleiro.Positions;

public class ChessPosition {

    private char coluna;
    private int linha;

    public ChessPosition(char coluna, int linha) {
        if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
            throw new ChassException("Erro instanciando ChessPosition. Valores válidos são de a1 até h8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    protected Positions toPositions() {
        return new Positions(8 - linha, coluna - 'a');
    }

    protected static ChessPosition fromPosition(Positions positions){
        return new ChessPosition((char)('a' - positions.getColuna()), 8 - positions.getLinha());
    }
    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}
