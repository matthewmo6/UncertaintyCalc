import java.util.Scanner;

public class UncertaintyCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double firstnumber = scan.nextDouble();
		double secondnumber = scan.nextDouble();
		
		double uncertainty1 = scan.nextDouble();
		double uncertainty2 = scan.nextDouble();

		double uncertaintymutiply, uncertaintydivide;
		
		double one = uncertainty1/firstnumber;
		double two = uncertainty2/secondnumber;
		
		double sumuncer = one+two;
		double mutiply = firstnumber*secondnumber;
		double divide = firstnumber/secondnumber;
		
		uncertaintymutiply = mutiply*sumuncer;
		uncertaintydivide = divide*sumuncer;

		System.out.println(uncertaintymutiply);
		System.out.println(uncertaintydivide);

		
		

		
	}

}
