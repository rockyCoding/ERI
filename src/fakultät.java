public class fakultät {
    //rekursives Aufrufen eines "einfacheren" Parameters
    static long f(long n){
        //Rekursionsverankerung (stoppt wenn n <= 1)
        if (n <= 1) return 1;
            //Induktionsteil (teil der die Funktion in rekursiv einfacher werdenden aufrufen verarbeitet)
        else return f(n-1)*n;
    }

    public static void main(String[] args) {
        long inputVar = 5;

        Out.print(f(inputVar));
    }
}
