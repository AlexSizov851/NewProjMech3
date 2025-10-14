

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

// Главный класс программы
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Автомобиль с бензиновым двигателем
        Car car = new Car("Mazda 3", 180, 5,
                new DVSEngine(150, FuelTypes.PETROL));

        // Самолет с реактивным двигателем на авиабензине
        Airplane airplaneGazoline = new Airplane( "Ан-4",230,9,
                new ReactiveEngine(738, FuelTypes.AVIAGASOLINE),1800);

        // Корабль с дизельным двигателем
        Ship ship = new Ship("Queen Mary 2", 48, 2695,
                new DVSEngine(157000, FuelTypes.DIESEL), 79287);

        // Велосипед c 18 скоростьями
        Bicycle bicycle18 = new Bicycle("Stesl", 50, 1, 18);

        // Помещаем все ТС в массив
        Transportprops[] transportsALL = {car, airplaneGazoline, ship, bicycle18};

        System.out.println("ТРАНСПОРТНЫЕ СРЕДСТВА");
        System.out.println("----------------------------");

        // Основной цикл программы
        boolean running = true;
        while (running) {
            System.out.println("\n ГЛАВНОЕ МЕНЮ:");
            System.out.println("`1` - Показать информацию о транспортных средствах ");
            System.out.println("`2` - Управлять автомобилем ");
            System.out.println("`3` - Управлять кораблем ");
            System.out.println("`4` - Управлять самолетом ");
            System.out.println("`5` - Управлять велосипедом ");
            System.out.println("`0` - Выйти из программы");
            System.out.print(" Введите значение: ");

            try {
               int input = scanner.nextInt();

               switch (input) {
                    case 0:
                    running = false;
                    System.out.println("Программа завершена");
                    break;

                    case 1:
                    // Показываем информацию о всех ТС
                    System.out.println("\n Информация о всех транспортных средствах: ");
                    for (int i = 0; i < transportsALL.length; i++) {
                        System.out.println("\n" + (i + 1) + ". " + transportsALL[i].getClass().getSimpleName());
                        transportsALL[i].displayInfo();}
                        break;

                    case 2:
                    System.out.println("\n Управление автомобилем: `" + car.name + "`");
                    adminTransport(car, scanner);
                    break;

                    case 3:
                    // manageTransport(airplane, scanner);
                    System.out.println(" \n Управление кораблем: `" + ship.name + "`");
                    adminTransport(ship, scanner);
                    break;

                    case 4:
                    //  manageTransport(ship, scanner);
                    System.out.println(" \n Управление самолетом: `" + airplaneGazoline.name + "`");
                    adminTransport(airplaneGazoline, scanner);
                    break;

                    case 5:
                    System.out.println("\n Управление велосипедом: `" + bicycle18.name + "`");
                    adminTransport(bicycle18, scanner);
                    break;

                    default:
                    System.out.println("ОШИБКА! Введите число от 0 до 5 \n");
               }
            } catch (InputMismatchException e) {
                     System.out.println("ОШИБКА! Введите целое число от 0 до 5");
                     // Очистка буфера сканера
                     scanner.nextLine();
            }
        }
        scanner.close();
    }

    // Метод для управления ТС
    private static void adminTransport(Transportprops transport, Scanner scanner) {

        boolean managing = true;
        while (managing) {
            System.out.println("\n Доступные действия:");
            System.out.println("1. Показать информацию");
            System.out.println("2. Двигаться");
            System.out.println("3. Остановиться");
            System.out.println("4. Заправить");
            System.out.println("0. Вернуться в главное меню");
            System.out.print("Выберите действие: ");

            try {
                int action = scanner.nextInt();

                switch (action) {
                    case 0:
                        managing = false;
                        break;

                    case 1:
                        transport.displayInfo();
                        break;

                    case 2:
                        transport.move();
                        break;

                    case 3:
                        transport.stop();
                        break;

                    case 4:
                        if (transport instanceof Refuel) {
                            Refuel refuelable = (Refuel) transport;
                            refuelable.refuel(100);
                            System.out.println("Транспорт успешно заправлен!");
                        } else {
                            System.out.println("Этот транспорт не требует заправки");
                        }
                        break;

                    default:
                        System.out.println("ОШИБКА! Введите число от 0 до 4 ");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("ОШИБКА! Введите целое число от 0 до 4 ");
                // Очистка буфера сканера
                scanner.nextLine();
            }
        }
    }
}