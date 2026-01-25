class A extends Thread{
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("Java");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class ThreadClass{
    public static void main(String[] args){
        A r = new A();
        r.run();
        for(int i=0; i<=5; i++){
            System.out.println("Hyy");
        }
    }
}