

public class InterfaceOrnekUser {
    private String userName;
    private int id;
    private int price;
   
   
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public InterfaceOrnekUser(String userName, int id, int price) {
        this.userName = userName;
        this.id = id;
        this.price = price;
    }


    
    
}
