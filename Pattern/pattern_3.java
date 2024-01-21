// 1
// 12
// 123
// 1234
// 12345
public class pattern_3 {
    static void pattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String Arg[]){
        pattern();
    }
    
}
