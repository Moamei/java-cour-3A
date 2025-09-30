//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("mamaifere", "lion", 50, true);
        Animal lion1 = new Animal("mamaifere", "lion1", 40, true);
        Animal lion2 = new Animal("mamaifere", "lion1", 40, true);
        Zoo myzoo = new Zoo("hello", "tunis", 25);
        myzoo.addAnimal(lion);
        myzoo.addAnimal(lion1);
        myzoo.addAnimal(lion2);
        myzoo.afficher();

    }
}