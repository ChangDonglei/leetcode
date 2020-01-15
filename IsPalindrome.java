   public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }
        int res = 0;
        int i = 1;
        while (true) {
            int reminder = x % (i * 10);
            int cur = reminder / i;
            res = cur + res * 10;
            if (x / (i * 10) < 10) {//last digit also called the highest number
                if (res > x) {
                    res = x / (i * 10) + res * 10;
                }
                break;
            }
            i = i * 10;
        }
        return res == x;
    }
