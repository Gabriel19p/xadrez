package app;

import chess.PartidaXadrez;
import chess.PecaXadrez;
import jogo_tabuleiro.Board;
import jogo_tabuleiro.Positions;

public class Program {
    public static void main(String[] args) {

        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printBoard(partidaXadrez.getPecas());
    }
}