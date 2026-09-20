package Code;

public class BitManipulation {
    public static void main(String[]args){
        int n=2;
        System.out.println(happy(2));
        int []nums={4,5,3,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    static boolean happy(int n){
        int digit=0;
        while(n>0){
            if(n==1){
                return true;
            }
           int rem=n%10;
           digit=digit+rem*rem;
           n = n/10;
        }
        return happy(digit);
    }
    static int removeDuplicates(int[] nums) {
        int start=0;
        int next=1;
        int count=0;
        while(start<=next){
            if(nums[start]==nums[next]){
                count++;
            }
            start++;
            next++;
        }
        return count;
    }
}
