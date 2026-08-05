class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Create buckets where index = frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : count.keySet()) {
            int frequency = count.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] res = new int[k];
        int counter = 0;
        // Iterate from highest frequency bucket to lowest
        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                for (Integer num : bucket[pos]) {
                    res[counter++] = num;
                    if (counter == k) return res;
                }
            }
        }
        return res;
    }
}
