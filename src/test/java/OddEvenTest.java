import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    // 1. Positive testing
    // if ((number & 2) == 0)
    // return "Even";

    // Even = 4
    @Test
    public void testStartEvemNumberEnd_HappyPathTest() {
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




    // 3. Negative testing
    // if ((number & 2) == 0)
    // return oddEven(0);

    // Even = (-1)
}
