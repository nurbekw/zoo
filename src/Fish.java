public class Fish {
    String kindoffish;
    String length;
    int kg;
    public Fish(String kindoffish,String length,int kg){
        this.kindoffish = kindoffish;
        this.length = length;
        this.kg = kg;
    }
    public Fish(){
    }

    @Override
    public String toString() {
        return "Fish\n" +
                "kindoffish: " + kindoffish +
                "\nlength: " + length +
                "\nkg: " + kg ;
    }
}
