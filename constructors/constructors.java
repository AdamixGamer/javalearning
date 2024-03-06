package constructors;

public class constructors {
    public static void main(String[] args) {
        class Animal {
            String words;

            Animal(String text){
                System.out.println("New animal creation");
                words = text;
            }
            void talk() {
                System.out.println('"' + words + '"' + "  -  and this is what you told me to say! Why!'");
            }
        }
        Animal zebra = new Animal("I am the zeeebraa!");
        zebra.talk();
    }
}
