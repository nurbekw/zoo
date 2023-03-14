public class Parrot {
    String name;
    String color;
    String breed;
    public Parrot(String name,String color,String breed){
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    public Parrot (){
    }

    @Override
    public String toString() {
        return "Parrot\n" +
                "name: " + name + '\'' +
                "\ncolor: " + color +
                "\nbreed: " + breed  ;
    }
}
