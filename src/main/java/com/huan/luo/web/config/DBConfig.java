package com.huan.luo.web.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

/**
 * Created by luohuan on 15/11/12.
 */
@Configuration
public class DBConfig {
    @Bean(name = "dataSource")
    DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://127.0.0.1:3307/test?useUnicode=yes&characterEncoding=UTF-8");
        config.setUsername("root");
        config.setPassword("123456");
        config.setMaxLifetime(TimeUnit.MINUTES.toMillis(10));
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        config.addDataSourceProperty("useServerPrepStmts", "true");

        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }
}
