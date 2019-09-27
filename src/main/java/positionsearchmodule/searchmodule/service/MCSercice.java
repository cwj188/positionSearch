package positionsearchmodule.searchmodule.service;

import positionsearchmodule.searchmodule.model.MapCondition;
import positionsearchmodule.searchmodule.model.Position;

import java.util.List;

public interface MCSercice {
    public Position queryPositionByMap(MapCondition mapCondition);

    public List<MapCondition> queryMapConByArea(String area);

    public Position queryPositionByMcid(String mcid);
}
