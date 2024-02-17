package HomeWorks.HW6.Warehouse;

import java.util.List;

public interface IWarehouseManager {
    void decreaseProductQuantity(Product product, int amount);
    void increaseProductQuantity(Product product, int amount);
    void addProduct(Product product);
    void removeProduct(Product product);
    List<Product> getProducts();
}
