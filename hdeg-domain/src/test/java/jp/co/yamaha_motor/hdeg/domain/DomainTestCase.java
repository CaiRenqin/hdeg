package jp.co.yamaha_motor.hdeg.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import jp.co.yamaha_motor.hdeg.domain.test.BaseDomainTest;

/**
 * Domain layer test case to verify the application context and properties.
 * 
 * <p>
 * This test class extends {@link BaseDomainTest} to inherit common test
 * configurations
 * and setups for domain layer testing. It includes a test to check if the
 * application name
 * is correctly set in the environment properties.
 * </p>
 * 
 * <p>
 * Note: This class is not annotated with @SpringBootTest directly, as it
 * inherits
 * the configuration from {@link BaseDomainTest}.
 * </p>
 * 
 */
class DomainTestCase extends BaseDomainTest {

    @Autowired
    private Environment env;

    /**
     * Check if the application name is correctly set in the environment properties
     * by the test configuration with profile "development-test".
     */
    @DisplayName("Check if application name from properties is 'hdeg-domain-test'")
    @Test
    void testCheckApplicationName() {
        // Prepare
        var propName = "spring.application.name";

        // Execute
        assertThat(this.env).isNotNull();
        var actualAppName = this.env.getRequiredProperty(propName);

        // Assert
        assertThat(actualAppName).isEqualTo("hdeg-domain-test");
    }
}
