package querymanager;

import Screens.LoginScreen;

public class QueryManager {

    private static LoginScreen loginScreen;
  
    public static void main(String[] args) {
        new QueryManager().run();
    }
    
    public void run() {
        loginScreen = new LoginScreen();
    }
}
