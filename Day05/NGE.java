import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int [] arr = {4,5,2,25};
        int n = arr.length;
        int [] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] =-1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int x : nge){
            System.out.print(x+" ");
        }
    }
    
}
