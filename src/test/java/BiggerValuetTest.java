import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class BiggerValuetTest {

    // 1. Positive testing
    // (num2 > num1)
    // return String.valueOf(num2);

    // Test Data: 3333, 9999
    // Expected result: 9999
    @Test
    public void testStartNum2GreaterThanNum1_HappyPathTest1() {
        // AAA
        // Arrange
        int num1 = 3333;
        int num2 = 9999;
        String  expectedResult = "9999";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Positive testing
    // (num1 > num2)
    // return String.valueOf(num1);

    // Test Data: 1111, 1110
    // Expected result: 1111
    @Test
    public void testStartNum1GreaterThanNum2_HappyPathTest1() {
        // AAA
        // Arrange
        int num1 = 1111;
        int num2 = 1110;
        String expectedResult = "1111";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 3. Positive testing
    // (num2 > num1)
    // return String.valueOf(num2);

    // Test Data: -2147483648, 2147483647
    // Expected result: 2147483647
    @Test
    public void testStartNum2GreaterThanNum1_HappyPathTest2() {
        // AAA
        // Arrange
        int num1 = -2_147_483_648;
        int num2 = 2_147_483_647;
        String expectedResult = "2147483647";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 4. Positive testing
    // (num2 == num1)
    // return "Числа равны";

    // Test Data: 0, 0
    // Expected result: "Числа равны"
    @Test
    public void testStartNum2EqualsNum1_HappyPathTest1() {
        // AAA
        // Arrange
        int num1 = 0;
        int num2 = 0;
        String expectedResult = "Числа равны";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 5. Positive testing
    // (num1 > num2)
    // return String.valueOf(num1);

    // Test Data: 1, -1
    // Expected result: 1
    @Test
    public void testStartNum1GreaterThanNum2_HappyPathTest2() {
        // AAA
        // Arrange
        int num1 = -1;
        int num2 = 1;
        String expectedResult = "1";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 6. Positive testing
    // (num1 > num2)
    // return String.valueOf(num1);

    // Test Data: 0, -1
    // Expected result: 0
    @Test
    public void testStartNum1GreaterThanNum2_HappyPathTest3() {
        // AAA
        // Arrange
        int num1 = 0;
        int num2 = -1;
        String expectedResult = "0";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 7. Positive testing
    // (num2 > num1)
    // return String.valueOf(num2);

    // Test Data: 1, 0
    // Expected result: 1
    @Test
    public void testStartNum2GreaterThanNum1_HappyPathTest3() {
        // AAA
        // Arrange
        int num1 = 0;
        int num2 = 1;
        String expectedResult = "1";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 8. Negative testing
    // (num2 > num1)
    // return String.valueOf(num2);

    // Test Data: -2147483648, 2147483647
    // "Error"
    @Ignore
    @Test
    public void testStartNum2GreaterThanNum1_NegativeTest1() {
        // AAA
        // Arrange
        //int num1 = 2_147_483_648;
        //int num2 = -2_147_483_649;
        String expectedResult = "2147483648";

        // Act
        //String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        //Assert.assertEquals(actualResult, expectedResult);
    }
}
