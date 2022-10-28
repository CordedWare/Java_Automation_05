import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {


    // 1. Positive testing

    // Test Data: {0, 1, 2, 3, 4, 5}
    // Expected Result: 15
    @Test
    public void testStartSortArray_HappyPathTest1() {
        // AAA
        // Arrange
        int[] numbers = {1, 1, 2, 3, 4, 5};
        int[] expectedResult = {1, 1, 2, 3, 4, 5};

        // Act
        int[] actualResult = new SortArray().sortArray(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
