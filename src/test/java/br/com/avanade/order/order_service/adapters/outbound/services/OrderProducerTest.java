package br.com.avanade.order.order_service.adapters.outbound.services;

import br.com.avanade.order.order_service.core.dtos.OrderEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.kafka.core.KafkaTemplate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class OrderProducerTest {

    @Mock
    KafkaTemplate<String, OrderEvent> kafkaTemplate;

    @InjectMocks
    private OrderProducer producer;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sendMessage() {
        OrderEvent orderEvent = new OrderEvent("1");
        assertDoesNotThrow(() -> producer.sendMessage(orderEvent));
    }
}