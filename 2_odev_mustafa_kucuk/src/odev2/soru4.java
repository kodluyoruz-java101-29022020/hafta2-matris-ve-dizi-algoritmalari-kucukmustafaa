package odev2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class soru4 
{
	public static void main(String[] args) {
		
		
		System.out.print("N degerini giriniz...: ");
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		
		int[] my_array=new int[input]; 
		Random random=new Random();
		
		StringBuilder b1=new StringBuilder();
		
		for (int i = 0; i < my_array.length; i++) {
			my_array[i]=random.nextInt(10);
			b1.append(my_array[i]);
			b1.append("-");
		}
		
		System.out.println(b1.toString());
		
		Set<Integer> unique_numberIntegers= new HashSet<Integer>();
		
		
		System.out.println("------------------------------");

		for (int i = 0; i < my_array.length; i++) {
			for (int j = i+1 ; j < my_array.length; j++) {
				if (my_array[i]==my_array[j]) {
					unique_numberIntegers.add(my_array[i]);
				}

			}
		}
		
		if (unique_numberIntegers.isEmpty()) {
			System.out.println("Tekrar eden eleman yok.");
		}
		
		unique_numberIntegers.stream().forEach(movie -> System.out.print(movie+" "));
	
		
		
		
	}
}
