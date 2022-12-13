package ivandjoh.online.twosum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
//		SpringApplication.run(App.class, args);
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum2(nums, target);
		System.out.println("Indeksnya adalah -> [" + result[0] + ", " + result[1] + "]");
	}

	// First Solution (Brute Force) - > O(n^2)
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return result;
	}

	// Second Solution (Two-pass Hash Table) -> O(n)
	public static int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		return result;
	}

}
