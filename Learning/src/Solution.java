class Solution {
    public int solution(int[] nums) {

        int counter = 0;

        int current;
        int next;
        int previous = nums[0];
        int size = nums.length;

        for (int i = 1; i < (size - 1); i++) {
            current = nums[i];
            next = nums[i + 1];

            //current > previous = going up
            if (current - previous > 0) {

                // next < current = going down -> valley detected
                if (next - current < 0) {
                    counter++;
                    previous = current;
                }

                // current < previous = going down
            } else if (current - previous < 0) {

                // next > current = going up -> hill detected
                if (next - current > 0) {
                    counter++;
                    previous = current;
                }
            }
        }
        // ops, no valleys or hills detected
        if (counter == 0) {
            // it is a plain -> just 1 castle
            if (nums[0] == nums[size - 1])
                return 1;
                // not a single plain -> 2 castles
            else return 2;
        }

        return counter + 2;
    }
}
