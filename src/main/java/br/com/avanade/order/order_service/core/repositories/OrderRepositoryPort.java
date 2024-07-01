package br.com.avanade.order.order_service.core.repositories;

import br.com.avanade.order.order_service.core.model.Order;

public interface OrderRepositoryPort {
    Order saveOrder(Order order);
    Order findOrderById(String orderId);
}
