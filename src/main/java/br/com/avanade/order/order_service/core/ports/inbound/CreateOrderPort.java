package br.com.avanade.order.order_service.core.ports.inbound;

import br.com.avanade.order.order_service.core.domain.Order;

public interface CreateOrderPort {
    Order execute();
}
