package monash.ie.team21.onboard.entity;

import java.util.ArrayList;
import java.util.List;

public class WasteClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WasteClassificationExample() {
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

        public Criteria andWasteIdIsNull() {
            addCriterion("waste_id is null");
            return (Criteria) this;
        }

        public Criteria andWasteIdIsNotNull() {
            addCriterion("waste_id is not null");
            return (Criteria) this;
        }

        public Criteria andWasteIdEqualTo(Integer value) {
            addCriterion("waste_id =", value, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdNotEqualTo(Integer value) {
            addCriterion("waste_id <>", value, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdGreaterThan(Integer value) {
            addCriterion("waste_id >", value, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waste_id >=", value, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdLessThan(Integer value) {
            addCriterion("waste_id <", value, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdLessThanOrEqualTo(Integer value) {
            addCriterion("waste_id <=", value, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdIn(List<Integer> values) {
            addCriterion("waste_id in", values, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdNotIn(List<Integer> values) {
            addCriterion("waste_id not in", values, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdBetween(Integer value1, Integer value2) {
            addCriterion("waste_id between", value1, value2, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("waste_id not between", value1, value2, "wasteId");
            return (Criteria) this;
        }

        public Criteria andWasteNameIsNull() {
            addCriterion("waste_name is null");
            return (Criteria) this;
        }

        public Criteria andWasteNameIsNotNull() {
            addCriterion("waste_name is not null");
            return (Criteria) this;
        }

        public Criteria andWasteNameEqualTo(String value) {
            addCriterion("waste_name =", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameNotEqualTo(String value) {
            addCriterion("waste_name <>", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameGreaterThan(String value) {
            addCriterion("waste_name >", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameGreaterThanOrEqualTo(String value) {
            addCriterion("waste_name >=", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameLessThan(String value) {
            addCriterion("waste_name <", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameLessThanOrEqualTo(String value) {
            addCriterion("waste_name <=", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameLike(String value) {
            addCriterion("waste_name like", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameNotLike(String value) {
            addCriterion("waste_name not like", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameIn(List<String> values) {
            addCriterion("waste_name in", values, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameNotIn(List<String> values) {
            addCriterion("waste_name not in", values, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameBetween(String value1, String value2) {
            addCriterion("waste_name between", value1, value2, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameNotBetween(String value1, String value2) {
            addCriterion("waste_name not between", value1, value2, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteTypeIsNull() {
            addCriterion("waste_type is null");
            return (Criteria) this;
        }

        public Criteria andWasteTypeIsNotNull() {
            addCriterion("waste_type is not null");
            return (Criteria) this;
        }

        public Criteria andWasteTypeEqualTo(String value) {
            addCriterion("waste_type =", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeNotEqualTo(String value) {
            addCriterion("waste_type <>", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeGreaterThan(String value) {
            addCriterion("waste_type >", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("waste_type >=", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeLessThan(String value) {
            addCriterion("waste_type <", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeLessThanOrEqualTo(String value) {
            addCriterion("waste_type <=", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeLike(String value) {
            addCriterion("waste_type like", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeNotLike(String value) {
            addCriterion("waste_type not like", value, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeIn(List<String> values) {
            addCriterion("waste_type in", values, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeNotIn(List<String> values) {
            addCriterion("waste_type not in", values, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeBetween(String value1, String value2) {
            addCriterion("waste_type between", value1, value2, "wasteType");
            return (Criteria) this;
        }

        public Criteria andWasteTypeNotBetween(String value1, String value2) {
            addCriterion("waste_type not between", value1, value2, "wasteType");
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