import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        int[] nums = new int[]{1,2,4,5,6,4};
        ArrayList<Integer> cars = new ArrayList<Integer>();
        System.out.println(nums.length);
        int sum = 0;
        for(int  i = 0; i<nums.length;i++){
           sum = sum + nums[i];
            cars.add(sum);


        }
        System.out.println(cars);

    }
}
