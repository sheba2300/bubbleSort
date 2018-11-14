public class BubbleSort {
    public static void main(String[] args)
    {


        public void swap(int[] array, int posOne, int posTwo)
        {
            int placeHolder = array[posOne];
            array[posOne] =array[posTwo];
            array[posTwo] = placeHolder;
        }
        public void bubbleSort(int[] arr)
        {
            int range = arr.length;
            boolean noSwap = false;
            int noSwapIdx = 0;
            while(range >= 0)
            {
                for(int x = 0; x<range; x++)
                {
                    if(arr[x]>arr[x+1])
                    {
                        swap(int[] arr, x, x+1)
                        noSwap = false;
                    }
                }
            }
        }
    }
}
