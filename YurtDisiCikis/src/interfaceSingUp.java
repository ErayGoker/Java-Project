

public class interfaceSingUp {

    public IntefaceCheckUser user;

    public interfaceSingUp(IntefaceCheckUser user) {
        this.user = user;
    }

    public void singUpManager(InterfaceOrnekUser calisan){
        if (user.CheckUser(calisan)) {
            System.out.println("kayit yapilmistir");
        }
        else    
            System.out.println("kayit yapilamamistir");
    }

    
    
}
