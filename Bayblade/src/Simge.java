

public class Simge {
    private String simgeTasarimcisi;
    private String simgeIsmi;

    public String getSimgeTasarimcisi() {
        return simgeTasarimcisi;
    }

    public void setSimgeTasarimcisi(String simgeTasarimcisi) {
        this.simgeTasarimcisi = simgeTasarimcisi;
    }

    public String getSimgeIsmi() {
        return simgeIsmi;
    }

    public void setSimgeIsmi(String simgeIsmi) {
        this.simgeIsmi = simgeIsmi;
    }

    public Simge(String simgeTasarimcisi, String simgeIsmi) {
        this.simgeTasarimcisi = simgeTasarimcisi;
        this.simgeIsmi = simgeIsmi;
    }

    public void bilgilerGoster(){
        System.out.println(getSimgeIsmi() +" Simgesi bayblade ozel tasarlanmis bir simgedir ve yapimcisi "
                            + getSimgeTasarimcisi() + " dir"   );
        
    }
}
