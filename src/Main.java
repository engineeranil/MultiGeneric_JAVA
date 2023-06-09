public class Main {
    public static void main(String[] args) {
        /*isEmpty is = new isEmpty("");
        is.isEmptyPrint();
        is.print();
       Integer abc = 10;
       String st = abc.toString();
        Generic<String> g = new Generic<>(st);
        g.print();*/

        MultiGeneric<Integer,Float,String> multi = new MultiGeneric<>(31,5.4f,"ANIL");
        multi.showInfo();



    }
}
