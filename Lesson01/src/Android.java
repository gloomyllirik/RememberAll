public class Android extends Robotics implements Actions{
    private int d;       // максимальная дистанция бега в км.
    private double h;   // максимальная высота прыжка в м.

    // конструктор без параметров, по умолчанию максимальная дистанция бега = 50 км., а высота прыжка = 1.4 м.
    public Android() {
        d = 500;
        h = 3.2;
    }

    // конструктор с заданными максимальными значения дистанции бега и высоты прыжка
    public Android(int d, double h) {
        this.d = d;
        this.h = h;
    }

    @Override
    public boolean doRun(Object obstacle){
        boolean result = false;
        System.out.println("Робот побежал.");
        if (obstacle instanceof Road && ((Road)obstacle).getDistance() <= d){
            System.out.println("Робот пробежал.");
            result = true;
        } else System.out.println("Робот не смог пробежать.");
        return result;
    }

    @Override
    public boolean doJump(Object obstacle){
        boolean result = false;
        System.out.println("Робот прыгнул.");
        if (obstacle instanceof Wall && ((Wall)obstacle).getHeight() <= h){
            System.out.println("Робот перепрыгнул.");
            result = true;
        } else System.out.println("Робот не смог перепрыгнуть.");
        return result;
    }

    public void getInfo(){
        System.out.println("Робот с максимальной дистанцией бега " + d + " км. и максимальной высотой прыжка " + h + " м.");
    }
}