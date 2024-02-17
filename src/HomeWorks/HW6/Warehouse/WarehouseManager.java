package HomeWorks.HW6.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class WarehouseManager implements IWarehouseManager{
    List<Product> products;
    Logger logger = new Logger();

    public WarehouseManager() {
        products = new ArrayList<>();
    }
    @Override
    public void addProduct(Product product) {
        products.add(product);
    }
    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
    public Product getProductInfo(Product product) {
        return product;
    }

    public List<Product> getProductsByCategory(ProductType productType) {
        List<Product> res = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductType().equals(productType)) {
                res.add(product);
            }
        }

        if (res.isEmpty()) {
            System.out.println("В категории " + productType + " нет товаров.");
            return null;
        } else {
            System.out.println("В категории " + productType + " есть следующие товары: ");
            return res;
        }
    }

    @Override
    public void decreaseProductQuantity(Product product, int amount) {
        logger.log("Количество " + product.productName + " уменьшилось на " + amount);
        product.setQuantity(Math.max(product.getQuantity() - amount, 0));
    }

    @Override
    public void increaseProductQuantity(Product product, int amount) {
        logger.log("Количество " + product.productName + " увеличилось на " + amount);
        product.setQuantity(product.getQuantity() + amount);
    }
}
