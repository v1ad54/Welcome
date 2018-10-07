
public class Welcome {

	public static void main(String[] args) {
		// Строка для вывода на экран
		String greeting = "Welcome Core Java!";
		// Вывод строки на экран
		System.out.println(greeting);
		// Вывод символов = под ранее выведенной строкой
		for (int i = 0; i < greeting.length(); i++)
			System.out.print("=");
		System.out.println();

		System.out.println("Конец программы.");

		// Конец программы

	}

}
