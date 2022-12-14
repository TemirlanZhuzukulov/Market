package Java8.Service;

import Java8.Clases.Customer;
import Java8.Clases.Market;
import Java8.Enums.Products;

import java.util.List;

public interface ServiceAble {

    String getMarketAddress();
    List<Products> getProducts();
    Market getMarketByName();
    List<Customer> getAllCustomers();
    Customer getCustomerByUsername();
    List<Market> getAllMarkets();
    List<Products> getMarketProducts();
    String createMarket();

}

