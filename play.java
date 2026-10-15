impport java.util.*;
public class play{
public static void main(String[] args){
int n=sc.nextInt();
int[] nums=new int[n];
int[] fine=new int[n];
for(int i=0;i<n;i++){
nums[i]=sc.nextInt();
fine[i]=2*nums[i];
}
System.out.pritnln(fine);
}
}
