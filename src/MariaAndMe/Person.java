package MariaAndMe;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name == null || name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        for (char each : name.toCharArray()) {
            if (!(Character.isLetter(each) || Character.isDigit(each))){
                System.err.println("Name can not contain special character: " + each);
                System.exit(1);
            }
        }


        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 0){
            System.err.println("Age cannot be negative");
            System.exit(1);
        }
        this.age = (char) age;
    }

    public char getGender() {
        if(!(gender == 'M' || gender == 'F')){
            System.err.println("Gender is not valid");
            System.exit(1);
        }
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking beer");

    }

    public void sleep(){
        System.out.println(name + " is dreaming with the computer");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

    /*Student Task:
        1. Create a class named Person:
        Variables:
        name, age, gender

        Encapsulate all the fields

        Add a constructor that can set all the fields

        Condition:
        1. name should not be set to null
        2. name should not be empty
        3. name should not contain any special character other than space
        4. age should not be set to negative
        5. gender must be valid

        Methods:
        eat()
        drink()
        sleep()
        toString()


        2. Create a subclass of Person named Student:
        Extra variables:
        studentId, fieldOfStudy, grade, schoolName

        Encapsulate all the fields

        Add a constructor that can set all the fields

        Condition:
        1. filedOfStudy and schoolName should not be set to null
        2. filedOfStudy and schoolName should not be empty
        3. grade must be valid (A, B, C, D, F)


        Extra methods:
        study()
        toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included */

