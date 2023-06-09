public class Generic <T>{
    private final T value;
    public  Generic(T value){
        this.value=value;
    }
    public T getValue(){
        return this.value;
    }

    public boolean isNull(){
        if(this.getValue()==null){
          return true;
        }
        return false;
    }

    public void print(){
        if(isNull()){
            System.out.println("NULL BIR DEGER DONDURUR");
        }
        else{

            System.out.println("NULL BIR DEGER DONDURMEZ");
        }
    }




}
