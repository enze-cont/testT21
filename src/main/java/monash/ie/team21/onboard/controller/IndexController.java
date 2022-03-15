package monash.ie.team21.onboard.controller;

import monash.ie.team21.onboard.entity.HistoryRubbishCollection;
import monash.ie.team21.onboard.entity.WasteClassification;
import monash.ie.team21.onboard.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    IndexService indexService;

    @RequestMapping("/introduction")
    public String introduction(Model model) {
        //Add OpenData
        List<HistoryRubbishCollection> historyRubbishCollections = indexService.getHistoryCollectionData();
        model.addAttribute("rubbishCollection", historyRubbishCollections);
        return "introductionPage";
    }

    @RequestMapping("/classficationTool")
    public String tool(Model model) {
        //Add Rubbish Classfication data
        List<WasteClassification> wasteTypeCollections = indexService.getWasteTypeData();
        model.addAttribute("wasteTypeCollection", wasteTypeCollections);
        return "classficationTool";
    }

    @RequestMapping("/home")
    public String test(Model model) {
        return "index";
    }

}
