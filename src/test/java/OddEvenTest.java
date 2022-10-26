import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenTest {

    // 1. Positive testing
    // if ((number & 2) == 0)
    // return "Even";

    // Test Data: 4
    // Expected Result: Even
    @Test
    public void testStartEvenNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int number = 4;
        String expectedResult = "Even";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }



    // 2. Positive testing
    // if ((number & 2) == 1)
    // return "Odd";

    // Test Data: 3
    // Expected Result: Odd
    @Test
    public void testStartOddNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int number = 3;
        String expectedResult = "Odd";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 3. Positive testing
    // if ((number & 2) == 1)
    // return "Odd";

    // Test Data: -345
    // Expected Result: Odd
    @Test
    public void testStartOddNumber_HappyPathTest2() {
        // AAA
        // Arrange
        int number = -345;
        String expectedResult = "Odd";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 4. Positive testing
    // if ((number & 2) == 0)
    // return "Even";

    // Test Data: 0
    // Expected Result: Even
    @Test
    public void testStartEvenNumber_HappyPathTest2() {
        // AAA
        // Arrange
        int number = 0;
        String expectedResult = "Even";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 5. Positive testing
    // if ((number & 2) == 0)
    // return "Even";

    // Test Data: 222222
    // Expected Result: Even
    @Test
    public void testStartEvenNumber_HappyPathTest3() {
        // AAA
        // Arrange
        int number = 222222;
        String expectedResult = "Even";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 6. Positive testing
    // if ((number & 2) == 1)
    // return "Odd";

    // Test Data: 2147483647
    // Expected Result: Odd
    @Test
    public void testStartOddNumber_HappyPathTest3() {
        // AAA
        // Arrange
        int number = 2147483647;
        String expectedResult = "Odd";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 7. Positive testing
    // if ((number & 2) == 1)
    // return "Even";

    // Test Data: -2147483648
    // Expected Result: Odd
    @Test
    public void testStartEvenNumber_HappyPathTest4() {
        // AAA
        // Arrange
        int number = -2147483648;
        String expectedResult = "Even";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 8. Negative testing
    // if ((number & 2) == 0)
    // return false;

    // None. Число либо "Even" либо "Odd".
}
