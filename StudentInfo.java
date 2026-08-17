public class StudentInfo {
    public void Studentname() {
        System.out.println("name:vishwa");
    }
    public void StudentList() {
        System.out.println();
    }
    public void StudentMark() {
        System.out.println("Mark:1005");
    }
    public void StudentAddress() {
        System.out.println("Address:chennai");
    }
    public static void main(String[] arg) {
        StudentInfo info = new StudentInfo();
        info.Studentname();
        info.StudentMark();
        info.StudentAddress();
    }
}