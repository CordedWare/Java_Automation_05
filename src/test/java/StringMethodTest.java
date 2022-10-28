import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodTest {

    //  (1) removeSpaces
    //  1. Positive testing
    //  if (string != "")
    //  return string.trim()

    // Test Data: " String "
    @Test
    public void testStartStringNotNull_HappyPathTest1() {
        // AAA
        // Arrange
        String string = "    Red Rover School   ";

        String expectedResult = "Лишние пробелы удалены";

        // Act
        String actualResult = new StringMethods().removeSpaces(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //  1. Positive testing
    //  if (string != "")
    //  return string.trim()

    // Test Data: ""
    @Test
    public void testStartStringIsNull_HappyPathTest1() {
        // AAA
        // Arrange
        String string = "";

        String expectedResult = "Строка пустая";

        // Act
        String actualResult = new StringMethods().removeSpaces(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
