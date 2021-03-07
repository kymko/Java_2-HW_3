package com.company;

public class BankAccount {
    private double amount;


    public double deposit(double sum) {
        amount += sum;
        return this.amount;

    }

    public double getAmount() {
        return amount;
    }

    public double withDraw(double sum) throws LimitException {


        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма больше чем остаток!", getAmount());

        }
        return deposit(-sum);

    }


    public void print() {

        System.out.println("Остаток: " + getAmount() + " сом");

    }


}
