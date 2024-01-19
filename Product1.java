package arrays;

public class Product1 implements Comparable<Product1> {

    private int id;
    private double weight;
    private double price;

    public Product1(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product1 p) {
        if(this.price > p.price ) return 1;
        else if(this.price < p.price) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Product1 p1 = new Product1(1, 0.5, 10.0);
        Product1 p2 = new Product1(2, 0.8, 15.0);

        int result = p1.compareTo(p2);

        if (result < 0) {
            System.out.println("Product 1 is cheaper than Product 2");
        } else if (result > 0) {
            System.out.println("Product 1 is more expensive than Product 2");
        } else {
            System.out.println("Product 1 and Product 2 have the same price");
        }
    }
}