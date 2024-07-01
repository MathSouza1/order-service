package br.com.avanade.order.order_service.configs;

import br.com.avanade.order.order_service.core.ports.inbound.FindOrderByIdPort;
import br.com.avanade.order.order_service.core.ports.outbound.CreateOrderRepositoryPort;
import br.com.avanade.order.order_service.core.ports.outbound.FindOrderRepositoryPort;
import br.com.avanade.order.order_service.core.service.CreateOrderService;
import br.com.avanade.order.order_service.core.service.FindOrderByIdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CreateOrderService orderService(CreateOrderRepositoryPort orderRepository) {
        return new CreateOrderService(orderRepository);
    }

    @Bean
    public FindOrderByIdService orderByIdService(FindOrderRepositoryPort findOrderRepository) {
        return new FindOrderByIdService(findOrderRepository);
    }
}
