public class OddEven {

    public String oddEven(int number) {
        if ((number & 2) == 0) {

            return "Even";
        }
        if ((number & 2) == 1) {

            return "Odd";
        }

        return oddEven(0);
    }
}
