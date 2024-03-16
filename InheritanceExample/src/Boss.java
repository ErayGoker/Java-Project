

public class Boss extends SoftwareDeveloper {

    private int resbonsibilityforworker;

    public int getResbonsibilityforworker() {
        return resbonsibilityforworker;
    }

    public void setResbonsibilityforworker(int resbonsibilityforworker) {
        this.resbonsibilityforworker = resbonsibilityforworker;
    }

    
    public Boss(int id, String name , int salary,String language, int resbonsibilityforworker){
        super(id, name, salary,language);
        this.resbonsibilityforworker=resbonsibilityforworker;

    }

    public void showOfTheImformation(){
        super.showOfTheImformation();
        System.out.println(" he is  resbonsibility a worker for  " + resbonsibilityforworker);
    }
    
}
