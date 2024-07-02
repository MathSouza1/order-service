package br.com.avanade.order.order_service.adapters.outbound;

import br.com.avanade.order.order_service.adapters.outbound.services.OrderProducer;
import br.com.avanade.order.order_service.core.dtos.OrderEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class OrderProducerAdapterTest {

    @Mock
    private OrderProducer producer;

    @InjectMocks
    private OrderProducerAdapter adapter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void execute() {
        assertDoesNotThrow(() -> adapter.execute(new OrderEvent("test message", "1")));
    }
}