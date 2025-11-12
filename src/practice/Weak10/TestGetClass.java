package practice.Weak10;

class CoffeeBean {

    String species = "Coffee";
    void print() {
        System.out.println(species);
    }
    void setSpecies(String s){
        species = s;
    }
}

class Arabica extends CoffeeBean{

}

class Robusta extends CoffeeBean{
    String species = "Robusta";
}