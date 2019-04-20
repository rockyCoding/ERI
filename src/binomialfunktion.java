public class binomialfunktion {

    static long fak(long x){
        if (x <= 1) return 1;
        else return fak(x-1)*x;
    }

    static long kürzen(long a, long b){
        long res = 1;
        do{
            res *= a;
            a--;
        }while (a > b);
        return res;
    }

    static long binomfkt(long n, long k){
        long delta, nenner, resultat;
        if (k == 0){
            return (1);
        }
        else if (k == n){
            return (1);
        }
        else {
            delta = n - k;
            nenner = kürzen(n, delta);
            resultat = nenner / fak(k);
            return resultat;
        }
    }
    public static void main(String[] args) {
        long n = 4;
        long k = 0;
        while (k <= n){
            System.out.print(binomfkt(n, k) + " ");
            k++;
        }

    }
}

