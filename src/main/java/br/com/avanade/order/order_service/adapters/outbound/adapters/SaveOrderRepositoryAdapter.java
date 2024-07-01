package br.com.avanade.order.order_service.adapters.outbound.adapters;

import br.com.avanade.order.order_service.adapters.outbound.entities.OrderEntity;
import br.com.avanade.order.order_service.adapters.outbound.repositories.OrderRepository;
import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.ports.outbound.SaveOrderRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class SaveOrderRepositoryAdapter implements SaveOrderRepositoryPort {

    private final OrderRepository orderRepository;


    public SaveOrderRepositoryAdapter(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(new OrderEntity(order)).toOrder();
    }
}
