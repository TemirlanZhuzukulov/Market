package Java8.Enums;

public enum Products {
    Apple("Apple",60,0.2),
    Bread("Bread",30),
    WATER("WATER",30,0.3),
    COLA("COLA",80,1),
    FISH("FISH",300,0.1),
    COOKIE("COOKIE",150,0.05),
    CHOCOLATE("CHOCOLATE",130),
    MEAT("MEAT",350,1),
    TEA("TEA",70);

    String name;
    double price;
    double discountPrice = 1;

    Products(String name, double price, double discountPrice) {
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
    }
    Products(String name , double price){
        this.name = name;
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
