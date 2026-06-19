import java.util.HashMap;
import java.lang.Character;

public class LCS {
    public static void main(String[] args) {
        String str = "abcdabcdbb";
        HashMap<Character,Integer> map = new HashMap<>();
           int start = 0; 
           int maxlen =0;
           for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>= start){
                start = map.get(ch) + 1;

            }
                map.put(Character.valueOf(ch), i);
                maxlen = Math.max(maxlen, i - start + 1);
        }

        System.out.println(maxlen);
    }
}
