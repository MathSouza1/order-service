package br.com.avanade.order.order_service.adapters.outbound;

import br.com.avanade.order.order_service.adapters.outbound.repositories.OrderRepository;
import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class SaveOrderRepositoryAdapterTest {

    @Mock
    private OrderRepository repository;

    @InjectMocks
    private SaveOrderRepositoryAdapter adapter;

    @Test
    void saveOrder() {
        assertThrows(NullPointerException.class, () -> adapter.saveOrder(new Order("1", OrderStatus.ENVIADO_TRANSPORTADORA)));
    }
}