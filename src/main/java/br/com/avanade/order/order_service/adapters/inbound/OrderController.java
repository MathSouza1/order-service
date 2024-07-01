package br.com.avanade.order.order_service.adapters.inbound;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.ports.inbound.CreateOrderPort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderPort createOrder;

    public OrderController(CreateOrderPort createOrder) {
        this.createOrder = createOrder;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder() {
        return ResponseEntity.ok().body(createOrder.execute());
    }
}
