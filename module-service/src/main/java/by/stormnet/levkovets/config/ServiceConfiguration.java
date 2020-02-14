package by.stormnet.levkovets.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(DaoConfiguration.class)

@Configuration
@ComponentScan({"by.stormnet.levkovets.service.impl", "by.stormnet.levkovets.mappers"})
public class ServiceConfiguration {

}
