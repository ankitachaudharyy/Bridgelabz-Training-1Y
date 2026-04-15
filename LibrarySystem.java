import java.util.*;

public class LibrarySystem{
    public static void main(String[] args){
        List<String> books=new ArrayList<>(Arrays.asList("Java","DSA","OS"));
        Set<String> members=new HashSet<>();
        members.add("S1");
        members.add("S1");

        Queue<String> issueQueue=new LinkedList<>(books);
        Stack<String> returned=new Stack<>();

        returned.push(issueQueue.remove());
        System.out.println("Returned:"+returned.peek());
    }
}