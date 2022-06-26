import java.util.HashMap;

public class IsomorphicStrings {
    //^ 1:1 mapping of characters
    //^ s = egge
    //^ t = adda
    //^ e -- a
    //^ g -- d
    //^ They are isomorphic
    //^ s = egg
    //^ t = adc
    //^ Not isomorphic, g is mapped to both d and c

    public boolean isIsomorphic(String s, String t) {
        //& Length - unequal - false
        //& 

        if(s.length() != t.length())
            return false;
        
            Map<Character,Character> map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                char s_chars = s.charAt(i);
                char t_chars = t.charAt(i);
                if(!map.containsKey(s_chars)){
                    if(map.containsValue(t_chars))   
                        return false;
                    map.put(s_chars,t_chars);
                }
                else  {
                    if(map.get(s_chars) != t_chars)   return false;
                } 
            }
            return true;        
    }
}
