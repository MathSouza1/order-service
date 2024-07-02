package br.com.avanade.order.order_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class OrderServiceApplicationTest {

	@Test
	public void contextLoads() {
		assertDoesNotThrow(() -> OrderServiceApplication.main(new String[] {}));
	}

}
