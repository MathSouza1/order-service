package br.com.avanade.order.order_service.core.service;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import br.com.avanade.order.order_service.core.ports.inbound.FindOrderByIdPort;
import br.com.avanade.order.order_service.core.ports.outbound.FindOrderRepositoryPort;

import java.util.Objects;

public class FindOrderByIdService implements FindOrderByIdPort {

    private final FindOrderRepositoryPort findOrderRepository;

    public FindOrderByIdService(FindOrderRepositoryPort findOrderRepository) {
        this.findOrderRepository = findOrderRepository;
    }

    @Override
    public Order execute(String id) throws OrderNotFoundException {
        Order order = this.findOrderRepository.execute(id);
        if (orderIsNull(order))
            throw new OrderNotFoundException("Order with the id " + id + " could NOT be found.");
        return order;
    }

    private boolean orderIsNull(Order order) {
        return Objects.isNull(order);
    }
}
