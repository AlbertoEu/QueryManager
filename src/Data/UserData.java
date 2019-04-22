package Data;

import Interfaces.Data;
import User.User;
import java.util.ArrayList;
import java.util.List;

public class UserData implements Data {
    
    private List<User> users;
    
    public UserData() {
       users = new <User> ArrayList(); 
    }
    
    public boolean create(String username, String password, String role){
        return users.add(new User(username, password, role));
    }
    
    public boolean update(int id, String updatedUsername, String updatedPassword, String updatedRole){
        users.set(id, new User(updatedUsername, updatedPassword, updatedRole));
        return true;
    }
    
    @Override
    public List<User> read(){
        return users;
    }
    
    @Override
    public boolean delete(int id){
        users.remove(id);
        return true;
    }
}
