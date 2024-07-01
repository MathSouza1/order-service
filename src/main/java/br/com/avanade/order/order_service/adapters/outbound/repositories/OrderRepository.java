package br.com.avanade.order.order_service.adapters.outbound.repositories;

import br.com.avanade.order.order_service.adapters.outbound.entities.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, String> {
}
