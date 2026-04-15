import java.util.*;

public class InventorySystem{
    public static void main(String[] args){
        Set<String> products=new HashSet<>();
        Queue<String> restock=new LinkedList<>();
        Stack<String> undo=new Stack<>();

        products.add("Milk");
        restock.add("Milk");
        undo.push(restock.remove());

        System.out.println("Restocked:"+undo.peek());
    }