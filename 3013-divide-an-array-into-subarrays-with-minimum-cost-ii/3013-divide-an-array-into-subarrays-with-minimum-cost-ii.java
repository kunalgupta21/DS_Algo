import java.util.*;

class Solution {

    int[] nums; // make accessible to comparator

    public long minimumCost(int[] nums, int k, int dist) {
        this.nums = nums;

        int n = nums.length;
        long ans = Long.MAX_VALUE;
        long sum = 0;

        TreeSet<Integer> using = new TreeSet<>(new IndexComparator());
        TreeSet<Integer> waiting = new TreeSet<>(new IndexComparator());

        // initial window [1 .. dist+1]
        for (int i = 1; i <= dist + 1; i++) {
            using.add(i);
            sum += nums[i];
        }

        // keep only k-1 smallest
        while (using.size() > k - 1) {
            int idx = using.pollLast();
            sum -= nums[idx];
            waiting.add(idx);
        }

        ans = Math.min(ans, sum);

        // slide window
        for (int i = 1; i + dist + 1 < n; i++) {

            int out = i;
            int in = i + dist + 1;

            waiting.add(in);

            // outgoing was in using
            if (using.contains(out)) {
                using.remove(out);
                sum -= nums[out];

                int promote = waiting.pollFirst();
                using.add(promote);
                sum += nums[promote];
            }
            // outgoing was in waiting
            else {
                waiting.remove(out);

                int wMin = waiting.first();
                int uMax = using.last();

                if (nums[wMin] < nums[uMax]) {
                    using.remove(uMax);
                    sum -= nums[uMax];
                    waiting.add(uMax);

                    waiting.remove(wMin);
                    using.add(wMin);
                    sum += nums[wMin];
                }
            }

            ans = Math.min(ans, sum);
        }

        return ans + nums[0];
    }

    // Classic Comparator (NO lambda)
    class IndexComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            if (nums[a] != nums[b]) {
                return nums[a] - nums[b];
            }
            return a - b;
        }
    }
}
