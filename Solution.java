import java.util.io;
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int first = nums[i];
            int second = nums[i + 1];
            if (second == first) {
                continue;
            }
            if (second == first + 1) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
  public class void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    nums[i]=sc.nextInt();
    Solution so=new Solution();
    System.out.println(so.longestConsecutive(nums);
}
