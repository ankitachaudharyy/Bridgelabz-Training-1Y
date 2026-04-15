import java.util.*;

class Order{
    int id;
    Order(int id){this.id=id;}
    public boolean equals(Object o){return (o instanceof Order)&&((Order)o).id==id;}
    public int hashCode(){return id;}
}

public class ECommerceSystem{
    public static void main(String[] args){
        List<Order> list=new ArrayList<>();
        list.add(new Order(1));
        list.add(new Order(1));

        Set<Order> unique=new HashSet<>(list);
        Queue<Order> queue=new LinkedList<>(unique);

        while(!queue.isEmpty())
            System.out.println("Processing "+queue.remove().id);
    }
}