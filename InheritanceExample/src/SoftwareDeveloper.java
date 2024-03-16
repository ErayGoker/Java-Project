
public class SoftwareDeveloper extends Worker{

    private String programmingLanguage;

    public SoftwareDeveloper(int id , String name , int salary,String language){
        super(id, name, salary);
        this.programmingLanguage=language;
    }
    
   
    public void showOfTheInformation(){
      super.showOfTheImformation();
        System.out.println("known the languages " + programmingLanguage);
    }

    
    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

     public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

}
