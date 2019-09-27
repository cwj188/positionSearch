package positionsearchmodule.searchmodule.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import positionsearchmodule.searchmodule.model.MapCondition;
import positionsearchmodule.searchmodule.model.Position;

import java.util.List;

@Mapper
@Repository
public interface MapConditionMapper {
    int insert(MapCondition record);

    int insertSelective(MapCondition record);

    List<MapCondition> queryByArea(@Param("area") String area);

    Position queryByMcid(@Param("mcid") int mcid);
}