package positionsearchmodule.searchmodule.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import positionsearchmodule.searchmodule.model.Position;

import java.util.List;

@Mapper
@Repository
public interface PositionMapper {
    int insert(Position record);

    int insertSelective(Position record);

    Position queryDirectly(@Param("pName") String pName);

    List<Position> getAllPosition();
}