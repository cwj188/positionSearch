package positionsearchmodule.searchmodule.serviceImpl;

import org.springframework.stereotype.Service;
import positionsearchmodule.searchmodule.model.Applicant;
import positionsearchmodule.searchmodule.service.AdviceService;

@Service
public class AdviceServiceImpl implements AdviceService {
    @Override
    public boolean sendAdviceMsg(Applicant applicant, String adviceMsg) {
        return false;
    }

    @Override
    public Applicant getIntegralApplicant(Applicant applicant) {
        return null;
    }
}
