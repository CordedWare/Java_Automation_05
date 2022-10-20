import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    // 1. if (number % 2 == 1) {
    // return new int[]{number};

    // number = {-45, 590, 234, 985, 12, 68}
    @Test
    public void testStartOddNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int[] number = {-45, 590, 234, 985, 12, 68};
        int[] exceptedResult = {590, 985, 68};

        // Act
        String actualResult = new OddIndices().oddIndices(number);

        // Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }
}
