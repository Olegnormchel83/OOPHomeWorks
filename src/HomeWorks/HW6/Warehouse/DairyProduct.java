package HomeWorks.HW6.Warehouse;

import lombok.Getter;

public class DairyProduct extends Product {

    @Override
    public String toString() {
        return "Категория = Молочное \n" + super.toString();
    }

    public DairyProduct(String productName, int quantity, double price) {
        super(productName, quantity, price, ProductType.DAIRY);
    }
}
