package br.com.avanade.order.order_service.core.ports.inbound;

import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;

public interface OrderConsumerPort {
    void execute(String orderId) throws OrderNotFoundException;
}
