package ActivityDay1;
import java.util.Scanner;

public class MarksPercentage {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of subjects: ");
		int r = sc.nextInt();
		int marks[][] = new int[r][2];
		int i, j, total;
		double percent;
		
		for(j = 0; j < 2; j++) {
			System.out.println("Enter the marks for Employee: " + (j+1));
			for(i = 0; i < r; i++) {
				marks[i][j] = sc.nextInt();
			}
		}
		
		for(j = 0; j < 2; j++) {
			total = 0;
			for(i = 0; i < r; i++) {
				total += marks[j][i];
			}
			System.out.println("Total Marks for Employee: " + (j+1) + "is" + total);
			percent = total/r;
			System.out.println("Percentage of marks for Employee: " + (j+1) + "is" + percent);
		}
	}
}