import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenTest {

    // 1. Positive testing
    // if ((number & 2) == 0)
    // return "Even";

    // Even = 4
    @Test
    public void testStartEvenNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int number = 4;
        String exceptedResult = "Even";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }



    // 2. Positive testing
    // if ((number & 2) == 1)
    // return "Odd";

    // Odd = 3
    @Test
    public void testStartOddNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int number = 3;
        String exceptedResult = "Odd";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }


    // 3. Positive testing
    // if ((number & 2) == 1)
    // return "Odd";

    // Odd = -345
    @Test
    public void testStartOddNumber_HappyPathTest2() {
        // AAA
        // Arrange
        int number = -345;
        String exceptedResult = "Odd";

        // Act
        String actualResult2 = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(exceptedResult,actualResult2);
    }

    // 4. Positive testing
    // if ((number & 2) == 0)
    // return "Even";

    // Even = 0
    @Test
    public void testStartEvenNumber_HappyPathTest2() {
        // AAA
        // Arrange
        int number = 0;
        String exceptedResult = "Even";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }

    // 5. Positive testing
    // if ((number & 2) == 0)
    // return "Even";

    // Even = 222222
    @Test
    public void testStartEvenNumber_HappyPathTest3() {
        // AAA
        // Arrange
        int number = 222222;
        String exceptedResult = "Even";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }

    // 6. Positive testing
    // if ((number & 2) == 1)
    // return "Odd";

    // Odd = 2147483647
    @Test
    public void testStartOddNumber_HappyPathTest3() {
        // AAA
        // Arrange
        int number = 2147483647;
        String exceptedResult = "Odd";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }


    // 7. Positive testing
    // if ((number & 2) == 1)
    // return "Even";

    // Odd = -2147483648
    @Test
    public void testStartEvenNumber_HappyPathTest4() {
        // AAA
        // Arrange
        int number = -2147483648;
        String exceptedResult = "Even";

        // Act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }


    // 8. Negative testing
    // if ((number & 2) == 0)
    // return false;

    // None. Число либо "Even" либо "Odd".
}
