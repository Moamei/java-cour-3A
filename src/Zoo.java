import java.util.Arrays;

public class Zoo {
    Animal[] animals ;
    String name ;
    String city ;
    int nbrCages = 25 ;

    public Zoo( String name, String city, int nbrCages) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;

    }

    public Zoo() {
    }


    public String displayZoo() {
        return this.name + " " +this.city +" "+ this.nbrCages ;
    }

    @Override
    public String toString() {
        return this.name + " " +this.city +" "+ this.nbrCages ;
    }
    public int searchAnimal(Animal animal){
        for (int i = 0 ;i <animals.length ; i++){
            if(animal.name.equals(animals[i].name) ){
                return  i ;
            }

        }
        return -1 ;
    }
    public boolean addAnimal(Animal animal){
        if(searchAnimal(animal) == -1){
            for (int i = 0 ;i < animals.length  ; i++){
                animals[i] = animal;

            }
            return  true ;
        }else {
            return  false ;
        }

    }

    boolean removeAnimal(Animal animal){
        if(searchAnimal(animal) != -1){
            Animal[] animalsArr = new Animal[24];
            for (int i = 0 , j= 0 ;i <animals.length ;i++){
                if(i != searchAnimal(animal)){
                    animalsArr[j] = animals[i];
                    j++ ;
                }
            }
            return  true ;
        }else {
            return false;
        }
    }
    public void afficher(){
        System.out.println(name);
        System.out.println(city);
        for(Animal a:animals){
            System.out.println(a);
        }
    }

    public boolean isZooFull(){
        return  nbrCages == animals.length ? true : false ;
    }

    public Zoo compareZoo(Zoo z1 , Zoo z2){
        return z1.animals.length > z2.animals.length ? z1 : z2 ;
    }
}
