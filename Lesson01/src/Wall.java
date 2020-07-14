public class Wall {
    private double height;

    // конструктор без параметров, по умолчанию высота стены = 2 м.
    public Wall(){
        height = 2.0;
    }

    // конструктор с заданной высотой стены
    public Wall(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void getInfo(){
        System.out.println("Стена высотой " + height + " м.");
    }
}