package br.com.avanade.order.order_service.core.ports.outbound;

import br.com.avanade.order.order_service.core.domain.Order;

public interface CreateOrderRepositoryPort {
    Order createOrder(Order order);
}
