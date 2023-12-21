package list;

class MyClass{
    public static void main(String[] args){
        Student[] student1 = {new Student("AC-343424", "James", "Smith", 6), new Student("AC-343428", "Maria", "Garcia", 5),new Student("AC-343434", "Robert", "Johnson", 3),new Student("AC-343454","Danny", "Robertson",10)};
        Classroom classroom1 = new Classroom(student1,"Algebra II", "Emily Theodore");
        Student[] student2 = {new Student("AC-340014","Kent", "Carter",9), new Student("AC-340024","Isaiah", "Chambers",10),new Student("AC-340018","Leta", "Ferguson",7)};
        Classroom classroom2 = new Classroom(student2, "English", "Daniel Pherb");

        Classroom[] school = {classroom1, classroom2};

        printHonorsStudents(school);
    }

    public static void printHonorsStudents(Classroom[] school){

        for(int i = 0; i < school.length; i++){
            for(int j = 0; j < school[i].students.length; j++){
                if(school[i].students[j].gradeLevel >= 10){
                    System.out.println(school[i].students[j].getStudentInfo() + school[i].teacher + "'s class");
                }
            }
        }
    }
}

class Student{
    String studentId;
    String firstName;
    String lastName;
    int gradeLevel;

    public Student(String studentId, String firstName, String lastName, int gradeLevel){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }

    public String getStudentInfo(){
        return this.studentId + " : " + this.firstName + " " + this.lastName + " (" + this.gradeLevel + ")";
    }
}

class Classroom{
    Student[] students;
    String courseName;
    String teacher;
    
    public Classroom(Student[] students, String courseName, String teacher){
        this.students = students;
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public String getClassIdentity(){
        return this.courseName + " managed by " + this.teacher;
    }

    public int getNumberOfStudents(){
        return this.students.length;
    }
}