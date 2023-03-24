package week5.day5;

public class Students {
	public void getStudentsInfo(int studId) {
		System.out.println(studId);
    }
	public void getStudentsInfo(int studId,String studName) {
		System.out.println(studId);
		System.out.println(studName);
	}
	public void getStudentsInfo(String studEmail,long studNumber) {
		System.out.println(studEmail);
		System.out.println(studNumber);
	}
	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentsInfo(822058);
		details.getStudentsInfo(850228,"Boopathi revanth");
		details.getStudentsInfo("revanthkishanth@gmail.com",8220585268l);
	}
	
	

}
