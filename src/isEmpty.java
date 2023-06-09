public class isEmpty extends Nullable{

    public isEmpty(String value) {
        super(value);
    }

    public boolean isEmpty(){
        if(this.getValue()==""){
            return true;
        }
        return false;
    }
    public void isEmptyPrint(){
        if(isEmpty()){
            System.out.println("EMPTY DEGER DONDURUR");
        }
        else{
            System.out.println("EMPTY DEGER DONDURMEZ");
        }
    }
}
