class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> keys = new HashMap<>();

        for(String str : strs)
        {
            int[] key = new int[26];

            for(int i = 0 ; i < str.length(); i++)
            {
                key[str.charAt(i) - 'a']++;
            }

            String counter = Arrays.toString(key);

            keys.putIfAbsent(counter, new ArrayList<>());
            keys.get(counter).add(str);
        }

        return new ArrayList<>(keys.values());
    }
}
