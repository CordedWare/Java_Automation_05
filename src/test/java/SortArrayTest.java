import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {


    // 1. Positive testing

    // Test Data: {4, 3, 7, 12, 5, 2, 9, 4, 12}
    // Expected Result: {2, 3, 4, 4, 5, 7, 9, 12, 12}
    @Test
    public void testStartSortArray_HappyPathTest1() {
        // AAA
        // Arrange
        int[] numbers = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        // Act
        int[] actualResult = new SortArray().sortArray(numbers);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
