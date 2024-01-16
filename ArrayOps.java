public class ArrayOps {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,5};
        int[] arr2 = {1,3,-4,5};
        boolean a = containsTheSameElements( arr,arr2);
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
        int first = 0;
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

    public static boolean isContains(int number, int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean isFirstcontains = false;
        boolean isSecondContains = false;
        for(int i = 0; i < array1.length; i++) {
            for( int j = 0; j < array2.length; j++) {
                isFirstcontains = isContains(array2[j], array1);
                if (!isFirstcontains) {
                    return false;
                }
            }
        }

        for(int i = 0; i < array2.length; i++) {
            for( int j = 0; j < array1.length; j++) {
                isSecondContains = isContains(array1[j], array2);
                if (!isSecondContains) {
                    return false;
                }
            }
        }

        return isFirstcontains && isSecondContains;
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
