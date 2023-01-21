import java.util.Random;

//merge sort взят с лекции
//BinarySort взят с интернета
//проанализировав затраченное время на выполнение кода сортировки мердж –
// его следует использовать в том случае, когда нужно много раз осуществлять
// поиск по массиву, но он будет менее результативен если массив будет часто меняться
// (добавляться новые элементы) и каждый раз его сортировать перед поиском – это более
// затратно по времени чем просто пройтись по массиву и найти элемент, я верно понял или нет?
// лучше ли использовать в любом случае мердж сорт, так как он будет выполняться на сервере и
// время выполнения не повлияет на отображение для конечного пользователя?

public class TestTime {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        Random rnd = new Random();

        int[] arr = new int[50_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10000);
        }
        int numberForSearch = 123456789;
        int index = arr.length - 1;
        arr[index] = numberForSearch;
        long try1 = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberForSearch) {
                System.out.println("number " + numberForSearch + " has position - " + (i + 1));
                break;
            }
        }
        long try1finish = System.currentTimeMillis();

        long result1 = try1finish - try1;


        System.out.println("search element use for");
        System.out.println(result1 + " - millis loop");
//        System.out.println(MergeSort.arrayToString(arr));

        System.out.println("__________________________________________");
        System.out.println("sort element use Merge Sort");
        long mergeSortBinSearchStart = System.currentTimeMillis();
        MergeSort.mergeSort(arr);

        binSearch(arr, numberForSearch);
        long mergeSortBinSearchFinish = System.currentTimeMillis();
        long mergeTimeResult = mergeSortBinSearchFinish - mergeSortBinSearchStart;

        System.out.println(mergeTimeResult + " - millis merge sort.");
//        System.out.println(MergeSort.arrayToString(arr));
        System.out.println("________________________________________");


        System.out.println("________________________________________");
//        System.out.println("sort O(n**2)");
//
//        long timeBubbleSortStart = System.currentTimeMillis();
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        long timeBubbleSortEnd = System.currentTimeMillis();
//
//        long resultTimeBubbleSort = timeBubbleSortEnd - timeBubbleSortStart;
//        System.out.println(resultTimeBubbleSort + " millis - bubbleSort");







        long timeFinish = System.currentTimeMillis();
        long timeResultAllMethod = timeFinish - timeStart;
        System.out.println(timeResultAllMethod + " millis - all method main");
    }

    public static void binSearch(int[] arr, int numberForSearch){
        System.out.println("______________________________");
        long start = System.currentTimeMillis();
        BinarySearch bs = new BinarySearch();

        long finish = System.currentTimeMillis();
        long result = finish - start;

        System.out.println(result + " millis binary search.");
        System.out.println("______________________________");
    }
}
