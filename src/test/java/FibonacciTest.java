import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FibonacciTest {
    @Test
    void fibonacciOfOne(){
        Fibonacci  fibonacci = new Fibonacci();
       // assertEquals(100, fibonacci.fibonacci(10));
        assertNotEquals(89, fibonacci.fibonacci(10));
    }
}