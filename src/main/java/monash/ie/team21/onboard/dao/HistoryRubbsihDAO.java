package monash.ie.team21.onboard.dao;

import monash.ie.team21.onboard.entity.HistoryRubbishCollection;
import monash.ie.team21.onboard.entity.HistoryRubbishCollectionExample;
import monash.ie.team21.onboard.mapper.HistoryRubbishCollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HistoryRubbsihDAO {
    @Autowired
    HistoryRubbishCollectionMapper historyRubbishCollectionMapper;

    public List<HistoryRubbishCollection> getHistoryRubbishCollection() {
        HistoryRubbishCollectionExample example = new HistoryRubbishCollectionExample();
        HistoryRubbishCollectionExample.Criteria criteria = example.createCriteria();
        criteria.andCollectedWeightGreaterThan(0);
        return historyRubbishCollectionMapper.selectByExample(example);
    };
}
