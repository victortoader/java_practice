package junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TesterExceptionTests {

    @Test
    public void testException() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            throw new Exception("Test exceptions");
        });
    }

@Test
    public void timeout() throws InterruptedException {
        Assertions.assertTimeout(Duration.ofMillis(10), () -> Thread.sleep(5));
    }
}
