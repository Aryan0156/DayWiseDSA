// package Day07;
public class Check {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int i =0;
        int count=0;
        int e =0;

        while (i<=n){
            count = 0;
            int element = nums[i];
            for(int j =0; j<n; j++){
            if(element == nums[j]){
                count++;
             }
            
            if(count> n/2){
                e = element;
                return e;
            }
        }
            i++;
    }
    return -1;
}
public static void main(String[] args) {
        int[] arr = {8, 8, 7, 7, 7};

        Check obj = new Check();
        int x = obj.majorityElement(arr);

        System.out.println(x);
    }
}
