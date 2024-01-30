package HomeWorks.HW1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Category bake = new Category("Выпечка");
        bake.addProduct(new Product("Хлеб", 35.0, 5));
        bake.addProduct(new Product("Булочка", 20.0, 4));
        bake.addProduct(new Product("Маффин", 15.0, 4));

        Category water = new Category("Вода");
        water.addProduct(new Product("Кола", 79.0, 5));
        water.addProduct(new Product("Простая вода", 55.0, 5));
        water.addProduct(new Product("Сок", 65.0, 4));

        Category hygiene = new Category("Гигиена");
        hygiene.addProduct(new Product("Зубная паста", 99.0, 4));
        hygiene.addProduct(new Product("Шампунь", 129.0, 5));
        hygiene.addProduct(new Product("Крем", 109.0, 4));

        shop.addCategory(bake);
        shop.addCategory(water);
        shop.addCategory(hygiene);

        shop.printCatalog();

        User user1 = new User("Oleg", "q1w2e3r4");
        User user2 = new User("Matvey", "qazwsxedc");
        User user3 = new User("Sergey", "zxcasdqwe");

        user1.getBasket().addProduct(bake.getProducts().get(0));
        user2.getBasket().addProduct(water.getProducts().get(1));
        user3.getBasket().addProduct(hygiene.getProducts().get(2));

        bake.getProducts().remove(0);
        water.getProducts().remove(1);
        hygiene.getProducts().remove(2);

        System.out.println(user1.getUserLogin() + " Покупки: ");
        List<Product> user1Products = user1.getBasket().getProducts();
        for (Product product : user1Products) {
            System.out.println(product.getProductName() + ". Цена: " + product.getPrice());
        }

        System.out.println();
        System.out.println(user2.getUserLogin() + " Покупки: ");
        List<Product> user2Products = user2.getBasket().getProducts();
        for (Product product : user2Products) {
            System.out.println(product.getProductName() + ". Цена: " + product.getPrice());
        }

        System.out.println();
        System.out.println(user3.getUserLogin() + " Покупки: ");
        List<Product> user3Products = user3.getBasket().getProducts();
        for (Product product : user3Products) {
            System.out.println(product.getProductName() + ". Цена: " + product.getPrice());
        }

        System.out.println();
        shop.printCatalog();
    }
}
