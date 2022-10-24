import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    // 1. Positive testing
    // if (number >= 0)
    // return true;

    // 555
    @Test
    public void testStartBooleanReturnTrue_HappyPathTest1() {
        // AAA
        // Arrange
        int number = 555;
        boolean exceptedResult = true;

        // Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }


    // 2. Positive testing
    // if (number >= 0)
    // return true;

    // 0
    @Test
    public void testStartBooleanReturnTrue_HappyPathTest2() {
        // AAA
        // Arrange
        int number = 0;
        boolean exceptedResult = true;

        // Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }


    // 3. Positive testing
    // if (number < 0)
    // return false;

    // -555
    @Test
    public void testStartBooleanReturnFalse_HappyPathTest1() {
        // AAA
        // Arrange
        int number = -555;
        boolean exceptedResult = false;

        // Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }

}
