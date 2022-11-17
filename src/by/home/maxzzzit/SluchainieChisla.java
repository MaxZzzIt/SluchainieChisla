package by.home.maxzzzit;

// Написать класс заполняющий массив случайными однозначными положительными числами!
public class SluchainieChisla {

	public static void main(String[]args) {
		int []mass= new int [10];
		int chisla = 0;
		System.out.print("Массив выглядит следующим образом: ");
		for (int i=0; i<mass.length; i++) {
			mass[chisla] = (int)(Math.random()*10);
			System.out.print(mass[chisla]+" ");
		}
			System.out.println(" ");
			System.out.println("Десятый элемент массива = "+mass[chisla]);
	}
}
