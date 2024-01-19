import java.util.ArrayList;
import java.util.List;

public class StringArray {
	private String[] array;
	
	public StringArray(int length) {
        array = new String[length];
    }
	
	public String get(int index) {
        // Проверка, что индекс находится в пределах массива
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            System.out.println("Индекс вне диапазона массива");
            return null;
        }
    }

    // Метод для установки значения элемента массива
    public void set(int index, String value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            System.out.println("Индекс вне диапазона массива");
        }
    }
    
    // Метод для поэлементного сцепления двух массивов
    public StringArray concatenate(StringArray anotherArray) {
        StringArray newArray = new StringArray(this.array.length + anotherArray.array.length);
        int newIndex = 0;

        // Копирование элементов из первого массива
        for (int i = 0; i < this.array.length; i++) {
            newArray.array[newIndex++] = this.array[i];
        }

        // Копирование элементов из второго массива
        for (int i = 0; i < anotherArray.array.length; i++) {
            newArray.array[newIndex++] = anotherArray.array[i];
        }

        return newArray;
    }
    
    // Метод для слияния двух массивов с исключением повторяющихся элементов
    public StringArray mergeUnique(StringArray anotherArray) {
        List<String> uniqueList = new ArrayList<>();

        // Добавляем уникальные элементы из первого массива
        for (String element : this.array) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        // Добавляем уникальные элементы из второго массива
        for (String element : anotherArray.array) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        // Создаем новый массив на основе уникального списка
        StringArray newArray = new StringArray(uniqueList.size());
        for (int i = 0; i < uniqueList.size(); i++) {
            newArray.array[i] = uniqueList.get(i);
        }

        return newArray;
    }
    
    // Метод для вывода элемента массива по индексу
    public void printElement(int index) {
        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else {
            System.out.println("Индекс вне диапазона массива");
        }
    }

    // Метод для вывода всего массива
    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println(); 
    } 
}
