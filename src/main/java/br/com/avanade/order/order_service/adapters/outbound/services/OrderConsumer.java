package br.com.avanade.order.order_service.adapters.outbound.services;

import br.com.avanade.order.order_service.core.dtos.OrderEvent;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import br.com.avanade.order.order_service.core.ports.inbound.OrderConsumerPort;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private final OrderConsumerPort orderConsumerPort;

    public OrderConsumer(OrderConsumerPort orderConsumerPort) {
        this.orderConsumerPort = orderConsumerPort;
    }

    @KafkaListener(topics = "order-service", groupId = "group-id")
    public void receiveMessage(OrderEvent orderEvent) throws OrderNotFoundException {
        System.out.println(orderEvent.getMessage());
        orderConsumerPort.execute(orderEvent.getOrderId());
    }
}
