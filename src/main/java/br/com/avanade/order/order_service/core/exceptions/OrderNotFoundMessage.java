package br.com.avanade.order.order_service.core.exceptions;

import java.util.Date;

public class OrderNotFoundMessage {
    private Date timestamp;
    private int status;
    private String error;

    public OrderNotFoundMessage(Date timestamp, int status, String error) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
    }

    public OrderNotFoundMessage() {
    }
}
