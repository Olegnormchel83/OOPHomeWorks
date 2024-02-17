package HomeWorks.HW6.Warehouse;

public class JuiceProduct extends Product {
    public JuiceProduct(String productName, int quantity, double price) {
        super(productName, quantity, price, ProductType.JUICES);
    }

    @Override
    public String toString() {
        return "Категория = Соки \n" + super.toString();
    }
}
