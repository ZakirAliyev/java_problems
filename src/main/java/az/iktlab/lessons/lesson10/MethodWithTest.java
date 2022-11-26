package az.iktlab.lessons.lesson10;

public class MethodWithTest {

    public static int countWords(String a) {

        int sum=0;
        for(int j=0;j<a.length();j++){
            for(int i='A';i<='Z';i++){
                if(a.charAt(j)==i){
                    sum++;
                }
            }
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ' && a.charAt(i+1)>96 && a.charAt(i+1)<123){
                sum++;
            }
        }
        return sum;
    }
}
