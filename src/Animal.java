class Animal {
        String family;
        String name;
        int age;
        boolean isMammal;
        Animal(String family,String name,int age,boolean isMammal) {
            this.family = family;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;
        }
       /* public void afficher() {
            //System.out.println(family+" "+name+" "+age+" "+isMammal);
             ;
        }*/
    @Override
    public String toString() {
        return family+" "+name+" "+age+" "+isMammal;
    }

}


