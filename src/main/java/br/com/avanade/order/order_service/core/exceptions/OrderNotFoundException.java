package br.com.avanade.order.order_service.core.exceptions;

public class OrderNotFoundException extends Exception {
    public OrderNotFoundException() {
        super("Order not found.");
    }

    public OrderNotFoundException(String message) {
        super(message);
    }
}
