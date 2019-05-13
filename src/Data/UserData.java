package Data;

import Interfaces.Data;
import java.util.ArrayList;
import java.util.List;

public class UserData implements Data {
    
    private List<User> users;
    
    public UserData() {
       users = new <User> ArrayList(); 
       users.add(new User("prueba", "1234"));
    }
    
    public boolean create(String username, String password){
        return users.add(new User(username, password));
    }
    
    public boolean update(int id, String updatedUsername, String updatedPassword){
        users.set(id, new User(updatedUsername, updatedPassword));
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
