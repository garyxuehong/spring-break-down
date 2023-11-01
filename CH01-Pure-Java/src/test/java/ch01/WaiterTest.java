package ch01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WaiterTest {

    @Test
    void shouldPlaceOrderWithCorrectId() {
        Waiter waiter = new Waiter();
        String food = waiter.placeOrder("abc");
        assertEquals(food, "some test food");
    }
}