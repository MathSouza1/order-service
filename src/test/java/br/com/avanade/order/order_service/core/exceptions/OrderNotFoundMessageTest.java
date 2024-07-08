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
    void OrderNotFoundMessageNoArgsConstructor() {
        exception = new OrderNotFoundMessage();
        assertNotNull(exception);
    }

    @Test
    void OrderNotFoundMessageAllArgsConstructor() {
        exception = new OrderNotFoundMessage(new Date(), HttpStatus.NO_CONTENT.value(), "test error message");
        assertNotNull(exception);
    }

    @Test
    void OrderNotFoundMessageAllGetters() {
        exception.getTimestamp();
        exception.getStatus();
        exception.getError();
        assertNotNull(exception);
    }

    @Test
    void OrderNotFoundMessageAllSetters() {
        exception.setTimestamp(new Date());
        exception.setStatus(404);
        exception.setError("Error Test");
        assertNotNull(exception);
    }
}