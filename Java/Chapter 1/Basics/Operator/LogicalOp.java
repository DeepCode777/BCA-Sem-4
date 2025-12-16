public class LogicalOp
{
    public static void main(String[] args) {
        int a = 3,b = 2;
        
        System.out.println("And Operator && : " +((a > b) && (a < b)));
        System.out.println("OR Operator || : " +((a > b) || (a < b)));
        System.out.println("NOT Operator ! : " +(! (a < b)));
        
    }
}