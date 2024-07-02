package br.com.avanade.order.order_service.core.service;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import br.com.avanade.order.order_service.core.ports.outbound.FindOrderRepositoryPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FindOrderByIdServiceTest {

    @Autowired
    Order order;

    @Mock
    private FindOrderRepositoryPort repositoryPort;

    @InjectMocks
    private FindOrderByIdService service;

    @Test
    void execute() throws OrderNotFoundException {
        Order order = new Order(OrderStatus.AGUARDANDO_ENVIO);
        when(repositoryPort.execute("1")).thenReturn(order);
        assertDoesNotThrow(() -> service.execute("1"));
    }

    @Test
    void executeNull() throws OrderNotFoundException {
        when(repositoryPort.execute("1")).thenReturn(order);
        assertThrows(OrderNotFoundException.class, () -> service.execute("1"));
    }
}