// 1
// 12
// 121
// 1212
// 12121
public class pattern_5 {
    static void pattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if(j%2==0){
                    System.out.print('2');
                }else{
                    System.out.print('1');
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        pattern();
    }
    
}
