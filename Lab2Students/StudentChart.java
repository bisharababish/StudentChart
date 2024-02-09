package Lab2Students;

public class StudentChart {
    Student[] studentChart = new Student[100];
    int size = 0;

    public StudentChart() {

    }

    public StudentChart(Student[] studentChart) {

    }

    public StudentChart(StudentChart sc) {
        this.studentChart = sc.studentChart;

    }

    public boolean addStudent(Student student) {

        if (size < studentChart.length) {
            studentChart[size++] = student;
            System.out.println("Size " + size);
            return true;

        }
        return false;
    }

    public void deleteStudent(Student student) {

        for (int i = 0; i < size; i++) {

            if (studentChart[i].getId() == student.getId()) {
                System.out.println(studentChart[i]);
                studentChart[i] = null;
                for (int j = i; j < size; j++) {
                    studentChart[j] = studentChart[j + 1];
                }
                studentChart[size - 1] = null;
                size--;
                break;
            }
        }
    }

    public int getNumOfStudents() {
        return size;
    }

    public boolean isStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (studentChart[i].getId() == student.getId()) {
                return true;
            }

        }
        return false;

    }

    Student getStudent(long studentNum) {
        Student t = null;
        for (int i = 0; i < size; i++) {
            if (studentChart[i].getId() == studentNum) {
                t = studentChart[i];
                break;
            }
        }
        return t;
    }

    public double getAverage(int course) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += studentChart[i].getGrade(course);
        }
        return sum / size;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += studentChart[i].getAverage();
        }
        return sum / size;
    }

    public void sortById() {

        for (int i = 0; i < studentChart.length; i++) {
            for (int j = 0; j < studentChart.length; j++) {
                if (studentChart[j].getId() > studentChart[i].getId()) {

                    Student temp = studentChart[i];
                    studentChart[i] = studentChart[j];
                    studentChart[j] = temp;

                }
            }
        }
        System.out.print(studentChart);

    }

    public void sortByAverage() {

        for (int i = 0; i < studentChart.length - 1; i++) {
            for (int j = 0; j < studentChart.length; j++) {
                if (studentChart[j].getAverage() > studentChart[i].getAverage()) {

                    Student temp = studentChart[i];
                    studentChart[i] = studentChart[j];
                    studentChart[j] = temp;

                }
            }
        }
        System.out.print(studentChart);

    }

    public static void sortByNameMerge(String[] name) {
        int length = name.length;
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        String[] left = new String[mid];
        String[] right = new String[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = name[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = name[i];
        }

        sortByNameMerge(left);
        sortByNameMerge(right);
        merge(name, left, right);
    }

    public static void merge(String[] name, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < name.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                name[i] = left[a];
                a++;
            } else {
                name[i] = right[b];
                b++;
            }
        }
    }

    public void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void sortByNameQuick() {

    }

    public Student findStudentByName(String familyName) {
        for (Student s : studentChart) {
            if (familyName.equals(s.getName())) {
                return s;
            }
        }
        return null;
    }

    public void printstudentChart() {
        if (size == 0) {
            System.out.println("No students!");

        } else {
            for (int i = 0; i < size; i++) {
                System.out.println("\nStudents Number " + (i + 1));
                System.out.println(studentChart[i]);
            }
        }

    }
}
