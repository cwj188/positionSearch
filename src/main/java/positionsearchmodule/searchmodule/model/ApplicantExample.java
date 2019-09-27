package positionsearchmodule.searchmodule.model;

import java.util.ArrayList;
import java.util.List;

public class ApplicantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicantExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAageIsNull() {
            addCriterion("aage is null");
            return (Criteria) this;
        }

        public Criteria andAageIsNotNull() {
            addCriterion("aage is not null");
            return (Criteria) this;
        }

        public Criteria andAageEqualTo(String value) {
            addCriterion("aage =", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageNotEqualTo(String value) {
            addCriterion("aage <>", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageGreaterThan(String value) {
            addCriterion("aage >", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageGreaterThanOrEqualTo(String value) {
            addCriterion("aage >=", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageLessThan(String value) {
            addCriterion("aage <", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageLessThanOrEqualTo(String value) {
            addCriterion("aage <=", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageLike(String value) {
            addCriterion("aage like", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageNotLike(String value) {
            addCriterion("aage not like", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageIn(List<String> values) {
            addCriterion("aage in", values, "aage");
            return (Criteria) this;
        }

        public Criteria andAageNotIn(List<String> values) {
            addCriterion("aage not in", values, "aage");
            return (Criteria) this;
        }

        public Criteria andAageBetween(String value1, String value2) {
            addCriterion("aage between", value1, value2, "aage");
            return (Criteria) this;
        }

        public Criteria andAageNotBetween(String value1, String value2) {
            addCriterion("aage not between", value1, value2, "aage");
            return (Criteria) this;
        }

        public Criteria andAgenderIsNull() {
            addCriterion("agender is null");
            return (Criteria) this;
        }

        public Criteria andAgenderIsNotNull() {
            addCriterion("agender is not null");
            return (Criteria) this;
        }

        public Criteria andAgenderEqualTo(String value) {
            addCriterion("agender =", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderNotEqualTo(String value) {
            addCriterion("agender <>", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderGreaterThan(String value) {
            addCriterion("agender >", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderGreaterThanOrEqualTo(String value) {
            addCriterion("agender >=", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderLessThan(String value) {
            addCriterion("agender <", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderLessThanOrEqualTo(String value) {
            addCriterion("agender <=", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderLike(String value) {
            addCriterion("agender like", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderNotLike(String value) {
            addCriterion("agender not like", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderIn(List<String> values) {
            addCriterion("agender in", values, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderNotIn(List<String> values) {
            addCriterion("agender not in", values, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderBetween(String value1, String value2) {
            addCriterion("agender between", value1, value2, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderNotBetween(String value1, String value2) {
            addCriterion("agender not between", value1, value2, "agender");
            return (Criteria) this;
        }

        public Criteria andAmarriageIsNull() {
            addCriterion("amarriage is null");
            return (Criteria) this;
        }

        public Criteria andAmarriageIsNotNull() {
            addCriterion("amarriage is not null");
            return (Criteria) this;
        }

        public Criteria andAmarriageEqualTo(String value) {
            addCriterion("amarriage =", value, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageNotEqualTo(String value) {
            addCriterion("amarriage <>", value, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageGreaterThan(String value) {
            addCriterion("amarriage >", value, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageGreaterThanOrEqualTo(String value) {
            addCriterion("amarriage >=", value, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageLessThan(String value) {
            addCriterion("amarriage <", value, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageLessThanOrEqualTo(String value) {
            addCriterion("amarriage <=", value, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageLike(String value) {
            addCriterion("amarriage like", value, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageNotLike(String value) {
            addCriterion("amarriage not like", value, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageIn(List<String> values) {
            addCriterion("amarriage in", values, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageNotIn(List<String> values) {
            addCriterion("amarriage not in", values, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageBetween(String value1, String value2) {
            addCriterion("amarriage between", value1, value2, "amarriage");
            return (Criteria) this;
        }

        public Criteria andAmarriageNotBetween(String value1, String value2) {
            addCriterion("amarriage not between", value1, value2, "amarriage");
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