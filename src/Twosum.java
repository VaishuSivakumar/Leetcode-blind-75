import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int reminder= target-nums[i];
            if(hash.containsKey(reminder)) return new int[]{hash.get(reminder),i};
            else hash.put(nums[i],i);
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int[] nums = {9, 11, 1, 15};
        int target = 10;
        int[] result = twoSum(nums, target);
System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
