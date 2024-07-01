package br.com.avanade.order.order_service.adapters.outbound.entities;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.domain.OrderStatus;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "tb_orders")
public class OrderEntity {

    @MongoId
    private String id;
    private OrderStatus status;

    public OrderEntity(Order order) {
        this.id = order.getId();
        this.status = order.getStatus();
    }

    public Order toOrder() {
        return new Order(this.id, this.status);
    }
}
