package Experience4.Q2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.SetStudentID(12345);
        student.SetName("张三");
        student.SetScore(95.5);

        System.out.println("学生ID: " + student.GetStudentID());
        System.out.println("姓名: " + student.GetName());
        System.out.println("成绩: " + student.GetScore());
    }
}

class Student {
    int StudentID;
    String Name;
    double Score;

    void SetStudentID(int id) {
        this.StudentID = id;
    }

    int GetStudentID() {
        return this.StudentID;
    }

    void SetName(String name) {
        this.Name = name;
    }

    String GetName() {
        return this.Name;
    }

    void SetScore(double score) {
        this.Score = score;
    }

    double GetScore() {
        return this.Score;
    }
}
