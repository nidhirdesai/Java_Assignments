package prog;

class StudentAdmission{
	
	String name;
    int id;
    boolean feeStatus;   // true = Paid, false = Not Paid
    
    StudentAdmission(String n,int i,boolean f)
    {
    	name = n;
    	id = i;
    	feeStatus = f;
    }
}
class StudentMarks extends StudentAdmission{
	int maths,physics,java;
	double average;
	String grade;
	
	StudentMarks(String n,int i,boolean f,int m,int p,int j)
	{
		super(n,i,f);
		maths=m;
		physics=p;
		java=j;
		
		calculate();
	}
	void calculate()
	{
		if(feeStatus)
		{
			average=(maths+physics+java)/3.0;
			
			if (average >= 90)
                grade = "GA";
            else if (average >= 80)
                grade = "GB";
            else
                grade = "GC";
		}
			else
			{
				grade = "NA";
		}
	}
	void display() 
	{

        System.out.print(id + "  " + name + "  ");

        if (!feeStatus)
        {
            System.out.println("NA   NA   NA   NA   NA   NA");
        } 
        else 
        {
          System.out.println("Y   " + physics + "   " + maths + "   "
                    + java + "   " + average + "   " + grade);
        }
    }
}

public class Assignment_2 {

	public static void main(String[] args) {
		StudentMarks s1 = new StudentMarks("Girish", 101, false,0, 0, 0);

        StudentMarks s2 = new StudentMarks("Satish", 102, true,56, 81, 59);

        StudentMarks s3 = new StudentMarks("Priya", 103, true,51, 45, 50);

        StudentMarks s4 = new StudentMarks("Medha", 104, true,91, 55, 60);

        StudentMarks s5 = new StudentMarks("Supriya", 105, true,95, 89, 91);
        
        System.out.println("ID Name Fee Physics Maths Java Avg Grade");
        
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();

	}

}

/*Expected output
ID Name Fee Physics Maths Java Avg Grade
101  Girish  NA   NA   NA   NA   NA   NA
102  Satish  Y   81   56   59   65.33333333333333   GC
103  Priya  Y   45   51   50   48.666666666666664   GC
104  Medha  Y   55   91   60   68.66666666666667   GC
105  Supriya  Y   89   95   91   91.66666666666667   G*/A
