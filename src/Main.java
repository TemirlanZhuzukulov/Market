import Java8.Service.Imple.MarketImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MarketImpl market= new MarketImpl();



        while(true){
            System.out.print("""
                    1. Create Market
                    2. Get All Markets
                    3. Get All Customers
                    4. Get Market by name
                    5. Get Customer by username
                    6. Get All Products
                    7. Get Market Products
                    8. Get Market Address
                   \n""");

            System.out.println("Enter your option ");
            Scanner scanner =new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number){

                case 1 -> System.out.println(market.createMarket());
                case 2 -> System.out.println(market.getAllMarkets());
                case 3 -> System.out.println(market.getAllCustomers());
                case 4 -> System.out.println(market.getMarketByName());
                case 5 -> System.out.println(market.getCustomerByUsername());
                case 6 -> System.out.println(market.getProducts());
                case 7 -> System.out.println(market.getMarketProducts());
                case 8 -> System.out.println(market.getMarketAddress());

            }
        }





    }
}