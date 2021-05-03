package task_25atm;

import java.util.Scanner;

public class ATMRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10, 5, 4);
        System.out.println("Cash out, please enter amount of money:");
        int amountCashOut = scanner.nextInt();
        System.out.println(atm.isCashOut(amountCashOut));
    }
}
