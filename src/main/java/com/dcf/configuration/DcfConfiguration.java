package com.dcf.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.SessionFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.EntityManagerFactory;

@Configuration
@EnableJpaAuditing
@EnableSwagger2
public class DcfConfiguration {

//    @Bean
//    public EntityManagerFactory entityManagerFactory(){
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(dataSource());
//        return (EntityManagerFactory) entityManagerFactoryBean;
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager(){
//        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
//        jpaTransactionManager.setEntityManagerFactory((EntityManagerFactory) entityManagerFactory());
//        return transactionManager();
//    }
//
//    @Bean
//    @ConfigurationProperties("jpa.datasource")
//    public HikariDataSource dataSource() {
//        return DataSourceBuilder.create().type(HikariDataSource.class).build();
//    }
//
//    @Bean
//    public SessionFactory getSessionFactory(){
//        EntityManagerFactory entityManagerFactory = entityManagerFactory();
//        if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
//            throw new NullPointerException("factory is not a hibernate factory");
//        }
//        return entityManagerFactory.unwrap(SessionFactory.class);
//    }
}
