package DogStatus;

public class MeetEnemy implements DogState {
    @Override
    public void showState() {
        System.out.println("狗遇到敌人：狂叫，并冲上去狠咬敌人。");
    }
}
