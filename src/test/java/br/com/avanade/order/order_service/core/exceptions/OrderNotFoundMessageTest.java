package br.com.avanade.order.order_service.core.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class OrderNotFoundMessageTest {

    @InjectMocks
    private OrderNotFoundMessage exception;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void setTimestamp() {
        exception.setTimestamp(new Date());
        assertNotNull(exception);
    }

    @Test
    void setStatus() {
        exception.setStatus(HttpStatus.NO_CONTENT.value());
        assertNotNull(exception);
    }

    @Test
    void setError() {
        exception.setError("test error message");
        assertNotNull(exception);
    }

    @Test
    void OrderNotFoundMessageNoArgsConstructor() {
        exception = new OrderNotFoundMessage();
        assertNotNull(exception);
    }

    @Test
    void OrderNotFoundMessageAllArgsConstructor() {
        exception = new OrderNotFoundMessage(new Date(), HttpStatus.NO_CONTENT.value(), "test error message");
        assertNotNull(exception);
    }
}