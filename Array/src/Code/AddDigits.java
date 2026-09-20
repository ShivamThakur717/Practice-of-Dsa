package Code;

public class AddDigits {
    public static void main(String[]args){
        AddDig(38);
        System.out.println(AddDig(38));
    }
    static int AddDig(int n){
        int sum=0;
        if(n < 10){
            return n;
        }
        while(n > 0){
            int rem= n % 10;
            sum+=rem;
            n=n/10;
        }
        return AddDig(sum);
    }
}
