package jp.co.yamaha_motor.hdeg.domain.test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

/**
 * Base class for domain layer tests.
 * This class sets up the Spring Boot test context with the specified configuration and profiles.
 * Tests extending this class will run with the "development-test" and "h2-test" profiles,
 * and will have transactions rolled back after each test method.
 */
@SpringBootTest(classes = { DomainTestConfiguration.class })
@ActiveProfiles({"development-test", "h2-test"})
@Rollback
public class BaseDomainTest {
}
