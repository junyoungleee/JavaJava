import java.util.*;

public class Chap2_12_2 {

	public static void main(String[] args) {
		
		System.out.print("����>> ");
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		String operator = sc.next();
		double b = sc.nextDouble();
		
		double result;
		switch(operator) {
			case "+":
				result = a+b;
				System.out.println(a+" "+operator+" "+b+"�� ��� ����� "+result);
				break;
			case "-":
				result = a-b;
				System.out.println(a+" "+operator+" "+b+"�� ��� ����� "+result);
				break;
			case "/":
				if(b!=0) {
					result = a/b;
					System.out.println(a+" "+operator+" "+b+"�� ��� ����� "+result);
				}else {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				break;
			case "*":
				result = a*b;
				System.out.println(a+" "+operator+" "+b+"�� ��� ����� "+result);
				break;
		}
			
				

	}

}