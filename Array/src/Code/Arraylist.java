import java.util.ArrayList;
public class Arraylist {
    public static void main(String[]args){
        int []arr={2,3,1,4,4,5};
        ArrayList<Integer>ans=findAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println(findAllIndex2(arr,4,0));
        int[]nums={-4,-2,0,4,5,7};
        System.out.println(sortedSquares(nums));
    }
    static ArrayList<Integer> findAllIndex(int[]arr, int target, int index, ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
//Without returning ArrayList as an argument//
static ArrayList<Integer> findAllIndex2(int[]arr,int target,int index){
    ArrayList<Integer>list =new ArrayList<>();
    if(index==arr.length){
        return list;
    }
    if(arr[index]==target){
        list.add(index);
    }
    ArrayList<Integer> ansFromBelowCalls =findAllIndex2(arr,target,index+1);
    list.addAll(ansFromBelowCalls);
    return list;
}}

static  int[] sortedSquares(int[] nums) {
    int[]ans = new int[nums.length];
    for(int i=0;i<=nums.length-1;i++){
        ans[i]=(nums[i]*nums[i]);
    }
    return ans;
}

void main() {
}