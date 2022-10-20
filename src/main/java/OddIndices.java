// NA RAZBOR!!! Доработать метод, чтобы было исключение деления на 0 и
// чтобы -2147483648 можно было поделить
public class OddIndices {

    public int[] oddIndices(int[] arrayNumber) {
        //if (arrayNumber.length > 1) {
            int[] newArray = new int[arrayNumber.length / 2];
            int x = 1;
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arrayNumber[x];
                x = x + 2;
            }
            return newArray;


//        }
//        return new int[0];
    }
}
//    Написать алгоритм OddIndices, который принимает массив целых чисел,
//    и возвращает массив значений нечетных индексов
//        Test Data:
//        Input = {-45, 590, 234, 985, 12, 68}
//        Expected Result =  {590, 985, 68}
