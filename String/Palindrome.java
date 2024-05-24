class Palindrome {
    public static String check(String s1,int n){
        String s2="";
        for(int i=n-1; i>=0; i--){
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2)) return "True";
        else return "False";
    }
    public static void main(String[] args) {
        String s1="lol";
        int n=s1.length();
        System.out.println(Palindrome.check(s1,n));
    }
}