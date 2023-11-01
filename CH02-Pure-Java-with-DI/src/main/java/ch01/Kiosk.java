package ch01;

public class Kiosk {
    private Kitchen kitchen;

    public Kiosk(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public String placeOrder(String orderId) {
        return kitchen.cook(orderId);
    }
}
