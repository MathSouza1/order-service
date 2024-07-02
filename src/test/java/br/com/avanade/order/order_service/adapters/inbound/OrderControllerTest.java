package br.com.avanade.order.order_service.adapters.inbound;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import br.com.avanade.order.order_service.core.ports.inbound.CreateOrderPort;
import br.com.avanade.order.order_service.core.ports.inbound.FindOrderByIdPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.when;

class OrderControllerTest {

    @Mock
    private CreateOrderPort createOrderPort;

    @Mock
    private FindOrderByIdPort findOrderByIdPort;

    @InjectMocks
    private OrderController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createOrder() throws Exception {
        when(createOrderPort.execute()).thenReturn(new Order("1", OrderStatus.ENVIADO_TRANSPORTADORA));
        assertDoesNotThrow(() -> controller.createOrder());
    }

    @Test
    void findOrderById() throws OrderNotFoundException {
        when(findOrderByIdPort.execute("1")).thenReturn(new Order("1", OrderStatus.ENVIADO_TRANSPORTADORA));
        assertDoesNotThrow(() -> controller.findOrderById("1"));
    }
}
