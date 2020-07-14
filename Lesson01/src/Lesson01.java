public class Lesson01 {

    public static void main(String[] args) {
        Object[] mass_participants = {new Human(), new Cat(), new Android(), new Human(30,1.1),
                new Cat(5, 2.7), new Android(200, 1.2)};
        Object[] mass_obstacles = {new Wall(), new Road(), new Wall(2.5), new Road(15)};

        int i = 1;
        for (Object participant:mass_participants) {
            System.out.println("Участник №"+ i +":");
            System.out.println(participant.getClass().getName() + "\n");
            int j = 1;
            for (Object obstacle:mass_obstacles) {
                System.out.println("Препятствие №"+ j +":");
                System.out.println(obstacle.getClass().getName() + "\n");
/*
                if(!(((participant.getClass()) participant).doRun(obstacle)))
                    break;
*/
                j++;
            }
            i++;
        }

    }
}