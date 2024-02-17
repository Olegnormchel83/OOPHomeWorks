package HomeWorks.HW6.Warehouse;

public class WaterProduct extends Product {
    public WaterProduct(String productName, int quantity, double price) {
        super(productName, quantity, price, ProductType.WATER);
    }

    @Override
    public String toString() {
        return "Категория = Простая вода \n" + super.toString();
    }
}
