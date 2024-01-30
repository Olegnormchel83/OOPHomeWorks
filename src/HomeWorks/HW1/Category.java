package HomeWorks.HW1;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private ArrayList<Product> products;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.products = new ArrayList<>();
    }

    public Category() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + products +
                '}';
    }
}
