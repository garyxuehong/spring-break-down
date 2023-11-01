package ch01;

public class Waiter {
    private Kiosk kiosk;

    /*
        Dependency Injection:
        Wiki: https://en.wikipedia.org/wiki/Dependency_injection#:~:text=In%20software%20engineering%2C%20dependency%20injection,opposed%20to%20creating%20them%20internally.
        Angular (frontend): https://angular.io/guide/dependency-injection
        Medium: https://medium.com/javarevisited/all-you-need-to-know-about-dependency-injection-c8f896e08993
     */
    public Waiter(Kiosk kiosk) {
        this.kiosk = kiosk;
    }

    public String placeOrder(String orderId) {
        return kiosk.placeOrder(orderId);
    }
}
