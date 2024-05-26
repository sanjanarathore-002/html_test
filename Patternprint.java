import java.util.Scanner;
class Patternprint
{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("welcome to pattern print ");
		System.out.println("please enter a number : " );
		int n = input.nextInt();
		int a=n;
		for(int j=1; j<=n; j++){
		for(int i=1; i<=a; i++){//n+1-j
			System.out.print(i);
		}
		a--;
		System.out.println();
		}
	}
}