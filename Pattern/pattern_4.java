// 1
// 22
// 333
// 4444
// 55555
public class pattern_4 {
    static void pattern(){
        for(int i=1; i<=5; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        pattern();
    }
    
}
