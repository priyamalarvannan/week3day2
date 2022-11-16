package week3.day2;

public class Auto extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args)
	{
		Auto a1=new Auto();
		a1.java();
		a1.selenium();
		a1.ruby();
		a1.python();
		
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium tool");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("it is programming language");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("it is a language");
		
	}
}
