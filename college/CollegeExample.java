public class CollegeExample{
Class cls;
 College collegename;
Grade grade;
Faculty faculty;
Students student;
Semester semester;
Result result;
Branches branches;


college(Class cls,College collegename,Grade grade,Faculty faculty,Student student,Semester semester,Result result,Branches branches)
{
this.cls=cls;
this.collegename=collegename;
this.grade=grade;
this.faculty=faculty;
this.student=student;
this.semester=semester;
this.result=result;
this.branches=branches;	
	
}
void displayinfo()
{
System.out.println("classtype:" +cls);	
System.out.println("College:" +collegename);	
System.out.println("Grade:" +grade);	
System.out.println("Facultynumber:" +faculty);	
System.out.println("Studentsnumber:" +student);	
System.out.println("Semester:" +semester);	
System.out.println("Result:" +result);	
System.out.println("Branches:" +branches);	
	
	
}

}