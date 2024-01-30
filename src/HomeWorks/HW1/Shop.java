package HomeWorks.HW1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void printCatalog() {
        for (Category category : categories) {
            System.out.println(category.getCategoryName());
            List<Product> products = category.getProducts();
            for (Product product : products) {
                System.out.println(product.getProductName()
                        + ". Цена:  " + product.getPrice()
                        + ". Рейтинг:  " + product.getRating());
            }
            System.out.println();
        }
    }
}
