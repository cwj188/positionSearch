package positionsearchmodule.searchmodule.service;

import positionsearchmodule.searchmodule.model.Position;

import java.util.List;

public interface DSService {
    public Position getPositionInfo(String pName);

    public List<Position> getAllPosition();
}
