class Person{
    int age=18;
    String name;
    public Person(String name){
        this.name=name;
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        
    }

    public String toString() {
        return "Age: " +age + " Name: " + name ;
    }

    public static void main(String[] args) {
        Person p1=new Person(10, "Vel");
        Person p2=new Person("Krish");
        Person p3=new Person(22,"Raina");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
    }
}