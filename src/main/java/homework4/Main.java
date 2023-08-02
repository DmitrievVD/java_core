package homework4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Buyer> buyers = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {

        // Создать массив покупателей (инициализировать 2 элемента),
        // массив товаров (инициализировать 5 элементов) и массив заказов (пустой на 5 элементов).

        buyers.add(new Buyer("Афгасий", "Илья", "Антонович", 18, "+79273568065"));
        buyers.add(new Buyer("Петрушин", "Максим", "Маратович", 21, "+79266568065"));


        products.add(new Product("Монитор", 8000));
        products.add(new Product("Телевизор", 90000));
        products.add(new Product("Компьютерная мышь", 1000));
        products.add(new Product("Клавиатура", 1500));
        products.add(new Product("Наушники", 2500));


        for (int i = 0; i < 5; i++) {
            orders.add(new Order());
        }

        //Вызвать метод совершения покупки несколько раз таким образом, чтобы заполнить массив покупок возвращаемыми значениями.

        try {
            makePurchase(buyers.get(0), new Product("Свекла", 50), 20); //если был передан неверный товар
        } catch (ProductException e){
            System.err.println(e.getMessage()); // вывести в консоль сообщение об ошиб-ке, не совершать данную покупку;
        }

        try {
            makePurchase(buyers.get(0), products.get(3), 101); //если было передано неверное количество
        } catch (AmountException e){
            System.err.println(e.getMessage());
            makePurchase(buyers.get(0), products.get(3), 1); // купить товар в количестве 1
        }

        System.out.printf("Итоговое количество совершённых покупок %s",orders.size()); // Вывести в консоль итоговое количество совершённых покупок после выполнения основного кода приложения.

        makePurchase(new Buyer("Волков", "Александр",
                "Маратович", 21, "+7986568065"), products.get(0), 1); // если был передан неверный пользователь
        //завершить работу приложения с исключением.





    }


    //Создать статический метод «совершить покупку» со строковыми параметрами,
    // соответствующими полям объекта заказа. Метод должен вернуть объект заказа.
    public static Order makePurchase(Buyer buyer, Product product, Integer quantity) {
        if (!buyers.contains(buyer)) throw new CustomerException("Несуществующий покупатель");
        if (!products.contains(product)) throw new ProductException("Несуществующий товар, не совершать данную покупку");
        if (quantity > 100 || quantity < 0) throw new AmountException("Неверное количество");
        return new Order(buyer, product, quantity);
    }
}
