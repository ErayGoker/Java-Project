

public class InterfaceCheckUserComplex implements IntefaceCheckUser {

    @Override
    public boolean CheckUser(InterfaceOrnekUser user) {
        
            if (user.getPrice()>150 && user.getUserName().endsWith("ay")) {
                return true;
            }
            return false;

    }
    
    
}
