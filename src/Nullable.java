public abstract class Nullable {
    private final String value;

    public Nullable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isNull(){
        if(this.getValue()==null){
            return true;
        }
        return false;
    }
    public void print(){
        if(isNull()){
            System.out.println("DEGISKENE BIR SEY ATANMAMISTIR(NULL)");

        }
        else{
            System.out.println("NULL BIR DEGER DONMUYOR");
        }
    }
}
