import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertNotNull;

public class IngredientTypeTest {
    @Test
    public void checkSauceIsNotNullTest() {
        assertNotNull(IngredientType.SAUCE);
    }

    @Test
    public void checkFillingIsNotNullTest() {
        assertNotNull(IngredientType.FILLING);
    }
}