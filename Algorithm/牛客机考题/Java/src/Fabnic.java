public class Fabnic {
    public static int Fab(int n){
        if (n<3){
            return 1;
        }
        return Fab(n-1)+Fab(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Fab(6 ));
    }
}
