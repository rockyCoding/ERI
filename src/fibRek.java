import static java.lang.System.currentTimeMillis;

public class fibRek {

    static long millis;

    static void starteTimer(){
        millis = currentTimeMillis();
    }

    static void stoppeTimer(){
        System.out.println("\n" + (currentTimeMillis()-millis) + " Millisekunden");
    }

    static int fibRekursiv(int counter){
        if (counter == 0) return 1;
        else if (counter == 1) return 1;
        else{
            return (fibRekursiv(counter-2) + fibRekursiv(counter-1));
        }
    }

    public static void main(String[] args) {
        starteTimer();
        int n = 0;
        int fin = 20;
        int res;
        while (n < fin){
            System.out.print(fibRekursiv(n) + ", ");
            n++;
        }
        stoppeTimer();
    }
}
