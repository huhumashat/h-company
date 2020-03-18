package h.company;
import java.util.Scanner;
public class HCompany {
    public static void main(String[] args) {
        String input;
        int num;
        // create a scanner object for keyboard input
        Scanner key = new Scanner(System.in);
        // create three employee objects
        employee emp1 = new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();
        
        System.out.println("Plase put:"
                + "\nname for employee number 1:");
        input = key.next();
        emp1.setName(input);
        
        System.out.println("Id: ");
        num = key.nextInt();
        emp1.setId(num);
        
        System.out.println("Department:");
        input = key.next();
        emp1.setDprt(input.toUpperCase());
        
        System.out.println("Position:");
        input = key.next();
        emp1.setPsn(input.toUpperCase());
        
        
        
        System.out.println( emp1.getId()+": "+ emp1.getName() +" Department: "+ emp1.getDprt() +" Position: "+ emp1.getpsn());
        
        //emp2
        System.out.println("Plase put:"
                + "\nname for employee number 2:");
        input = key.next();
        emp2.setName(input);
        
        System.out.println("Id: ");
        num = key.nextInt();
        emp2.setId(num);
        
        System.out.println("Department:");
        input = key.next();
        emp2.setDprt(input.toUpperCase());
        
        System.out.println("Position:");
        input = key.next();
        emp2.setPsn(input.toUpperCase());
        
        
        
        System.out.println( emp2.getId()+": "+ emp2.getName() +" Department: "+ emp2.getDprt() +" Position: "+ emp2.getpsn());
        
        //emp3
        System.out.println("Plase put:"
                + "\nname for employee number 3:");
        input = key.next();
        emp3.setName(input);
        
        System.out.println("Id: ");
        num = key.nextInt();
        emp3.setId(num);
        
        System.out.println("Department:");
        input = key.next();
        emp3.setDprt(input.toUpperCase());
        
        System.out.println("Position:");
        input = key.next();
        emp3.setPsn(input.toUpperCase());
        
        
        
        System.out.println( emp3.getId()+": "+ emp3.getName() +" Department: "+ emp3.getDprt() +" Position: "+ emp3.getpsn());
        
        System.out.println("=========="
                + "\nAll employees:"
                + "\n==========");
        
        System.out.println( emp1.getId()+": "+ emp1.getName() +" Department: "+ emp1.getDprt() +" Position: "+ emp1.getpsn());
        System.out.println( emp2.getId()+": "+ emp2.getName() +" Department: "+ emp2.getDprt() +" Position: "+ emp2.getpsn());
        System.out.println( emp3.getId()+": "+ emp3.getName() +" Department: "+ emp3.getDprt() +" Position: "+ emp3.getpsn());
    }
       
    
}
