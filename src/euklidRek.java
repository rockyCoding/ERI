public class euklidRek {
    public static long ggt(long x, long y){
        if (x == y) return x;
        else if (y > x) return ggt(x, y-x);
        else return ggt(x-y, y);
    }

    public static void main(String[] args) {
        long a = 132;
        long b = 7527;
        System.out.print(ggt(a, b));
    }

}

