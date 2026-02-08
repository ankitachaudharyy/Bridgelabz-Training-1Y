import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int [5];
        for(int i = 0; i < 5; i++){
            nums[i] = sc.nextInt();
        }

        for(int num:nums){
            if(num < 0){
                System.out.println("Negative");
            } else if(num == 0){
                System.out.println("Zero");
            } else{
                if(num % 2== 0){
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
        }

        if(nums[0] == nums[nums.length-1]){
            System.out.println("Equals");
        } else if(nums[0] < nums[nums.length-1]){
            System.out.println("First element is smaller than last");
        }else {
            System.out.println("First element is greater than last");
        }
    }
}
