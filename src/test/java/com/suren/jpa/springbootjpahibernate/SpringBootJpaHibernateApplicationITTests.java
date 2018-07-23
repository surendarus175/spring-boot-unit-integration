package com.suren.jpa.springbootjpahibernate;
//Unit Test Example

import com.suren.jpa.springbootjpahibernate.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes = SpringBootJpaHibernateApplication.class
)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
public class SpringBootJpaHibernateApplicationITTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {

		MvcResult mvcResult = mockMvc.perform(
				MockMvcRequestBuilders.get("/all")
						.accept(MediaType.APPLICATION_JSON)
		).andReturn();

		System.out.println(mvcResult.getResponse());
	}

}
