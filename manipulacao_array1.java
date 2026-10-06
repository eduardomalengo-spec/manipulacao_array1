import java.util.ArrayList;
import java.util.Scanner;

public class manipulacao_array1 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
    	ArrayList<String> duds = new ArrayList<>();
        
        duds.add("| SOCC45 |");
        duds.add("| SOCC46 |");
        duds.add("| SOCC47 |");
        duds.add("| SOCC48 |");
        System.out.println(duds);
        
        System.out.println("==========================");
        System.out.println("|MANIPULAÇÃO EM ANDAMENTO|");
        System.out.println("==========================");
        
        System.out.print(" QUAL?: ");
        String escolha = sc.nextLine();
        sc.nextLine();
        
        if(escolha.equals("| SOCC46 |")) {
        	duds.add(1, "| SOCC44 |");
            duds.remove("| SOCC46 |");
            System.out.println(duds);
        }
        else {
        	System.out.println("[ ERROR ]");
        }
        
        ArrayList<Double> num = new ArrayList<>();
        
        num.add(3.15);
        num.add(2.75);
        num.add(1.34);
        num.add(0.98);
        System.out.println(num);
        
        System.out.println("==========================");
        System.out.println("|MANIPULAÇÃO EM ANDAMENTO|");
        System.out.println("==========================");
        
        System.out.print("Next?: ");
        double next = sc.nextDouble();
        sc.nextLine();
        
        if(next == 2.75) {
        	int p = 1;
            num.add(p, 2.89);
            num.remove(2.75);
            System.out.println("HACKEANDO..." + num);
        }
        
        else {
        	System.out.println(" [ERROR] ");
        }
        
        System.out.println("================================");
        System.out.println("| RESULTADO: | | HACKINGMASTER |");
        System.out.println("================================");
        System.out.println("| H1: " + duds + " | ");
        System.out.println("| H2: " + num + " | ");
    }
}