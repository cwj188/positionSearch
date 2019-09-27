package positionsearchmodule.searchmodule.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import positionsearchmodule.searchmodule.dao.MapConditionMapper;
import positionsearchmodule.searchmodule.model.MapCondition;
import positionsearchmodule.searchmodule.model.Position;
import positionsearchmodule.searchmodule.service.MCSercice;

import java.util.List;

@Service
public class MCServiceImpl implements MCSercice {

    @Autowired
    private MapConditionMapper mapConditionMapper;

    @Override
    public Position queryPositionByMap(MapCondition mapCondition) {
        return null;
    }

    @Override
    public List<MapCondition> queryMapConByArea(String area) {
        List<MapCondition> mclist=mapConditionMapper.queryByArea(area);
        return mclist;
    }

    @Override
    public Position queryPositionByMcid(String mcid) {
        int mcId=Integer.parseInt(mcid);
        Position position=mapConditionMapper.queryByMcid(mcId);
        return position;
    }
}
