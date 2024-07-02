package br.com.avanade.order.order_service.adapters.outbound;

import br.com.avanade.order.order_service.adapters.outbound.entities.OrderEntity;
import br.com.avanade.order.order_service.adapters.outbound.repositories.OrderRepository;
import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FindOrderRepositoryAdapterTest {

    @Autowired
    private Optional<OrderEntity> orderEntity;

    @Mock
    private OrderRepository repository;

    @InjectMocks
    private FindOrderRepositoryAdapter repositoryAdapter;

    @Test
    void execute() {
        orderEntity = Optional.of(new OrderEntity(new Order("1", OrderStatus.ENVIADO_TRANSPORTADORA)));
        when(repository.findById("1")).thenReturn(orderEntity);
        assertDoesNotThrow(() -> repositoryAdapter.execute("1"));
    }

    @Test
    void executeEmpty() {
        assertThrows(OrderNotFoundException.class, () -> repositoryAdapter.execute("1"));
    }
}