package com.microwebservice.services;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AccountServiceTests {
		
	@Test
	public void testFindOne() {
		assertThat(1).isEqualTo(1);
	}
}

