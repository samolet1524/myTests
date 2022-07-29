import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
//        ca.rec(new int[6], 0, 6, 5);
//        ca.rec1(new int[7], 0, 7, new boolean[8]);
//        ca.rec2(new int[35], 0, 35, 0,1);
        ca.rec3(new String[7], new boolean[8],0, 7);
//        BigDecimal bigDecimal = new BigDecimal("50");
//
//        int [] array = new int[]{3,1,4,2};
////        int[] sorted = Sort.sortV1(array);
//        Sort.quickSort(array, 0, array.length);
    }
}
