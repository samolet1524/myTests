import java.util.Arrays;

public class ClassA {
    private static int cnt = 1;

    public void rec(int[] array, int idx, int n, int m) {
        if (idx == n) {
            if (cnt == 6659) {
                System.out.println(Arrays.toString(array));
            }
            cnt++;
            return;
        }
        for (int i = 1; i <= m; i++) {
            array[idx] = i;
            rec(array, idx + 1, n, m);
        }
    }

    public void rec1(int[] array, int idx, int n, boolean[] used) {
        if (idx == n) {
            if (cnt == 4468) {
                System.out.println(Arrays.toString(array));
            }
            cnt++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (used[i]) {
                continue;
            }
            array[idx] = i;
            used[i] = true;
            rec1(array, idx + 1, n, used);
            used[i] = false;
        }
    }

    public void rec2(int[] array, int idx, int n, int sum, int last) {
        if (sum == n) {
            if (cnt == 13672) {
                System.out.println(Arrays.toString(array) + " -- " + idx);
            }
            cnt++;
            return;
        }
        for (int i = last; i <= n - sum; i++) {
            array[idx] = i;
            rec2(array, idx + 1, n, sum + i, i);
        }
    }

    public void rec3(String[] array, boolean[] possible, int idx, int n) {
        if (idx == n-1) {
            if (cnt == 7) {
                System.out.println(Arrays.toString(array));
            }
            cnt++;
            return;
        }
        for (int i = 0; i <= n; i++) {
            if (possible[i]) {
                array[i+1]=".";
                idx = i+1;
                continue;
            }
            array[idx] = "*";
            possible[i] = true;
            rec3(array, possible, idx+1, n);
            possible[i]=false;
        }
    }
}
