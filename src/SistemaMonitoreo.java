public class SistemaMonitoreo {


    protected String nombreSistema;
    protected String ubicacion;
    private String secreto;



    public SistemaMonitoreo(String nombre, String ubicacion, String clave){
        nombreSistema=nombre;
        this.ubicacion=ubicacion;
        secreto=clave;
    }

    public String iniciarMonitoreo(){
        return "Ha iniciado el monitoreo";
    }

    public String mostrarInformacion(){
        String resultado="";
        resultado="Nombre del Sistema: "+nombreSistema;
        resultado+="Ubicacion: "+ubicacion+"\n";
        return resultado;
    }
}
