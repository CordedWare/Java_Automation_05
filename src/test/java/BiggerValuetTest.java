import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class BiggerValuetTest {

    // 1. Positive testing
    // (num2 > num1)
    // return String.valueOf(num2);

    // 3333, 9999
    @Test
    public void testStartNum2GreaterThanNum1_HappyPathTest1() {
        // AAA
        // Arrange
        int num1 = 3333;
        int num2 = 9999;
        String  exceptedResult = "9999";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }

    // 2. Positive testing
    // (num1 > num2)
    // return String.valueOf(num1);

    // 1111, 1110
    @Test
    public void testStartNum1GreaterThanNum2_HappyPathTest1() {
        // AAA
        // Arrange
        int num1 = 1111;
        int num2 = 1110;
        String exceptedResult = "1111";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }

    // 3. Positive testing
    // (num2 > num1)
    // return String.valueOf(num2);

    // -2147483648, 2147483647
    @Test
    public void testStartNum2GreaterThanNum1_HappyPathTest2() {
        // AAA
        // Arrange
        int num1 = -2_147_483_648;
        int num2 = 2_147_483_647;
        String exceptedResult = "2147483647";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }

    // 4. Positive testing
    // (num2 == num1)
    // return "Числа равны";

    // 0, 0
    @Test
    public void testStartNum2EqualsNum1_HappyPathTest1() {
        // AAA
        // Arrange
        int num1 = 0;
        int num2 = 0;
        String exceptedResult = "Числа равны";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }

    // 5. Positive testing
    // (num1 > num2)
    // return String.valueOf(num1);

    // 1, -1
    @Test
    public void testStartNum1GreaterThanNum2_HappyPathTest2() {
        // AAA
        // Arrange
        int num1 = -1;
        int num2 = 1;
        String exceptedResult = "1";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }

    // 6. Positive testing
    // (num1 > num2)
    // return String.valueOf(num1);

    // 0, -1
    @Test
    public void testStartNum1GreaterThanNum2_HappyPathTest3() {
        // AAA
        // Arrange
        int num1 = 0;
        int num2 = -1;
        String exceptedResult = "0";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }

    // 7. Positive testing
    // (num2 > num1)
    // return String.valueOf(num2);

    // 1, 0
    @Test
    public void testStartNum2GreaterThanNum1_HappyPathTest3() {
        // AAA
        // Arrange
        int num1 = 0;
        int num2 = 1;
        String exceptedResult = "1";

        // Act
        String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }

    // 8. Negative testing
    // (num2 > num1)
    // return String.valueOf(num2);

    // -2147483648, 2147483647
    @Ignore
    @Test
    public void testStartNum2GreaterThanNum1_NegativeTest1() {
        // AAA
        // Arrange
        //int num1 = 2_147_483_648;
        //int num2 = -2_147_483_649;
        String exceptedResult = "2147483648";

        // Act
        //String actualResult = new BiggerValue().biggerValue(num1,num2);

        // Assert
        //Assert.assertEquals(actualResult,exceptedResult);
    }
}
