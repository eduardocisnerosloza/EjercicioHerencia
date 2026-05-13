public class Antivirus extends SistemaMonitoreo{

    private int archivosAnalizados;

    public Antivirus(String nombre, String ubicacion, String clave, int cantidad){
        super(nombre, ubicacion, clave);
        archivosAnalizados=cantidad;

    }

    public String escanearSistema(){
        return nombreSistema + " esta analizando "+archivosAnalizados+" archivos";
    }
    //Sobre escrito
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion()+
                "Cantidad de archivos: "+archivosAnalizados;
    }
}
