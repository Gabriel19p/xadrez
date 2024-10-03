package jogotabuleiro;

public class Board {

    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Board(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1 ){
            throw new TabuleiroException("Erro criando tabuleiro: é necessário que haja pelo menos 1 linha e 1 coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linhas, int colunas){
        if (!positionExists(linhas, colunas)){
            throw new TabuleiroException("Posição não existe no tabuleiro");
        }
        return pecas [linhas][colunas];
    }
    public Peca peca(Positions positions) {
        if (!positionExists(positions)){
            throw new TabuleiroException("Posição não existe no tabuleiro");
        }
        return pecas[positions.getLinha()][positions.getColuna()];
    }

    public void lugarPeca(Peca peca, Positions positions){
        if (thereIsAPiece(positions)){
            throw new TabuleiroException("Já existe uma peça na posição " + positions);
        }
        pecas[positions.getLinha()][positions.getColuna()] = peca;
        peca.position = positions;
    }

    public Peca removerPeca(Positions positions) {
        if (!positionExists(positions)) {
            throw new TabuleiroException("Essa posição não existe");
        }
        if (peca(positions) == null) {
            return null;
        }
        Peca aux = peca(positions);
        aux.position = null;
        pecas[positions.getLinha()][positions.getColuna()] = null;
        return aux;
    }

    private boolean positionExists(int linha, int coluna){
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }
    public boolean positionExists(Positions positions){
    return positionExists(positions.getLinha(), positions.getColuna());

    }
    public boolean thereIsAPiece(Positions positions){
        if (!positionExists(positions)){
            throw new TabuleiroException("Posição não existe no tabuleiro");
        }
       return peca(positions) != null;
    }
}
