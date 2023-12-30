import java.util.Date;

public class Main{
    public void callingFunc(){
        System.out.println("From Calling Functions");
    }
    public static void main(String[] args){
        System.out.println("Hello!!!");
        System.out.println("This is from JavaSampleProject");
        System.out.println(new Date());
        new Main().callingFunc();
    }
}