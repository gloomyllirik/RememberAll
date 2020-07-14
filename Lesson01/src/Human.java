public class Human extends People implements Actions{
    private int d;       // максимальная дистанция бега в км.
    private double h;   // максимальная высота прыжка в м.

    // конструктор без параметров, по умолчанию максимальная дистанция бега = 50 км., а высота прыжка = 1.4 м.
    public Human(){
        d = 50;
        h = 1.4;
    }

    // конструктор с заданными максимальными значения дистанции бега и высоты прыжка
    public Human(int d, double h){
        this.d = d;
        this.h = h;
    }

    @Override
    public boolean doRun(Object obstacle){
        boolean result = false;
        System.out.println("Человек побежал.");
        if (obstacle instanceof Road && ((Road)obstacle).getDistance() <= d){
            System.out.println("Человек пробежал.");
            result = true;
        } else System.out.println("Человек не смог пробежать.");
        return result;
    }

    @Override
    public boolean doJump(Object obstacle){
        boolean result = false;
        System.out.println("Человек прыгнул.");
        if (obstacle instanceof Wall && ((Wall)obstacle).getHeight() <= h){
            System.out.println("Человек перепрыгнул.");
            result = true;
        } else System.out.println("Человек не смог перепрыгнуть.");
        return result;
    }

    public void getInfo(){
        System.out.println("Человек с максимальной дистанцией бега " + d + " км. и максимальной высотой прыжка " + h + " м.");
    }
}