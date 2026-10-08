import java.util.*;
class alicebob {
    public boolean canAliceWin(int[] nums) {
        int doubledigit=0;
        int singledigit=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                doubledigit+=nums[i];
            }
            if(nums[i]<=9 && nums[i]>=0){
                singledigit+=nums[i];
            }
        }
        if(singledigit>doubledigit||doubledigit>singledigit){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        alicebob ab=new alicebob();
        System.out.println(ab.canAliceWin(nums));

    }
}