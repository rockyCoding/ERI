public class binomrek {

    static long fak(long x){
        if (x <= 1) return 1;
        else return fak(x-1)*x;
    }

    static long binomfkt(long n, long k){
        long resultat;  //delta, nenner,
        if (k == 0){
            return (1);
        }
        else if (k == n){
            return (1);
        }
        else {
            resultat = binomfkt(n-1, k-1)+binomfkt(n-1, k);
            return resultat;
        }
    }

    public static void main(String[] args) {
        long n = 8;
        long k = 0;
        while (k <= n) {
            System.out.print(binomfkt(n, k) + " ");
            k++;
        }
    }
}
