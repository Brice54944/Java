package persons;

import java.util.ArrayList;


public class Club {

        private String name;
        private ArrayList<Person> members;

        public Club(String name0){
            this.name = name0;
            this.members = new ArrayList<>();

        }

        public void enroll(Person person) {
            this.members.add(person);

        }

        public void display() {
            String string = "Nom du club : ";
            string += this.name;
            string += ", liste des membres : ";
            for(Person person : this.members) {
                string += person.getName() + " ";
            }
            System.out.println(string);
        }

        public double meanAge() {
            int n = this.members.size();
            if (n > 0) {
                double m = 0;
                for(Person person : this.members) {
                    m += person.getAge();
                }
                return(m/n);
            }
            else {
                return(Double.NaN);
            }
        }
}

