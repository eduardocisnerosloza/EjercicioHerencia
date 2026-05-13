public class Main {

    public static void main(String[] args) {
        IDS ids1=new IDS("IDS Central", "UDLA", "Udla321", 100);
        Antivirus av1=new Antivirus("Defender", "Servidor", "Serv1d*r", 50);

        System.out.println(ids1.detectarIntrusion());
        System.out.println(av1.escanearSistema());

        System.out.println("IDS: "+ids1.mostrarInformacion());
        System.out.println("Antivirus: "+av1.mostrarInformacion());
        av1.nombreSistema="Karspersky";
        System.out.println("Antivirus: "+av1.mostrarInformacion());

        SistemaMonitoreo sm=new SistemaMonitoreo("Genesys", "Data Center", "password");
        System.out.println(sm.iniciarMonitoreo());



    }
}