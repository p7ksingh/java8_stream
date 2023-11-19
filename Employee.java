import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//sort on the bases of name and age
class Student {
    String Name;
    int age;

    public Student(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Student [Name=" + Name + ", age=" + age + "]";
    }

}

public class Employee {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("pankaj", 30);
        Student student2 = new Student("dhiraj", 28);
        Student student3 = new Student("niraj", 27);
        Student student4 = new Student("alam", 15);
        Student student5 = new Student("alam", 17);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(students);

        List<Student> str = students.stream()
                .sorted((Comparator.comparing(Student::getName))
                        .thenComparing(Comparator.comparing(Student::getAge)))
                .collect(Collectors.toList());

                str.forEach(System.out::println);
    }
}