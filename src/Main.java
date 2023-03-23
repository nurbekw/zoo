public class Main {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setKindoffish("Som");
        fish1.setLength("83 cm");
        fish1.setKg(113);

        Parrot parrot1 = new Parrot();
        parrot1.setName ("Emado");
        parrot1.setColor("Red");
        parrot1.setBreed("Jaco");

        Cat cat1 = new Cat();
        cat1.setName("Marusya");
        cat1.setAge(1);
        cat1.setColor("White");

        Dog dog1 = new Dog();
        dog1.setName("Akainu");
        dog1.setAge(3);
        dog1.setColor("Red");

        System.out.println("\t"+fish1+"\n\t"+parrot1+"\n\t"+cat1+"\n\t"+dog1);
    }
}