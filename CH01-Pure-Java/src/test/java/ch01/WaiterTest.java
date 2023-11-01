package ch01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WaiterTest {

    @Test
    void shouldPlaceOrderWithCorrectId() {
        Kiosk kiosk = new Kiosk();
        String food = kiosk.placeOrder("abc");
        assertEquals(food, "some test food");
    }
}