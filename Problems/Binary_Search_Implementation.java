import java.util.*;
   public class Binary_Search_Implementation {
    




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int [] a = {10,20,30,40,50};
        
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
                sc.close();
            }
        }
        
        
        if(!found){
            System.out.println("Element not found ");
        }
        
    }
}