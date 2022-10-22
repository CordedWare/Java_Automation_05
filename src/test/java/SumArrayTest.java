import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SumArrayTest {

        // 1. Positive testing
        // for (int i = 0; i < sumArray.length; i ++) {
        // sum += sumArray[i];
        // return sum

        // numbers = {0, 1, 2, 3, 4, 5}
        @Test
        public void testStartSumArray_HappyPathTest1() {
            // AAA
            // Arrange
            int[] numbers = {0, 1, 2, 3, 4, 5};
            int exceptedResult = 15;

            // Act
            int actualResult = new SumArray().sumArray(numbers);

            // Assert
            Assert.assertEquals(exceptedResult,actualResult);
        }


    // 1. Positive testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // numbers = {-7, -3}
    @Test
    public void testStartSumArray_HappyPathTest2() {
        // AAA
        // Arrange
        int[] numbers = {-7, -3};
        int exceptedResult = -10;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }

    // 3. Positive testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // numbers = {-2, 5}
    @Test
    public void testStartSumArray_HappyPathTest3() {
        // AAA
        // Arrange
        int[] numbers = {-2, 5};
        int exceptedResult = 3;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }

    // 4. Positive testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // numbers = {0, 0}
    @Test
    public void testStartSumArray_HappyPathTest4() {
        // AAA
        // Arrange
        int[] numbers = {0, 0};
        int exceptedResult = 0;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }


    // 5. Negative testing
    // for (int i = 0; i < sumArray.length; i ++) {
    // sum += sumArray[i];
    // return sum

    // numbers = {1,3}
    @Ignore
    @Test
    public void testStartSumArray_NegativeTest1() {
        // AAA
        // Arrange
        int[] numbers = {1,3};
        int exceptedResult = 13;

        // Act
        int actualResult = new SumArray().sumArray(numbers);

        // Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }
}
