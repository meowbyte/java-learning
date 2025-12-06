package exercises.exercises4;

public class Student {
	 String studentId;
	    String name;
	    double[] grades;
public Student(String id, String name) {
	studentId=id;
	this.name=name;
	grades = new double[3];
}
public void addGrade(double grade, int index) {
    if (index >= 0 && index < 3) {
        grades[index] = grade;
    } else {
        System.out.println("Error: Index must be 0, 1, or 2");
    }
}
public double calculateAverage() {
	double sum=0;
	for(int index=0;index<3;index++) {
		sum+=grades[index];
	}
	return sum/3;
		
	}
public void displayInfo() {
    System.out.println("name:"+name+"ID: " +studentId);
    System.out.print("Grades: [");
    for (int i = 0; i < 3; i++) {
        System.out.print(grades[i]);
        if (i < 2) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
    System.out.println("Average: " + calculateAverage());
}
}
