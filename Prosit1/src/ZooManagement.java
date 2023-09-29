import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {

        int nbrCages=20;
        String zooName= "my zoo";



        Scanner scanner=new Scanner(System.in);
        System.out.println("entrer le nom du zoo");
        String zooName2=scanner.next();
        System.out.println("entrer le nommbre de cages");
        int nbrCages2=scanner.nextInt();
        System.out.println(zooName2+" comporte "+nbrCages2+" cages");
        scanner.close();
        System.out.println(zooName+" comporte "+nbrCages+" cages");


    }
}
