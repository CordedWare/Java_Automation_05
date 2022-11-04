import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    // 1. Positive testing
    // if (num1 == num2)
    // return 0;

    // Test data: 89, 89
    // Expected result: 0
    @Test
    public void testStartNumber1EqualsNumber2_HappyPathTest() {
        // AAA
        // Arrange
        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;

        // Act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    // 2. Positive testing
    // if (num1 < num2)
    // return -1;

    // Test data: -89, 89
    // Expected result: -1
    @Test
    public void testStartNumber1LessNumber2_HappyPathTest() {
        // AAA
        // Arrange
        int num1 = -89;
        int num2 = 89;
        int expectedResult = -1;

        // Act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 3. Positive testing
    // if (num1 > num2)
    // return 0;

    // Test data: 89, -89
    // Expected result: 1
    @Test
    public void testStartNumber1GreaterNumber2_HappyPathTest() {
        // AAA
        // Arrange
        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;

        // Act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
