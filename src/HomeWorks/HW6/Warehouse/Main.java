package HomeWorks.HW6.Warehouse;

public class Main {
    static WarehouseManager warehouseManager;
    static Order order;
    public static void main(String[] args) {
        init();
        Product milk = new DairyProduct("Молоко", 500, 63.0);
        Product cheese = new DairyProduct("Сыр", 750, 120.0);
        Product smetana = new DairyProduct("Сметана", 650, 69.0);
        Product dobriy = new JuiceProduct("Сок Добрый", 700, 79.0);
        Product reach = new JuiceProduct("Сок Reach", 400, 99.0);
        Product borjomi = new WaterProduct("Боржоми", 1000, 109.0);
        Product saint = new WaterProduct("Святой Источник", 1200, 49.0);
        warehouseManager.addProduct(milk);
        warehouseManager.addProduct(cheese);
        warehouseManager.addProduct(smetana);
        warehouseManager.addProduct(dobriy);
        warehouseManager.addProduct(reach);
        warehouseManager.addProduct(borjomi);
        warehouseManager.addProduct(saint);

        //todo : 1) Посмотреть весь склад +
        //       2) Посмотреть категорию Молочное +
        //       3) Принять поставку воды (увеличить кол-во всех товаров в категории Вода на 100) и посмотреть категорию Вода +
        //       4) Составить заказ на 500 и 5000 упаковок сока Добрый,
        //          В 1 случае обработать заказ, во 2 - выдать сообщение об ошибке (Товара Х в количестве У нет на складе) +
        //       5) Посмотреть весь склад +

        System.out.println("Пункт 1:");
        System.out.println(warehouseManager.getProducts());
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Пункт 2:");
        System.out.println(warehouseManager.getProductsByCategory(ProductType.DAIRY));
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Пункт 3:");
        warehouseManager.increaseProductQuantity(borjomi, 100);
        warehouseManager.increaseProductQuantity(saint, 100);
        System.out.println(warehouseManager.getProductsByCategory(ProductType.WATER));
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Пункт 4:");
        order.createOrder(dobriy, 500);
        order.createOrder(dobriy, 5000);
        System.out.println(warehouseManager.getProductsByCategory(ProductType.JUICES));
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Пункт 5:");
        System.out.println(warehouseManager.getProducts());
        System.out.println("--------------------------------------------------------------------------------");

    }

    private static void init() {
        warehouseManager = new WarehouseManager();
        order = new Order();
    }
}
