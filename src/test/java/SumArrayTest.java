import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SumArrayTest {

    // 1. Positive testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // Test Data: {0, 1, 2, 3, 4, 5}
    // Expected Result: 15
    @Test
    public void testStartSumArray_HappyPathTest1() {
        // AAA
        // Arrange
        int[] numbers = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 2. Positive testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // Test Data: {-7, -3}
    // Expected Result: -10
    @Test
    public void testStartSumArray_HappyPathTest2() {
        // AAA
        // Arrange
        int[] numbers = {-7, -3};
        int expectedResult = -10;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 3. Positive testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // Test Data: {-2, 5}
    // Expected Result: 3
    @Test
    public void testStartSumArray_HappyPathTest3() {
        // AAA
        // Arrange
        int[] numbers = {-2, 5};
        int expectedResult = 3;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    // 4. Positive testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // Test Data: {0, 0}
    // Expected Result: 0
    @Test
    public void testStartSumArray_HappyPathTest4() {
        // AAA
        // Arrange
        int[] numbers = {0, 0};
        int expectedResult = 0;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 5. Negative testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // Test Data: {1,3}
    // Expected Result: 13
    @Ignore
    @Test
    public void testStartSumArray_NegativeTest1() {
        // AAA
        // Arrange
        int[] numbers = {1,3};
        int expectedResult = 13;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
