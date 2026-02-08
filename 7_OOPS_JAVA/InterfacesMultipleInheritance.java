package practiceprograms1;

interface Sports{
	
	void play();
}
interface Study{
	
	void study();
}
class Student implements Sports,Study{
	
	public void play()
	{
		System.out.println("Playing sports.");
	}
	public void study()
	{
		System.out.println("Studying subjects.");
	}
}

public class Interface_MultipleInh {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.play();
		s.study();

	}

}
