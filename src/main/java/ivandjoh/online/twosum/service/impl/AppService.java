package ivandjoh.online.twosum.service.impl;

import org.springframework.stereotype.Service;

@Service
public interface AppService {

    int[] twoSumImpl(Integer[] nums, Integer target);
}
