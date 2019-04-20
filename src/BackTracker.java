/**
 * Loesung des n-Damen-Problems mittels Backtracking
 */
public class BackTracker
{
   static NDamenBrett brett;

   static boolean versucheSpalte(int spalte)
    {
        boolean erfolg;
        int zeile = 0;

        do
        {
            zeile++;
            erfolg = false;
            if (brett.istSicherePosition(spalte, zeile))
            {
                brett.setzeDameAufPosition(spalte, zeile);
                if (spalte < brett.anzahlZeilen())
                {
                    erfolg = versucheSpalte(spalte+1);
                    if (!erfolg)
                        brett.entferneDameVonPosition(spalte, zeile);
                } else
                {
                    erfolg = true;
                }
            }
        } while (!erfolg && zeile != brett.anzahlZeilen());
        return erfolg;
    }


    public static void main(String[] args)
    {
       int brettGroesse;
       if (args.length > 0) brettGroesse = Integer.parseInt(args[0]);
       else brettGroesse = Integer.parseInt(args[0]);

       brett = new NDamenBrett(brettGroesse);
       if (versucheSpalte(1))
       {
          for (int s = 1; s <= brett.anzahlZeilen(); s++)
             System.out.printf("%3d", brett.letzteBelegteZeileInSpalte(s));
          System.out.println();
       } else System.out.println("Keine Lösung");
    }
}
