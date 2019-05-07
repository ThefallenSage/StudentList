package beads;
/**
 * @author This program is written by Kirtan Parekh - THE GREATEST PROGRAMMER YOU WILL EVER SEE ON EARTH
 */
public class Arrays
{
   public static void main (String[] args)
   {

      char[] bead = {'B', 'E', 'A', 'D'};

      for (int i = 0; i < bead.length; i++) {
         System.out.print(bead[i] + ",");

      }

      for (int i = bead.length - 1; i >= 0; i--) {

         System.out.print(bead[i] + ",");

      }

   }

}
