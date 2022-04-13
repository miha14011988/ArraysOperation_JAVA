import java.util.Arrays;

public class ArraysOperations {
    public boolean isEven(int[] array, int index){
        if(array == null || array.length ==0){
            throw new NullPointerException("Array is empty");
        }
        if(index <0 || index >= array.length){
            throw new ArrayIndexOutOfBoundsException("index is incorrect");
        }
        return array[index] % 2 == 0;
    }

    public int sumElement(int[] array){
        int sum =0;
        if(array != null && array.length !=0){
            for(int i :array){
                sum = sum+i;
            }
        }
        return sum;
    }

    public int countElement(int[] array){
        if(array == null || array.length ==0){
            throw new NullPointerException("Array is empty");
        }
        return array.length;
    }

    public String minimum(int[] array){
        String s;
        int index =0;
        if(array == null || array.length ==0){
            throw new NullPointerException("Array is empty");

        }else {
            int minimum = array[0];
            for(int i =0; i < array.length ;i++){
                if(array[i] < minimum){
                    minimum =array[i];
                    index = i;
                }
            }
            s = "minimum: array["+index+"] = "+minimum;
        }
        return s;
    }

    public String maximum(int[] array){
        String s;
        int index =0;
        if(array == null || array.length ==0){
            throw new NullPointerException("Array is empty");

        }else {
            int maximum = array[0];
            for(int i =0; i < array.length ;i++){
                if(array[i] > maximum){
                    maximum =array[i];
                    index = i;
                }
            }
            s = "maximum: array["+index+"] = "+maximum;
        }
        return s;
    }

    public String getValue(int[] array,int value){
        String s =null;
        int number=0;
        int index =0;
        if(array == null || array.length ==0){
            throw new NullPointerException("Array is empty");
        }
        if(value >= array.length || value < 0){
            throw new ArrayIndexOutOfBoundsException("index is incorrect");
        }
        for(int i=0; i < array.length ;i++){
            if(array[i] == value){
                number =value;
                index = i;
            }
            s = "value: array["+index+"] = "+number;
        }
        return s;
    }

    public String replaceValue(int[] array, int value , int replace){
        int index =0;
        int number =0;
        if(array == null || array.length ==0){
            throw new NullPointerException("Array is empty");
        }
        if(value >= array.length || value < 0){
            throw new ArrayIndexOutOfBoundsException("index is incorrect");
        }
        if(replace <= 0){
            throw new IllegalArgumentException("number is negative");
        }

        for(int i =0; i < array.length ;i++){
            if(array[i] == value){
                array[i] =replace;
                number =array[i];
                index = i;
            }
        }
        return "replace: array["+index+"] = "+number;
    }

    public static void main(String[] args) {
        ArraysOperations a = new ArraysOperations();
        int[] array = new int[10];
        int[] reverseArray = new int[10];
        System.out.println("array: "+ Arrays.toString(array));
        int number =1;

        for(int i =0; i < array.length ;i++){
            array[i] = number;
            number++;
        }

        System.out.println("array: "+ Arrays.toString(array));

        for(int i = reverseArray.length-1; i >=0; i--){
            reverseArray[i] = number;
            number++;
        }

        System.out.println("reverse array: "+ Arrays.toString(reverseArray));
        boolean result1 = a.isEven(array,0);
        boolean result2 = a.isEven(array,1);
        System.out.println("a.isEven(array,0) = "+result1);
        System.out.println("a.isEven(array,1) = "+result2);
        int result3 = a.sumElement(array);
        System.out.println("sum = "+result3);
        int result4= a.countElement(array);
        System.out.println("count element = "+result4);
        String result5 = a.minimum(array);
        String result6 = a.minimum(reverseArray);
        System.out.println(result5);
        System.out.println(result6);
        String result7 = a.maximum(array);
        String result8 = a.maximum(reverseArray);
        System.out.println(result7);
        System.out.println(result8);
        String result9 = a.getValue(array,7);
        System.out.println(result9);
        String result10 = a.replaceValue(array,7,1000);
        System.out.println(result10);
        System.out.println("array: "+Arrays.toString(array));

    }
}
