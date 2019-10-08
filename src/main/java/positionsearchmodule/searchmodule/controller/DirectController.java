package positionsearchmodule.searchmodule.controller;

import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import positionsearchmodule.searchmodule.model.Position;
import positionsearchmodule.searchmodule.service.DSService;

import java.util.List;
import java.util.Map;

@Controller
public class DirectController {
    @Autowired
    private DSService dsService;

    @RequestMapping("/directSearch")
    public String getPositionDirectly(@RequestParam("direct") String pName, Map<String,Object> map){
        Position position= dsService.getPositionInfo(pName);
        map.put("dsResult",position);
        return "showPosition";
    }

    @RequestMapping("/showall")
    @ResponseBody
    public String showAllPosition(){
        List<Position> list=dsService.getAllPosition();
        String json=JSONArray.fromObject(list).toString();
        return json;
    }
}
