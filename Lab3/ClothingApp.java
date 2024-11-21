import java.util.Arrays;
import java.util.Comparator;

/**
 * Клас ClothingApp для демонстрації роботи з масивом об'єктів Clothing.
 */
public class ClothingApp {

    /**
     * Основний метод, що виконує програму.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        // Створення масиву об'єктів Clothing
        Clothing[] clothes = {
            new Clothing("Jacket", "M", "Black", 120.0, "Leather"),
            new Clothing("T-Shirt", "L", "White", 20.0, "Cotton"),
            new Clothing("Jeans", "M", "Blue", 50.0, "Denim"),
            new Clothing("Skirt", "S", "Red", 40.0, "Silk"),
            new Clothing("Sweater", "L", "Green", 70.0, "Wool")
        };

        // Сортування за ціною за зростанням та за розміром за спаданням
        Arrays.sort(clothes, Comparator.comparing(Clothing::getPrice)
                                      .thenComparing(Comparator.comparing(Clothing::getSize).reversed()));

        // Виведення відсортованого масиву
        System.out.println("Sorted clothing items:");
        for (Clothing item : clothes) {
            System.out.println(item);
        }

        // Пошук ідентичного елементу
        Clothing target = new Clothing("Jeans", "M", "Blue", 50.0, "Denim");
        for (Clothing item : clothes) {
            if (item.equals(target)) {
                System.out.println("Found identical clothing: " + item);
                break;
            }
        }
    }
}
