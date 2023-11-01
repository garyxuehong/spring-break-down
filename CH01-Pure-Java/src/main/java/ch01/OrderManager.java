package ch01;

public class OrderManager {
    private Kitchen kitchen;

    public OrderManager() {
        this.kitchen = new KitchenImpl();
    }

    public void placeOrder() {
        kitchen.cook();
    }
}
