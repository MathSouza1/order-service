package br.com.avanade.order.order_service.core.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class OrderTest {

    @InjectMocks
    private Order order;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void setStatus() {
        order.setStatus(OrderStatus.ENVIADO_TRANSPORTADORA);
        assertNotNull(order);
    }

    @Test
    void toOrder() {
        order = new Order(OrderStatus.ENVIADO_TRANSPORTADORA);
        assertNotNull(order);
    }
}