import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to Armstrong Number");
		System.out.println("enter a number ");
		int num =input.nextInt();
		boolean isArmstrong=isArmstrong(num);
		System.out.println(isArmstrong);
		if(isArmstrong){
			System.out.println("your number is Armstrong");
		}
		else{
			System.out.println("your number is not Armstrong");
		}
		
	}
	public static boolean isArmstrong(int num){
		int numCopy =num;
		int no0fdigits=no0fdigits(num);
	
	System.out.println("no of digits:" + no0fdigits);
	int finalnumber=0;
	
	while(num>0){
		int lastDigite=num%10;
		num/=10;
		finalnumber+=pow(lastDigite,no0fdigits);
		
	}
	System.out.println("fianl number is :" +finalnumber);
		return finalnumber==numCopy;
	}
	public static int pow(int num1 ,int num2){
		int result=num1;
		int i=1;
		while(i<num2){
			result*=num1;
			i++;
		}
		System.out.println("pow of "  +num1 + "is " + result);
		return result;
	}
			
	
	
	public static int no0fdigits(int num){
		int digits=0;
		while(num>0){
			digits++;
			num/=10;
		}
		return digits;
	}
	}
		