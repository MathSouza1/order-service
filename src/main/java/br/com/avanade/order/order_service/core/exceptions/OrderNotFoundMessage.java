package br.com.avanade.order.order_service.core.exceptions;

import java.util.Date;


public class OrderNotFoundMessage {
    private Date timestamp;
    private int status;
    private String error;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public OrderNotFoundMessage(Date timestamp, int status, String error) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
    }

    public OrderNotFoundMessage() {

    }
}
