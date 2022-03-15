package monash.ie.team21.onboard.service;

import monash.ie.team21.onboard.entity.HistoryRubbishCollection;
import monash.ie.team21.onboard.entity.WasteClassification;


import java.util.List;

public interface IndexService {
    List<HistoryRubbishCollection> getHistoryCollectionData();

    List<WasteClassification> getWasteTypeData();
}

