package task_25atm;


/**
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
 * банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
 * 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 * снимающую деньги. На вход передается сумма денег. На выход – булевское
 * значение (операция удалась или нет). При снятии денег функция должна
 * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами – количеством купюр.
 */
public class ATM {
    private int amountTwenties;
    private int amountFifties;
    private int amountHundreds;

    public ATM(int amountTwenties, int amountFifties, int amountHundreds) {
        this.amountTwenties = amountTwenties;
        this.amountFifties = amountFifties;
        this.amountHundreds = amountHundreds;
    }

    public ATM() {
    }

    public boolean isCashOut(int amount) {
        int twentiesLeft = amountTwenties;
        int fiftiesLeft = amountFifties;
        int hundredsLeft = amountHundreds;
        int amountLeft = amount;
        int twentiesCount = 0;
        int fiftiesCount = 0;
        int hundredsCount = 0;

        if (amountLeft == 10 || amountLeft == 30) {
            System.out.println("It cannot process");
            return false;
        }
        while (amountLeft >= 100 && hundredsLeft > 0) {
            amountLeft -= 100;
            hundredsCount++;
            hundredsLeft--;

        }
        while (amountLeft >= 50 && fiftiesLeft > 0) {
            amountLeft -= 50;
            fiftiesCount++;
            fiftiesLeft--;
        }
        while (amountLeft >= 20 && twentiesLeft > 0) {
            amountLeft -= 20;
            twentiesCount++;
            twentiesLeft--;
        }
        if (amountLeft == 0) {
            System.out.println("Banknotes 100: " + hundredsCount +
                    "\nBanknotes 50: " + fiftiesCount +
                    "\nBanknotes 20: " + twentiesCount);
            return true;
        } else {
            amountLeft = amount;
            twentiesLeft = amountTwenties;
            fiftiesLeft = amountFifties;
            hundredsLeft = amountHundreds;
            twentiesCount = 0;
            fiftiesCount = 0;
            hundredsCount = 0;
            while (amountLeft > 200 && hundredsLeft != 0) {
                amountLeft -= 100;
                hundredsLeft--;
                hundredsCount++;
            }
            if (fiftiesLeft % 2 != 0) {
                while (amountLeft > 100 && fiftiesLeft != 0) {
                    amountLeft -= 50;
                    fiftiesLeft--;
                    fiftiesCount++;
                }
            } else {
                while (amountLeft > 100 && fiftiesLeft != 1) {
                    amountLeft -= 50;
                    fiftiesLeft--;
                    fiftiesCount++;
                }
            }
            while (amountLeft != 0 && twentiesLeft != 0){
                amountLeft -= 20;
                twentiesLeft--;
                twentiesCount++;
            }
            if(amountLeft !=0){
                System.out.println("Out of money");
                return false;
            }
            System.out.println("Banknotes 100: " + hundredsCount +
                    "\nBanknotes 50: " + fiftiesCount +
                    "\nBanknotes 20: " + twentiesCount);
            System.out.println("amount left : " + amountLeft);
        }
        return true;
    }

    public void addAmountTwenties(int amountTwenties) {
        this.amountTwenties += amountTwenties;
    }

    public void addAmountFifties(int amountFifties) {
        this.amountFifties += amountFifties;
    }

    public void addAmountHundreds(int amountHundreds) {
        this.amountHundreds += amountHundreds;
    }

    public int getAmountTwenties() {
        return amountTwenties;
    }

    public void setAmountTwenties(int amountTwenties) {
        this.amountTwenties = amountTwenties;
    }

    public int getAmountFifties() {
        return amountFifties;
    }

    public void setAmountFifties(int amountFifties) {
        this.amountFifties = amountFifties;
    }

    public int getAmountHundreds() {
        return amountHundreds;
    }

    public void setAmountHundreds(int amountHundreds) {
        this.amountHundreds = amountHundreds;
    }

}
