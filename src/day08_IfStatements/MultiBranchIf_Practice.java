package day08_IfStatements;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {
        double score=55.5;

        boolean AGrade=score>=90 && score <=100;
        boolean BGrade=score>=80 && score<90;
        boolean CGrade =score>=70 && score <80;
        boolean DGrade=score>=60 && score<70;

        char grade=' ';


        if(AGrade){
            grade='A';
        }else if(BGrade){
            grade='B';
        }else if(CGrade){
            grade='C';
        }else if(DGrade){
            grade='D';
        }else{
            grade='F';
        }

        System.out.println(grade);
    }
}
