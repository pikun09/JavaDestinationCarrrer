public class student{
    int studentId;
    String studentName;
    int studentAge;
    int studentMarks;
    long studentParentContactNumber;
    String studentAddress;
    student(){
    };
    student(int studentId){
        this.studentId = studentId;
    };
    student(int studentId,String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        
        
    };
    student(int studentId,String studentName,int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        
    };
    student(int studentId,String studentName,int studentAge,int studentMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMarks = studentMarks;
        
    };
    student(int studentId,String studentName,int studentAge,int studentMarks,long studentParentContactNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMarks = studentMarks;
        this.studentParentContactNumber = studentParentContactNumber;
        
    };
    student(int studentId,String studentName,int studentAge,int studentMarks,long studentParentContactNumber,String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMarks = studentMarks;
        this.studentParentContactNumber = studentParentContactNumber;
        this.studentAddress = studentAddress;
    };
}