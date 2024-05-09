import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size ; i++){
            arr[i] = s.nextInt();
        }

        int i ;
        int j;

        for (i = 0 ,j = size - 1 ; i <= j; ){
            if(arr[i] % 2 == 0){
                i++;
            } else if (arr[j] % 2 != 0) {
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println("Array after sorting: "+ Arrays.toString(arr));

    }
}