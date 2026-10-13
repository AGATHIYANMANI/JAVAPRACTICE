import java.util.Scanner;
class peak {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean left = (i == 0 || nums[i] > nums[i - 1]);
            boolean right = (i == n - 1 || nums[i] > nums[i + 1]);
            if (left && right) {
                return i;
            }
        }
        return -1;
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
}
