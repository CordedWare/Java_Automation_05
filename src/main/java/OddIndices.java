public class OddIndices {

    public int[] oddIndices(int[] arrayNumber) {

            int[] newArray = new int[arrayNumber.length / 2]; // объявляем новый массив, который
                                         // забирает у другого массива символы нечетных индексов
                                         // это 3 числа со значением {0, 0, 0}

            int x = 1; // переменная, которая играет роль нечетного индекса и нужна для цикла for

            for (int i = 0; i < newArray.length; i++) { // длина массива newArray.length = 3
                newArray[i] = arrayNumber[x]; // newArray забирает число от индекса массива arrayNumber
                                                                                 // с присвоенным x = 1
                x += 2; // к числу с индексом х прибавляется +2 для следующего цикла
            }

            return newArray; //
    }
}
//    Написать алгоритм OddIndices, который принимает массив целых чисел,
//    и возвращает массив значений нечетных индексов
//        Test Data:
//        Input = {-45, 590, 234, 985, 12, 68}
//        Expected Result =  {590, 985, 68}
