package CheckDanger;

public class Good {

    Good(boolean danger){
        this.danger=danger;
    }

    private String name;
    private boolean danger;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isDanger(){
        return danger;
    }


}
