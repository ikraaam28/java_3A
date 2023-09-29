public class Zoo {
    Animal[] animals;
    String name,city;
    final int nbCages=50;
    int nbAnimal;

    static  int  nbTotalAnimals;

    public Zoo(String name,String city){
        animals = new Animal[nbCages];
        this.name = name;

        this.city=city;
    }
    public Zoo(String name,int nbCages){

        this.name = name;


    }
    public void displayZoo(){
        System.out.println("Name : "+this.name);
        System.out.println("City : "+this.city);
        System.out.println("nbCages : "+this.nbCages);

    }

    @Override
    public String toString(){
        String s =  "Name : "+name+"\n" + "City :"+city+"\n"+"NbCages :"+nbCages +"\n";
        String r ="";
        for(int i=0;i<nbAnimal;i++){
            r+=animals[i].toString();
        }
        return s+r;

    }
    public boolean addAnimal(Animal animal){
        if(nbAnimal<nbCages && searchAnimal(animal)==-1){
            animals[nbAnimal] = animal;
            nbAnimal++;
            nbTotalAnimals++;
            System.out.println("Animal ajouté!!");
            return true;

        }
        return false;
    }
    int searchAnimal(Animal animal){
        for(int i=0;i<nbAnimal;i++){
            if(animals[i].name == animal.name){
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal an){
        int index = searchAnimal(an);
        if(index==-1){
            return false;
        } else{
            for(int i=index;i<nbAnimal-1;i++){
                animals[i]=animals[i+1];

            }
            nbAnimal--;
            nbTotalAnimals--;
            animals[nbAnimal] =null;
            return true;
        }

    }
public boolean isZooFull(){
        if(nbAnimal == nbCages){
            return true;
        }
        return false;
}
   public Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbAnimal>z2.nbAnimal){
            return z1;

        }
        return z2;
    }
}