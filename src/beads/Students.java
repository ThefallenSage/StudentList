package beads;
import java.util.Scanner;
/**
 * @author This program is written by Kirtan Parekh - THE GREATEST PROGRAMMER YOU WILL EVER SEE ON EARTH
 */
public class Students
{
   public int id;
   public String name;

   public static void main (String[] args)
   {

      Students[] list = new Students[5];
      Scanner s1 = new Scanner(System.in);

      for (int i = 0; i < list.length; i++) {

         list[i] = new Students();
         System.out.println("Enter student ID:-");
         list[i].id = s1.nextInt();

         System.out.println("Enter student Name:-");
         list[i].name = s1.nextLine();



      }





   }

}
