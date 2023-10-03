package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.printf("%d\n%d\n%d\n", first, second, third);
        var linkToFirst = first;
        var linkToSecond = second;
        var linkToThird = third;
        first = 15;
        second = 6;
        third = 4;
        System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",
                first,
                second,
                third,
                linkToFirst,
                linkToSecond,
                linkToThird
        );
    }
}
