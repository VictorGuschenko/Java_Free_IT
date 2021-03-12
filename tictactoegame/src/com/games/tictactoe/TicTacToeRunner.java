package com.games.tictactoe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class TicTacToeRunner {
    static int playerNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] field = new char[3][3];
        Pattern regexp;
        Matcher matcher;
        String move;
        int count;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = '.';
            }
        }
        boolean isProceed = true;
        System.out.println("Let's play the TIC TAC TOE!");
        while (isProceed) {
            System.out.println("Press '1' if you want to play for 'X'");
            System.out.println("Press '2' if you want to play for '0'");
            String symbols = scanner.nextLine().trim();
            regexp = Pattern.compile("[12]?");
            matcher = regexp.matcher(symbols);
            if (matcher.matches() && !symbols.equals("")) {
                playerNumber = parseInt(symbols);
                switch (playerNumber) {
                    case 1:
                        System.out.println("You've chosen 'X'");
                        isProceed = false;
                        break;
                    case 2:
                        System.out.println("You've chosen '0'");
                        isProceed = false;
                        break;
                }
            } else {
                System.out.println("Wrong input: it should be 1 or 2");
            }
        }
        System.out.println("To make a move You should type row and column through the \"space\"");
        System.out.println("For example input can be: \"1 2\" or \"3 3\" etc.");
        int row = 0;
        int col = 0;
        if (playerNumber == 1) {
            while (true) {
                System.out.println("Your move:");
                do {
                    move = scanner.nextLine().trim().replaceAll(" +", " ");
                    regexp = Pattern.compile("[123] [123]");
                    if (!(regexp.matcher(move).matches())) {
                        System.out.println("Wrong input. It should be \"raw col\"");
                    } else {
                        row = move.charAt(0) - 49;
                        col = move.charAt(2) - 49;
                        if (field[row][col] != '.') {
                            System.out.println("The field is not empty. Please take another.");
                        }
                    }
                } while (!(regexp.matcher(move).matches()) || field[row][col] != '.');

                field[row][col] = 'X';
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; j++) {
                        System.out.print(chars[j] + " ");
                    }
                    System.out.println();
                }

                for (char[] chars : field) {
                    for (int j = 0; j < field.length; ) {
                        if (chars[j] != 'X') {
                            break;
                        }
                        j++;
                        if (j == 3) {
                            System.out.println("You win!");
                            return;
                        }
                    }
                }
                for (int j = 0; j < field.length; j++) {
                    for (int i = 0; i < field.length; ) {
                        if (field[i][j] != 'X') {
                            break;
                        }
                        i++;
                        if (i == 3) {
                            System.out.println("You win");
                            return;
                        }
                    }
                }
                if (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') {
                    System.out.println("You win");
                    return;
                }
                if (field[2][0] == 'X' && field[1][1] == 'X' && field[0][2] == 'X') {
                    System.out.println("You win");
                    return;
                }
                count = 0;
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; j++) {
                        if (chars[j] == '.') {
                            count++;
                            break;
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("\nDraw");
                    return;
                }
                System.out.println("\nComputer move:");
                row = (int) (Math.random() * 3);
                col = (int) (Math.random() * 3);
                while (field[row][col] != '.') {
                    row = (int) (Math.random() * 3);
                    col = (int) (Math.random() * 3);
                }
                field[row][col] = '0';
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; j++) {
                        System.out.print(chars[j] + " ");
                    }
                    System.out.println();
                }
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; ) {
                        if (chars[j] != '0') {
                            break;
                        }
                        j++;
                        if (j == 3) {
                            System.out.println("You lose!");
                            return;
                        }
                    }
                }
                for (int j = 0; j < field.length; j++) {
                    for (int i = 0; i < field.length; ) {
                        if (field[i][j] != '0') {
                            break;
                        }
                        i++;
                        if (i == 3) {
                            System.out.println("You lose");
                            return;
                        }
                    }
                }
                if (field[0][0] == '0' && field[1][1] == '0' && field[2][2] == '0') {
                    System.out.println("You lose");
                    return;
                }
                if (field[2][0] == '0' && field[1][1] == '0' && field[0][2] == '0') {
                    System.out.println("You lose");
                    return;
                }
            }
        } else {
            while (true) {
                System.out.println("\nComputer move:");
                row = (int) (Math.random() * 3);
                col = (int) (Math.random() * 3);
                while (field[row][col] != '.') {
                    row = (int) (Math.random() * 3);
                    col = (int) (Math.random() * 3);
                }
                field[row][col] = 'X';
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; j++) {
                        System.out.print(chars[j] + " ");
                    }
                    System.out.println();
                }
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; ) {
                        if (chars[j] != 'X') {
                            break;
                        }
                        j++;
                        if (j == 3) {
                            System.out.println("You lose!");
                            return;
                        }
                    }
                }
                for (int j = 0; j < field.length; j++) {
                    for (int i = 0; i < field.length; ) {
                        if (field[i][j] != 'X') {
                            break;
                        }
                        i++;
                        if (i == 3) {
                            System.out.println("You lose");
                            return;
                        }
                    }
                }
                if (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') {
                    System.out.println("You lose");
                    return;
                }
                if (field[2][0] == 'X' && field[1][1] == 'X' && field[0][2] == 'X') {
                    System.out.println("You lose");
                    return;
                }
                count = 0;
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; j++) {
                        if (chars[j] == '.') {
                            count++;
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("\nDraw");
                    return;
                }
                System.out.println("\nYour move:");

                do {
                    move = scanner.nextLine().trim().replaceAll(" +", " ");
                    regexp = Pattern.compile("[123] [123]");
                    if (!(regexp.matcher(move).matches())) {
                        System.out.println("Wrong input. It should be \"raw col\"");
                    } else {
                        row = move.charAt(0) - 49;
                        col = move.charAt(2) - 49;
                        if (field[row][col] != '.') {
                            System.out.println("The field is not empty. Please take another.");
                        }
                    }
                } while (!(regexp.matcher(move).matches()) || field[row][col] != '.');

                field[row][col] = '0';
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; j++) {
                        System.out.print(chars[j] + " ");
                    }
                    System.out.println();
                }
                for (char[] chars : field) {
                    for (int j = 0; j < field.length; ) {
                        if (chars[j] != '0') {
                            break;
                        }
                        j++;
                        if (j == 3) {
                            System.out.println("You win!");
                            return;
                        }
                    }
                }
                for (int j = 0; j < field.length; j++) {
                    for (int i = 0; i < field.length; ) {
                        if (field[i][j] != '0') {
                            break;
                        }
                        i++;
                        if (i == 3) {
                            System.out.println("You win");
                            return;
                        }
                    }
                }
                if (field[0][0] == '0' && field[1][1] == '0' && field[2][2] == '0') {
                    System.out.println("You win");
                    return;
                }
                if (field[2][0] == '0' && field[1][1] == '0' && field[0][2] == '0') {
                    System.out.println("You win");
                    return;
                }
            }
        }
    }
}

