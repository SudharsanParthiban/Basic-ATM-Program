package com.company;

public class second {
    public void displayBalance(int balance){
        System.out.println("current Balance : "+balance);
        System.out.println("---------------------------------");
    }
    public int WithDraw(int balance, int withdrawAmount){
        System.out.println("Withdraw Amount : "+withdrawAmount);
        System.out.println("---------------------------------");
        if(balance>=withdrawAmount){
            balance = balance-withdrawAmount;
            System.out.println("Transaction succesfully completed");
            System.out.println("---------------------------------");
            displayBalance(balance);

        }
        else{
            System.out.println("Insufficient Funds!!!!");
            System.out.println("---------------------------------");
        }
        return balance;
    }
    public int Deposit(int balance, int Amount){
        System.out.println("Deposit Amount : "+Amount);
        System.out.println("---------------------------------");
        balance = balance+Amount;
        System.out.println("Amount Successfully Deposited");
        System.out.println("---------------------------------");
        displayBalance(balance);
        return balance;
    }
}
