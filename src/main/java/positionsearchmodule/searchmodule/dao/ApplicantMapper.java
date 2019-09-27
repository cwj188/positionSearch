package positionsearchmodule.searchmodule.dao;

import positionsearchmodule.searchmodule.model.Applicant;

public interface ApplicantMapper {
    int insert(Applicant record);

    int insertSelective(Applicant record);
}