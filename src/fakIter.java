public class fakIter {

    public static long fIter(long n){
        long num = 1;
        long res = n;
        while (num < n){
            res = res * num;
            num++;
        }
        return res;
    }

    public static void main(String[] args) {
        long input = 5;
        Out.print (fIter(input));
    }
}
