package businessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MangoDBDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {11,3,23,5,16,3546,4};
    }
}
