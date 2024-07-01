package br.com.avanade.order.order_service.core.domain;

import br.com.avanade.order.order_service.infraestructure.OrderStatus;

public class Order {
    private String id;
    private OrderStatus status;

    public String getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order(String id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }
}
