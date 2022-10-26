import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

// EXAMPLE FizzBuzz
public class FizzBuzzTest {

    // 1. Positive testing
    // if (start <= end)
    // return stringArray;

    // start < end
    @Test
    public void testStartLessThanEnd_HappyPathTest() {
        // AAA
        // Arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        // Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 2. Positive testing
    // if (start == end)
    // return stringArray;

    // start = end
    @Test
    public void testStartEqualsEnd_HappyPathTest() {
        // AAA
        // Arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        // Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 3. Negative testing
    // if (start <= end)
    // return array;

    // start < end
    @Ignore
    @Test
    public void testStartLessThanEnd_NegativeTest() {
        // AAA
        // Arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz"};

        // Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 4. Negative testing
    // if (start > end)
    // return new String[0];

    //
    @Test
    public void testStartGreaterThanEnd_NegativeTest() {
        // AAA
        // Arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        // Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
