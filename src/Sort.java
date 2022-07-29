public class Sort {
    public static int[] sortV1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int t = array[i];
            for (int j = i; j > 0 && array[j - 1] > t; j--) {
                array[j] = array[j - 1];
                array[j - 1] = t;
            }
        }
        return array;
    }

    public static void quickSort(int[] x, int l, int u) {
        if (l >= u) {
            return;
        }
        int m = l;
        for (int i = l + 1; i < u; i++) {
            if (x[i] < x[l]) {
                int t = ++m;
                m = i;
                i = t;
            }
        }
        int t = m;
        m = l;
        l = t;
        quickSort(x, l, m - 1);
        quickSort(x, m + 1, u);
    }


    public int gcd(int n, int m) {
        while (n != 0 && m != 0) {
            if (n > m) {
                n = n % m;
            } else {
                m = m % n;
            }
        }
        return n + m;
    }
}
