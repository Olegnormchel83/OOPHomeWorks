package HomeWorks.HW6.Warehouse;

public class Order implements IOrder {
    WarehouseManager warehouseManager;
    Logger logger;
    public Order() {
        warehouseManager = new WarehouseManager();
        logger = new Logger();
    }

    private void cancelOrder(Product product, int amount) {
        logger.log("Товара " + product.productName + " в количестве " + amount + " нет на складе.");
    }
    private void processOrder(Product product, int amount) {
        logger.log("Обработка заказа. Товар: \n " + product.productName + "Количество в заказе - " + amount + ";");
    }
    @Override
    public void createOrder(Product product, int amount) {
        if (warehouseManager.getProductInfo(product).quantity < amount) {
            cancelOrder(product, amount);
        } else {
            warehouseManager.decreaseProductQuantity(product, amount);
            processOrder(product, amount);
        }
    }
}
