package monash.ie.team21.onboard.entity;

import java.util.ArrayList;
import java.util.List;

public class HistoryRubbishCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryRubbishCollectionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightIsNull() {
            addCriterion("Collected_Weight is null");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightIsNotNull() {
            addCriterion("Collected_Weight is not null");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightEqualTo(Integer value) {
            addCriterion("Collected_Weight =", value, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightNotEqualTo(Integer value) {
            addCriterion("Collected_Weight <>", value, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightGreaterThan(Integer value) {
            addCriterion("Collected_Weight >", value, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("Collected_Weight >=", value, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightLessThan(Integer value) {
            addCriterion("Collected_Weight <", value, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightLessThanOrEqualTo(Integer value) {
            addCriterion("Collected_Weight <=", value, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightIn(List<Integer> values) {
            addCriterion("Collected_Weight in", values, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightNotIn(List<Integer> values) {
            addCriterion("Collected_Weight not in", values, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightBetween(Integer value1, Integer value2) {
            addCriterion("Collected_Weight between", value1, value2, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andCollectedWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("Collected_Weight not between", value1, value2, "collectedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightIsNull() {
            addCriterion("Sorted_Weight is null");
            return (Criteria) this;
        }

        public Criteria andSortedWeightIsNotNull() {
            addCriterion("Sorted_Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSortedWeightEqualTo(Integer value) {
            addCriterion("Sorted_Weight =", value, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightNotEqualTo(Integer value) {
            addCriterion("Sorted_Weight <>", value, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightGreaterThan(Integer value) {
            addCriterion("Sorted_Weight >", value, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sorted_Weight >=", value, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightLessThan(Integer value) {
            addCriterion("Sorted_Weight <", value, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightLessThanOrEqualTo(Integer value) {
            addCriterion("Sorted_Weight <=", value, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightIn(List<Integer> values) {
            addCriterion("Sorted_Weight in", values, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightNotIn(List<Integer> values) {
            addCriterion("Sorted_Weight not in", values, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightBetween(Integer value1, Integer value2) {
            addCriterion("Sorted_Weight between", value1, value2, "sortedWeight");
            return (Criteria) this;
        }

        public Criteria andSortedWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("Sorted_Weight not between", value1, value2, "sortedWeight");
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