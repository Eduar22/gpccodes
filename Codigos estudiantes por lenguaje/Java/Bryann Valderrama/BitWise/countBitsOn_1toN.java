public class Main {

    static int countSetBit(int n) {
        int bitcount = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "->" + Integer.toString(i, 2));
            bitcount += countSetBitsUtil(i);
        }
        return bitcount;
    }

    static int countSetBitsUtil(int x) {
        if (x <= 0) {
            return 0;
        }
        return (x % 2 == 0 ? 0 : 1) + countSetBitsUtil(x / 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countSetBit(n));
    }
}
