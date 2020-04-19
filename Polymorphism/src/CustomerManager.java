public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){
        System.out.println("Customer was added");
        this.logger.log("Logged");
    }
}
