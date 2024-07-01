package br.com.avanade.order.order_service.application.service;

import br.com.avanade.order.order_service.core.model.Order;
import br.com.avanade.order.order_service.core.model.OrderStatus;
import br.com.avanade.order.order_service.core.repositories.OrderRepositoryPort;
import br.com.avanade.order.order_service.core.repositories.OrderServicePort;

public class OrderServiceImpl implements OrderServicePort {

    private final OrderRepositoryPort orderRepository;

    public OrderServiceImpl(OrderRepositoryPort orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder() {
        Order order = this.orderRepository.saveOrder(new Order(OrderStatus.AGUARDANDO_ENVIO));
        return order;
    }

    @Override
    public Order findOrderById(String orderId) {
        return null;
    }

    @Override
    public void updateOrderStatus(String orderId) {

    }
}
