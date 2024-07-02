package br.com.avanade.order.order_service.core.dtos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class OrderEventTest {

    @InjectMocks
    private OrderEvent orderEvent;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void OrderEventAllArgsConstructor() {
        orderEvent = new OrderEvent("test message", "1");
        assertNotNull(orderEvent);
    }

    @Test
    void OrderEventIdConstructor() {
        orderEvent = new OrderEvent("1");
        assertNotNull(orderEvent);
    }

    @Test
    void OrderEventNoArgsConstructor() {
        orderEvent = new OrderEvent();
        assertNotNull(orderEvent);
    }
}