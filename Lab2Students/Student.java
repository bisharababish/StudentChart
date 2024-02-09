package Lab2Students;

import java.util.Scanner;

/*
 * done by: Saliba 22011168 and Bishara 22011173
 */

public class Student {
    // Attributes ( Data Fields)
    private String name;
    private long id;
    private int[] grades = new int[5]; // the grades for the courses
    // UpperCase name and stuff like that

    public Student(String name, long id) {
        this.name = name.toUpperCase();
        this.id = id;
    }

    // get value of the name and id ( copy contractor)
    public Student(Student st) {
        this.name = st.name;
        this.id = st.id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    // grade value returns -1
    public int getGrade(int course) {
        if (grades[course] == 0)
            return -1;
        return grades[course];
    }

    public int[] getGrade() {
        return grades;
    }

    public void setName(String newName) {
        this.name = newName;

    }

    public void setId(long newid) {
        this.id = newid;
    }

    public void setGrade(int course, int grade) {
        grades[course] = grade;
    }

    public void setGrades(int[] g) {
        for (int i = 0; i < grades.length; i++)
            grades[i] = g[i];

    }

    public double getAverage() {
        int sum = 0;
        int Average = 0;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        Average = sum / 5;
        return Average;

    }

    public boolean equals(Student student) {
        if (student.id == id)
            return true;
        return false;

    }

    @Override
    public String toString() {
        String[] g = new String[5];
        for (int i = 0; i < grades.length; i++)
            if (grades[i] != -1)
                g[i] = grades[i] + " ";
            else
                g[i] = "no grade";
        String n1 = "\nName: " + name + "\n" + "ID: " + id + "\n" + "Grades: " + "\n" + "Introduction to Programming: "
                + g[0] + "\n" + "Introduction to Management: " + g[1] + "\n" + "Data Structures: " + g[2] + "\n"
                + "Introduction to Economics: " + g[3] + "\n" + "Introduction to Mathematics: " + g[4] + "\n";

        return n1;
    }

    public static void main(String[] args) throws Exception {
        StudentChart s = new StudentChart(new Student[] {});
        int choose = 0;
        while (true) {
            Student temp = null;
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            System.out.println(
                    "1.Add\n2.Delete\n3.Get current number of Students\n4.Check for a student\n5.Get Student details\n"
                            + "6.Get Average(Course)\n7.Get Average\n8.Print All\n9.EXIT");
            choose = scan1.nextInt();
            String name;
            long id;
            int gradeNumber;
            int[] grade = new int[5];
            int[] studentChart = null;
            switch (choose) {
                case 1:
                    System.out.print("Enter name: ");
                    name = scan2.nextLine();
                    System.out.print("Enter ID: ");
                    id = scan1.nextLong();
                    System.out.print("Enter the grades: ");
                    grade[0] = scan1.nextInt();
                    grade[1] = scan1.nextInt();
                    grade[2] = scan1.nextInt();
                    grade[3] = scan1.nextInt();
                    grade[4] = scan1.nextInt();
                    temp = new Student(name, id);
                    temp.setGrades(grade);
                    boolean r = s.addStudent(temp);
                    System.out.println(r);
                    System.out.println();

                    break;
                case 2:
                    System.out.print("Enter name: ");
                    name = scan2.nextLine();
                    System.out.print("Enter ID: ");
                    id = scan1.nextLong();
                    temp = new Student(name, id);
                    s.deleteStudent(temp);

                    break;
                case 3:
                    System.out.println("Current number of students: " + s.getNumOfStudents());
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    name = scan2.nextLine();
                    System.out.print("Enter ID: ");
                    id = scan1.nextLong();
                    temp = new Student(name, id);
                    if (s.isStudent(temp)) {
                        System.out.println("PRESENT");
                    } else {
                        System.out.println("NOT PRESENT");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID: ");
                    id = scan1.nextLong();
                    System.out.println(s.getStudent(id));
                    break;
                case 6:
                    System.out.print("Enter GradeNumber: ");
                    gradeNumber = scan1.nextInt();
                    System.out.println("Average : " + s.getAverage(gradeNumber));
                    break;
                case 7:
                    // System.out.println("Average : " + s.getAverage());
                    s.printArray(studentChart);
                    break;
                case 8:
                    s.printstudentChart();
                    break;
                default:
                    System.out.println("Exiting...");
                    break;
            }
            if (choose <= 0 || choose > 8)
                break;
        }
    }
}
