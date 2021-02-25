
import java.util.Scanner;
import java.io.*;
import java.util.Formatter;

class StudentResults {
	public static void main(String[] args) throws IOException {
		Student s1=new Student();
		Scanner input=new Scanner (System.in);
		String inputFileName;

		System.out.println("\nEXAMINATION RESULT SLIP SYSTEM\n");
		System.out.print("Enter Student's Matric Number : ");
		inputFileName=input.nextLine();
		input.close();

		try {
			File obj=new File("C:\\JavaPrograms\\Assignment\\"+inputFileName+".txt");

			Scanner read=new Scanner (obj);
			System.out.println( "\nStudent Record found");
			System.out.println("\nExamination Slip is generated....\n");

			s1.setName(read.nextLine());
			s1.setMatricsNo(inputFileName);

			//System.out.println(s1.getName());
			//System.out.println(s1.getMatricsNo()+"\n");

			Course mp;
			int credit=0, i=0;
			double  t1=0, t2=0, t3=0;
			String kos2="";

			Formatter output;
			output=new Formatter("Slip"+inputFileName+".txt");
			output.format("EXAMINATION RESULTS FOR SEM 2, 2018/2019\n\n");
			output.format("NAME        :   "+s1.getName().toUpperCase()+"\n");
			output.format("MATRICS NO  :   "+s1.getMatricsNo().toUpperCase()+"\n\n\n");
			output.format("%-10s%-36s%-8s%-7s%n","CODE","COURSE","CREDIT","GRADE");
 			output.format("=============================================================\n");

			//String line=read.readLine();
			while(read.hasNextLine()) {

				String kos = read.next();

				mp=Course.valueOf(kos);

				if(i%2==0) {

					t1=mp.getGradeValue();
					kos2 = kos;
				}
				else {
					credit+=mp.getCredit();
					output.format("%-10s%-38s%-8s%-7s%n",kos,mp.getDescription(),mp.getCredit(),kos2);
					t2=(mp.getCredit())*t1;
					t3+=t2;
					t1=0;
					t2=0;
				}
				i++;
			}
			double answer=t3/credit;
			s1.setTotalCredit(credit);
			s1.setGpa(answer);

 			output.format("=============================================================\n\n");
 			output.format("CREDIT EARNED  : "+s1.getTotalCredit());
 			output.format("\nGPA            : %.2f",s1.getGpa());
 			output.close();
 			read.close();
		}
		catch(IOException e) {
			System.out.println( "No Student Record");
		}
	}
}
