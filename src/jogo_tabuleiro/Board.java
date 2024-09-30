package jogo_tabuleiro;

public class Board {

    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Board(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public Peca peca(int linhas, int colunas){
        return pecas [linhas][colunas];
    }
    public Peca peca(Positions positions) {
        return pecas[positions.getLinha()][positions.getColuna()];
    }

    public void lugarPeca(Peca peca, Positions positions){
        pecas[positions.getLinha()][positions.getColuna()] = peca;
        peca.position = positions;
    }

}
