package com.pt.dev.config;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("local")
public class LocalDataSourceConfiguration {

    @Bean
@ConfigurationProperties(DataSourceProperties.PREFIX)
    public DataSource dataSource() {
            return DataSourceBuilder.create().build();
    }
}
