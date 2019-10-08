package positionsearchmodule.searchmodule.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import positionsearchmodule.searchmodule.dao.PositionMapper;
import positionsearchmodule.searchmodule.model.Position;
import positionsearchmodule.searchmodule.service.DSService;

import java.util.List;

@Service
public class DSServiceImpl implements DSService {
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public Position getPositionInfo(String pName) {
        Position position=positionMapper.queryDirectly(pName);
        return position;
    }

    @Override
    public List<Position> getAllPosition() {
        List<Position> list=positionMapper.getAllPosition();
        return list;
    }
}
