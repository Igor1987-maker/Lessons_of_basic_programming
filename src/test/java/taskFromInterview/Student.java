package taskFromInterview;

import java.util.ArrayList;

public class Student {

    private String name;
    private String degreeType;
    private ArrayList<Subject> subjects = new ArrayList<Subject>();



    public Student(String name, String degreeType) {
        super();
        this.name = name;
        this.degreeType = degreeType;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDegreeType() {
        return degreeType;
    }
    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }


    public void addSubject(Subject sub) {

        subjects.add(sub);
    }

    public void displayStudents() {

        System.out.println("Name:"+name);
        System.out.println("Degree type:"+degreeType);

        for(Subject s:subjects) {

            System.out.println(s);
        }


    }



}
