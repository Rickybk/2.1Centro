import java.util.ArrayList;
public class Centro
{
    ArrayList<Ambiente> ambientes;
    ArrayList<Evento>     eventos;
    private int      horaTest = 8;
    public Centro()
    {
        ambientes = new ArrayList<Ambiente>(10);
        eventos   = new ArrayList<Evento>(10);
        generarAmbientes(10);
    }

    public void contratoFiesta(){
        eventos.add(new Fiesta("Test",horaTest,horaTest+7));
    }

    public int asignarAmbiente(){
        int contador = 0;
        boolean bandera = true;
        while(bandera){
            if(!ambientes.get(contador).getStatus()){
                bandera = !bandera;
            } else {
                contador++;
            }

        }
        return contador;
    }

    private void generarAmbientes(int nAmbientes){
        for(int i = 0;i < nAmbientes;i++){
            ambientes.add(new Ambiente("salon "+i));
        }
    }

    public void ambienteLibre(){
        for(int i = 0 ; i<ambientes.size();i++){
            if(!ambientes.get(i).getStatus()){
                System.out.println("Ambiente "+i+" Disponible");
            }
        }
    }

    public int getHora(){
        return horaTest;
    }
}
