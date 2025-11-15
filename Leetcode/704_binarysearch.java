import java.util.*;
class 704_BinarySearch {
    public static int search(int[] nums, int target) {
       return Helper(nums, target,0,nums.length-1);
    }
        public static int Helper(int []nums,int target,int start,int end){
        int mid=start+(end-start)/2;
        
        if(nums[mid]==target){
            return mid;
        }else if(target>nums[mid]){
             return Helper(nums,target,start=mid+1,end);
        }else if(target<nums[mid]){
           return Helper(nums,target,start,end=mid-1);
        }else{
            return -1;
        }
        
        }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size:");
            int size=sc.nextInt();
            int []nums=new int[size]; 
            System.out.print("Enter the elements:");
            for(int i=0;i<size;i++){
                nums[i]=sc.nextInt();
            }
            System.out.print("Enter the target:");
            int target=sc.nextInt();
            int ans=search(nums,target);
            System.out.println(ans);
        }
    }