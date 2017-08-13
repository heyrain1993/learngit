package com.hicetech.ucenter.model;

import java.util.ArrayList;
import java.util.List;

public class JPushPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JPushPoExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Long value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Long value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Long value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Long value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Long> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Long> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Long value1, Long value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andJpaliasIsNull() {
            addCriterion("jpalias is null");
            return (Criteria) this;
        }

        public Criteria andJpaliasIsNotNull() {
            addCriterion("jpalias is not null");
            return (Criteria) this;
        }

        public Criteria andJpaliasEqualTo(String value) {
            addCriterion("jpalias =", value, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasNotEqualTo(String value) {
            addCriterion("jpalias <>", value, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasGreaterThan(String value) {
            addCriterion("jpalias >", value, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasGreaterThanOrEqualTo(String value) {
            addCriterion("jpalias >=", value, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasLessThan(String value) {
            addCriterion("jpalias <", value, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasLessThanOrEqualTo(String value) {
            addCriterion("jpalias <=", value, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasLike(String value) {
            addCriterion("jpalias like", value, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasNotLike(String value) {
            addCriterion("jpalias not like", value, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasIn(List<String> values) {
            addCriterion("jpalias in", values, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasNotIn(List<String> values) {
            addCriterion("jpalias not in", values, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasBetween(String value1, String value2) {
            addCriterion("jpalias between", value1, value2, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJpaliasNotBetween(String value1, String value2) {
            addCriterion("jpalias not between", value1, value2, "jpalias");
            return (Criteria) this;
        }

        public Criteria andJptagsIsNull() {
            addCriterion("jptags is null");
            return (Criteria) this;
        }

        public Criteria andJptagsIsNotNull() {
            addCriterion("jptags is not null");
            return (Criteria) this;
        }

        public Criteria andJptagsEqualTo(String value) {
            addCriterion("jptags =", value, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsNotEqualTo(String value) {
            addCriterion("jptags <>", value, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsGreaterThan(String value) {
            addCriterion("jptags >", value, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsGreaterThanOrEqualTo(String value) {
            addCriterion("jptags >=", value, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsLessThan(String value) {
            addCriterion("jptags <", value, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsLessThanOrEqualTo(String value) {
            addCriterion("jptags <=", value, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsLike(String value) {
            addCriterion("jptags like", value, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsNotLike(String value) {
            addCriterion("jptags not like", value, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsIn(List<String> values) {
            addCriterion("jptags in", values, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsNotIn(List<String> values) {
            addCriterion("jptags not in", values, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsBetween(String value1, String value2) {
            addCriterion("jptags between", value1, value2, "jptags");
            return (Criteria) this;
        }

        public Criteria andJptagsNotBetween(String value1, String value2) {
            addCriterion("jptags not between", value1, value2, "jptags");
            return (Criteria) this;
        }

        public Criteria andJpgroupIsNull() {
            addCriterion("jpgroup is null");
            return (Criteria) this;
        }

        public Criteria andJpgroupIsNotNull() {
            addCriterion("jpgroup is not null");
            return (Criteria) this;
        }

        public Criteria andJpgroupEqualTo(String value) {
            addCriterion("jpgroup =", value, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupNotEqualTo(String value) {
            addCriterion("jpgroup <>", value, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupGreaterThan(String value) {
            addCriterion("jpgroup >", value, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupGreaterThanOrEqualTo(String value) {
            addCriterion("jpgroup >=", value, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupLessThan(String value) {
            addCriterion("jpgroup <", value, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupLessThanOrEqualTo(String value) {
            addCriterion("jpgroup <=", value, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupLike(String value) {
            addCriterion("jpgroup like", value, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupNotLike(String value) {
            addCriterion("jpgroup not like", value, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupIn(List<String> values) {
            addCriterion("jpgroup in", values, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupNotIn(List<String> values) {
            addCriterion("jpgroup not in", values, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupBetween(String value1, String value2) {
            addCriterion("jpgroup between", value1, value2, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpgroupNotBetween(String value1, String value2) {
            addCriterion("jpgroup not between", value1, value2, "jpgroup");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidIsNull() {
            addCriterion("jpregistrationId is null");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidIsNotNull() {
            addCriterion("jpregistrationId is not null");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidEqualTo(String value) {
            addCriterion("jpregistrationId =", value, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidNotEqualTo(String value) {
            addCriterion("jpregistrationId <>", value, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidGreaterThan(String value) {
            addCriterion("jpregistrationId >", value, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidGreaterThanOrEqualTo(String value) {
            addCriterion("jpregistrationId >=", value, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidLessThan(String value) {
            addCriterion("jpregistrationId <", value, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidLessThanOrEqualTo(String value) {
            addCriterion("jpregistrationId <=", value, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidLike(String value) {
            addCriterion("jpregistrationId like", value, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidNotLike(String value) {
            addCriterion("jpregistrationId not like", value, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidIn(List<String> values) {
            addCriterion("jpregistrationId in", values, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidNotIn(List<String> values) {
            addCriterion("jpregistrationId not in", values, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidBetween(String value1, String value2) {
            addCriterion("jpregistrationId between", value1, value2, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andJpregistrationidNotBetween(String value1, String value2) {
            addCriterion("jpregistrationId not between", value1, value2, "jpregistrationid");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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