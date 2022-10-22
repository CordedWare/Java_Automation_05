public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {

        if (start <= end) {
            String[] stringArray = new String[end - start + 1];

            int number = start;

            for(int i = 0; i < stringArray.length && number <= end; i ++) {
                if(number % 15 == 0) {
                    stringArray[i] = "FizzBuzz";
                } else if (number % 3 == 0) {
                    stringArray[i] = "Fizz";
                } else if (number % 5 == 0 ) {
                    stringArray[i] = "Buzz";
                } else {
                    stringArray[i] = String.valueOf(number);
                }

                number ++;
            }

            return stringArray;
        }

        return new String[0];
    }
}
