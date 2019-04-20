import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class bubbleSort
{
    static final int ITERATIONEN = 5;
    public static int[][] versuche = new int[ITERATIONEN][2];


    static void initialisiere(int[] zahlen, int n)
    {
        Out.println("Initialisiere Array mit " + n + " Zufallselementen");
        Random random = new Random();
        for (int i = 0; i < n; i++)
            zahlen[i] = random.nextInt(1000);
        Out.println("Initialisierung beendet");
    }

    static void sortiere(int[]zahlen, int n)
    {
        Out.println("Sortiere Array mit " + n + " Zufallselementen");
        boolean sortiert = false;
        do
        {
            sortiert = true;
            for (int i = 0; i < n-1; i++)
            {
                if (zahlen[i] > zahlen[i+1])
                {
                    sortiert = false;
                    int puffer = zahlen[i];
                    zahlen[i] = zahlen[i+1];
                    zahlen[i+1] = puffer;
                }
            }
        } while (!sortiert);
        Out.println("Sortierung beendet");
    }

    static boolean suche_linear(int[] zahlen, int n, int z, int iteration)
    {
        int zähler = 0;
        for (int i = 0; i < n; i++) {
            zähler++;
            if (zahlen[i] == z) {
                versuche[iteration][0] = zähler;
                return true;
            }
        }
        versuche[iteration][0] = zähler;
        return false;
    }

    static boolean suche_binaer(int[] zahlen, int n, int z, int iteration)
    {
        int u, v, zähler;
        u = 0; v = (n-1); zähler = 0;
        while (u <= v)
        {
            zähler++;
            int m = (u + v) / 2;
            if (z < zahlen[m]) v = m - 1;
            else if (z > zahlen[m]) u = m + 1;
            else {
                versuche[iteration][1] = zähler;
                return true;
            }
        }
        versuche[iteration][1] = zähler;
        return false;
    }

    static void gibAus(int[] zahlen, int n)
    {
        for (int i = 0; i < n; i++)
        {
            Out.print(zahlen[i]);
            if (i < n - 1) Out.print(" . ");
        }
        Out.println();

    }

    static void statistik(){
        int linSum = 0, binSum = 0;
        for (int i = 0; i < ITERATIONEN; i++){
            linSum += versuche[i][0];
        }
        for (int i = 0; i < ITERATIONEN; i++){
            binSum += versuche[i][1];
        }
        System.out.println("Die lineare Suche hat durchschnittlich " + ((float)linSum/ITERATIONEN) + " Durchläufe benötigt.");
        System.out.println("Die binäre Suche hat durchschnittlich " + ((float)binSum/ITERATIONEN) + " Durchläufe benötigt.");
    }

    public static void main(String[] args)
    {
        int[] zahlen;
        int n = 100;
        if (args.length > 0) n = Integer.parseInt(args[0]);
        zahlen = new int[n];
        int iteration = 0;

        while (iteration < ITERATIONEN) {
            initialisiere(zahlen, n);
            gibAus(zahlen, n);
            Out.print("Zu suchende Zahl: \n");
            int z = In.readInt();

            Out.println(suche_linear(zahlen, n, z, iteration) ? "gefunden" : "nicht gefunden");

            sortiere(zahlen, n);

            gibAus(zahlen, n);
            Out.println(suche_binaer(zahlen, n, z, iteration) ? "gefunden" : "nicht gefunden");
            iteration++;
        }
        statistik();

    }
}
