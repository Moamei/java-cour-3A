
class Zoo {
            Animal animal;
            String name;
            String city;
            int nbrCages;
            Zoo(Animal animal, String name, String city, int nbrCages) {
                this.animal = animal;
                this.name = name;
                this.city = city;
                this.nbrCages = nbrCages;
            }
            public void afficher() {
                System.out.println(animal);
                System.out.println(name);
                System.out.println(city);
                System.out.println(nbrCages);
            }
        }


