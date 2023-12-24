package list;

class Student{

    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public int grade;

    public Student(String firstName, String lastName, int age, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
    }
};

class Main{

    public static void setStudentIds(Student[] students){
        for (int i = 0; i < students.length; i++){
            students[i].id = i + 1;
            System.out.println("Student " + students[i].firstName + " has an id of " + students[i].id);
        }
    }

    public static String searchForStudent(int id, Student[] listOfStudents){
        int correctId = id -1;
        if(!(0 <= correctId && correctId <= listOfStudents.length - 1)){
            return "Not FOUND";
        }
        Student studentFound = listOfStudents[correctId];
        return studentFound.firstName + " " + studentFound.lastName;
    }

    
}
