package ch01;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(
                new Kiosk(
                        new KitchenImpl()
                )
        );
        waiter.placeOrder("123");
    }
}