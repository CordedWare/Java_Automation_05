public class SumArray {

    public int sumArray(int[] sumArray) {

        int sum = 0; // для присваивания и суммирования через цикл
        for (int i = 0; i < sumArray.length; i ++) {
            sum += sumArray[i]; // на каждый цикл суммируется число
        }

        return sum; // возвращается метод
    }
}

//    3. Написать алгоритм SumArray, который возвращает сумму всех
//    чисел массива
//
//        Test Data:
//        {0, 1, 2, 3, 4, 5} → 15
//        {-7, -3} → -10