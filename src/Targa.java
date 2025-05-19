public class Targa {
    private String numero;
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Targa(String numero){
        this.numero=numero;
    }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if (obj==null || getClass()!=obj.getClass())return false;
        Targa targa=(Targa)obj;
        return numero.equals(targa.numero);
    }
    //public int hashCode(){

    //}
    public String toString(){
        return "Numero di targa: "+numero;
    }
}