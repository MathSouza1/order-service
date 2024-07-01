package br.com.avanade.order.order_service.core.service;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import br.com.avanade.order.order_service.core.dtos.OrderEvent;
import br.com.avanade.order.order_service.core.ports.inbound.CreateOrderPort;
import br.com.avanade.order.order_service.core.ports.outbound.CreateOrderRepositoryPort;
import br.com.avanade.order.order_service.core.ports.outbound.OrderProducerPort;

public class CreateOrderService implements CreateOrderPort {

    private final CreateOrderRepositoryPort orderRepository;
    private final OrderProducerPort orderProducerPort;

    public CreateOrderService(CreateOrderRepositoryPort orderRepository, OrderProducerPort orderProducerPort) {
        this.orderRepository = orderRepository;
        this.orderProducerPort = orderProducerPort;
    }

    @Override
    public Order execute() {
        Order order = this.orderRepository.createOrder(new Order(OrderStatus.AGUARDANDO_ENVIO));
        orderProducerPort.execute(new OrderEvent(order.getId()));
        return order;
    }
}
