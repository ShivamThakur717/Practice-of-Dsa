package Assignment;

//https://leetcode.com/problems/valid-digit-number/
//3908. Valid Digit Number

public class ValidDigitNumber {
    static void main(String[] args) {
        int n=101 , x=2;
        System.out.println(validDigit(n,x));

    }
    public static boolean validDigit(int n, int x) {
        String str1=Integer.toString(n);
        char[]arr=str1.toCharArray();
        char target=(char)(x+'0');
        if(arr[0]==target){
            return false;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}

