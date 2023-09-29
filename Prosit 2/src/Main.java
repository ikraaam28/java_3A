
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name ="Lion";
        lion.age=2;

        Zoo myZoo = new Zoo("myZoo","Tunis");
        Zoo myZoo2 = new Zoo("myZoo2","Ariana");
        Animal a = new Animal("Chat","c",2,true);
        //  System.out.println(myZoo.name);

        //  myZoo.displayZoo();
        System.out.println("nbCages :"+myZoo.nbCages);

        System.out.println("nbCages 2 :"+myZoo2.nbCages);
        System.out.println(myZoo.nbAnimal);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(a);
        // System.out.println(myZoo.removeAnimal(new Animal("Lion")));
        System.out.println("myZoo :"+myZoo.nbAnimal);
        // System.out.println(myZoo.searchAnimal(new Animal("Dog")));
        myZoo2.addAnimal(lion);
        System.out.println("myzoo2 "+myZoo2.nbAnimal);

        System.out.println("Total :" +Zoo.nbTotalAnimals);

    }
}