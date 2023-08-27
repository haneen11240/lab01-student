import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
	   Scanner keyboard = new Scanner(System.in);
	   int num = keyboard.nextInt();
	   int [] arr = new int[num];
	   for (int i = 0;i < num; i++)
		   arr[i] = keyboard.nextInt();
	   //Get first 2 values to be printed
	   Arrays.sort(arr);
	   System.out.println(arr[0] + " and " + arr[1]);
			   
   } //change to pull back
}
