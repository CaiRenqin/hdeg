package jp.co.yamaha_motor.eg;

import com.ymsl.solid.jpa.repository.JpaExtensionRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author YMSLX
 * @version 1.0
 *
 */
@SpringBootApplication
@EntityScan(basePackageClasses = { EgApplication.class })
@EnableJpaRepositories(basePackageClasses = {
        EgApplication.class }, repositoryFactoryBeanClass = JpaExtensionRepositoryFactoryBean.class)
public class EgApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EgApplication.class);
        app.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EgApplication.class);
    }
}
