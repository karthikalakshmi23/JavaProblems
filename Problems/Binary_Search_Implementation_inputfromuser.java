import java.util.*;
public class Binary_Search_Implementation_inputfromuser {

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
        
        int lb = 0;
        int ub = a.length-1;
        
        boolean found = false;
        
        
        while(lb<=ub){
            int mid = lb+(ub-lb)/2;
            if(a[mid]==target){
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            }
            else if(a[mid]<target){
                lb = mid+1;
            }
            else{
                ub = mid-1;
            }
        }
        
        
        if(!found){
            System.out.println("Element not found ");
        }
        
    }
}