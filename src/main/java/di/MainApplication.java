package di;

import example_villageworld.factories.villages.VillageFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainApplication {

    private VillageFactory villageFactory;




    @Inject
    public MainApplication(VillageFactory villageFactory) {
        this.villageFactory = villageFactory;
    }

    public void init() {
    }
}
