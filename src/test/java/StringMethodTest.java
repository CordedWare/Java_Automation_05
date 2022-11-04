import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodTest {

    //  (1) removeSpaces
    //  1. Positive testing
    //  if (string != "")
    //  return string.trim()

    // Test Data: "    Red Rover School   "
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

    //  (1) removeSpaces
    //  2. Positive testing
    //  if (string != "")
    //  return "Пустая строка"

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

    //  (2) removeAllAs
    //  1. Positive testing
    //  return string.trim().replace("a","");

    // Test Data: "    Red Rover School   "
    @Test
    public void testStartRemoveAllAs_HappyPathTest1() {
        // AAA
        // Arrange
        String string = "    Red Rover School   ";

        String expectedResult = "Red Rover School";

        // Act
        String actualResult = new StringMethods().removeAllAs(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //  (2) removeAllAs
    //  2. Positive testing
    //  return string.trim().replace("a","");

    // Test Data: "panda   "
    @Test
    public void testStartRemoveAllAs_HappyPathTest2() {
        // AAA
        // Arrange
        String string = "panda   ";

        String expectedResult = "pnd";

        // Act
        String actualResult = new StringMethods().removeAllAs(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //  (2) removeAllAs
    //  3. Positive testing
    //  return string.trim().replace("a","");

    // Test Data: "taramasalata"
    @Test
    public void testStartRemoveAllAs_HappyPathTest3() {
        // AAA
        // Arrange
        String string = "taramasalata";

        String expectedResult = "trmslt";

        // Act
        String actualResult = new StringMethods().removeAllAs(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //  (3) removeAllZeros
    //  1. Positive testing
    //  return string.replace("0", "");

    // Test Data: "3504209706040000 "
    @Test
    public void testStartRemoveAllZeros_HappyPathTest1() {
        // AAA
        // Arrange
        String string = "3504209706040000 ";

        String expectedResult = "35429764";

        // Act
        String actualResult = new StringMethods().removeAllZeros(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //  (3) removeAllZeros
    //  2. Positive testing
    //  return string.replace("0", "");

    // Test Data: "0000000111"
    @Test
    public void testStartRemoveAllZeros_HappyPathTest2() {
        // AAA
        // Arrange
        String string = "0000000111";

        String expectedResult = "111";

        // Act
        String actualResult = new StringMethods().removeAllZeros(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //  (4) removeAllZeros
    //  1. Positive testing
    //  return string.trim().replace("     ", "");

    // Test Data: "   R e d     Ro ve    r Sc   h ool   "
    @Test
    public void testStartRemoveAllSpaces_HappyPathTest1() {
        // AAA
        // Arrange
        String string = "   R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";

        // Act
        String actualResult = new StringMethods().removeAllSpaces(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //  (4) removeAllZeros
    //  2. Positive testing
    //  return string.trim().replace("     ", "");

    // Test Data: "p a     n   d a   "
    @Test
    public void testStartRemoveAllSpaces_HappyPathTest2() {
        // AAA
        // Arrange
        String string = "p a     n   d a   ";

        String expectedResult = "panda";

        // Act
        String actualResult = new StringMethods().removeAllSpaces(string);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
