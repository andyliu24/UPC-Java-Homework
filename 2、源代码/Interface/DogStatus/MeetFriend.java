package DogStatus;

public class MeetFriend implements DogState {
    @Override
    public void showState() {
        System.out.println("狗遇到朋友：摇晃尾巴，表示欢迎。");
    }
}
