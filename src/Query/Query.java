package Query;

import Interfaces.Data;
import java.util.ArrayList;
import java.util.List;

public class Query {
    private List <String> querys;
    private int nData;
    private String [] values = new String [nData];
    
    public Query() {
        this.querys = new ArrayList <String>();
    }
    
    public int countSpaces(String query) {
        int spaces = 0;
        for(int i=0; i<query.length(); i++) {
            if(query.charAt(i)==' ') spaces++;
        }
        return spaces;
    }
    
    public boolean create(String query){
        nData = this.countSpaces(query);
        return querys.add(query);
    }
    
    public boolean update(){
        return true;
    }
    
    public List<String> read(){
        return new ArrayList();
    }
    
    public boolean delete(){
        return true;
    }
}
