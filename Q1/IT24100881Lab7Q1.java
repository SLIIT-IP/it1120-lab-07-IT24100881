import java.util.Scanner;

public class IT24100881Lab7Q1{
	public static void main(String[] args){

Scanner input=new Scanner(System.in);

	int i;
	int marks;
	int sum=0;

for(i=1 ; i<=4 ; i++){

System.out.println("Enter the marks for subject number " +i+":" );
 marks=input.nextInt();

sum=sum+marks;
}

double average=sum/4.0;

System.out.println("average"+average);
//grade

if(average<=100 && average>=75){
System.out.println("distiction pass");
}
else if(average<=74 && average>=50){
System.out.println("credit pass");
}
else if(average<=49 && average>=0){
System.out.println("fail");
}

	}
}