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

//    1. В классе OddEven создать алгоритм oddEven(), который принимает
//    на вход целое число, возвращает “Odd”,  если число нечетное,
//    и “Even”, если число четное.
//
//        Test Data:
//        -345 →  “Odd”
//        0 →  “Even”
//        222222 →  “Even”
