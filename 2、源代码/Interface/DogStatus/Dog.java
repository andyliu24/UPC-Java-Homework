package DogStatus;

public class Dog {
    public void DogsStatus(DogState dogState){
        dogState.showState();
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.DogsStatus(new MeetMaster());
        dog.DogsStatus(new MeetCompanion());
        dog.DogsStatus(new MeetEnemy());
        dog.DogsStatus(new MeetFriend());
    }
}
