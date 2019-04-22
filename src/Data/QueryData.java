package Data;

import Interfaces.Data;
import Query.Query;
import java.util.ArrayList;
import java.util.List;

public class QueryData implements Data {
    
    private List<Query> querys;
    
    public QueryData() {
        querys = new <Query> ArrayList();
    }
    
    public boolean create(String query){
        return querys.add(new Query(query));
    }
    
    public boolean update(int id, String updatedQuery){
        querys.set(id, new Query(updatedQuery));
        return true;
    }
    
    public List<Query> read(){
        return querys;
    }
    
    public boolean delete(int id){
        querys.remove(id);
        return true;
    }
    
    public void saveData() {
        
    }
    
    public void loadData() {
        
    }
}
