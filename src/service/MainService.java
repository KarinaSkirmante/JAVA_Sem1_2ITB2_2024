package service;

import java.util.Arrays;
import java.util.Random;


/**
 * MainService for Seminar1
 * @author Karina Skirmante
 * 
 */
import java.util.Random;
public class MainService {

	private static final double GRAVITY = -9.81;
	
	
	public static void main(String[] args) {
		float price = 23.34f;
		
		//Math.pow
		
		
		// One - line commenta
		
		/*
		 * Multi line comment
		 */
		
		System.out.println("Hello");
		System.out.println();
		
		
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
				"Kate", "asdlaskdlaskdl;ks;" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
				299, 343, 317, 265 };
		
		
		int nameSize = names.length;
		int timeSize = times.length;
		
		if(nameSize == timeSize) {
			for(int i = 0; i < nameSize; i++) {
				//[Name, <time>]:
				System.out.println("[" + names[i] + ", <" + times[i] + ">]:");
			}
		}
		
		try
		{
			System.out.println(positionCalc(10, 10, 100));
			
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		
		try {
			System.out.println(factorialForLoop(16));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		try {
			double[] mas = generateArray(10, 0, 10);
			System.out.println(Arrays.toString(mas));
			System.out.println(getMean(mas));
			System.out.println(Arrays.toString(arraySort(mas)));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		try {
			System.out.println(Arrays.deepToString(generateMatrix(5)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static double positionCalc(double initialVelocity, double
			initialPosition, double fallingTime) throws Exception{ 
		
		if(initialVelocity >= 0 && initialVelocity < 299792458
				&& initialPosition >= 0 && initialPosition < 20000
				&& fallingTime >= 0 && fallingTime < 80000) {
			//x(t) = 0.5 × a*t^2 + v_0*t + x_0
			return 0.5 * GRAVITY * Math.pow(fallingTime, 2) 
					+ initialVelocity * fallingTime + initialPosition;
		}
		else
		{
			throw new Exception("Not possible to calculate ->wrong input parameters");
		}
		
	}
	
	//4! = 1 * 2 * 3 * 4 = 24
	public static int factorialForLoop(int N) throws Exception{
		
		if(N < 0) throw new Exception("Wrong input parameter");
		
		else if (N == 0) return 1;
		
		else
		{
			int result = 1;
			for(int i = 1; i <= N; i++) {
				result = result * i;
				//result *= i;
			}
			return result;
		}
				
	}
	
	
	public static double[] generateArray(int N, double lower, double upper) 
			throws Exception{
		if(N <= 0 || (upper < lower)) throw new Exception("Wrong input parameters");
		
		double[] result = new double[N];
		Random rand = new Random();
		for(int i = 0; i < result.length;i++) {
			result[i] = rand.nextDouble(lower, upper);
		}
		return result;
	}
	
	public static double getMean(double[] array) throws Exception  {
		if(array == null) throw new Exception("Wrong input parameters");
		
		double sum = 0;
		//tips mainigais : masīvaNosaukums
		for(double temp : array) {
			sum = sum + temp;
			//sum +=temp;
		}
		
		return sum/array.length;
		
		
	}
	//TODO min and max
	public static double[] arraySort(double[] array)throws Exception {
		if(array == null) throw new Exception("Wrong input parameters");
		
		Arrays.sort(array);
		
		return array;
	}
	
	
	public static double[][] generateMatrix(int N) throws Exception{
		if(N <= 0) throw new Exception("Wrong input parameters");
		
		double[][] result = new double[N][N];
		Random rand = new Random();
		
		for(int i = 0; i < result.length; i++) {//rows
			for(int j = 0; j < result[i].length; j++) {//columns
				result[i][j] = rand.nextDouble(100);
			}
		}
		
		return result;
		
	}
	
}
