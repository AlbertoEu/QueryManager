package Data;

import java.util.ArrayList;
import java.util.List;

public class Query {
    private String baseQuery;
    private String completedQuery;
    private int nData;
    private List<String> values = new <String> ArrayList();
    
    public Query(String baseQuery) {
        this.baseQuery = baseQuery;
        nData = countSpaces();
        completedQuery = "";
    }
    
    public int countSpaces() {
        int spaces = 0;
        for(int i=0; i<baseQuery.length(); i++) {
            if(baseQuery.charAt(i)==' ') spaces++;
        }
        return spaces;
    }
    
    public void completeQuery() {
        int nData = 0;
        for(String splittedQuery : baseQuery.split(" ")) {
            completedQuery.concat(splittedQuery);
            completedQuery.concat(values.get(nData));
            nData++;
        }
    }
    
    public void addValue(String value) {
        values.add(value);
    }
    
    public String getBaseQuery() {
        return baseQuery;
    }

    public void setBaseQuery(String baseQuery) {
        this.baseQuery = baseQuery;
    }

    public int getnData() {
        return nData;
    }

    public void setnData(int nData) {
        this.nData = nData;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public String getCompletedQuery() {
        return completedQuery;
    }

    public void setCompletedQuery(String completedQuery) {
        this.completedQuery = completedQuery;
    }
}
