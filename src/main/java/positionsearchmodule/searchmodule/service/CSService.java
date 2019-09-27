package positionsearchmodule.searchmodule.service;

import positionsearchmodule.searchmodule.model.Condition;
import positionsearchmodule.searchmodule.model.Position;

import java.util.List;

public interface CSService {
    public List<Position> queryPositionInfo(Condition condition);
}
