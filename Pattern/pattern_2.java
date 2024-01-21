// *
// **
// ***
// ****
// *****
public class pattern_2 {
    static void pattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        pattern();
    }
}
