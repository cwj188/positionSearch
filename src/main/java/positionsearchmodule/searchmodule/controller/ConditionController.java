package positionsearchmodule.searchmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import positionsearchmodule.searchmodule.model.Condition;
import positionsearchmodule.searchmodule.model.Position;
import positionsearchmodule.searchmodule.service.CSService;

import java.util.List;
import java.util.Map;

@Controller
public class ConditionController {
    @Autowired
    private CSService csService;

    @PostMapping("/cbsearch")
    public String getPositionInfo(Condition condition, Map<String,Object> map){
        List<Position> positions=csService.queryPositionInfo(condition);
        StringBuffer showPosition=new StringBuffer();
        for (Position position:positions){
            showPosition.append(position.toString()+"\r\n");
        }
        map.put("csResult",showPosition.toString());
        return "combineSearch";
    }

    @GetMapping("/jumpMapSearch")
    public String jumpMapSearch(){
        return "MapSearch";
    }

}
