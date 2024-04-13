package ru.hse.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.hse.demo.Planes.Boeing;
import ru.hse.demo.Planes.Fighter;

@Configuration
public class ConfigBeans {
    @Bean
    @ConditionalOnProperty(prefix = "plane", name = "type", havingValue = "boeing")
    @Scope("prototype")
    public Boeing getBoeing(){
        return new Boeing();
    }

    @Bean
    @ConditionalOnProperty(prefix = "plane", name = "type", havingValue = "fighter")
    public Fighter getFighter(){
        return new Fighter();
    }
}
