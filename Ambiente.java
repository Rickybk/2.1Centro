public class Ambiente
{
    String  nombre;
    boolean status = false;
    public Ambiente(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }
    
}
