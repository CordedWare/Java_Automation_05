public class MinMaxAve {

    public int[] minMaxAve(int[] array, int x, int y) {

        if (x >= 0 && x < array.length && y >= 0 && y < array.length) {

            if (x > y) {

                int z;
                z = x;
                x = y;
                y = z;
            }

            int average = 0;
            int numbers = 0;
            int min = array[x];
            int max = array[x];

            for (int i = x; i <= y; i ++, numbers ++) {

                average += array[i];

                if (array[i] < min) {
                    min = array[i];
                } else {
                    max = array[i];
                }
            }
            average = Math.round(average / numbers);

            return new int[]{min, max, average}; // выводим начало, конец, срзнач
        }  else {

            return new int[]{};
        }
    }
}

//  8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]
//  и 2 значения индексов.
//  Алгоритм возвращает массив, который содержит минимальное значение,
//  максимальное значение, и среднее среди всех значений между
//  2-мя индексами.
//
//        Test Data:
//        ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
