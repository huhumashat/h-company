package h.company;
import java.util.Scanner;
public class HCompany {
    public static void main(String[] args) {
        String input;
        int num;
        // create a scanner object for keyboard input
        Scanner key = new Scanner(System.in);
        // create three employee objects
        employee emp1 = new employee("hussein",1,"cs","programmer");
        employee emp2 = new employee("ammar",1,"cs","Web developer");
        employee emp3 = new employee("aseel",1,"cs","Mobile application developer");
        System.out.println("=========="
                + "\nAll employees:"
                + "\n==========");
          emp1.display();
          emp2.display();
          emp3.display();

    }
       
    
}
