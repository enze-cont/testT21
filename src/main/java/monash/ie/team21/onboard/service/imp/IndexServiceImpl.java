package monash.ie.team21.onboard.service.imp;

import monash.ie.team21.onboard.dao.HistoryRubbsihDAO;
import monash.ie.team21.onboard.dao.WasteClassificationDao;
import monash.ie.team21.onboard.entity.HistoryRubbishCollection;
import monash.ie.team21.onboard.entity.WasteClassification;
import monash.ie.team21.onboard.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    HistoryRubbsihDAO historyRubbsihDAO;

    @Autowired
    WasteClassificationDao wasteClassificationDao;

    @Override
    public List<HistoryRubbishCollection> getHistoryCollectionData() {
        return historyRubbsihDAO.getHistoryRubbishCollection();
    }

    public List<WasteClassification> getWasteTypeData() {
        return wasteClassificationDao.getWasteTypeCollection();
    }
}
