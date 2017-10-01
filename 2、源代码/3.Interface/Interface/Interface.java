package Interface;

interface ComputeAverage{
    double averageGrade(double []Array);
}

public class Interface {
    public static void main(String[] args) {
        Gymnastics gymnastics=new Gymnastics();
        School school=new School();

        double gymGrade,schoolGrade;
        gymGrade=gymnastics.averageGrade(gymnastics.gymGrade);
        schoolGrade=school.averageGrade(school.schoolGrade);

        System.out.println("体操选手的最后得分为："+gymGrade);
        System.out.println("学生的平均成绩为："+schoolGrade);
    }
}
