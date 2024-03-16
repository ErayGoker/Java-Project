

public class InterfaceOrnek {
    public static void main(String[] args) {
        interfaceSingUp user=new interfaceSingUp(new InterfaceCheckUserId());

            user.singUpManager(new InterfaceOrnekUser("nil", 15, 6000));

    }
    
}
