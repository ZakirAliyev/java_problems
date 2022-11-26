package az.iktlab.lessons.lesson6;

public class question5 {

    public static void main(String[] args) {

        int a,b,c,sum=0;
        for(int i=0;i<500;i++){
            a=i/100;
            b=i/10%10;
            c=i%10;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i) {
                sum++;
                System.out.println(sum+"th Armstrong number : "+i);
            }
        }
    }
}
