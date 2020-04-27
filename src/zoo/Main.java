package zoo;

import zoo.animals.Lion;
import zoo.animals.Monkey;
import zoo.animals.Zebra;
import zoo.animals.Elephant;
import zoo.animals.Raccoon;
import zoo.animals.Penguin;
import zoo.aviary.aviaryHerb;
import zoo.aviary.aviaryCarn;
import zoo.aviary.aviaryOmni;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    private static Object veg;

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String command = "";
        double countOfMeat = 1000;
        double countOfVegetables = 1000;
        int li = 1;
        int s = 0;
        int l = 0;
        int o = 0;
        int weight = 0;
        String food = "";
        String name = "";

        aviaryHerb aviaryHerb = new aviaryHerb(30);
        aviaryOmni aviaryOmni = new aviaryOmni(10);
        aviaryCarn aviaryCarn = new aviaryCarn(20);


        System.out.print("Строим зоопарк");
        delayDots();
        System.out.print("Смотрим список доступных животных");
        delayDots();
        System.out.print("Нанимаем работников");
        delayDots();
        System.out.print("Покупаем еду");
        delayDots();


        /*======Добавляем львов=====*/

        while (li != 0) {
            System.out.println("Сколько добавить львов?" +
                    "\nдоступно " + (aviaryCarn.maxCount() - l) + " мест" +
                    "\n0, если добавлять львов не надо");
            li = scanner.nextInt();
            scanner.nextLine();//убираем лишний enter
            String text = "";
            if (li <= aviaryCarn.maxCount()) {
                Lion[] lion = new Lion[li];
                for (int i = 0; i < li; i++) {
                    l++;
                    System.out.println("Отлично, вы выбрали льва, задайте ему имя и вес");
                    System.out.println("Имя:");
                    name = scanner.nextLine();
                    System.out.println("Вес кг:");
                    weight = scanner.nextInt();
                    scanner.nextLine();//убираем лишний enter
                    aviaryCarn.addAnimalToAviaryCarn(lion[i] = new Lion(weight, name));
                    System.out.println("Мы его поселим");
                }
            } else {
                System.out.println("Вы привысили максимальное количество допустимых животных");
            }
        }

        /*======Добавляем слонов=====*/
        li = 1;
        while (li != 0) {
            System.out.println("Сколько добавить слонов?" +
                    "\nдоступно " + (aviaryHerb.maxCount() - s) + " мест" +
                    "\n0, если добавлять слонов не надо");
            li = scanner.nextInt();
            scanner.nextLine();//убираем лишний enter
            String text = "";
            if (li <= aviaryHerb.maxCount()) {
                Elephant[] elephant = new Elephant[li];
                for (int i = 0; i < li; i++) {
                    s++;
                    System.out.println("Отлично, вы выбрали слона, задайте ему имя и вес");
                    System.out.println("Имя:");
                    name = scanner.nextLine();
                    System.out.println("Вес кг:");
                    weight = scanner.nextInt();
                    scanner.nextLine();//убираем лишний enter
                    aviaryHerb.addAnimalToAviaryHerb(elephant[i] = new Elephant(weight, name));
                    System.out.println("Мы его поселим");
                }
            } else {
                System.out.println("Вы привысили максимальное количество допустимых животных");

            }
        }
        /*======Добавляем  обезьян=====*/
        li = 1;
        while (li != 0) {
            System.out.println("Сколько добавить обезьян?" +
                    "\nдоступно " + (aviaryOmni.maxCount() - o) + " мест" +
                    "\n0, если добавлять обезьян не надо");
            li = scanner.nextInt();
            scanner.nextLine();//убираем лишний enter
            String text = "";
            if (li <= aviaryHerb.maxCount()) {
                Monkey[] monkey = new Monkey[li];
                for (int i = 0; i < li; i++) {
                    o++;
                    System.out.println("Отлично, вы выбрали обезьяну, задайте ему имя и вес");
                    System.out.println("Имя:");
                    name = scanner.nextLine();
                    System.out.println("Вес кг:");
                    weight = scanner.nextInt();
                    scanner.nextLine();//убираем лишний enter
                    aviaryOmni.addAnimalToAviaryOmni(monkey[i] = new Monkey(weight, name));
                    System.out.println("Мы его поселим");
                }
            } else {
                System.out.println("Вы привысили максимальное количество допустимых животных");
            }
        }

        /*======Добавляем пингвинов=====*/
        li = 1;
        while (li != 0) {
            System.out.println("Сколько добавить пингвинов?" +
                    "\nдоступно " + (aviaryCarn.maxCount() - l) + " мест" +
                    "\n0, если добавлять пингвинов не надо");
            li = scanner.nextInt();
            scanner.nextLine();//убираем лишний enter
            String text = "";
            if (li <= aviaryCarn.maxCount()) {
                Penguin[] penguin = new Penguin[li];
                for (int i = 0; i < li; i++) {
                    l++;
                    System.out.println("Отлично, вы выбрали пингвина, задайте ему имя и вес");
                    System.out.println("Имя:");
                    name = scanner.nextLine();
                    System.out.println("Вес кг:");
                    weight = scanner.nextInt();
                    scanner.nextLine();//убираем лишний enter
                    aviaryCarn.addAnimalToAviaryCarn(penguin[i] = new Penguin(weight, name));
                    System.out.println("Мы его поселим");
                }
            } else {
                System.out.println("Вы привысили максимальное количество допустимых животных");
            }
        }

        /*======Добавляем енотов=====*/
        li = 1;
        while (li != 0) {
            System.out.println("Сколько добавить енотов?" +
                    "\nдоступно " + (aviaryOmni.maxCount() - o) + " мест" +
                    "\n0, если добавлять енотов не надо");
            li = scanner.nextInt();
            scanner.nextLine();//убираем лишний enter
            String text = "";
            if (li <= aviaryHerb.maxCount()) {
                Raccoon[] raccoon = new Raccoon[li];
                for (int i = 0; i < li; i++) {
                    o++;
                    System.out.println("Отлично, вы выбрали енот, задайте ему имя и вес");
                    System.out.println("Имя:");
                    name = scanner.nextLine();
                    System.out.println("Вес кг:");
                    weight = scanner.nextInt();
                    scanner.nextLine();//убираем лишний enter
                    aviaryOmni.addAnimalToAviaryOmni(raccoon[i] = new Raccoon(weight, name));
                    System.out.println("Мы его поселим");
                }
            } else {
                System.out.println("Вы привысили максимальное количество допустимых животных");
            }
        }

        /*======Добавляем зебр=====*/
        li = 1;
        while (li != 0) {
            System.out.println("Сколько добавить зебр?" +
                    "\nдоступно " + (aviaryHerb.maxCount() - s) + " мест" +
                    "\n0, если добавлять зебр не надо");
            li = scanner.nextInt();
            scanner.nextLine();//убираем лишний enter
            String text = "";
            if (li <= aviaryHerb.maxCount()) {
                Zebra[] zebra = new Zebra[li];
                for (int i = 0; i < li; i++) {
                    s++;
                    System.out.println("Отлично, вы выбрали зебра, задайте ему имя и вес");
                    System.out.println("Имя:");
                    name = scanner.nextLine();
                    System.out.println("Вес кг:");
                    weight = scanner.nextInt();
                    scanner.nextLine();//убираем лишний enter
                    aviaryHerb.addAnimalToAviaryHerb(zebra[i] = new Zebra(weight, name));
                    System.out.println("Мы его поселим");
                }
            } else {
                System.out.println("Вы привысили максимальное количество допустимых животных");

            }
        }


        while (!command.matches("выход")) {
            System.out.println("========================" +
                    " \n В нашем зоопарке есть такие команды:" +
                    " \n Выход - если вы хотите пойти домой" +
                    " \n 1 - если вы хотите покормить вальер с хищниками  " +
                    " \n 2 - если хотите покормить вальер с травоядными " +
                    " \n 3 - если хотите покормить вальер с всеядными " +
                    " \n 4 -  для вывода информации о зоопарке" +
                    " \n ========================");
            System.out.println("Введите команду");
            command = scanner.nextLine().toLowerCase();

            if (command.matches("1")) {
                System.out.println("Чем будем клормить?");
                System.out.println("На складе лежит" +
                        "\n1 - мясо " + countOfMeat + " кг" +
                        "\n2 - овощи и фрукты" + countOfVegetables + " кг ");
                food = scanner.nextLine().toLowerCase();
                if (food.matches("1")) {
                    if (countOfMeat > 0) {
                        for (int i = 0; i < l; i++) {
                            System.out.print(aviaryCarn.getAnimal(i));
                            aviaryCarn.animalsCarn.get(i).feed("meat");
                            countOfMeat = countOfMeat - aviaryCarn.animalsCarn.get(i).needMeat();
                        }
                    } else {
                        System.out.println("Еда закончилась");
                    }
                } else if (food.matches("2")) {
                    for (int i = 0; i < l; i++) {
                        System.out.print(aviaryCarn.getAnimal(i));
                        aviaryCarn.animalsCarn.get(i).feed("vegetables");
                    }
                } else {
                    System.out.println("вы ввели некоректную команду");
                }
            } else if (command.matches("2")) {
                System.out.println("Чем будем клормить?");
                System.out.println("На складе лежит" +
                        "\n1 - мясо " + countOfMeat + " кг" +
                        "\n2 - овощи и фрукты " + countOfVegetables + " кг");
                food = scanner.nextLine().toLowerCase();
                if (food.matches("2")) {
                    if (countOfVegetables > 0) {
                        for (int i = 0; i < s; i++) {
                            System.out.print(aviaryHerb.getAnimal(i));
                            aviaryHerb.animalsHerb.get(i).feed("vegetables");
                            countOfVegetables = countOfVegetables - aviaryHerb.animalsHerb.get(i).needVegetable();
                        }
                    } else {
                        System.out.println("Еда закончилась");
                    }
                } else if (food.matches("1")) {
                    if (countOfMeat > 0) {
                        for (int i = 0; i < s; i++) {
                            System.out.print(aviaryHerb.getAnimal(i));
                            aviaryHerb.animalsHerb.get(i).feed("meat");
                        }
                    } else {
                        System.out.println("Еда закончилась");
                    }
                } else {
                    System.out.println("вы ввели некоректную команду");
                }
            } else if (command.matches("3")) {
                System.out.println("Чем будем клормить?");
                System.out.println("На складе лежит" +
                        "\n1 - мясо " + countOfMeat + " кг" +
                        "\n2 - овощи и фрукты" + countOfVegetables + " кг");
                food = scanner.nextLine().toLowerCase();
                if (food.matches("2")) {
                    if (countOfVegetables > 0) {
                        for (int i = 0; i < o; i++) {
                            System.out.print(aviaryOmni.getAnimal(i));
                            aviaryOmni.animalsOmni.get(i).feed("vegetables");
                            countOfVegetables = countOfVegetables - aviaryOmni.animalsOmni.get(i).needMeat();
                        }
                    } else {
                        System.out.println("Еда закончилась");
                    }
                } else if (food.matches("1")) {
                    if (countOfMeat > 0) {
                        for (int i = 0; i < o; i++) {
                            System.out.print(aviaryOmni.getAnimal(i));
                            aviaryOmni.animalsOmni.get(i).feed("meat");
                            countOfMeat = countOfMeat - aviaryOmni.animalsOmni.get(i).needVegetable();
                        }
                    } else {
                        System.out.println("Еда закончилась");
                    }
                } else {
                    System.out.println("вы ввели некоректную команду");
                }
            } else if (command.matches("4")) {
                System.out.print("Собираем информацию о зоопарке");
                delayDots();
                System.out.println("Вальер с хищниками");
                aviaryCarn.printInfo();
                System.out.println("Вальер с травоядными");
                aviaryHerb.printInfo();
                System.out.println("Вальер с всеядными");
                aviaryOmni.printInfo();
            }
        }
    }

    /*точечки*/
    public static void delayDots(int dotAmount) throws InterruptedException {
        for (int i = 0; i < dotAmount; ++i) {
            TimeUnit.SECONDS.sleep(1L);
            System.out.print(".");
        }

        System.out.println();
    }

    public static void delayDots() throws InterruptedException {
        delayDots(3);
    }

}