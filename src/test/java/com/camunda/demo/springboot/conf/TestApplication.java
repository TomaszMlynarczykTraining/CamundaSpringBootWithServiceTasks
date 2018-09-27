package com.camunda.demo.springboot.conf;

import static org.mockito.Mockito.mock;

import org.mockito.Mock;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.camunda.demo.springboot.Application;

@ComponentScan(basePackageClasses={Application.class})
@TestConfiguration
public class TestApplication {

}
