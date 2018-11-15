public class BubbleSort {
    public static void main(String[] args)
    {
        int numCount = 10;
        int[] randomNumsOne = new int[numCount];
        int[] randomNumsTwo = {2,3,1,4,0,7};
        int chosenNum;
//        for(int x=0;x<numCount;x++)
//        {
//            chosenNum = (int)(Math.random()*numCount);
//            randomNumsOne[x] = chosenNum;
//            randomNumsTwo[x] = chosenNum;
//        }
     //   bubbleSortTwo(randomNumsOne);
        selectionSort(randomNumsTwo);
//
//        for(int i=0;i<numCount;i++)
//        {
//            System.out.println(randomNumsOne[i]);
//        }
//               for(int i=0;i<numCount;i++)
//    {
//        System.out.println(randomNumsTwo[i]);
//    }



    }
    public static void swap (int[] array, int posOne, int posTwo)
    {
        int placeHolder = array[posOne];
        array[posOne] =array[posTwo];
        array[posTwo] = placeHolder;
    }
    public static void bubbleSort(int[] arr)
    {
        int range = arr.length;
        boolean noSwap = false;
        int noSwapIdx = 0;
        while(range >= 0)
        {
            for(int x = 0; x<range-2; x++)
            {
                if(arr[x]>arr[x+1])
                {
                    swap(arr, x, x+1);
                    noSwap = false;
                }
                else
                {
                    noSwap = true;
                    noSwapIdx = x;
                }
            }
            if(noSwap)
                range = noSwapIdx-1;
            System.out.println(range);
        }
    }
    public static void bubbleSortTwo(int[] arr)
    {
        int swap = 1;
        while(swap != 0)
        {
            swap = 0;
            for(int x = 0; x< arr.length-1;x++)
            {
                if(arr[x]>arr[x+1])
                {
                    swap++;
                    swap(arr,x,x+1);
                }
            }
        }
    }
    public static void selectionSort(int[] arr)
    {
        int target;
        for(int x=0;x<arr.length;x++)
        {
            target = arr[x];
            for(int i=x+1; i<arr.length-(x+1);x++)
            {
                System.out.println(target);
                System.out.println(arr[i]);
                if(target > arr[i])
                {
                    System.out.println("switch");
                    swap(arr,x,i);
                }
            }

        }
    }
}
