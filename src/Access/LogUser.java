package Access;

import Data.UserData;
import User.User;

public class LogUser {
    
    private static User logedUser;
    private static UserData usersData;
    private static boolean usersAccess;
    private static final User USUARIO_BASE = new User("jcardenas", "universal", "SuperAdmin");
    
    public LogUser() {
        usersData = new UserData();
        usersData.loadData();
    }
    
    public boolean login(String username, String password) {
        boolean userExists = false;
        usersAccess = false;
        if(USUARIO_BASE.getUsername().equals(username) && USUARIO_BASE.getPassword().equals(password)) {
            logedUser = USUARIO_BASE;
            userExists = true;
            usersAccess = true;
        } else {
            for(int i=0; i<usersData.read().size(); i++) {
                User currentUser = usersData.read().get(i);
                if(currentUser.getUsername().equals(username)&&currentUser.getPassword().equals(password)) {
                    logedUser = new User(username, password);
                    userExists = true;
                }  
            }
        }
        return userExists;
    }
    
    public void logout() {
        
    }
}
