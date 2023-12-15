public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={3,0,1,2,5};
        System.out.println (missingNum ( nums ));
    }
    public  static int missingNum(int[] nums){
        int sumArr=0;
        for (int i : nums) {
            sumArr =sumArr+i;
        }
        int n =nums.length;
        int sumAll=n*(n+1)/2;
        return sumAll-sumArr;
    }
}



