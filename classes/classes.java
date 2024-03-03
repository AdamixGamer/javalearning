package classes;

public class classes { //this is a class
    public static void main(String[] args) { 
        //https://www.geeksforgeeks.org/classes-objects-java/
        class Human { //private class Human
            String name;
            int age;
            String Hobby;
            boolean isMale; //true = male, false = woman
        }
        //object of Human class
        Human Human1 = new Human();
        Human1.name = "Suzan";
        Human1.age = 12;
        Human1.Hobby = "Gaming";
        Human1.isMale= false;

        System.out.println("Name : " + Human1.name + ", Age : " + Human1.age + ", Hobby : " + Human1.Hobby + ", Is male : " + Human1.isMale);
    }
}
