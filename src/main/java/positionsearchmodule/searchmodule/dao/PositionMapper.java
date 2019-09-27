package positionsearchmodule.searchmodule.dao;

import positionsearchmodule.searchmodule.model.Position;

public interface PositionMapper {
    int insert(Position record);

    int insertSelective(Position record);
}