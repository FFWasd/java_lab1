public class Main {
    void add() {
        for (int i=1; i<11; i++){
            for (int j = 1; j<11; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] arg){
        Main obj = new Main();
        obj.add();
    }
}