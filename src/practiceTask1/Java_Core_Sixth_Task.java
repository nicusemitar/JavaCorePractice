package practiceTask1;/*
Author: Semitar Nicolae
JAVA AM Intern
 */

import java.util.LinkedList;
import java.util.List;

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "practiceTask1.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

public class Java_Core_Sixth_Task {

    public static void myMethod(List<Object> aro) {
//OR
// public static void myMethod(Object[] aro) {
        String str = "";
        Long sum = 0l;
        List<Person> alp = new LinkedList<Person>();
        for (Object o : aro) {
            if (o instanceof Person)
                alp.add((Person) o);
            else if (o instanceof String || o instanceof Character)
                str += o + " ";
            else if (o instanceof Integer)
                sum += (Integer) o;
            else if (o instanceof Long)
                sum += (Long) o;
        }
        System.out.println(str);
        System.out.println("");
        System.out.println(sum);
        System.out.println("");
        for (Person p : alp) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        List<Object> arrayObject = new LinkedList<>();
        arrayObject.add(30000000000l);
        arrayObject.add("Java");
        arrayObject.add(2000000);
        arrayObject.add(new Person("Ion", 11, 'M'));
        arrayObject.add("is");
        arrayObject.add(new Person("Maria", 15, 'F'));
        arrayObject.add('a');
        arrayObject.add(5000);
        arrayObject.add(new Person("Gigel", 21, 'M'));
        arrayObject.add("programming language");
        myMethod(arrayObject);

        //OR
//        Object[] arro = new Object[10];
//        arro[0] = 3000000;
//        arro[1] = "Java";
//        arro[2] = 2000000;
//        arro[3] = new practiceTask1.Person("Ion", 22, 'M');
//        arro[4] = "is";
//        arro[5] = new practiceTask1.Person("Maria", 25, 'F');
//        arro[6] = 'a';
//        arro[7] = 5000;
//        arro[8] = new practiceTask1.Person("Gigel", 21, 'M');
//        arro[9] = "programming language";
//        myMethod(arro);

    }
}
