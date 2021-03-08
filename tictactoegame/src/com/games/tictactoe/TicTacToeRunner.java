package com.games.tictactoe;

import java.util.Scanner;

public class TicTacToeRunner {
    static int playerNumber;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] field = new char[3][3];
        int count;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = '.';
            }
        }
        boolean isProceed = true;
        System.out.println("Let's Play The TIC TAC TOE!");
        while (isProceed) {
            System.out.println("Press '1' if you wanna play for 'X' or 2 for '0'");
            playerNumber = scanner.nextInt();
            switch (playerNumber) {
                case 1:
                    System.out.println("You've chosen 'X'");
                    isProceed = false;
                    break;
                case 2:
                    System.out.println("You've chosen '0'");
                    isProceed = false;
                    break;
                default:
                    System.out.println("Wrong input. Should be 1 or 2");
            }
        }
        int horizontal;
        int vertical;
        if (playerNumber == 1) {
            while (true) {
                System.out.println("Your move:");
                horizontal = scanner.nextInt() - 1;
                vertical = scanner.nextInt() - 1;
                while (field[horizontal][vertical] != '.') {
                    System.out.println("Field is not empty. Please choose another one:");
                    horizontal = scanner.nextInt() - 1;
                    vertical = scanner.nextInt() - 1;
                }
                field[horizontal][vertical] = 'X';

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
                horizontal = (int) (Math.random() * 3);
                vertical = (int) (Math.random() * 3);
                while (field[horizontal][vertical] != '.') {
                    horizontal = (int) (Math.random() * 3);
                    vertical = (int) (Math.random() * 3);
                }
                field[horizontal][vertical] = '0';
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
                horizontal = (int) (Math.random() * 3);
                vertical = (int) (Math.random() * 3);
                while (field[horizontal][vertical] != '.') {
                    horizontal = (int) (Math.random() * 3);
                    vertical = (int) (Math.random() * 3);
                }
                field[horizontal][vertical] = 'X';
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
                horizontal = scanner.nextInt() - 1;
                vertical = scanner.nextInt() - 1;
                while (field[horizontal][vertical] != '.') {
                    System.out.println("Field is not empty. Please choose another one:");
                    horizontal = scanner.nextInt() - 1;
                    vertical = scanner.nextInt() - 1;
                }
                field[horizontal][vertical] = '0';
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

