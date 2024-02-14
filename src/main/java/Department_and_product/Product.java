package Department_and_product;

public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity){
        return quantity*this.price;
    }
}
