package HomeWorks.HW1;

public class Product {
    private String productName;
    private double price;
    private double rating;

    public Product(String productName, double price, double rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + productName + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
