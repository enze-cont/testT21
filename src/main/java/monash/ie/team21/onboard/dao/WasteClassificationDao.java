package monash.ie.team21.onboard.dao;

import monash.ie.team21.onboard.entity.WasteClassification;
import monash.ie.team21.onboard.entity.WasteClassificationExample;
import monash.ie.team21.onboard.mapper.WasteClassificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WasteClassificationDao {

    @Autowired
    WasteClassificationMapper wasteClassificationMapper;

    public List<WasteClassification> getWasteTypeCollection() {
        WasteClassificationExample example1 = new WasteClassificationExample();
        WasteClassificationExample.Criteria criteria = example1.createCriteria();
        //criteria.andWasteNameEqualTo("eggshells");
        criteria.andWasteIdGreaterThan(0);
        return wasteClassificationMapper.selectByExample(example1);
    }


}
