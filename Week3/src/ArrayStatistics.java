public class ArrayStatistics {
    static int sum(int[] values){
        int sum=0;
        for (int i=0; i<values.length; i++){
            sum+=values[i];
        }
        return sum;
    }
    
    static double average(int[] values) {
        return sum(values) / values.length;
    }

    static int minimum(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    static int maximum(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    static int countEven(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static void printSignCounts(int[] values) {
        int positive = 0, negative = 0, zero = 0;
        for (int i = 0; i < values.length; i++) 
        {
            if (values[i] > 0) positive++;
            else if (values[i] < 0) negative++;
            else zero++;
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
