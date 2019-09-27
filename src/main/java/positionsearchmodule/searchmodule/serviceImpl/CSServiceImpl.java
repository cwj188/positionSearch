package positionsearchmodule.searchmodule.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import positionsearchmodule.searchmodule.dao.ConditionMapper;
import positionsearchmodule.searchmodule.model.Condition;
import positionsearchmodule.searchmodule.model.Position;
import positionsearchmodule.searchmodule.service.CSService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CSServiceImpl implements CSService {

    @Autowired
    private ConditionMapper conditionMapper;

    @Override
    public List<Position> queryPositionInfo(Condition condition) {
        //此处SQL语句where 1 =1 ，即使条件全为空也不影响查询出所有数据
        StringBuffer sql=new StringBuffer("select * from position where posid in (select posid from position.condition where 1=1 ");

        //以下做sql语句拼接，如果某条件为空就不拼接
        String postype=condition.getPostype();
        if (postype!=null&&!postype.trim().isEmpty()){
            sql.append("and postype = '"+postype+"' ");
        }
        String postreatment=condition.getPostreatment();
        if (postreatment!=null&&!postreatment.trim().isEmpty()){
            sql.append("and postreatment = '"+postreatment+"' ");
        }
        String poslevel=condition.getPoslevel();
        if (poslevel!=null&&!poslevel.trim().isEmpty()){
            sql.append("and poslevel = '"+poslevel+"' ");
        }
        String posexperience=condition.getPosexperience();
        if (posexperience!=null&&!posexperience.trim().isEmpty()){
            sql.append("and posexperience = '"+posexperience+"' ");
        }
        String poswelfare=condition.getPoswelfare();
        if (poswelfare!=null&&!poswelfare.trim().isEmpty()){
            sql.append("and poswelfare = '"+poswelfare+"' ");
        }
        sql.append(");");

        List<Position> positions= conditionMapper.getPositionByCondition(sql.toString());
        return positions;
    }


}
