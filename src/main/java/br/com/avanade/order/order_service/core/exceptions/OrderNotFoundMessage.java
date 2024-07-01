package br.com.avanade.order.order_service.core.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderNotFoundMessage {
    private Date timestamp;
    private int status;
    private String error;
}
