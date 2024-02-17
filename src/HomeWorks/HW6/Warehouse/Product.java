package HomeWorks.HW6.Warehouse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Product {
    protected String productName;

    @Getter @Setter
    protected int quantity;
    protected double price;

    @Getter
    private ProductType productType;

    public Product(String productName, int quantity, double price, ProductType productType) {
        this.productName = productName;
        if (quantity < 0 ) quantity = 0;
        if (price < 0) price = 0;
        this.quantity = quantity;
        this.price = price;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return productName + "\n" +
                " Ост. на складе = " + quantity + "\n" +
                " Цена = " + price + "\n\n";
    }
}
