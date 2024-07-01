package br.com.avanade.order.order_service.infraestructure.web;

import br.com.avanade.order.order_service.core.model.Order;
import br.com.avanade.order.order_service.core.repositories.OrderServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderServicePort orderService;

    public OrderController(OrderServicePort orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder() {
        return ResponseEntity.ok().body(orderService.createOrder());
    }
}
