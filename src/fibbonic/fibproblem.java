package fibbonic;

public class fibproblem {
     public static void main(String[] args){
        int num = 5;
        int temp = 0;
        int res=1;

        for (int i = 0; i <= num; i++) {
            temp = temp +i;
            //res=i*(temp+1);

            System.out.println(temp);
        }
    }
}

