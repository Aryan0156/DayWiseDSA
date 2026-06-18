import java.util.Scanner;

public class MaxlengthEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int currlen = 1;
        int maxlen = 1;
        int start = 0;
        int cstart =0;
        for(int i =1; i<n; i++){
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                    currlen++;
                    if(currlen> maxlen){
                        maxlen = currlen;
                        start = cstart;
                    }
                }
                    else{
                        currlen =1;
                        cstart = i;
                    }
        }
        System.out.println("Length = "+maxlen);
        for(int i = start; i<start + maxlen; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }   
}
