package businessCalculationService;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] {1,45,5,2,23,4,54,2};
    }
}
