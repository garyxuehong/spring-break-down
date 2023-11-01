package ch01;

public class Kiosk {
    private Kitchen kitchen;

    public Kiosk() {
        this.kitchen = new Kitchen();
    }

    public String placeOrder(String orderId) {
        return kitchen.cook(orderId);
    }
}
