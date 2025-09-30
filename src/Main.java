//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("lion","scarface",10,true);

        Zoo myZoo = new Zoo(animal1,"scarface","south africa",10);

      //animal1.afficher();
        System.out.println(myZoo) ;
        System.out.println(myZoo.toString());


        }
    }
