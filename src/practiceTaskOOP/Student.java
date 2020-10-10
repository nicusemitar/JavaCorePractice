package practiceTaskOOP;

// 3
public class Student {
    private String name;
    private int age;

//    public Student(String name, int age) {
//        this.name  = name;
//        this.age = age;
//    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData("Gigi", 30);
        Student s2 = new Student();
        s2.setData("Ion", 26);
        int avg = (s1.getAge() + s2.getAge()) / 2;
        System.out.println("Average = " + avg);
    }

    public int getAge() {
        return age;
    }

    public void setData(String n, int a) {
        name = n;
        age = a;
    }
}