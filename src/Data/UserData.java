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
    
    public boolean create(String username, String password){
        return users.add(new User(username, password, "admin"));
    }
    
    public boolean update(int id, String updatedUsername, String updatedPassword){
        users.set(id, new User(updatedUsername, updatedPassword, "admin"));
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
    
    @Override
    public void saveData() {
        
    }
    
    @Override
    public void loadData() {
        
    }
}
