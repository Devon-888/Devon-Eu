public class App {

    public static void main(String[] args) throws Exception {
       System.out.println("Number\tSquaroot\tCode\n");

       for(int i = 0; i <= 20;i = i+2 ){
        System.out.printf("%d\t %.4f %.4f\n",i,Math.sqrt(i),Math.pow(i,3));
        System.out.printf("%d\t %.4f %.4f\n",i,Math.sqrt(i),Math.pow(i,3));
       }
        
    }
}
