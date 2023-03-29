public class athreeApp {
    public static void main (String[] args) {
        int[] nums = {1,2,3,4,-4 };
        int min, max;
        min = max = nums[0];
        for(int i=1; i < 5; i++) {
            if(nums[i] < min)
            min = nums[i];
            if(nums[i] > max)
            max = nums[i];
        for (int numero: nums)
            {
            System.out.print(numero + " ");
            }
        }
        System.out.println("Min e Max: " + min + " " + max);
    }
}