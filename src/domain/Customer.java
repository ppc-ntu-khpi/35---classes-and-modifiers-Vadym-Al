package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private float total;
    public Customer(){
        ID = 1;
        isNew = true;
        total = 1000f;

    }
    public void setID(int ID){
        this.ID = ID;
    }
    public  void setTotal(float total){
        this.total = total;
    }
    public void setNew(boolean isNew){
        this.isNew = isNew;
    }
    public void displayCustomerInfo () {
        System.out.println("Id - "+ID);
        System.out.println("is product new - "+isNew);
        System.out.println("total purchases are - "+total);
    }

}
