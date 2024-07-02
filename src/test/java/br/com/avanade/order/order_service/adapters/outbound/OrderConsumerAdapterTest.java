package br.com.avanade.order.order_service.adapters.outbound;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import br.com.avanade.order.order_service.core.ports.outbound.SaveOrderRepositoryPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderConsumerAdapterTest {

    @Mock
    private SaveOrderRepositoryPort repositoryPort;

    @Mock
    private FindOrderRepositoryAdapter repositoryAdapter;

    @InjectMocks
    private OrderConsumerAdapter adapter;

    @Test
    void execute() throws OrderNotFoundException {
        Order order = new Order("1", OrderStatus.ENVIADO_TRANSPORTADORA);
        when(repositoryAdapter.execute("1")).thenReturn(order);
        when(repositoryPort.saveOrder(order)).thenReturn(order);
        assertDoesNotThrow(() -> adapter.execute("1"));
    }
}