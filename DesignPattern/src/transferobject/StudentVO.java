package transferobject;

public class StudentVO {
private int RollNo;
private String Name;
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public StudentVO(int rollNo, String name) {
	super();
	RollNo = rollNo;
	Name = name;
}


}
