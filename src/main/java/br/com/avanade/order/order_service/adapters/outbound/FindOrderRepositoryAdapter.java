package br.com.avanade.order.order_service.adapters.outbound;

import br.com.avanade.order.order_service.adapters.outbound.entities.OrderEntity;
import br.com.avanade.order.order_service.adapters.outbound.repositories.OrderRepository;
import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import br.com.avanade.order.order_service.core.ports.outbound.FindOrderRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindOrderRepositoryAdapter implements FindOrderRepositoryPort {

    private final OrderRepository orderRepository;

    public FindOrderRepositoryAdapter(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order execute(String orderId) throws OrderNotFoundException {
        Optional<OrderEntity> orderEntity = this.orderRepository.findById(orderId);
        if (orderEntity.isPresent())
            return orderEntity.get().toOrder();
        throw new OrderNotFoundException("Order with the id: " + orderId + " does NOT exists.");
    }
}
