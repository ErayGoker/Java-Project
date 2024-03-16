

public class main {
    public static void main(String[] args) {
        Worker calisan=new Worker(03, "eray", 10000);
        SoftwareDeveloper yazilimci=new SoftwareDeveloper(02, "yasemin", 15000, "python and c");
        Boss patron=new Boss(01, "father", 30000,"yok", 30);

        yazilimci.showOfTheInformation();
        patron.showOfTheInformation();
    }
}
