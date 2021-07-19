package anmolworkspace;
import java.util.*;

public class Linearsearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
       System.out.println("enter the element you want to search about");
       int key_element=sc.nextInt();
       int found=0;
       for (int i=0;i<arr.length;i++) {
    	   if(arr[i]==key_element){
    		   found=1;
    		   System.out.println("yes the element is found");
    		   System.out.println("number of comparison are:"+(i+1));
    		   break;
    	   }
       }
	
	if(found==0) {
		 System.out.println("not found");
	}

}
}