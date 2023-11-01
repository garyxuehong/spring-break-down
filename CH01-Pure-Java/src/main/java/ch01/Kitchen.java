package ch01;

public class Kitchen {
    public String cook(String orderId) {
        System.out.println("===============================");
        System.out.println("!!!COOKING REAL ORDER " + orderId + " !!!! .... ");
        System.out.println("It take times...............");
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("===============================");
        return "Real Food from order: " + orderId;
    }
}
