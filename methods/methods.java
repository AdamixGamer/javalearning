package methods;

public class methods {
    public static void main(String[] args) {
        
        class Human { //private class Human
            String name;
            byte age;

            void talk() {
                System.out.println("I am " + name + " and I am " + age + " years old!");
            }

            String aging() {
                age += 1;
                return " I am now 1 year older";
            }
            void hobby(String hobbyname) {
                System.out.println("My current hobby is " + hobbyname);
            }
        }

        Human human = new Human();
        human.name = "Bob";
        human.age = 24;

        human.talk();
        human.hobby("Chess");
        System.out.println(human.aging());
        human.talk();
        human.hobby("Skydiving");
    }
}