package persons2;

public class Person {

    protected String name;
    protected int age;
    /**
     * 
     * @param name0
     * @param age0
     */
    public Person(String name0, int age0) {
        this.age = age0;
        this.name = name0;
    }
    
    //@Override
    public String getName(){
        return(this.name);
    }
   //@Override   
    public int getAge() {
        return(this.age);
    }

    @Override
    public String toString() {
        return("\"" + this.name + " " + ":" + " " + this.age + " ans" + "\"");
    }

    public void display(){
        
        System.out.println(this.toString() + "," + " " + super.toString());
    }
}