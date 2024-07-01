package br.com.avanade.order.order_service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class OrderServiceApplicationTests {

	@Test
	public void contextLoads() {
		SpringApplication mockApplication = Mockito.mock(SpringApplication.class);
		OrderServiceApplication.main(new String[] {});
		Mockito.verify(mockApplication, Mockito.times(1)).run();
		assertDoesNotThrow(() -> OrderServiceApplication.main(new String[] {}));
	}

}
