import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Resource {
    wood,ore,clay,wheat,wool,desert;

    public static List<Resource> resourcePool = new ArrayList<>();
    static {
        resourcePool.add(Resource.ore);
        resourcePool.add(Resource.ore);
        resourcePool.add(Resource.ore);
        resourcePool.add(Resource.clay);
        resourcePool.add(Resource.clay);
        resourcePool.add(Resource.clay);
        resourcePool.add(Resource.wheat);
        resourcePool.add(Resource.wheat);
        resourcePool.add(Resource.wheat);
        resourcePool.add(Resource.wheat);
        resourcePool.add(Resource.wood);
        resourcePool.add(Resource.wood);
        resourcePool.add(Resource.wood);
        resourcePool.add(Resource.wood);
        resourcePool.add(Resource.wool);
        resourcePool.add(Resource.wool);
        resourcePool.add(Resource.wool);
        resourcePool.add(Resource.wool);
        resourcePool.add(Resource.desert);

        Collections.shuffle(resourcePool);
    }
}
