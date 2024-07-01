package br.com.avanade.order.order_service.core.repositories;

import br.com.avanade.order.order_service.core.model.Order;

public interface OrderServicePort {
    Order createOrder();
    Order findOrderById(String orderId);
    void updateOrderStatus(String orderId);
}
