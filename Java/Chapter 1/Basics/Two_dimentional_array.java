public class two_d
{
    public static void main(String[] args) {
        int a[][] = {{10,20,50},{30,40,60}};
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(" " +a[i][j]);
            }
            System.out.println();
        }
    }
}