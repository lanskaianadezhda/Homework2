public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 3.6;
        System.out.println(cat);
        paper = paper-7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println(totalWeight);
        var differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println(differenceWeight);

        System.out.println("Задание 7");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var remainder = weight2%weight1;

        System.out.println("Задание 8");
        var totalTime1 = 640;
        var time1worker = 8;
        var numberWorker1 = totalTime1/time1worker;
        System.out.println("Всего работников в компании - " + numberWorker1 + " человек");
        var numberWorker2 = numberWorker1 + 94;
        var totalTime2 = totalTime1/numberWorker2;
        System.out.println("Если в компании работает " + numberWorker2 + " человек, то всего " + totalTime2 + " часов работы может быть поделено между сотрудниками");


    }
}