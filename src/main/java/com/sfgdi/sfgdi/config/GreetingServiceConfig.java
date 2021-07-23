package com.sfgdi.sfgdi.config;

import com.sfgdi.sfgdi.services.PetService;
import com.sfgdi.pets.PetServiceFactory;
import com.sfgdi.sfgdi.datasource.FakeDataSource;
import com.sfgdi.sfgdi.repositories.EnglishGreetingRepository;
import com.sfgdi.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import com.sfgdi.sfgdi.services.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;


@EnableConfigurationProperties(SfgConstructorConfig.class)
@PropertySource("classpath:application.yml")
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConstructorConfig sfgConstructorConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConstructorConfig.getUsername());
        fakeDataSource.setPassword(sfgConstructorConfig.getPassword());
        fakeDataSource.setJdbcurl(sfgConstructorConfig.getJdbcurl());

        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile("dog")
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
       return  petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Profile("ES")
    @Bean("I18nService")
    I18nSpanishService i18nSpanishService(){
        return new I18nSpanishService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService I18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }


    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
