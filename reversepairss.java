class reversepairss {
    public int reversePairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((long)nums[i]>(2*(long)nums[j])){
                    count++;
                }
            }
        }
        return count;
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();   
     }
    reversepairss rp=new reversepairss();
    System.out.println(rp.reversepairs(nums));
  }
}
