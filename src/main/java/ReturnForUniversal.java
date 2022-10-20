public class ReturnForUniversal {
    // не работает, доработать на досуге
    public int returnForUniversal(int start, int end, int step) {
        if (step == 0) {
            System.out.print("Error! Enter correct step number");
        } else {

            if (start < end && step > 0) {                     // 1
                int start1 = start - start % step;
                if (start1 < start) {
                    start1 += step;
                }

                for (int i = start1; i <= end; i += step) {
                    return i;
                }                                              // 1

            } else if (start > end && step > 0) {              // 2
                int start1 = start - start % step;
                if (start1 > start) {
                    start1 -= step;
                }

                for (int i = start1; i >= end; i -= step) {
                    return i;
                }                                              // 2

            } else if (start < end && step < 0) {              // 3
                int start1 = start - start % step;
                if (start1 < start) {
                    start1 -= step;
                }

                for (int i = start1; i <= end; i -= step) {
                    return i;
                }                                              // 3

            } else if (start > end && step < 0) {              // 4
                int start1 = start - start % step;
                if (start1 > start) {
                    start1 += step;
                }

                for (int i = start1; i >= end; i += step) {
                    return i;
                }                                              // 4
            }
        }
        return start;
    }
}
