package assignment13;

import java.util.ArrayList;

public class Question7 {
    public void wrapperInCollections(){
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();

        for(double p : prices){
            list.add(p);
        }

        double highest = list.get(0);
        double sum = 0;
        for(Double val : list){
            if(val > highest){
                highest = val;
            }
            sum += val;
        }

        double average = sum / list.size();

        System.out.println("Prices : " + list);
        System.out.println("Highest Price : " + highest);
        System.out.println("Average Price : " + average);
    }

    public static void main(String[] args) {
        Question7 q = new Question7();
        q.wrapperInCollections();
    }
}