package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner a = new Scanner(System.in);
        System.out.println("Welcome to World of Tic Tac Toe");
        System.out.println("Wanna play the game?");
        System.out.println("Press 1 for YES or press 2 for NO");
        int num = a.nextInt();
        if (num == 1)
        {
            TicTacToe game = new TicTacToe();
            do
            {
                String currentPlayer = "Player 1";
                if (game.currentPlayerMark == 'o')
                    currentPlayer = "Player 2";

                System.out.println(currentPlayer + ": Please pick a spot for rows 0-2");
                int x = a.nextInt();
                System.out.println(currentPlayer + ": Please pick a spot for column 0-2");
                int y = a.nextInt();
                if (game.placeMark(x, y))
                {
                    game.printBoard();
                    if (game.checkForWin()) {
                        System.out.println("We have a winner! Congrats! " + currentPlayer);
                        System.exit(0);
                    }
                    else if (game.FullBoard()) {
                        System.out.println("Appears we have a draw!");
                        System.exit(0);
                    }
                    game.changePlayer();
                }
                else
                {
                    System.out.println("space not available, try again!");
                }

            }while (!game.FullBoard());

        }
        else
        {
            System.out.println("What a shame, bye!");
        }
        /*
        TicTacToe game = new TicTacToe();
        game.placeMark(0,2);
        game.printBoard();
        if (game.checkForWin()) {
            System.out.println("We have a winner! Congrats!");
            System.exit(0);
        }
        else if (game.FullBoard()) {
            System.out.println("Appears we have a draw!");
            System.exit(0);
        }
        game.changePlayer(); */
    }
}
