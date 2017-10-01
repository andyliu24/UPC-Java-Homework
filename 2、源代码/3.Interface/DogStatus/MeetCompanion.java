package DogStatus;

public class MeetCompanion implements DogState{
    @Override
    public void showState() {
        System.out.println("狗遇到同伴：在一起快乐的玩耍。");
    }
}
