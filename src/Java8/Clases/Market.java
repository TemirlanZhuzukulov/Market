package Java8.Clases;

import Java8.Enums.Products;
import Java8.Enums.Region;

import java.util.List;

public class Market {
    private long id;
    private String name;
    private Region region;
    private String address;
    private List<Products> products;
    private List<Products> cart;

    public Market(long id, String name, Region region, String address, List<Products> products, List<Products> cart) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.address = address;
        this.products = products;
        this.cart = cart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public List<Products> getCart() {
        return cart;
    }

    public void setCart(List<Products> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "\nMarket{" +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \naddress='" + address + '\'' +
                ", \nproducts=" + products +
                ", \ncart=" + cart +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    }
}
