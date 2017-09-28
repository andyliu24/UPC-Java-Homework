import java.io.*;

public class AnalysisResult {
    public static void main(String[] args) {
        File fRead=new File("source.txt");
        File fWrite=new File("sourceAnalysis.txt");
        try {
            Writer out = new FileWriter(fWrite,true);
            BufferedWriter bufferedWriter=new BufferedWriter(out);
            Reader in =new FileReader(fRead);
            BufferedReader bufferedReader=new BufferedReader(in);
            String str=null;
            while ((str=bufferedReader.readLine())!=null){
                double totalScore=Fenxi.getTotalScore(str);
                str=str+"总分"+totalScore;
                System.out.println(str);
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
