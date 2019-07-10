package com.ecut.test.entitys;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Amy
 * @date 2019-07-05 11:19
 * @description:
 */
@Data
@Component
@PropertySource({"classpath:/jdbc.properties"})
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSource {

    private String url;

    private String username;

    private String password;
}
