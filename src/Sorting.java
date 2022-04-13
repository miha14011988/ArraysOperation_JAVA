import java.util.Arrays;

public class Sorting {
    private int a;
    private static int b;

    @FunctionalInterface
    private interface Select{
        int[] selectionSort(int[] array);
    }

    public Select select(){
        return array ->  {
            {
                if(array == null || array.length ==0){
                    throw new ArrayIndexOutOfBoundsException("Array is empty");
                }else {
                    for(int i =0; i < array.length ;i++){
                        int min = array[i];
                        int minIndex = i;
                        for(int j = i+1; j < array.length ; j++){
                            if(array[j] < min){
                                min = array[j];
                                minIndex = j;
                            }
                        }
                        int temporary = array[i];
                        array[i] = min;
                        array[minIndex] =temporary;
                    }
                }
                return array;
            }

        };
    }




    public static class Insert{

        public int[] insertSort(int[] array){
            if(array == null || array.length ==0){
                throw new ArrayIndexOutOfBoundsException("Array is empty");
            }else {
                for(int i = 1; i <array.length ;i++){
                    int current = array[i];
                    int j = i-1;
                    while (j>=0 && array[j] > current){
                        array[j+1] =array[j];
                        j--;
                    }
                    array[j+1] = current;
                }
            }
            return array;
        }
    }

    private class Bubble{

        public int[] bubbleSort(int[] array){
            if(array == null || array.length ==0){
                throw new ArrayIndexOutOfBoundsException("Array is empty");
            }else {
                for(int i =0; i <array.length-1  ;i++){
                    int temporary;
                    if(array[i] > array[i+1]){
                        temporary = array[i];
                        array[i] = array[i+1];
                        array[i+1]= temporary;
                    }
                }
            }
            return array;
        }
    }

    public static void main(String[] args) {
        int[] array = {90,12,34,27,78};
        System.out.println("array: "+ Arrays.toString(array));
        Sorting sorting = new Sorting();
        Bubble bubble = sorting.new Bubble();
        int[] sortedArray1 = bubble.bubbleSort(array);
        System.out.println("bubble sorting: "+Arrays.toString(sortedArray1));
        Sorting.Insert insert = new Insert();
        int[] sortedArray2 = insert.insertSort(array);
        System.out.println("insert sorting: "+Arrays.toString(sortedArray2));
        int[] sortedArray3 = sorting.select().selectionSort(array);
        System.out.println("select sorting: "+Arrays.toString(sortedArray3));
    }
}