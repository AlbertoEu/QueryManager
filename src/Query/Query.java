package Query;

public class Query {
    private String query;
    private int nData;
    private String [] values = new String [nData];
    
    public Query(String query) {
        this.query = query;
        nData = countSpaces();
    }
    
    public int countSpaces() {
        int spaces = 0;
        for(int i=0; i<query.length(); i++) {
            if(query.charAt(i)==' ') spaces++;
        }
        return spaces;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getnData() {
        return nData;
    }

    public void setnData(int nData) {
        this.nData = nData;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
}
