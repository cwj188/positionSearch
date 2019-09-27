package positionsearchmodule.searchmodule.service;

import positionsearchmodule.searchmodule.model.Applicant;

public interface AdviceService {
    public boolean sendAdviceMsg(Applicant applicant, String adviceMsg);
    public Applicant getIntegralApplicant(Applicant applicant);
}
