import java.util.Scanner;

public class Main {
    public static void main(String fullname){

        Scanner keyboard = new Scanner(System.in);
        String names ;


        System.out.println("enter name in full");
        names = keyboard.nextLine();
        String[] Arrayname = names.split("");

        for(int i = 0; i< Arrayname.length-1; i++){
            System.out.println(Arrayname[i].toUpperCase().charAt(0)+ ".");

        }
        System.out.println(Arrayname[Arrayname.length-1].toUpperCase());

        }
    }
