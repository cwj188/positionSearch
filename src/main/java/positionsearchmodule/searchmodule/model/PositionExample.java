package positionsearchmodule.searchmodule.model;

import java.util.ArrayList;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPinfoIsNull() {
            addCriterion("pinfo is null");
            return (Criteria) this;
        }

        public Criteria andPinfoIsNotNull() {
            addCriterion("pinfo is not null");
            return (Criteria) this;
        }

        public Criteria andPinfoEqualTo(String value) {
            addCriterion("pinfo =", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoNotEqualTo(String value) {
            addCriterion("pinfo <>", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoGreaterThan(String value) {
            addCriterion("pinfo >", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoGreaterThanOrEqualTo(String value) {
            addCriterion("pinfo >=", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoLessThan(String value) {
            addCriterion("pinfo <", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoLessThanOrEqualTo(String value) {
            addCriterion("pinfo <=", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoLike(String value) {
            addCriterion("pinfo like", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoNotLike(String value) {
            addCriterion("pinfo not like", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoIn(List<String> values) {
            addCriterion("pinfo in", values, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoNotIn(List<String> values) {
            addCriterion("pinfo not in", values, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoBetween(String value1, String value2) {
            addCriterion("pinfo between", value1, value2, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoNotBetween(String value1, String value2) {
            addCriterion("pinfo not between", value1, value2, "pinfo");
            return (Criteria) this;
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