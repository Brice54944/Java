package persons;

public class Teacher extends Person{
    
    private String specialty;

    public Teacher(String name0, int age0, String specialty0) {
        super(name0, age0);
        this.specialty = specialty0;
    }

    public String getSpecialty() {
        return (this.specialty);
    }

    @Override
    public String toString() {
        return("\"Prof. " + super.getName() + this.getSpecialty());
    }


}
