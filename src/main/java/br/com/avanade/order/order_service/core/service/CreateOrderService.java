package br.com.avanade.order.order_service.core.service;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import br.com.avanade.order.order_service.core.ports.inbound.CreateOrderPort;
import br.com.avanade.order.order_service.core.ports.outbound.CreateOrderRepositoryPort;

public class CreateOrderService implements CreateOrderPort {

    private final CreateOrderRepositoryPort orderRepository;

    public CreateOrderService(CreateOrderRepositoryPort orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order execute() {
        return this.orderRepository.createOrder(new Order(OrderStatus.AGUARDANDO_ENVIO));
    }
}
