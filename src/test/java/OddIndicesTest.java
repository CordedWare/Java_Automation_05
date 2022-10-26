import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    // 1. Positive testing
    // [arrayNumber.length / 2]
    // newArray[i] = arrayNumber[x]
    // return newArray

    // Test Data: {-45, 590, 234, 985, 12, 68}
    // Expected result: {590, 985, 68}
    @Test
    public void testStartOddNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int[] numbers = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        // Act
        int[] actualResult = new OddIndices().oddIndices(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 2. Positive testing
    // [arrayNumber.length / 2]
    // newArray[i] = arrayNumber[x]
    // return newArray

    // Test Data: {-2147483648, -2, -1, 0, 1, 2, 2147483647}
    // Expected result: {-2, 2147483646}
    @Test
    public void testStartOddNumber_HappyPathTest2() {
        // AAA
        // Arrange
        int[] numbers = {1, -2, 2147483647, 2147483646};
        int[] expectedResult = {-2, 2147483646};

        // Act
        int[] actualResult = new OddIndices().oddIndices(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 3. Positive testing
    // [arrayNumber.length / 2]
    // newArray[i] = arrayNumber[x]
    // return newArray

    // Test Data: {0, 1, 2, 3, 4, 5}
    // Expected result: {1, 3, 5}
    @Test
    public void testStartOddNumber_HappyPathTest3() {
        // AAA
        // Arrange
        int[] numbers = {0, 1, 2, 3, 4, 5};
        int[] expectedResult = {1, 3, 5};

        // Act
        int[] actualResult = new OddIndices().oddIndices(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
