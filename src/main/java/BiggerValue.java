public class BiggerValue {

    public String biggerValue(int num1, int num2) {
        if (num1 > num2)
            return String.valueOf(num1);

        if (num2 > num1)
            return String.valueOf(num2);

        if (num2 == num1)
            return "Числа равны";

        return "Error";
    }
}

//    4. Напишите алгоритм BiggerValue, который из двух параметров
//    типа int возвращает бОльшее значение.
//        Test Data:
//        3333, 9999
//        Expected Result = 9999

