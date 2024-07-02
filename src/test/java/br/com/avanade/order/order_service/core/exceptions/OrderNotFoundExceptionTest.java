package br.com.avanade.order.order_service.core.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class OrderNotFoundExceptionTest {

    @InjectMocks
    private OrderNotFoundException exception;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void OrderNotFoundNoArgsConstructor() {
        exception = new OrderNotFoundException();
        assertNotNull(exception);
    }

    @Test
    void OrderNotFoundAllArgsConstructor() {
        exception = new OrderNotFoundException("test error message");
        assertNotNull(exception);
    }
}