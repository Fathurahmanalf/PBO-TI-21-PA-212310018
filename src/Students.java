
public class Students {
	int npm;
	String fullName;
	String ClassName;
	int Semester;
	double GPA;

	int GetNPM (int value) {
		npm = value;
		return npm;
	}
	String GetfullName (String value) {
		fullName = value;
		return fullName;
	}
	String GetClassName (String value) {
		ClassName = value;
		return ClassName;
	}
	int GetSemester(int value) {
		Semester = value;
		return Semester;
	}
	double GetGPA (double value) {
		GPA = value;
		return GPA;
	}
}
