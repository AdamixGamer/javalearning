package overloadedmethods;

public class overloaded {
    public static void main(String[] args) {
        class allmethods {
            String name;
            allmethods(String input){
                name = input;
            }
            void method1(String inputname) {
                System.out.println("My name is " + inputname);
            }
            void method1(String inputname,int age) {
                System.out.println("My name is " + inputname + " and I am " + age + " years old!");
            }
            void method1(int number) {
                System.out.println("Method 1 , number input is " + number);
            }
        }
            allmethods mymeth = new allmethods("Maria");
            mymeth.method1(mymeth.name);
            mymeth.method1(2137);
            mymeth.method1(mymeth.name,24);
        }
        
    }
