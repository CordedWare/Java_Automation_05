import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnForUniversalTest {

    // 1. if (start < end && step > 0)

    // Data: 1, 7, 7
    @Test
    public void testStartForUniversal_HappyPathTest1() {
        // AAA
        // Arrange
        int start = 1;
        int end = 7;
        int step = 7;
        int exceptedResult = 7;

        // Act
        int actualResult = new ReturnForUniversal().returnForUniversal(start,end,step);

        // Assert
        Assert.assertEquals(exceptedResult,actualResult);
    }
}
