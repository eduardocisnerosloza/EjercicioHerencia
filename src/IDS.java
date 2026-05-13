public class IDS extends SistemaMonitoreo{

    private int IntentosIntrusion;

    public IDS(String nombre, String ubicacion, String clave, int intentos){
        super(nombre, ubicacion, clave);
        IntentosIntrusion=intentos;
    }

    public String detectarIntrusion(){
        return nombreSistema+" detecto "+IntentosIntrusion+" Intento de intrusion";
    }
    public String mostrarInformacion(){
        return super.mostrarInformacion()+
                " cantidad de intntos de intrusion"+IntentosIntrusion+"\n";
    }
}
