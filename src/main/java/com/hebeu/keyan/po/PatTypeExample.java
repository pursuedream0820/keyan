package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class PatTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatTypeExample() {
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

        public Criteria andPatTypeIdIsNull() {
            addCriterion("pat_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdIsNotNull() {
            addCriterion("pat_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdEqualTo(Integer value) {
            addCriterion("pat_type_id =", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdNotEqualTo(Integer value) {
            addCriterion("pat_type_id <>", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdGreaterThan(Integer value) {
            addCriterion("pat_type_id >", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pat_type_id >=", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdLessThan(Integer value) {
            addCriterion("pat_type_id <", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pat_type_id <=", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdIn(List<Integer> values) {
            addCriterion("pat_type_id in", values, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdNotIn(List<Integer> values) {
            addCriterion("pat_type_id not in", values, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("pat_type_id between", value1, value2, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pat_type_id not between", value1, value2, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameIsNull() {
            addCriterion("pat_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameIsNotNull() {
            addCriterion("pat_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameEqualTo(String value) {
            addCriterion("pat_type_name =", value, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameNotEqualTo(String value) {
            addCriterion("pat_type_name <>", value, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameGreaterThan(String value) {
            addCriterion("pat_type_name >", value, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pat_type_name >=", value, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameLessThan(String value) {
            addCriterion("pat_type_name <", value, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameLessThanOrEqualTo(String value) {
            addCriterion("pat_type_name <=", value, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameLike(String value) {
            addCriterion("pat_type_name like", value, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameNotLike(String value) {
            addCriterion("pat_type_name not like", value, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameIn(List<String> values) {
            addCriterion("pat_type_name in", values, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameNotIn(List<String> values) {
            addCriterion("pat_type_name not in", values, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameBetween(String value1, String value2) {
            addCriterion("pat_type_name between", value1, value2, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andPatTypeNameNotBetween(String value1, String value2) {
            addCriterion("pat_type_name not between", value1, value2, "patTypeName");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("is_effective is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("is_effective is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(Integer value) {
            addCriterion("is_effective =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(Integer value) {
            addCriterion("is_effective <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(Integer value) {
            addCriterion("is_effective >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_effective >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(Integer value) {
            addCriterion("is_effective <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_effective <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<Integer> values) {
            addCriterion("is_effective in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<Integer> values) {
            addCriterion("is_effective not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(Integer value1, Integer value2) {
            addCriterion("is_effective between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_effective not between", value1, value2, "isEffective");
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