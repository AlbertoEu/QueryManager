package Query;

public class Query {
    String query;
    int nData;
    String [] values = new String [nData];
    
    public Query(String query) {
        this.query = query;
        int spaces = 0;
        for(int i=0; i<query.length(); i++) {
            if(query.charAt(i)==' ') spaces++;
        }
        nData = spaces;
    }
}
