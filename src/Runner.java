public class Runner {
    public static void main(String[] args) {
        String[] wordList = {"cat", "dog", "school", "book", "pencil", "computer", "science", "table", "chairs", "paper"};
        int numCount = 4;
        String[] bubbletList = new String[numCount];
        InPlaceSorts.generateStringList(bubbletList, numCount, wordList);
        int[] insertionList = new int[numCount];
        InPlaceSorts.generateIntList(insertionList, numCount);
        double[] selectionList = new double[numCount];
        InPlaceSorts.generateDoubleList(selectionList, numCount);
        InPlaceSorts.bubbleSort(bubbletList);
    }

}
