class Solution {
    public int repeatedNTimes(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            // If already exists, return it
            if (set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return -1;
    }
}