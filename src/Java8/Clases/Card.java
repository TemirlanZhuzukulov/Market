package Java8.Clases;

import Java8.Enums.Bank;

public class Card{
    private Bank bank;
    private double bankAccount;

    public Card(Bank bank, double bankAccount) {
        this.bank = bank;
        this.bankAccount = bankAccount;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "\nbank=" + bank +
                ", \nbankAccount=" + bankAccount +
                "\n~~~~~~~~~~~~~~~~~~~~~\n";
    }
}
