package br.com.avanade.order.order_service.adapters.outbound;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import br.com.avanade.order.order_service.core.ports.inbound.OrderConsumerPort;
import br.com.avanade.order.order_service.core.ports.outbound.SaveOrderRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumerAdapter implements OrderConsumerPort {

    private final SaveOrderRepositoryPort orderRepositoryPort;
    private final FindOrderRepositoryPort repositoryAdapter;


    public OrderConsumerAdapter(SaveOrderRepositoryPort orderRepositoryPort, FindOrderRepositoryPort repositoryAdapter) {
        this.orderRepositoryPort = orderRepositoryPort;
        this.repositoryAdapter = repositoryAdapter;
    }

    @Override
    public void execute(String orderId) throws OrderNotFoundException {
        Order order = this.repositoryAdapter.execute(orderId);
        order.setStatus(OrderStatus.ENVIADO_TRANSPORTADORA);
        this.orderRepositoryPort.saveOrder(order);
    }
}
