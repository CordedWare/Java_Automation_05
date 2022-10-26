import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    // 1. Positive testing
    // if (number >= 0)
    // return true;

    // Test Data: 555
    // Expected result: true
    @Test
    public void testStartBooleanReturnTrue_HappyPathTest1() {
        // AAA
        // Arrange
        int number = 555;
        boolean expectedResult = true;

        // Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 2. Positive testing
    // if (number >= 0)
    // return true;

    // Test Data: 0
    // Expected result: true
    @Test
    public void testStartBooleanReturnTrue_HappyPathTest2() {
        // AAA
        // Arrange
        int number = 0;
        boolean expectedResult = true;

        // Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 3. Positive testing
    // if (number < 0)
    // return false;

    // Test Data: -555
    // Expected result: false
    @Test
    public void testStartBooleanReturnFalse_HappyPathTest1() {
        // AAA
        // Arrange
        int number = -555;
        boolean expectedResult = false;

        // Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
