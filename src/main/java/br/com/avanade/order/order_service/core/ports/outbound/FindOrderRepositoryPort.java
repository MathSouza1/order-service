package br.com.avanade.order.order_service.core.ports.outbound;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;

public interface FindOrderRepositoryPort {

    Order execute(String orderId) throws OrderNotFoundException;
}
