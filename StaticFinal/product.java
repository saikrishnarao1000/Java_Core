public class product {

    Double price;
    public Double getPrice() {
        return price;
    }
    public Double getPrice(int quantity) {
        return quantity*price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
class Main2{
    public static void main(String[] args)
    {
        product p = new product();
        p.getPrice();
        p.setPrice(20.98);
        Double totalPrice = p.getPrice(4);
        System.out.println("Total Price:" +totalPrice);
    }
}

