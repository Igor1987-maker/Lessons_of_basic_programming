package taskFromInterview;


public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Haim", "Biology");

        Subject sb1 = new Subject("Botanica", "b1,b3,f34");
        Subject sb2 = new Subject("Zoology", "df13, sdsd1");

        st1.addSubject(sb1);
        st1.addSubject(sb2);
        st1.displayStudents();
    }
}
