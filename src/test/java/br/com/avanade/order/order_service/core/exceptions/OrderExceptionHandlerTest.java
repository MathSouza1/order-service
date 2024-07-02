package br.com.avanade.order.order_service.core.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class OrderExceptionHandlerTest {

    @Mock
    private OrderNotFoundException exception;

    @InjectMocks
    private OrderExceptionHandler exceptionHandler;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void orderNotFoundHandler() {
        exceptionHandler.orderNotFoundHandler(exception);
        assertNotNull(exceptionHandler);
    }
}