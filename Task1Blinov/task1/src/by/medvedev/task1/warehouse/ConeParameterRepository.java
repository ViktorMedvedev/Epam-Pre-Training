package by.medvedev.task1.warehouse;

import java.util.HashMap;

public class ConeParameterRepository {
    HashMap<Long, ConeParameter> map = new HashMap<>();

    public void add(long id, ConeParameter parameter) {
        map.put(id, parameter);
    }

}
