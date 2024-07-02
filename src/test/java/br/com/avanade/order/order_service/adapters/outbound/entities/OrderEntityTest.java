package br.com.avanade.order.order_service.adapters.outbound.entities;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataMongoTest
@ExtendWith(value = MockitoExtension.class)
public class OrderEntityTest {

    @Mock
    private Order order;

    @InjectMocks
    private OrderEntity orderEntity;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testOrderEntityAllArgsConstructor() {
        orderEntity = new OrderEntity("message", OrderStatus.AGUARDANDO_ENVIO);
        assertNotNull(orderEntity);
    }

    @Test
    public void testOrderEntityNoArgsConstructor() {
        orderEntity = new OrderEntity();
        assertNotNull(orderEntity);
    }

    @Test
    public void testOrderEntityOrderConstructor() {
        order = new Order("1", OrderStatus.ENVIADO_TRANSPORTADORA);
        orderEntity = new OrderEntity(order);
        assertNotNull(orderEntity);
    }

    @Test
    public void testOrderEntityToOrder() {
        orderEntity = new OrderEntity(order);
        assertNotNull(orderEntity.toOrder());
    }
}
