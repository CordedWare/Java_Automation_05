public class OddEven {

    public String oddEven(int number) {
        if ((number % 2) == 0) {

            return "Even";
        }
        else if ((number % 2) == -1 ||(number % 2) == 1) {

            return "Odd";
        }

        return null;
    }
}
