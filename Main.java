import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        StringArray array1 = new StringArray(3);
        StringArray array2 = new StringArray(3);

        // Инициализация массивов для примера
        array1.set(0, "Привет");
        array1.set(1, "Java");
        array1.set(2, "Мир");

        array2.set(0, "Программирование");
        array2.set(1, "Java");
        array2.set(2, "Класс");

        int choice;
        do {
            System.out.println("\nМеню:");
            System.out.println("1. Вывести массивы");
            System.out.println("2. Обратиться к элементу массива");
            System.out.println("3. Установить значение элемента массива");
            System.out.println("4. Сцепить массивы");
            System.out.println("5. Слить массивы с исключением повторений");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Массив 1:");
                    array1.printArray();
                    System.out.println("Массив 2:");
                    array2.printArray();
                    break;
                case 2:
                    System.out.print("Введите индекс элемента для массива 1: ");
                    int index = scanner.nextInt();
                    array1.printElement(index);
                    break;
                case 3:
                    System.out.print("Введите индекс и значение для массива 1: ");
                    index = scanner.nextInt();
                    String value = scanner.next();
                    array1.set(index, value);
                    break;
                case 4:
                    StringArray concatenated = array1.concatenate(array2);
                    System.out.println("Сцепленный массив:");
                    concatenated.printArray();
                    break;
                case 5:
                    StringArray merged = array1.mergeUnique(array2);
                    System.out.println("Слияние массивов с исключением повторений:");
                    merged.printArray();
                    break;
            }
        } while (choice != 0);

        scanner.close();

	}

}
