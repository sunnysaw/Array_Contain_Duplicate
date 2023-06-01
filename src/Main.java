/*
Question : Given an integer array, return true if any value appears at least twice in the array and return false if
           every element is distinct.
_____________________________________________________________________________________________________________________
I/O = [1,2,1,3]
O/P = True
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, SizeOfArray,temp,count = 0;
        System.out.println("Enter the size of array :");
        SizeOfArray = input.nextInt();
        int[] array = new int[SizeOfArray];
        System.out.println("Enter the element inside array :");
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        for (start = 0; start < array.length; start++){
            for (temp = start + 1; temp < array.length; temp++) {
                if (array[start] == array[temp]) {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                break;
            }
        }
        if (count > 0){
            System.out.println("false ");
        }else
            System.out.println("True");
    }
}