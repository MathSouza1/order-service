package br.com.avanade.order.order_service.adapters.outbound;

import br.com.avanade.order.order_service.adapters.outbound.entities.OrderEntity;
import br.com.avanade.order.order_service.adapters.outbound.repositories.OrderRepository;
import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.ports.outbound.CreateOrderRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class CreateOrderRepositoryAdapter implements CreateOrderRepositoryPort {
    private final OrderRepository orderRepository;


    public CreateOrderRepositoryAdapter(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(new OrderEntity(order)).toOrder();
    }
}
