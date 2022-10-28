package persons2;

public class Student extends Person{
    
    private String promo;

    public Student(String name0, int age0, String promo0){
        super(name0, age0);
        this.promo = promo0;
    
    }

    public String getPromo() {
        return(this.promo);
    }

    @Override
    public String toString(){
        return(super.toString() + ", " + this.promo);

    }
}
