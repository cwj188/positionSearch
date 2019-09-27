package positionsearchmodule.searchmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import positionsearchmodule.searchmodule.model.Position;
import positionsearchmodule.searchmodule.service.DSService;

import java.util.Map;

@Controller
public class DirectController {
    @Autowired
    private DSService dsService;

    @RequestMapping("/pName")
    public String getPositionDirectly(@RequestParam("positionName") String pName, Map<String,Object> map){
        Position position= dsService.getPositionInfo(pName);
        map.put("dsResult",position);
        return "directSearch";
    }
}
