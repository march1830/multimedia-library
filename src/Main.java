

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
       Scanner console = new Scanner(System.in);
       while (true) {
           System.out.println("1. Добавить книгу");
           System.out.println("2. Показать все книги");
           System.out.println("3. Выход");
           System.out.println("Выберите опцию");
           int choice = console.nextInt();
           console.nextLine();
           switch (choice) {
               case 1:
                   System.out.println("Введите название книги");
                   String title = console.nextLine();
                   System.out.println("Введите автора книги");
                   String author = console.nextLine();
                   System.out.println("Введите год издания книги");
                   int year = console.nextInt();
                   console.nextLine();
                   Book newBook = new Book(title, author, year);
                   library.addBook(newBook);
                   System.out.println("Книга успешно добавлена!");
                   break;

               case 2:
                   System.out.println("\n--- Список книг в библиотеке ---");
                   library.displayAllBooks();
                   System.out.println("--------------------------------");
                   break;

               case 3:
                   System.out.println("Выход из программы.");
                   return;

               default:
                   System.out.println("Неверный выбор. Пожалуйста, введите число от 1 до 3.");
                   break;


           }
       }

    }
}
