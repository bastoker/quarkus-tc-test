package st.bas.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.Assert.assertTrue;

// if you comment out the @QuarkustTest then the test succeeds
@QuarkusTest
@Testcontainers
public class QuarkusTestContainersTest {

    @Container
    private static PostgreSQLContainer db = new PostgreSQLContainer("postgres:10.8");

    @Test
    public void testIfContainersStartsAccordingToDocs() {
        assertTrue(db.isRunning());
    }
}