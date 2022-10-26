public class first {
    private static class Person{
        int age;
        String name;

        public void sayshi(){
            System.out.println(name + "[" + age + "]" + "hello");
        }
    }

    public static void swap(Person p1 , Person p2){
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "pep";
        p1.age = 21;

        Person p2 = new Person();
        p2.name = "abc";
        p2.age = 24;

        p1.saysHi();
        p2.saysHi();
        swap(p1 , p2);
        p1.saysHi();
        p2.saysHi();

    }
}
