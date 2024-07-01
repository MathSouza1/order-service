package br.com.avanade.order.order_service.core.ports.inbound;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;

public interface FindOrderByIdPort {
    Order execute(String id) throws OrderNotFoundException;
}
