public class Product {
    public static void main(String[] args) {
        int [] arr = {3,2,3,4};
        int n = arr.length;
        int pro =1;
        int [] product = new int[n];
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i!=j){
                    pro *= arr[j];
                }
            }
            product[i]= pro;
            pro = 1;
        }
        for(int x : product){
            System.out.print(x+" ");
        }
    }
    
}
