class leetcode_34 {
    public static int search(int[] nums, int target, boolean bool) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int answer = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                answer = mid;
                if (bool) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return answer;
        }
        return answer;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] answer = { -1, -1 };
        int low = search(nums, target, true);
        int high = search(nums, target, false);
        answer[0] = low;
        answer[1] = high;
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        System.out.println(searchRange(nums, 8));
    }
}