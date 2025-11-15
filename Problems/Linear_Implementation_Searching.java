
    
// Linear Search Implementation
import java.util.*;

public class Linear_Implementation_Searching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size :");
        int size = sc.nextInt();
        
        int [] a= new int[size]; 
        
        System.out.println("Enter the no of elements");
        for(int i=0; i<size; i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter your target ");
        int target = sc.nextInt();
        

        boolean found = false;
        
        
       for(int i=0; i<size; i++){
            if(a[i]==target){
                System.out.println("Element found at index " + i );
                found = true;
                break;
            }
        }
        
        
        if(!found){
            System.out.println("Element not found ");
        }
        
    }
}