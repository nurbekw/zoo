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

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Parrot\n" +
                "name: " + getName() +
                "\ncolor: " + getColor() +
                "\nbreed: " + getBreed()  ;
    }
}
