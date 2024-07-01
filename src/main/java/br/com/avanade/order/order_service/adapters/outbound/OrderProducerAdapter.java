package br.com.avanade.order.order_service.adapters.outbound;

import br.com.avanade.order.order_service.adapters.outbound.services.OrderProducer;
import br.com.avanade.order.order_service.core.dtos.OrderEvent;
import br.com.avanade.order.order_service.core.ports.outbound.OrderProducerPort;
import org.springframework.stereotype.Component;

@Component
public class OrderProducerAdapter implements OrderProducerPort {

    private final OrderProducer orderProducer;

    public OrderProducerAdapter(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @Override
    public void execute(OrderEvent orderEvent) {
        orderProducer.sendMessage(orderEvent);
    }
}
