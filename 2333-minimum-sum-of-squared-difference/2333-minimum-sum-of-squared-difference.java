class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2,
                                 int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];

        long k = (long) k1 + k2;
        int maxDiff = 0;
        long totalDiff = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
            totalDiff += diff[i];
        }

        // Enough operations to make every difference zero
        if (k >= totalDiff) {
            return 0L;
        }

        // Binary search for the minimum achievable maximum
        int low = 0;
        int high = maxDiff;

        while (low < high) {
            int mid = low + (high - low) / 2;

            long operations = 0;

            for (int d : diff) {
                if (d > mid) {
                    operations += d - mid;
                }
            }

            if (operations > k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int target = low;
        long operations = 0;
        long ans = 0;

        // Reduce every difference to at most target
        for (int d : diff) {
            if (d > target) {
                operations += d - target;
                d = target;
            }

            ans += (long) d * d;
        }

        // Use remaining operations to reduce target to target - 1
        long remaining = k - operations;
        ans -= remaining * (2L * target - 1);

        return ans;
    }
}
