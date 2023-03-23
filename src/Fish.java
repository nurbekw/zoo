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

    public String getKindoffish() {
        return kindoffish;
    }

    public void setKindoffish(String kindoffish) {
        this.kindoffish = kindoffish;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Fish\n" +
                "kindoffish: " + getKindoffish() +
                "\nlength: " + getLength() +
                "\nkg: " + getKg() ;
    }
}
