package positionsearchmodule.searchmodule.controller;

import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import positionsearchmodule.searchmodule.model.MapCondition;
import positionsearchmodule.searchmodule.model.Position;
import positionsearchmodule.searchmodule.service.MCSercice;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@Controller
public class MapConditionController {
    @Autowired
    private MCSercice mcSercice;

    @GetMapping("/mapInfo")
    public String getPositionInfoByMap(@PathParam("area") String area, Map<String,Object> map){
        List<MapCondition> mapConList=mcSercice.queryMapConByArea(area);
        JSONArray jsonArray=JSONArray.fromObject(mapConList);
        map.put("msResult",jsonArray);
        return "mapSearchResult";
    }

    @PostMapping("/mcid")
    public String searchPosition(@RequestParam("getMapId") String getMapId, Map<String,Object> map){
        Position position=mcSercice.queryPositionByMcid(getMapId);
        map.put("mcidResult",position);
        return "showPosition";
    }
}
