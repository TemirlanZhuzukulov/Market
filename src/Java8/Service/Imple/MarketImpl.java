package Java8.Service.Imple;

import Java8.Clases.Customer;
import Java8.Clases.Market;
import Java8.Enums.Products;
import Java8.Enums.Region;
import Java8.Service.ServiceAble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketImpl implements ServiceAble {
    List<Customer> customers = new ArrayList<>();
    List<Market> markets = new ArrayList<>();


    @Override
    public String getMarketAddress() {

            System.out.print("Enter a Market name : ");
            String marketName = new Scanner(System.in).nextLine().toLowerCase();

            for (Market market : markets) {
                if (market.getName().toLowerCase().equals(marketName)) return market.getAddress();
            }

        return "Sorry. We couldn't find a market";
    }


    @Override
    public List<Products> getProducts() {
        return List.of(Products.values());
    }

    @Override
    public Market getMarketByName() {

            System.out.print("Enter a market name : ");
            String marketName = new Scanner(System.in).nextLine().toLowerCase();
            for (Market market : markets) {
                if (market.getName().toLowerCase().equals(marketName))
                    return market;
            }

        return null;
    }


    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Customer getCustomerByUsername() {
        System.out.print("Enter customer's username : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();
        for (Customer customer : customers) {
            if (customer.getUsername().toLowerCase().equals(username)) return customer;
        }

        return null;
}


    @Override
    public List<Market> getAllMarkets() {
        return markets;
    }

    @Override
    public List<Products> getMarketProducts() {
        System.out.print("Enter a Market name : ");
        String marketName = new Scanner(System.in).nextLine().toLowerCase();

        for (Market market : markets) {
            if (market.getName().toLowerCase().equals(marketName))
                return market.getProducts();
        }
        return null;
}



    @Override
    public String createMarket() {
        System.out.print("Market ID (long) : ");
        long id = new Scanner(System.in).nextLong();


        System.out.print("Market Name : ");
        String marketName = new Scanner(System.in).nextLine();


        System.out.print("Enter your region : ");
        String region = new Scanner(System.in).nextLine();


        System.out.print("Enter a store address : ");
        String address = new Scanner(System.in).nextLine();


        System.out.print("Would you like include products (yes/no) : ");
        String includeProducts = new Scanner(System.in).next().toLowerCase();

        List<Products> products;
        if (includeProducts.equals("yes")) products = new ArrayList<>(List.of(Products.values()));
        else products = new ArrayList<>();

        List<Products> newCart = new ArrayList<>(); // initializing new empty cart

        Market newMarket = new Market(id, marketName, Region.valueOf(region), address, products, newCart);

        markets.add(newMarket);

        return "Market created successfully.";


    }
}