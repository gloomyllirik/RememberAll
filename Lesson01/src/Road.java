public class Road {
    private int distance;

    // конструктор без параметров, по умолчанию длина дороги = 10 км.
    public Road(){
        distance = 10;
    }

    // конструктор с заданной длиной дороги
    public Road(int distance){
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void getInfo(){
        System.out.println("Дорога длиной в " + distance + " км.");
    }
}