static long getSubbaraySum(List<Long> list) {
        long sum = 0L;
        for (long x : list) {
            sum += x;
        }
        return sum;
    }