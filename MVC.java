/**
 * Created by Alexander on 1/30/2017.
 */
public class MVC {
    public static void main(String[] args){
        Client model = retrieveClientFromDatabase();

        ClientView view = new ClientView();

        ClientController controller;
        controller = new ClientController(model, view);

        controller.updateView();

        controller.setClientNum("1");
        controller.setFirstName("Alex");
        controller.setLastName("Bloomfield");

        controller.updateView();
    }

    private static Client retrieveClientFromDatabase(){
        Client client = new Client();
        client.setClientNum("2");
        client.setFirstName("Ashley");
        client.setLastName("Bloomfield");
        return client;

    }

}
