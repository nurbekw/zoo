public class Cat {
    String name;
    int age;
    String color;
    public Cat(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Cat(){
    }

    @Override
    public String toString() {
        return "Cat\n" +
                "name: " + name +
                "\nage: " + age +
                "\ncolor: " + color ;
    }
}
