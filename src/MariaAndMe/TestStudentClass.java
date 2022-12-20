package MariaAndMe;


public class TestStudentClass {

    public static void main(String[] args) {


        Student student1 = new Student("Maria", 28, 'F', "SDET", "A0123", 'A');

        System.out.println(student1);


        student1.drink();
        student1.eat();
        student1.sleep();
        student1.study();

    }
}
