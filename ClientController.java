/**
 * Created by Alexander on 1/30/2017.
 */
public class ClientController {
    private Client model;
    private  ClientView view;

    public ClientController(Client model, ClientView view){
        this.model = model;
        this.view = view;
    }

    public void setClientNum(String clientNum){
        model.setClientNum(clientNum);
    }

    public String getClientNum(){
        return model.getClientNum();
    }

    public void setFirstName(String FirstName){
        model.setFirstName(FirstName);
    }

    public String getFirstName(){
        return model.getFirstName();
    }

    public void setLastName(String LastName){
        model.setLastName(LastName);
    }

    public String getLastName(){
        return model.getLastName();
    }

    public void updateView(){
        view.printClientDetails(model.getClientNum(),model.getFirstName(),model.getLastName());
    }
}
