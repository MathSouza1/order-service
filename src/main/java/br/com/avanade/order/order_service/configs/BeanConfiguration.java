package br.com.avanade.order.order_service.configs;

import br.com.avanade.order.order_service.core.ports.outbound.CreateOrderRepositoryPort;
import br.com.avanade.order.order_service.core.service.CreateOrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CreateOrderService orderService(CreateOrderRepositoryPort orderRepository) {
        return new CreateOrderService(orderRepository);
    }
}
