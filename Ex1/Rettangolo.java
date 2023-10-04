package Ex1;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo (int altezza, int larghezza) {
    this.altezza = altezza;
    this.larghezza = larghezza;
    }
    public int areaCalcolata() {
       return this.altezza * this.larghezza;
    }
    public int perimCalcolato() {
        return (this.altezza * this.larghezza)*2;
    }
    public static void printRett (Rettangolo x){
        System.out.println("Rettangolo:" + "Area calcolata:" + x.areaCalcolata() + "Perimetro calcolato:" + x.perimCalcolato());

    }
    public static void printDueRett (Rettangolo ret1, Rettangolo ret2) {
        System.out.println("Rettangolo:" + "Area calcolata:" + ret1.areaCalcolata() + "Perimetro calcolato:" + ret1.perimCalcolato());
        System.out.println("Rettangolo:" + "Area calcolata:" + ret2.areaCalcolata() + "Perimetro calcolato:" + ret2.perimCalcolato());
        System.out.println("sum area: " + (ret1.areaCalcolata() + ret2.areaCalcolata()));
        System.out.println("sum Perimetro: " + (ret1.perimCalcolato() + ret2.perimCalcolato()));
    }
}
