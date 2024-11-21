import java.util.Arrays;

public class TestLinkedListFlowerCollection {

    public static void main(String[] args) {
        // Створимо квіти для тестування
        Flower rose = new Flower("Rose", 10.5, 1, 50.0);
        Flower tulip = new Flower("Tulip", 7.3, 2, 40.5);
        Flower lily = new Flower("Lily", 8.8, 1, 60.0);

        // 1. Тест порожнього конструктора
        LinkedListFlowerCollection flowerList1 = new LinkedListFlowerCollection();
        System.out.println("Initial empty list size: " + flowerList1.size());  // 0

        // 2. Тест конструктора з одним об'єктом
        LinkedListFlowerCollection flowerList2 = new LinkedListFlowerCollection(rose);
        System.out.println("List size after adding one flower (Rose): " + flowerList2.size());  // 1
        System.out.println("First flower: " + flowerList2.get(0).getName());  // Rose

        // 3. Тест конструктора з колекцією квітів
        LinkedListFlowerCollection flowerList3 = new LinkedListFlowerCollection(Arrays.asList(rose, tulip, lily));
        System.out.println("List size after adding a collection of flowers: " + flowerList3.size());  // 3

        // Виведемо всі квіти в списку
        System.out.println("Flowers in the list:");
        for (Flower flower : flowerList3) {
            System.out.println(flower.getName() + " - Price: " + flower.getPrice());
        }

        // 4. Тест додавання квітки
        flowerList3.add(new Flower("Sunflower", 9.5, 3, 80.0));
        System.out.println("List size after adding Sunflower: " + flowerList3.size());  // 4
        System.out.println("Last flower in the list: " + flowerList3.get(3).getName());  // Sunflower

        // 5. Тест видалення квітки за індексом
        Flower removedFlower = flowerList3.remove(1);  // Видаляємо Tulip
        System.out.println("Removed flower: " + removedFlower.getName());  // Tulip
        System.out.println("List size after removal: " + flowerList3.size());  // 3

        // Виведемо оновлений список квітів
        System.out.println("Updated flowers in the list:");
        for (Flower flower : flowerList3) {
            System.out.println(flower.getName() + " - Price: " + flower.getPrice());
        }
    }
}
