class ArrayExercise
{
	public static void main(String[] args) {
		int number[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0,average=0;
    System.out.println("Elements in array are as follows ");
		for(int i=0;i<number.length;i++)
		{
			System.out.print(number[i]+" ");
		}
		for(int i=0;i<number.length;i++)
		{
			sum+=number[i];
		}
		average=(sum/number.length);
		System.out.println("\n\nThe sum of the 10 numbers is =>"+sum+"\n");
		System.out.println("The average of the 10 numbers is => "+average+"\n");
	}
}