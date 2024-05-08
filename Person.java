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
        return age + " " + name ;
    }

    public static void main(String[] args) {
        Person p1=new Person(10, "Vel");
        Person p2=new Person("Krish");

        System.out.println("Age: "+p1.age+" Name: "+p1.name);
        System.out.println("Age: "+p2.age+" Name: "+p2.name);
        
    }
}