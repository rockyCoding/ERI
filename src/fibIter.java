import static java.lang.System.currentTimeMillis;

public class fibIter {

    static long millis;

    static void starteTimer(){
        millis = currentTimeMillis();
    }

    static long stoppeTimer(){
        return (currentTimeMillis()-millis);
    }

    static void fibIterativ(){
        starteTimer();
        int a = 0;
        int b = 1;
        int n = 2;
        int fin = 20;
        int res;
        System.out.print(a + ", "+ b);
        while (n < fin){
            res = a + b;

            System.out.print(", " + res);
            a = b;
            b = res;
            n++;
        }
        System.out.println(stoppeTimer() + "Millisekunden iterativ");
    }

    public static void main(String[] args) {
        starteTimer();
        int a = 0;
        int b = 1;
        int n = 2;
        int fin = 20;
        int res;
        System.out.print(a + ", "+ b);
        while (n < fin){
            res = a + b;

            System.out.print(", " + res);
            a = b;
            b = res;
            n++;
        }
        System.out.println(stoppeTimer() + "Millisekunden iterativ");
    }
}


