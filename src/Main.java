// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*Задача 1
        С помощью условного оператора напишите программу, которая выводит в консоль:
        сообщение о том, что человеку 18 или больше лет;
        сообщение, что возраст совершеннолетия еще не наступил, нужно немного подождать.
        При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
        «Если возраст человека равен …, то (вывести в зависимости от результата) он совершеннолетний /
        он не достиг совершеннолетия,
        нужно немного подождать».
                * */
        int ageHuman=67;
        int ageOfMajority=18;
        if(ageHuman>=ageOfMajority){
            System.out.println("Если возраст человека равен "+ageHuman+", он совершеннолетний");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }
        System.out.println("=================================");

         /*Человек одевается в зависимости от температуры воздуха. Напишите программу,
         которая выводит сообщение:
        «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
        «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        При выполнении каждого условия выведите в консоль: «На улице … градусов,
        (вывести в зависимости от результата) нужно надеть шапку / можно идти без шапки».*/


          int  outsideTemperature=2;
          int warmWeather=5;
          if(outsideTemperature<warmWeather){
              System.out.println("На улице "+outsideTemperature+",нужно надеть шапку");
          }
          else {
              System.out.println("На улице "+outsideTemperature+",можно идти без шапки");
          }
            System.out.println("=================================");



       /*Задача 3
        За превышение скорости водителю могут выписать штраф. Напишите программу,
        которая сообщает водителю о том, что:
        скорость превышена, если она больше 60 км/ч;
        превышения скорости нет, если она меньше 60 км/ч.
        При выполнении каждого условия программа должна выводить такое сообщение: «Если скорость …,
        то (вывести в зависимости от результата) придется заплатить штраф / можно ездить спокойно».**/


        int allowedSpeed=60;
        int carSpeed=78;
        if(carSpeed>=allowedSpeed){
            System.out.println("Если скорость "+carSpeed+",придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + carSpeed + ",можно ездить спокойно");
        }
            System.out.println("=====================================");
            /*Напишите программу, которая помогает определить,
            в какое учреждение нужно отправить человека в зависимости от его возраста:
            Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
            Если человеку от 7 до 17 лет, то ему нужно ходить в школу.
            Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете.
            А если человеку больше 24, то ему пора ходить на работу.
            При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
             «Если возраст человека равен …,
            то ему нужно ходить … (в зависимости от возраста дописать нужное)».*/


        int ageHuman2=89;
        if(ageHuman2>0&&ageHuman2<=2){
            System.out.println("никуда не надо ходить");
        }
        else if(ageHuman2>2&&ageHuman2<=6){
            System.out.println("Если возраст человека равен "+ageHuman2+
                    " то ему нужно ходить в детский сад.");
        }
        else if(ageHuman2>6&&ageHuman2<=17){
            System.out.println("Если возраст человека равен "+ageHuman2+
                    ", то ему нужно ходить в школу.");
        }
        else if(ageHuman2>17&&ageHuman2<=24){
            System.out.println("Если возраст человека равен "+ageHuman2+
                    ", то его место в университете.");
        }
       else if(ageHuman2>24&&ageHuman2<=65){
            System.out.println("Если возраст человека равен "+ageHuman2+
                    " то ему пора ходить на работу.");
        }
        else{
            System.out.println("на пенсии...");
        }
        /*else выполняет условия последнего "if",логичнее  "else if"..,
        * от 2 до 7 не "заложить' в переменную,или будет
        * каждая переменная под один год,могу через цикл..,но мы еще не проходили*/
        if((ageHuman2>6&&ageHuman2<=17)||(ageHuman2>2&&ageHuman2<=6)){
            System.out.println("\nкуда то надо идти");
        }
        else{
            System.out.println("\nникуда не надо");
        }
        //можно конечно так,но к каждому условию не вывести ...
        System.out.println("=================================");
        /* Задача 5
        Как правило, на аттракционах действуют ограничения для детей по возрасту:

        Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        Если ребенку больше 5, но меньше 14 лет, то он может кататься только в
        сопровождении взрослого. Если взрослого нет, то кататься нельзя.
        Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        Напишите программу, которая выводит в консоль сообщение в формате:
        «Если возраст ребенка равен …, то ему …
        (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе,
        можно кататься на аттракционе в сопровождении / без сопровождения взрослого)».*/
        int ageChild=15;
        if(ageChild<5) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    ", то он не может кататься на аттракционе.");
            }
        else if (ageChild>=5&&ageChild<14) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    ", он может кататься только в" +
                    "сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            }
        else {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    ", он может кататься без сопровождения взрослого.");
        }
        System.out.println("=========================================");
        /*Задача 6
Вместимость одного вагона поезда — 102 человека.
 Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
С помощью условного оператора и конструкции else напишите программу,
которая выводит в консоль сообщение о том,
есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.*/
       int countPlaceInCarriage=102;
       int seatsPlaceInCarriage=60;
       int standingPlaceInCarriage=countPlaceInCarriage-seatsPlaceInCarriage;
       int placeInCarriage=90;
       if(placeInCarriage>=countPlaceInCarriage){
           System.out.println("в вагоне нет мест");
       }
       else {
           if (placeInCarriage <= seatsPlaceInCarriage) {
               seatsPlaceInCarriage -= placeInCarriage;
               System.out.println("в вагоне" + (seatsPlaceInCarriage) + "сидячих мест и " +
                       standingPlaceInCarriage + " стоячих.");
           } else {
               standingPlaceInCarriage += seatsPlaceInCarriage - placeInCarriage;
               System.out.println("в вагоне нет сидячих мест,стоячих -> " + standingPlaceInCarriage);
           }
       }
           System.out.println("====================================");
          /* Задача 7
           Даны три числа:

           int one;
           int two;
           int three;

           С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
           какое из трех чисел бо́льшее, и выводит результат в консоль.*/

        int one=10;
        int two=9;
        int three=3;
        if(one>two&&two>=three){
            System.out.println("число "+one+" большее из трех");
        }
        else {
            if(two>one&&two>three){
                System.out.println("число "+two+" большее из трех");
            }
            else {
                System.out.println("число "+three+" большее из трех");

                }
            }

    }

}