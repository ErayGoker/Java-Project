import java.util.TreeMap;

public class QuestionAndAnswer {

    private TreeMap <String ,String> sorular=new TreeMap<String,String>();

    public TreeMap<String, String> getSorular() {
        return sorular;
    }


    public void setSorular(TreeMap<String, String> sorular) {
        this.sorular = sorular;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sorular == null) ? 0 : sorular.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        QuestionAndAnswer other = (QuestionAndAnswer) obj;
        if (sorular == null) {
            if (other.sorular != null)
                return false;
        } else if (!sorular.equals(other.sorular))
            return false;
        return true;
    }


    public TreeMap <String,String> setSorular(){
        
        
        sorular.put(" which famous university graduate ", "kadir inanır");
        
        sorular.put(" A rainbow of seven colors What is the color in the middle? ", "green");

        sorular.put(" Dede Korkut's Turkish Epics In which two cities are the original copies located? Are there? ", "Dresten-Vatikan");
        sorular.put(" In which direction is the Leaning Tower of Pisa approaching the ground by 7 cm every 100 years? is it bending? ", "South");

        sorular.put(" Turkey's first prison sentence Who is a hacker? ", "tamer sahin");
        
        sorular.put(" He received the title of 'State Artist' in our country.Who is the first person to get it? ", "ahmet adnan saygun");
        
        sorular.put(" Which tree is the raw material of aspirin? ", "söğüt");
        
        sorular.put(" Which celebrity doesn't have a twin? ", "adile nasit");
        
        
        
        
        return sorular;
    }


    
}
