package System2;

public class Room {
    int number;
    Person persons = new Person(null);
    public Room(){

    }
    public Room(int number,String name){

        this.number = number;
        this.persons.name = name;

    }
}
