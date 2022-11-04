public class SortArray {

    public int[] sortArray (int[] numbers) {

        if (numbers.length > 0) {

            while (true) {

                int timespell = 0;
                int count = 0;
                for (int i = 0; i < (numbers.length - 1); i ++) {
                    if (numbers[i] > numbers[(i + 1)]); {
                     timespell = numbers[i];
                     numbers[i] = numbers[i + 1];
                     numbers[(i + 1)] = timespell;
                     count ++;
                    }
                }
                if (count == 0) {
                    break;
                }
            }

            return numbers;
        }

        return new int[]{};
    }
}

//   12.  Написать алгоритм SortArray, который принимает на вход массив
//   целых чисел, и сортирует элементы массива в порядке возрастания.

//        Test Data:
//        {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
