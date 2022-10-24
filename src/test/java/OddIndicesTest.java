import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    // 1. Positive testing
    // [arrayNumber.length / 2]
    // newArray[i] = arrayNumber[x]
    // return newArray

    // number = {-45, 590, 234, 985, 12, 68}
    @Test
    public void testStartOddNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int[] number = {-45, 590, 234, 985, 12, 68};
        int[] exceptedResult = {590, 985, 68};

        // Act
        int[] actualResult = new OddIndices().oddIndices(number);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }


    // 2. Positive testing
    // [arrayNumber.length / 2]
    // newArray[i] = arrayNumber[x]
    // return newArray

    // number = {-2147483648, -2, -1, 0, 1, 2, 2147483647}
    @Test
    public void testStartOddNumber_HappyPathTest2() {
        // AAA
        // Arrange
        int[] number = {1, -2, 2147483647, 2147483646};
        int[] exceptedResult = {-2, 2147483646};

        // Act
        int[] actualResult = new OddIndices().oddIndices(number);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }


    // 3. Positive testing
    // [arrayNumber.length / 2]
    // newArray[i] = arrayNumber[x]
    // return newArray

    // number = {0, 1, 2, 3, 4, 5}
    @Test
    public void testStartOddNumber_HappyPathTest3() {
        // AAA
        // Arrange
        int[] number = {0, 1, 2, 3, 4, 5};
        int[] exceptedResult = {1, 3, 5};

        // Act
        int[] actualResult = new OddIndices().oddIndices(number);

        // Assert
        Assert.assertEquals(actualResult,exceptedResult);
    }
}
