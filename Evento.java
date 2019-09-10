public abstract class Evento
{
    private String cliente;
    private String   fecha;
    private int    horaFin;
    private int   horaInit;
    public Evento() {
    }
    
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public void setHoraInit(int hora){
        this.horaInit = hora;
    }
    
    public void setHoraFin(int hora){
        this.horaFin = hora;
    }
}
