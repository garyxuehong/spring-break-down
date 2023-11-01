package ch01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WaiterTest {

    @Test
    void shouldPlaceOrderWithCorrectId() {
        Waiter waiter = new Waiter(new Kiosk(new Kitchen() {
            @Override
            public String cook(String orderId) {
                return "fake food " + orderId;
            }
        }));

        String food = waiter.placeOrder("abc");
        assertEquals(food, "fake food abc");
    }
}