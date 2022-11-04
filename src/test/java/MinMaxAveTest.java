import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    // 1. Positive testing

    // Test Data: {1, 2, 3, 4, 5, 6, 7, 8}
    @Test
    public void testStartMinMaxAverage_HappyPathTest1() {
        // AAA
        // Arrange
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int x = 2;
        int y = 6;

        int[] expectedResult = new int[] {3, 7, 5};

        // Act
        int[] actualResult = new MinMaxAve().minMaxAve(array, x, y);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 2. Positive testing

    // Test Data: {1, -6}
    @Test
    public void testStartMinMaxAverage_HappyPathTest2() {
        // AAA
        // Arrange
        int[] array = new int[]{1, -6};
        int x = 1;
        int y = 0;

        int[] expectedResult = new int[] {-6, 1, -2};

        // Act
        int[] actualResult = new MinMaxAve().minMaxAve(array, x, y);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 3. Positive testing

    // Test Data: {2}
    @Test
    public void testStartMinMaxAverage_HappyPathTest3() {
        // AAA
        // Arrange
        int[] array = new int[]{2};
        int x = 0;
        int y = 0;

        int[] expectedResult = new int[] {2, 2, 2};

        // Act
        int[] actualResult = new MinMaxAve().minMaxAve(array, x, y);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    // 4. Negative testing

    // Test Data: {1, 2, 3, 4, 5, 6, 7, 8}
    @Test
    public void testStartMinMaxAverage_NegativeTest() {
        // AAA
        // Arrange
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int x = -2;
        int y = 6;

        int[] expectedResult = new int[] {};

        // Act
        int[] actualResult = new MinMaxAve().minMaxAve(array, x, y);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
