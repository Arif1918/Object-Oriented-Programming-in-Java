package Person;

public class MainClass {
    public static void main(String[] args) {

        Person p1 = new Person("Arif",28);
        Person p2 = new Person("Naeem",29);

        p1.setAge(30);
        p2.setAge(32);
        
        Person[] somePerson = new Person[2];
        somePerson[0] = p1;
        somePerson[1] = p2;

        for(Person p : somePerson){
            System.out.println(p.getName()+" "+p.getAge());
        }
    }
}
