import java.util.*;

public class HospitalManagement{
    public static void main(String[] args){
        Set<String> admitted=new HashSet<>();
        Queue<String> waiting=new LinkedList<>();
        Stack<String> discharged=new Stack<>();

        admitted.add("P1");
        waiting.add("P1");

        discharged.push(waiting.remove());
        System.out.println("Discharged:"+discharged.peek());
    }
}