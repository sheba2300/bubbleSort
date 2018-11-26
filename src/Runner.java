public class Runner {
    public static void main(String[] args)
    {
        int numCount = 4;
        String[] wordList = {"cat", "dog", "school", "book", "pencil", "computer", "science", "table", "chairs", "paper"};
        String[] bubbletList = new String[numCount];
        InPlaceSorts.generateStringList(bubbletList,numCount,wordList);
        InPlaceSorts.bubbleSort(bubbletList);
        for (int x = 0; x < bubbletList.length; x++)
        {
            System.out.println(bubbletList[x]);
        }
        int[] insertionList = new int[numCount];
        InPlaceSorts.generateIntList(insertionList, numCount,50);
        InPlaceSorts.insertionSort(insertionList);
        for (int x = 0; x < insertionList.length; x++)
        {
            System.out.println(insertionList[x]);
        }
        double[] selectionList = new double[numCount];
        InPlaceSorts.generateDoubleList(selectionList,numCount);
        InPlaceSorts.selectionSort(selectionList);
        for (int x = 0; x < selectionList.length; x++)
        {
            System.out.println(selectionList[x]);
        }

    }
}
