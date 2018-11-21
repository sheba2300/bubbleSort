public class InPlaceSorts {

    public static void generateIntList(int[] arr, int numCount) {

        for (int x = 0; x < numCount; x++) {
            arr[x] = (int) (Math.random() * numCount);
        }

    }
    public static void generateDoubleList(double[] arr, int numCount)
    {
        for (int x = 0; x < numCount; x++)
        {
            arr[x] = (double) (Math.random() * numCount);
        }
    }
    public static void generateStringList(String[] arr, int numCount, String[] wordList) {

        for (int x = 0; x < numCount; x++)
        {
           arr[x] = wordList[(int)(Math.random() * wordList.length-1)];

        }
    }

    public static void swap(String[] array, int posOne, int posTwo) {
        String placeHolder = array[posOne];
        array[posOne] = array[posTwo];
        array[posTwo] = placeHolder;
    }

    public static void bubbleSort(String[] arr) {
        int range = arr.length;
        boolean noSwap = false;
        int noSwapIdx = 0;
        while (range >= 0) {
            for (int x = 0; x < range - 2; x++) {
                if (arr[x].compareTo(arr[x + 1]) > 0) {
                    swap(arr, x, x + 1);
                    noSwap = false;
                } else {
                    noSwap = true;
                    noSwapIdx = x;
                }
            }
            if (noSwap)
                range = noSwapIdx - 1;
            System.out.println(range);
        }
    }

    public static void bubbleSortTwo(String[] arr) {
        int swap = 1;
        while (swap != 0) {
            swap = 0;
            for (int x = 0; x < arr.length - 1; x++) {
                if (arr[x].compareTo(arr[x + 1]) >0) {
                    swap++;
                    swap(arr, x, x + 1);
                }
            }
        }
    }

//    public static void selectionSort(double[] arr) {
//        int target;
//        for (int x = 0; x < arr.length; x++) {
//            target = arr[x];
//            for (int i = x + 1; i < arr.length - (x + 1); x++) {
//                System.out.println(target);
//                System.out.println(arr[i]);
//                if (target > arr[i]) {
//                    System.out.println("switch");
//                    swap(arr, x, i);
//                }
//            }
//
//        }
//    }

    public static void mergeSort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    public static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if(from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle+1, to, temp);
            merge(elements,from, middle, to, temp);
        }
    }
    public static void merge(int[] elements, int from, int middle, int to, int[] temp)
    {
        int pos = middle;
        while(pos < to)
        {

            for(int x = from; x< middle; x++)
            {
                System.out.println(elements[pos]);
                System.out.println(elements[x]);

                if(elements[pos] >= elements[x])
                {
                    temp[x] = elements[pos];
                }
                else
                    {
                    temp[x] = elements[x];
                }
            }
            pos++;
        }

        for(int x = 0; x<temp.length;x++)
        {
            System.out.println(temp[x]);
        }
    }

}
