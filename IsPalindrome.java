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

/**
     * use list
     *
     * @param x
     * @return
     */
    public boolean isPalindrome_list(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; ; i *= 10) {
            int cur = x % (i * 10) / i;
            list.add(cur);
            if (x / (i * 10) < 10) {// the highest number
                list.add(x / (i * 10));
                break;
            }
        }
        for (int j = 0; j < list.size() / 2; j++) {
            if (list.get(j) != list.get(list.size() - 1 - j)) {
                return false;
            }
        }
        return true;
    }
