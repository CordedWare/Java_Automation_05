import java.util.Arrays;
// NA RAZBOR!!! какой тип переменной метода должен возвращаться?
public class OddIndices {

    public String  oddIndices(int[] number) {
        for(int i = 0; i <= number.length; i ++) {
            if ((number[i] % 2) != 0) {
                return String.valueOf(Arrays.toString(new int[]{number[i]}));
            }
        }

        return String.valueOf(number);
    }
}
//    Написать алгоритм OddIndices, который принимает массив целых чисел,
//    и возвращает массив значений нечетных индексов
//        Test Data:
//        Input = {-45, 590, 234, 985, 12, 68}
//        Expected Result =  {590, 985, 68}
