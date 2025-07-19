class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1 && slow != 1) {
            slow = getval(slow);
            fast = getval(getval(fast));
            
            if (slow == 1 || fast == 1){
                return true;
            }

            if (slow == fast) {
                return false; 
            }
        }

        return true;
    }

    public int getval(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
