package app;

import chess.ChassException;
import chess.ChessPosition;
import chess.PartidaXadrez;
import chess.PecaXadrez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        PartidaXadrez partidaXadrez = new PartidaXadrez();

        while (true) {
            try {
                UI.limparTela();
                UI.printBoard(partidaXadrez.getPecas());
                System.out.println();
                System.out.print("Origem: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Destino: ");
                ChessPosition target = UI.readChessPosition(sc);

                PecaXadrez pecaCapturada = partidaXadrez.performChessMove(source, target);
            }
            catch (ChassException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}