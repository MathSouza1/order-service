package br.com.avanade.order.order_service.configs;

import br.com.avanade.order.order_service.core.ports.outbound.FindOrderRepositoryPort;
import br.com.avanade.order.order_service.core.ports.outbound.OrderProducerPort;
import br.com.avanade.order.order_service.core.ports.outbound.SaveOrderRepositoryPort;
import br.com.avanade.order.order_service.core.service.CreateOrderService;
import br.com.avanade.order.order_service.core.service.FindOrderByIdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateOrderService orderService(SaveOrderRepositoryPort orderRepository, OrderProducerPort orderProducerPort) {
        return new CreateOrderService(orderRepository, orderProducerPort);
    }

    @Bean
    public FindOrderByIdService orderByIdService(FindOrderRepositoryPort findOrderRepository) {
        return new FindOrderByIdService(findOrderRepository);
    }
}
