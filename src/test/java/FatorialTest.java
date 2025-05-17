import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FatorialTest {

    @Test
    public void testeFatorialDe5() {
        assertEquals(120, Fatorial.calcular(5));
    }

    @Test
    public void testeFatorialDe0() {
        assertEquals(1, Fatorial.calcular(0));
    }

    @Test
    public void testeFatorialDeNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fatorial.calcular(-3);
        });
    }
}
