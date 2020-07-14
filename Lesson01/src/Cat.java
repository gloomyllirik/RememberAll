public class Cat extends Animal implements Actions{
    private int d;       // максимальная дистанция бега в км.
    private double h;   // максимальная высота прыжка в м.

    // конструктор без параметров, по умолчанию максимальная дистанция бега = 50 км., а высота прыжка = 1.4 м.
    public Cat() {
        d = 10;
        h = 2.4;
    }

    // конструктор с заданными максимальными значения дистанции бега и высоты прыжка
    public Cat(int d, double h) {
        this.d = d;
        this.h = h;
    }

    @Override
    public boolean doRun(Object obstacle){
        boolean result = false;
        System.out.println("Кот побежал.");
        if (obstacle instanceof Road && ((Road)obstacle).getDistance() <= d){
            System.out.println("Кот пробежал.");
            result = true;
        } else System.out.println("Кот не смог пробежать.");
        return result;
    }

    @Override
    public boolean doJump(Object obstacle){
        boolean result = false;
        System.out.println("Кот прыгнул.");
        if (obstacle instanceof Wall && ((Wall)obstacle).getHeight() <= h){
            System.out.println("Кот перепрыгнул.");
            result = true;
        } else System.out.println("Кот не смог перепрыгнуть.");
        return result;
    }

    public void getInfo(){
        System.out.println("Кот с максимальной дистанцией бега " + d + " км. и максимальной высотой прыжка " + h + " м.");
    }
}