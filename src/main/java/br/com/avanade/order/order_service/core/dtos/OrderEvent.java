package br.com.avanade.order.order_service.core.dtos;

public class OrderEvent {
    private String message;
    private String orderId;

    public String getMessage() {
        return message;
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderEvent(String message, String orderId) {
        this.message = message;
        this.orderId = orderId;
    }

    public OrderEvent(String orderId) {
        this.message = "um novo pedido foi efetuado.";
        this.orderId = orderId;
    }
}
