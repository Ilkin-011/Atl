package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    private String name;
    private Integer ID;

    public MapTask(String name, Integer ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }



    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "MapTask{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}

