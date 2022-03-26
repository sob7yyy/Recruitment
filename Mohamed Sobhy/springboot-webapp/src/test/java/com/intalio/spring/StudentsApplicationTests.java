package com.intalio.spring;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.http.HttpMethod;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentsApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate ;

        @Test
    void contextLoads() {
        restTemplate.withBasicAuth("firstStudent","firstStudentPass");
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "/api/students", HttpMethod.GET, null,String.class);
        System.out.println(responseEntity.getBody());
        assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
    }

}
