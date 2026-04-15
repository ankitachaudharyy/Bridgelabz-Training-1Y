import java.util.*;

public class ListFrequency {
    public static void main(String[] args){
        List<String> data=Arrays.asList("apple","banana","apple","orange");
        Map<String,Integer> map=new HashMap<>();
        for(String s:data){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
    }
}