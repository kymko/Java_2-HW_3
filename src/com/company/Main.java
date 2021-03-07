package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        System.out.println("На ваш баланс добавлен " + bankAccount.deposit(20000) + " cом");

        while (true)
            try {
                bankAccount.print();
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("У вас на счету: " + bankAccount.getAmount() + " сом");
                //System.out.println("хотите снять остаток?");
                Scanner scanner = new Scanner(System.in);
                //String s = scanner.nextLine();
                while (true)
                    try {
                        System.out.println("Введите сумму для снятия остатка!");
                        bankAccount.withDraw(scanner.nextInt());
                    } catch (LimitException e1) {
                        break;
                    }
                System.out.println("на вашем счету: " + bankAccount.getAmount() + " сом");
                    break;

            }


    }
}
