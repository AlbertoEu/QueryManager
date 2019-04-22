package querymanager;

import Query.Query;
import User.User;

public class QueryManager {
    
    private static Query querys;
    private static final User USUARIO_BASE = new User("jcardenas", "universal", "superAdmin");
  
    public static void main(String[] args) {
        new QueryManager().run();
    }
    
    public void run() {
        
    }
    
    public boolean createQuery() {
     return true;   
    }
}
