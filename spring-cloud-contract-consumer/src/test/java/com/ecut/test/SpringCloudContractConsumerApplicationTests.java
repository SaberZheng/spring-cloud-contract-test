package com.ecut.test;


import com.ecut.test.entities.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"com.ecut:spring-cloud-contract-provider:+:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class SpringCloudContractConsumerApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testGetAuthors() {
        ParameterizedTypeReference<Page> ptf =
                new ParameterizedTypeReference<Page>() {
                };
        ResponseEntity<Page> responseEntity =
                restTemplate.exchange("http://localhost:8080/test/authors", HttpMethod.GET, null, ptf);
        Assert.assertEquals("size error!", 2, responseEntity.getBody().getData().size());
    }
}
