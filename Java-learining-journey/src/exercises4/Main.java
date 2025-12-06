package exercises.exercises4;

public class Main {
public static void main(String[] args) {
	Student s= new Student("S001","John Doe");

	s.addGrade(85.0,0 );
	s.addGrade(90.0,1 );
	s.addGrade(78.0,2 );
	s.calculateAverage();
	double ave=s.calculateAverage();
	System.out.println("average:"+ave);
	s.displayInfo();
	
}
}

