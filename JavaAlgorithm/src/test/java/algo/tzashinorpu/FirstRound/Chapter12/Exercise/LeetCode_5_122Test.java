package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import algo.tzashinorpu.FirstRound.Chapter12.Exercise.LeetCode_5_122;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_122Test {

    @Test
    void maxProfit() {
        LeetCode_5_122 ins = new LeetCode_5_122();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(ins.maxProfit(prices));
    }
}