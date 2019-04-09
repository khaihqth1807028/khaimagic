package main;

import entity.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(1000, 10);
        System.out.println(" xà lê xà lô =" +bank.calculateInterest());
    }
}

