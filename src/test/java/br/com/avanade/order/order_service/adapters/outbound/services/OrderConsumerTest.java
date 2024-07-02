package br.com.avanade.order.order_service.adapters.outbound.services;

import br.com.avanade.order.order_service.core.dtos.OrderEvent;
import br.com.avanade.order.order_service.core.ports.inbound.OrderConsumerPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class OrderConsumerTest {

    @Mock
    private OrderConsumerPort consumerPort;

    @InjectMocks
    private OrderConsumer consumer;

    @Test
    void receiveMessage() {
        assertDoesNotThrow(() -> consumer.receiveMessage(new OrderEvent("test message", "1")));
    }
}