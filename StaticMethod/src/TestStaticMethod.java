public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(15,"Khai");
        Student s2 = new Student(20,"Duy");
        Student s3 = new Student(18,"Nam");
        Student s4 = new Student(21,"Bao");

        s1.Display();
        s2.Display();
        s3.Display();
        s4.Display();
    }
}
