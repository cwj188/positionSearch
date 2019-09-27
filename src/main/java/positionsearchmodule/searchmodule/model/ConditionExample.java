package positionsearchmodule.searchmodule.model;

import java.util.ArrayList;
import java.util.List;

public class ConditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConditionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPosidIsNull() {
            addCriterion("posid is null");
            return (Criteria) this;
        }

        public Criteria andPosidIsNotNull() {
            addCriterion("posid is not null");
            return (Criteria) this;
        }

        public Criteria andPosidEqualTo(Integer value) {
            addCriterion("posid =", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotEqualTo(Integer value) {
            addCriterion("posid <>", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidGreaterThan(Integer value) {
            addCriterion("posid >", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidGreaterThanOrEqualTo(Integer value) {
            addCriterion("posid >=", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLessThan(Integer value) {
            addCriterion("posid <", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidLessThanOrEqualTo(Integer value) {
            addCriterion("posid <=", value, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidIn(List<Integer> values) {
            addCriterion("posid in", values, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotIn(List<Integer> values) {
            addCriterion("posid not in", values, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidBetween(Integer value1, Integer value2) {
            addCriterion("posid between", value1, value2, "posid");
            return (Criteria) this;
        }

        public Criteria andPosidNotBetween(Integer value1, Integer value2) {
            addCriterion("posid not between", value1, value2, "posid");
            return (Criteria) this;
        }

        public Criteria andPostypeIsNull() {
            addCriterion("postype is null");
            return (Criteria) this;
        }

        public Criteria andPostypeIsNotNull() {
            addCriterion("postype is not null");
            return (Criteria) this;
        }

        public Criteria andPostypeEqualTo(String value) {
            addCriterion("postype =", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotEqualTo(String value) {
            addCriterion("postype <>", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeGreaterThan(String value) {
            addCriterion("postype >", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeGreaterThanOrEqualTo(String value) {
            addCriterion("postype >=", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLessThan(String value) {
            addCriterion("postype <", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLessThanOrEqualTo(String value) {
            addCriterion("postype <=", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeLike(String value) {
            addCriterion("postype like", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotLike(String value) {
            addCriterion("postype not like", value, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeIn(List<String> values) {
            addCriterion("postype in", values, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotIn(List<String> values) {
            addCriterion("postype not in", values, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeBetween(String value1, String value2) {
            addCriterion("postype between", value1, value2, "postype");
            return (Criteria) this;
        }

        public Criteria andPostypeNotBetween(String value1, String value2) {
            addCriterion("postype not between", value1, value2, "postype");
            return (Criteria) this;
        }

        public Criteria andPostreatmentIsNull() {
            addCriterion("postreatment is null");
            return (Criteria) this;
        }

        public Criteria andPostreatmentIsNotNull() {
            addCriterion("postreatment is not null");
            return (Criteria) this;
        }

        public Criteria andPostreatmentEqualTo(String value) {
            addCriterion("postreatment =", value, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentNotEqualTo(String value) {
            addCriterion("postreatment <>", value, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentGreaterThan(String value) {
            addCriterion("postreatment >", value, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("postreatment >=", value, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentLessThan(String value) {
            addCriterion("postreatment <", value, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentLessThanOrEqualTo(String value) {
            addCriterion("postreatment <=", value, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentLike(String value) {
            addCriterion("postreatment like", value, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentNotLike(String value) {
            addCriterion("postreatment not like", value, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentIn(List<String> values) {
            addCriterion("postreatment in", values, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentNotIn(List<String> values) {
            addCriterion("postreatment not in", values, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentBetween(String value1, String value2) {
            addCriterion("postreatment between", value1, value2, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPostreatmentNotBetween(String value1, String value2) {
            addCriterion("postreatment not between", value1, value2, "postreatment");
            return (Criteria) this;
        }

        public Criteria andPoslevelIsNull() {
            addCriterion("poslevel is null");
            return (Criteria) this;
        }

        public Criteria andPoslevelIsNotNull() {
            addCriterion("poslevel is not null");
            return (Criteria) this;
        }

        public Criteria andPoslevelEqualTo(String value) {
            addCriterion("poslevel =", value, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelNotEqualTo(String value) {
            addCriterion("poslevel <>", value, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelGreaterThan(String value) {
            addCriterion("poslevel >", value, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelGreaterThanOrEqualTo(String value) {
            addCriterion("poslevel >=", value, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelLessThan(String value) {
            addCriterion("poslevel <", value, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelLessThanOrEqualTo(String value) {
            addCriterion("poslevel <=", value, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelLike(String value) {
            addCriterion("poslevel like", value, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelNotLike(String value) {
            addCriterion("poslevel not like", value, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelIn(List<String> values) {
            addCriterion("poslevel in", values, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelNotIn(List<String> values) {
            addCriterion("poslevel not in", values, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelBetween(String value1, String value2) {
            addCriterion("poslevel between", value1, value2, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPoslevelNotBetween(String value1, String value2) {
            addCriterion("poslevel not between", value1, value2, "poslevel");
            return (Criteria) this;
        }

        public Criteria andPosexperienceIsNull() {
            addCriterion("posexperience is null");
            return (Criteria) this;
        }

        public Criteria andPosexperienceIsNotNull() {
            addCriterion("posexperience is not null");
            return (Criteria) this;
        }

        public Criteria andPosexperienceEqualTo(String value) {
            addCriterion("posexperience =", value, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceNotEqualTo(String value) {
            addCriterion("posexperience <>", value, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceGreaterThan(String value) {
            addCriterion("posexperience >", value, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("posexperience >=", value, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceLessThan(String value) {
            addCriterion("posexperience <", value, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceLessThanOrEqualTo(String value) {
            addCriterion("posexperience <=", value, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceLike(String value) {
            addCriterion("posexperience like", value, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceNotLike(String value) {
            addCriterion("posexperience not like", value, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceIn(List<String> values) {
            addCriterion("posexperience in", values, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceNotIn(List<String> values) {
            addCriterion("posexperience not in", values, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceBetween(String value1, String value2) {
            addCriterion("posexperience between", value1, value2, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPosexperienceNotBetween(String value1, String value2) {
            addCriterion("posexperience not between", value1, value2, "posexperience");
            return (Criteria) this;
        }

        public Criteria andPoswelfareIsNull() {
            addCriterion("poswelfare is null");
            return (Criteria) this;
        }

        public Criteria andPoswelfareIsNotNull() {
            addCriterion("poswelfare is not null");
            return (Criteria) this;
        }

        public Criteria andPoswelfareEqualTo(String value) {
            addCriterion("poswelfare =", value, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareNotEqualTo(String value) {
            addCriterion("poswelfare <>", value, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareGreaterThan(String value) {
            addCriterion("poswelfare >", value, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareGreaterThanOrEqualTo(String value) {
            addCriterion("poswelfare >=", value, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareLessThan(String value) {
            addCriterion("poswelfare <", value, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareLessThanOrEqualTo(String value) {
            addCriterion("poswelfare <=", value, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareLike(String value) {
            addCriterion("poswelfare like", value, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareNotLike(String value) {
            addCriterion("poswelfare not like", value, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareIn(List<String> values) {
            addCriterion("poswelfare in", values, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareNotIn(List<String> values) {
            addCriterion("poswelfare not in", values, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareBetween(String value1, String value2) {
            addCriterion("poswelfare between", value1, value2, "poswelfare");
            return (Criteria) this;
        }

        public Criteria andPoswelfareNotBetween(String value1, String value2) {
            addCriterion("poswelfare not between", value1, value2, "poswelfare");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}