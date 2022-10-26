import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberMultiplicityCheckTest {

    // 1. Positive testing
    // if (numberM == 7 && numberM == 9)
    // return "Good Number";

    // Test Data: 378
    // Expected result: "Good Number"
    @Test
    public void testStartNumberCheckSevenAndNineItGoodNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int numberN = 378;
        String expectedResult = "Good Number";

        // Act
        String actualResult = new NumberMultiplicityCheck().numberMultiplicityCheck(numberN);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 2. Positive testing
    // else if (numberM % 9 == 0 && numberM % 7 != 0)
    // return "Bad Number";

    // Test Data: 18
    // Expected result: "Bad Number"
    @Test
    public void testStartNumberCheckNineAndNotSevenItBadNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int numberN = 171;
        String expectedResult = "Bad Number";

        // Act
        String actualResult = new NumberMultiplicityCheck().numberMultiplicityCheck(numberN);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 3. Positive testing
    // else if (numberM % 11 == 0)
    // return "Poor Number";

    // Test Data: 154
    // Expected result: "Poor Number"
    @Test
    public void testStartNumberCheckElevenItPoorNumber_HappyPathTest1() {
        // AAA
        // Arrange
        int numberN = 154;
        String expectedResult = "Poor Number";

        // Act
        String actualResult = new NumberMultiplicityCheck().numberMultiplicityCheck(numberN);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    // 4. Positive testing
    // return "-1";

    // Test Data: 3
    // Expected result: "-1"
    @Test
    public void testStartNumberMinusOne_HappyPathTest1() {
        // AAA
        // Arrange
        int numberN = 3;
        String expectedResult = "-1";

        // Act
        String actualResult = new NumberMultiplicityCheck().numberMultiplicityCheck(numberN);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}

