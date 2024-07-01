package br.com.avanade.order.order_service.adapters.outbound.services;

import br.com.avanade.order.order_service.core.dtos.OrderEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    private final KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public OrderProducer(KafkaTemplate<String, OrderEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(OrderEvent orderEvent) {
        kafkaTemplate.send("order-service", orderEvent);
    }
}
