package guru.springframework.config;

import guru.springframework.propertyexamplebeans.FakeDataSource;
import guru.springframework.propertyexamplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by shivam (techSavyThor) on 05/13/2019
 */
@Configuration
//@PropertySource({"classpath:dataSource.properties","classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:dataSource.properties"),@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${username}")
    String user;
    @Value("${password}")
    String password;
    @Value("${dburl}")
    String url;

    @Value("${jms.username}")
    String jmsUsername;
    @Value("${jms.password}")
    String jmsPassword;
    @Value("${jms.url}")
    String jmsUrl;

    @Autowired
    Environment env;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setUsername(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(url);
        return  fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker jmsBroker=new FakeJmsBroker();
        jmsBroker.setJmsUsername(jmsUsername);
        jmsBroker.setJmsPassword(jmsPassword);
        jmsBroker.setJmsUrl(jmsUrl);
        return  jmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;

    }
}
