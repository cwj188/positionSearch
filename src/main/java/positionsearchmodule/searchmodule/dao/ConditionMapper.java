package positionsearchmodule.searchmodule.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import positionsearchmodule.searchmodule.model.Condition;
import positionsearchmodule.searchmodule.model.Position;

import java.util.List;

@Mapper
@Repository
public interface ConditionMapper {
    int insert(Condition record);

    int insertSelective(Condition record);

    List<Position> getPositionByCondition(@Param("cSql") String cSql);
}