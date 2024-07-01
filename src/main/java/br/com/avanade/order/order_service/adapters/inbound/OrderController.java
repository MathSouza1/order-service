package br.com.avanade.order.order_service.adapters.inbound;

import br.com.avanade.order.order_service.core.domain.Order;
import br.com.avanade.order.order_service.core.exceptions.OrderNotFoundException;
import br.com.avanade.order.order_service.core.ports.inbound.CreateOrderPort;
import br.com.avanade.order.order_service.core.ports.inbound.FindOrderByIdPort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderPort createOrder;
    private final FindOrderByIdPort findById;

    public OrderController(CreateOrderPort createOrder, FindOrderByIdPort findById) {
        this.createOrder = createOrder;
        this.findById = findById;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder() {
        return ResponseEntity.ok().body(createOrder.execute());
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> findOrderById(@PathVariable String orderId) throws OrderNotFoundException {
        return ResponseEntity.ok().body(findById.execute(orderId));
    }
}
