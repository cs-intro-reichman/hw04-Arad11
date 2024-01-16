public class ArrayOps {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,6};
        int a = findMissingInt(arr);
        int b = 4;
    }
    
    public static int findMissingInt (int [] array) {
        int expectedSum = calcInvoiceSeriesSum(array);
        int actualSum = 0;
        for(int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        return (expectedSum - actualSum);
    }

    private static int calcInvoiceSeriesSum(int [] array) {
        int first = array[0];
        int n = array.length + 1;
        int d = 1;
        double sum = (n / 2.0) * (2*first + (n-1)*d);
        return (int)sum;
    }

    public static int secondMaxValue(int [] array) {
        int maxNum = 0;
        int secondMaxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                secondMaxNum = maxNum;
                maxNum = array[i];
            }
            else if (array[i] > secondMaxNum) {
                secondMaxNum = array[i];
            }
        }   
        return secondMaxNum;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean isExsists = false;
        for(int i = 0; i < array1.length; i++) {
            isExsists = false;
            for( int j = 0; j < array2.length; j++) {
               if (array1[i] == array2[j]) {
                 isExsists = true;
               }

               if (!isExsists) {
                return false;
               }
            }
        }

        for(int i = 0; i < array2.length; i++) {
            isExsists = false;
            for( int j = 0; j < array1.length; j++) {
               if (array2[i] == array1[j]) {
                 isExsists = true;
               }

               if (!isExsists) {
                return false;
               }
            }
        }

        return true;
    }

    public static boolean isSorted(int [] array) {
        if (array[0] > array[1]) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
        }
        else if(array[0] < array[1]) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
