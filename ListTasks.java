import java.util.*;

public class ListTasks {
    public static void reverse(List<Integer> list){
        for(int i=0,j=list.size()-1;i<j;i++,j--){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
    }

    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(list);
        System.out.println(list);
    }
}