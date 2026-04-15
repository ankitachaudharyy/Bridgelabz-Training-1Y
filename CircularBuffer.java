import java.util.*;

public class CircularBuffer{
    public static void main(String[] args){
        int size=3;
        Queue<Integer> buffer=new LinkedList<>();
        int[] input={1,2,3,4};
        for(int x:input){
            if(buffer.size()==size) buffer.remove();
            buffer.add(x);
        }
        System.out.println(buffer);
    }
}