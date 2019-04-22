package Interfaces;
import java.util.List;

public interface Data {
    boolean create(String data);
    boolean update();
    List read();
    boolean delete();
}
