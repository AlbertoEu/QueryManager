package Access;

import Data.UserData;
import User.User;

public class LogUser {
    
    private static User loginUser;
    private static UserData usersData;
    private static final User USUARIO_BASE = new User("jcardenas", "universal", "superAdmin");
    
    public LogUser() {
        usersData = new UserData();
        usersData.loadData();
    }
    
    public boolean login(String username, String password) {
        boolean userExists = false;
        
        for(int i=0; i<usersData.read().size(); i++) {
            User currentUser = usersData.read().get(i);
            if(currentUser.getUsername().equals(username)&&currentUser.getPassword().equals(password))
                userExists = true;
        }
        
        return userExists;
    }
    
    public void logout() {
        
    }
}
