package ch01;

public class Waiter {
    private Kiosk kiosk;

    public Waiter(Kiosk kiosk) {
        this.kiosk = kiosk;
    }

    public String placeOrder(String orderId) {
        return kiosk.placeOrder(orderId);
    }
}
