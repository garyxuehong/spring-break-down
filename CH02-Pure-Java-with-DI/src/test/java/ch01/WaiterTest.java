package ch01;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    void shouldPlaceOrderWithCorrectId__WithMockito() {

        Kitchen kitchen = mock(Kitchen.class);
        when(kitchen.cook("abc")).thenReturn("mockito food abc");
        Waiter waiter = new Waiter(new Kiosk(kitchen));

        String food = waiter.placeOrder("abc");
        assertEquals(food, "mockito food abc");
    }
}