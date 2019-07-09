package com.ecut.test.entitys;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Amy
 * @date 2019-07-05 11:19
 * @description:
 */
@Component
@Data
@PropertySource({"classpath:/jdbc.properties"})
public class DataSource {

    @Value(value="${spring.datasource.url}")
    private String url;
    @Value(value="${spring.datasource.username}")
    private String username;
    @Value(value="${spring.datasource.password}")
    private String password;
}
