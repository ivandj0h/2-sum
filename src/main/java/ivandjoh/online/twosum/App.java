package ivandjoh.online.twosum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
//		SpringApplication.run(App.class, args);
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println("Indeksnya adalah -> [" + result[0] + ", " + result[1] + "]");
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}
}
