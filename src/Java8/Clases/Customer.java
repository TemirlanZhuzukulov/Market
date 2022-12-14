package Java8.Clases;

import java.util.List;

public class Customer {
    private long id;
    private String username;
    private int age;
    private Card bankAccount;

    private String password;
    private List<String> invoices;

    public Customer(long id, String username, int age, Card bankAccount, String password, List<String> invoices) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.bankAccount = bankAccount;
        this.password = password;
        this.invoices = invoices;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Card getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Card bankAccount) {
        this.bankAccount = bankAccount;
    }

    public List<String> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<String> invoices) {
        this.invoices = invoices;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "\nid=" + id +
                ", \nusername='" + username + '\'' +
                ", \nbankAccount=" + bankAccount +
                ", \ninvoices=" + invoices +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    }
}
