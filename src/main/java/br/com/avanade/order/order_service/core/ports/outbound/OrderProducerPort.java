package br.com.avanade.order.order_service.core.ports.outbound;

import br.com.avanade.order.order_service.core.dtos.OrderEvent;

public interface OrderProducerPort {
    void execute(OrderEvent orderEvent);
}
