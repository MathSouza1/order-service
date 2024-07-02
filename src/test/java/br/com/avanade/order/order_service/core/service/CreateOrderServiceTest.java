package br.com.avanade.order.order_service.core.service;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import br.com.avanade.order.order_service.core.ports.outbound.OrderProducerPort;
import br.com.avanade.order.order_service.core.ports.outbound.SaveOrderRepositoryPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CreateOrderServiceTest {

    @Mock
    private SaveOrderRepositoryPort repositoryPort;

    @Mock
    private OrderProducerPort producerPort;

    @InjectMocks
    private CreateOrderService service;

    @Test
    void execute() {
        Order order = new Order(OrderStatus.AGUARDANDO_ENVIO);
        when(repositoryPort.saveOrder(any())).thenReturn(order);
        assertDoesNotThrow(() -> service.execute());
    }
}