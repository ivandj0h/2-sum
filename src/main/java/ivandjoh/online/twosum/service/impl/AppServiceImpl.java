package ivandjoh.online.twosum.service.impl;


import java.util.HashMap;
import java.util.Map;

public class AppServiceImpl implements AppService {

    @Override
    public int[] twoSumImpl(Integer[] nums, Integer target) {

        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[] {i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return null;
    }
}
