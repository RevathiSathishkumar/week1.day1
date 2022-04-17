package week1.day1;

public class Fibonacciseries {
	
	public static void main(String[] args) {
		
		int range = 8;
		int firstNum = 0;
		int secondnum= 1;
		int sum=0;
		
		System.out.println("the fibonaci series" + range + "terms are");
		
		System.out.println(firstNum);
		
		System.out.println(secondnum);
		 
		for(int i=secondnum;i<=range;i++)
		{
           sum =firstNum+secondnum;
			firstNum=secondnum;
			secondnum=sum;
		 
		 System.out.println(sum);
		 
		 
		}
		
	}

}




