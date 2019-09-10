public class Fiesta extends Evento
{
    private int   invitados;
    private int       mesas;
    private String tematica;
    Menu               menu;
    public Fiesta(String nombre,int horaInit,int horaFin)
    {
        super();
        setCliente(nombre);
        setHoraInit(horaInit);
        setHoraFin(horaFin);
    }
   
}
