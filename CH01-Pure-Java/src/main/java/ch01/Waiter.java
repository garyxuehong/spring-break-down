package ch01;

public class Waiter {
    private Kiosk kiosk;

    public Waiter() {
        this.kiosk = new Kiosk();
    }

    public String placeOrder(String orderId) {
        return kiosk.placeOrder(orderId);
    }
}
