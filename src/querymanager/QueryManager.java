package querymanager;

import Query.Query;
import Usuario.Usuario;

public class QueryManager {
    
    private static Query querys;
    private static final Usuario USUARIO_BASE = new Usuario("jcardenas", "universal", "superAdmin");
  
    public static void main(String[] args) {
        new QueryManager().run();
    }
    
    public void run() {
        
    }
}
