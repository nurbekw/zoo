public class Dog {
    String name;
    int age;
    String color;
    public Dog(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Dog(){
    }

    @Override
    public String toString() {
        return "Dog\n" +
                "name: " + name +
                "\nage: " + age +
                "\ncolor: " + color ;
    }
}
