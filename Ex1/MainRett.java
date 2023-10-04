package Ex1;

public class MainRett {

    public static void main(String[] args){
    Rettangolo ret1 = new Rettangolo (2 , 6);
    Rettangolo ret2 = new Rettangolo (3 , 7);

    Rettangolo.printRett(ret1);
    Rettangolo.printRett(ret2);
    Rettangolo.printDueRett(ret1, ret2);
    }

}
