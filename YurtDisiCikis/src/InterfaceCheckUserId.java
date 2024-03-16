

public class InterfaceCheckUserId implements IntefaceCheckUser {

    @Override
    public boolean CheckUser(InterfaceOrnekUser user) {
       if (user.getId()==15) {
            return true;
       }
        return false;
    }


    
}
