import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnForUniversalTest {

    // 1. Positive testing
    // if (start < end && step > 0)

    // Test Data: 1, 7, 7
    // Expected Result: 7
    @Test
    public void testStartForUniversal_HappyPathTest1() {
        // AAA
        // Arrange
        int start = 1;
        int end = 7;
        int step = 7;
        int[] expectedResult = {7};

        // Act
        int[] actualResult = new ReturnForUniversal().returnForUniversal(start, end, step);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    // 2. Positive testing
    // else if (start > end && step > 0)

    // Test Data: 8, 4, 4
    // Expected Result: 8
    @Test
    public void testStartForUniversal_HappyPathTest2() {
        // AAA
        // Arrange
        int start = 8;
        int end = 4;
        int step = 4;
        int[] expectedResult = {8};

        // Act
        int[] actualResult = new ReturnForUniversal().returnForUniversal(start, end, step);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    // 3. Positive testing
    // else if (start < end && step < 0)

    // Test Data: -16, -8, -8
    // Expected Result: 8
    @Test
    public void testStartForUniversal_HappyPathTest3() {
        // AAA
        // Arrange
        int start = -16;
        int end = -8;
        int step = -8;
        int[] expectedResult = {-16};

        // Act
        int[] actualResult = new ReturnForUniversal().returnForUniversal(start, end, step);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    // 4. Positive testing
    // else if (start > end && step < 0)

    // Test Data: 16, -8, -8
    // Expected Result: 8
    @Test
    public void testStartForUniversal_HappyPathTest4() {
        // AAA
        // Arrange
        int start = 16;
        int end = -8;
        int step = -8;
        int[] expectedResult = {16};

        // Act
        int[] actualResult = new ReturnForUniversal().returnForUniversal(start, end, step);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
