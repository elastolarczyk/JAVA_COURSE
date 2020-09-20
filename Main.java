import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integersToArray = getIntegers(5);
        //printArray(integersToArray);
        int[] sorted = sortIntegers(integersToArray);
        printArray(sorted);
    }

    public static int[] getIntegers(int numberOfIntegers){
        int[] values = new int[numberOfIntegers];
        System.out.println("Enter a value of " + numberOfIntegers + ".\r");
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] values){
        for(int i = 0; i < values.length; i++){
            System.out.println(i+1 + " has a value: " + values[i]);
        }
    }

    public static int[] sortIntegers(int[] values){
        /*
        int[] newSortArray = new int[values.length];
        for(int i = 0; i < values.length; i++){
            newSortArray[i] = values[i];
        }
        */
        int[] newSortArray = Arrays.copyOf(values, values.length);
        boolean flag = true;
        int tmp;
        while(flag){
            flag = false;
            for(int i = 0; i < newSortArray.length-1; i++){
                if(newSortArray[i] < newSortArray[i+1]){
                    tmp = newSortArray[i];
                    newSortArray[i] = newSortArray[i+1];
                    newSortArray[i+1] = tmp;
                    flag = true;
                }
            }
        }
        return newSortArray;
    }
}
