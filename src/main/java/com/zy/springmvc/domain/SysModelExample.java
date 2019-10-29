package com.zy.springmvc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysModelExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andModule_nameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModule_nameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModule_nameEqualTo(String value) {
            addCriterion("module_name =", value, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameGreaterThan(String value) {
            addCriterion("module_name >", value, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameLessThan(String value) {
            addCriterion("module_name <", value, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameLike(String value) {
            addCriterion("module_name like", value, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameNotLike(String value) {
            addCriterion("module_name not like", value, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameIn(List<String> values) {
            addCriterion("module_name in", values, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_nameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "module_name");
            return (Criteria) this;
        }

        public Criteria andModule_codeIsNull() {
            addCriterion("module_code is null");
            return (Criteria) this;
        }

        public Criteria andModule_codeIsNotNull() {
            addCriterion("module_code is not null");
            return (Criteria) this;
        }

        public Criteria andModule_codeEqualTo(String value) {
            addCriterion("module_code =", value, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeNotEqualTo(String value) {
            addCriterion("module_code <>", value, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeGreaterThan(String value) {
            addCriterion("module_code >", value, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeGreaterThanOrEqualTo(String value) {
            addCriterion("module_code >=", value, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeLessThan(String value) {
            addCriterion("module_code <", value, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeLessThanOrEqualTo(String value) {
            addCriterion("module_code <=", value, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeLike(String value) {
            addCriterion("module_code like", value, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeNotLike(String value) {
            addCriterion("module_code not like", value, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeIn(List<String> values) {
            addCriterion("module_code in", values, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeNotIn(List<String> values) {
            addCriterion("module_code not in", values, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeBetween(String value1, String value2) {
            addCriterion("module_code between", value1, value2, "module_code");
            return (Criteria) this;
        }

        public Criteria andModule_codeNotBetween(String value1, String value2) {
            addCriterion("module_code not between", value1, value2, "module_code");
            return (Criteria) this;
        }

        public Criteria andParent_moduleIsNull() {
            addCriterion("parent_module is null");
            return (Criteria) this;
        }

        public Criteria andParent_moduleIsNotNull() {
            addCriterion("parent_module is not null");
            return (Criteria) this;
        }

        public Criteria andParent_moduleEqualTo(String value) {
            addCriterion("parent_module =", value, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleNotEqualTo(String value) {
            addCriterion("parent_module <>", value, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleGreaterThan(String value) {
            addCriterion("parent_module >", value, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleGreaterThanOrEqualTo(String value) {
            addCriterion("parent_module >=", value, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleLessThan(String value) {
            addCriterion("parent_module <", value, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleLessThanOrEqualTo(String value) {
            addCriterion("parent_module <=", value, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleLike(String value) {
            addCriterion("parent_module like", value, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleNotLike(String value) {
            addCriterion("parent_module not like", value, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleIn(List<String> values) {
            addCriterion("parent_module in", values, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleNotIn(List<String> values) {
            addCriterion("parent_module not in", values, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleBetween(String value1, String value2) {
            addCriterion("parent_module between", value1, value2, "parent_module");
            return (Criteria) this;
        }

        public Criteria andParent_moduleNotBetween(String value1, String value2) {
            addCriterion("parent_module not between", value1, value2, "parent_module");
            return (Criteria) this;
        }

        public Criteria andModule_typeIsNull() {
            addCriterion("module_type is null");
            return (Criteria) this;
        }

        public Criteria andModule_typeIsNotNull() {
            addCriterion("module_type is not null");
            return (Criteria) this;
        }

        public Criteria andModule_typeEqualTo(String value) {
            addCriterion("module_type =", value, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeNotEqualTo(String value) {
            addCriterion("module_type <>", value, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeGreaterThan(String value) {
            addCriterion("module_type >", value, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeGreaterThanOrEqualTo(String value) {
            addCriterion("module_type >=", value, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeLessThan(String value) {
            addCriterion("module_type <", value, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeLessThanOrEqualTo(String value) {
            addCriterion("module_type <=", value, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeLike(String value) {
            addCriterion("module_type like", value, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeNotLike(String value) {
            addCriterion("module_type not like", value, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeIn(List<String> values) {
            addCriterion("module_type in", values, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeNotIn(List<String> values) {
            addCriterion("module_type not in", values, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeBetween(String value1, String value2) {
            addCriterion("module_type between", value1, value2, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_typeNotBetween(String value1, String value2) {
            addCriterion("module_type not between", value1, value2, "module_type");
            return (Criteria) this;
        }

        public Criteria andModule_urlIsNull() {
            addCriterion("module_url is null");
            return (Criteria) this;
        }

        public Criteria andModule_urlIsNotNull() {
            addCriterion("module_url is not null");
            return (Criteria) this;
        }

        public Criteria andModule_urlEqualTo(String value) {
            addCriterion("module_url =", value, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlNotEqualTo(String value) {
            addCriterion("module_url <>", value, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlGreaterThan(String value) {
            addCriterion("module_url >", value, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlGreaterThanOrEqualTo(String value) {
            addCriterion("module_url >=", value, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlLessThan(String value) {
            addCriterion("module_url <", value, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlLessThanOrEqualTo(String value) {
            addCriterion("module_url <=", value, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlLike(String value) {
            addCriterion("module_url like", value, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlNotLike(String value) {
            addCriterion("module_url not like", value, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlIn(List<String> values) {
            addCriterion("module_url in", values, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlNotIn(List<String> values) {
            addCriterion("module_url not in", values, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlBetween(String value1, String value2) {
            addCriterion("module_url between", value1, value2, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_urlNotBetween(String value1, String value2) {
            addCriterion("module_url not between", value1, value2, "module_url");
            return (Criteria) this;
        }

        public Criteria andModule_iconIsNull() {
            addCriterion("module_icon is null");
            return (Criteria) this;
        }

        public Criteria andModule_iconIsNotNull() {
            addCriterion("module_icon is not null");
            return (Criteria) this;
        }

        public Criteria andModule_iconEqualTo(String value) {
            addCriterion("module_icon =", value, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconNotEqualTo(String value) {
            addCriterion("module_icon <>", value, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconGreaterThan(String value) {
            addCriterion("module_icon >", value, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconGreaterThanOrEqualTo(String value) {
            addCriterion("module_icon >=", value, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconLessThan(String value) {
            addCriterion("module_icon <", value, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconLessThanOrEqualTo(String value) {
            addCriterion("module_icon <=", value, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconLike(String value) {
            addCriterion("module_icon like", value, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconNotLike(String value) {
            addCriterion("module_icon not like", value, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconIn(List<String> values) {
            addCriterion("module_icon in", values, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconNotIn(List<String> values) {
            addCriterion("module_icon not in", values, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconBetween(String value1, String value2) {
            addCriterion("module_icon between", value1, value2, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_iconNotBetween(String value1, String value2) {
            addCriterion("module_icon not between", value1, value2, "module_icon");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descIsNull() {
            addCriterion("module_eng_desc is null");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descIsNotNull() {
            addCriterion("module_eng_desc is not null");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descEqualTo(String value) {
            addCriterion("module_eng_desc =", value, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descNotEqualTo(String value) {
            addCriterion("module_eng_desc <>", value, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descGreaterThan(String value) {
            addCriterion("module_eng_desc >", value, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descGreaterThanOrEqualTo(String value) {
            addCriterion("module_eng_desc >=", value, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descLessThan(String value) {
            addCriterion("module_eng_desc <", value, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descLessThanOrEqualTo(String value) {
            addCriterion("module_eng_desc <=", value, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descLike(String value) {
            addCriterion("module_eng_desc like", value, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descNotLike(String value) {
            addCriterion("module_eng_desc not like", value, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descIn(List<String> values) {
            addCriterion("module_eng_desc in", values, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descNotIn(List<String> values) {
            addCriterion("module_eng_desc not in", values, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descBetween(String value1, String value2) {
            addCriterion("module_eng_desc between", value1, value2, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andModule_eng_descNotBetween(String value1, String value2) {
            addCriterion("module_eng_desc not between", value1, value2, "module_eng_desc");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowIsNull() {
            addCriterion("is_run_work_flow is null");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowIsNotNull() {
            addCriterion("is_run_work_flow is not null");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowEqualTo(String value) {
            addCriterion("is_run_work_flow =", value, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowNotEqualTo(String value) {
            addCriterion("is_run_work_flow <>", value, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowGreaterThan(String value) {
            addCriterion("is_run_work_flow >", value, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowGreaterThanOrEqualTo(String value) {
            addCriterion("is_run_work_flow >=", value, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowLessThan(String value) {
            addCriterion("is_run_work_flow <", value, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowLessThanOrEqualTo(String value) {
            addCriterion("is_run_work_flow <=", value, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowLike(String value) {
            addCriterion("is_run_work_flow like", value, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowNotLike(String value) {
            addCriterion("is_run_work_flow not like", value, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowIn(List<String> values) {
            addCriterion("is_run_work_flow in", values, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowNotIn(List<String> values) {
            addCriterion("is_run_work_flow not in", values, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowBetween(String value1, String value2) {
            addCriterion("is_run_work_flow between", value1, value2, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_run_work_flowNotBetween(String value1, String value2) {
            addCriterion("is_run_work_flow not between", value1, value2, "is_run_work_flow");
            return (Criteria) this;
        }

        public Criteria andIs_modifyIsNull() {
            addCriterion("is_modify is null");
            return (Criteria) this;
        }

        public Criteria andIs_modifyIsNotNull() {
            addCriterion("is_modify is not null");
            return (Criteria) this;
        }

        public Criteria andIs_modifyEqualTo(String value) {
            addCriterion("is_modify =", value, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyNotEqualTo(String value) {
            addCriterion("is_modify <>", value, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyGreaterThan(String value) {
            addCriterion("is_modify >", value, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyGreaterThanOrEqualTo(String value) {
            addCriterion("is_modify >=", value, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyLessThan(String value) {
            addCriterion("is_modify <", value, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyLessThanOrEqualTo(String value) {
            addCriterion("is_modify <=", value, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyLike(String value) {
            addCriterion("is_modify like", value, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyNotLike(String value) {
            addCriterion("is_modify not like", value, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyIn(List<String> values) {
            addCriterion("is_modify in", values, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyNotIn(List<String> values) {
            addCriterion("is_modify not in", values, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyBetween(String value1, String value2) {
            addCriterion("is_modify between", value1, value2, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_modifyNotBetween(String value1, String value2) {
            addCriterion("is_modify not between", value1, value2, "is_modify");
            return (Criteria) this;
        }

        public Criteria andIs_okIsNull() {
            addCriterion("is_ok is null");
            return (Criteria) this;
        }

        public Criteria andIs_okIsNotNull() {
            addCriterion("is_ok is not null");
            return (Criteria) this;
        }

        public Criteria andIs_okEqualTo(String value) {
            addCriterion("is_ok =", value, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okNotEqualTo(String value) {
            addCriterion("is_ok <>", value, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okGreaterThan(String value) {
            addCriterion("is_ok >", value, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okGreaterThanOrEqualTo(String value) {
            addCriterion("is_ok >=", value, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okLessThan(String value) {
            addCriterion("is_ok <", value, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okLessThanOrEqualTo(String value) {
            addCriterion("is_ok <=", value, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okLike(String value) {
            addCriterion("is_ok like", value, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okNotLike(String value) {
            addCriterion("is_ok not like", value, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okIn(List<String> values) {
            addCriterion("is_ok in", values, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okNotIn(List<String> values) {
            addCriterion("is_ok not in", values, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okBetween(String value1, String value2) {
            addCriterion("is_ok between", value1, value2, "is_ok");
            return (Criteria) this;
        }

        public Criteria andIs_okNotBetween(String value1, String value2) {
            addCriterion("is_ok not between", value1, value2, "is_ok");
            return (Criteria) this;
        }

        public Criteria andOrder_numIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrder_numIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_numEqualTo(Integer value) {
            addCriterion("order_num =", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numGreaterThan(Integer value) {
            addCriterion("order_num >", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLessThan(Integer value) {
            addCriterion("order_num <", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numIn(List<Integer> values) {
            addCriterion("order_num in", values, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "order_num");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontIsNull() {
            addCriterion("is_display_front is null");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontIsNotNull() {
            addCriterion("is_display_front is not null");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontEqualTo(String value) {
            addCriterion("is_display_front =", value, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontNotEqualTo(String value) {
            addCriterion("is_display_front <>", value, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontGreaterThan(String value) {
            addCriterion("is_display_front >", value, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontGreaterThanOrEqualTo(String value) {
            addCriterion("is_display_front >=", value, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontLessThan(String value) {
            addCriterion("is_display_front <", value, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontLessThanOrEqualTo(String value) {
            addCriterion("is_display_front <=", value, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontLike(String value) {
            addCriterion("is_display_front like", value, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontNotLike(String value) {
            addCriterion("is_display_front not like", value, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontIn(List<String> values) {
            addCriterion("is_display_front in", values, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontNotIn(List<String> values) {
            addCriterion("is_display_front not in", values, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontBetween(String value1, String value2) {
            addCriterion("is_display_front between", value1, value2, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_display_frontNotBetween(String value1, String value2) {
            addCriterion("is_display_front not between", value1, value2, "is_display_front");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuIsNull() {
            addCriterion("is_top_menu is null");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuIsNotNull() {
            addCriterion("is_top_menu is not null");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuEqualTo(String value) {
            addCriterion("is_top_menu =", value, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuNotEqualTo(String value) {
            addCriterion("is_top_menu <>", value, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuGreaterThan(String value) {
            addCriterion("is_top_menu >", value, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuGreaterThanOrEqualTo(String value) {
            addCriterion("is_top_menu >=", value, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuLessThan(String value) {
            addCriterion("is_top_menu <", value, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuLessThanOrEqualTo(String value) {
            addCriterion("is_top_menu <=", value, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuLike(String value) {
            addCriterion("is_top_menu like", value, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuNotLike(String value) {
            addCriterion("is_top_menu not like", value, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuIn(List<String> values) {
            addCriterion("is_top_menu in", values, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuNotIn(List<String> values) {
            addCriterion("is_top_menu not in", values, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuBetween(String value1, String value2) {
            addCriterion("is_top_menu between", value1, value2, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_top_menuNotBetween(String value1, String value2) {
            addCriterion("is_top_menu not between", value1, value2, "is_top_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuIsNull() {
            addCriterion("is_side_menu is null");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuIsNotNull() {
            addCriterion("is_side_menu is not null");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuEqualTo(String value) {
            addCriterion("is_side_menu =", value, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuNotEqualTo(String value) {
            addCriterion("is_side_menu <>", value, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuGreaterThan(String value) {
            addCriterion("is_side_menu >", value, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuGreaterThanOrEqualTo(String value) {
            addCriterion("is_side_menu >=", value, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuLessThan(String value) {
            addCriterion("is_side_menu <", value, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuLessThanOrEqualTo(String value) {
            addCriterion("is_side_menu <=", value, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuLike(String value) {
            addCriterion("is_side_menu like", value, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuNotLike(String value) {
            addCriterion("is_side_menu not like", value, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuIn(List<String> values) {
            addCriterion("is_side_menu in", values, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuNotIn(List<String> values) {
            addCriterion("is_side_menu not in", values, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuBetween(String value1, String value2) {
            addCriterion("is_side_menu between", value1, value2, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andIs_side_menuNotBetween(String value1, String value2) {
            addCriterion("is_side_menu not between", value1, value2, "is_side_menu");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_timeEqualTo(Date value) {
            addCriterion("created_time =", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeGreaterThan(Date value) {
            addCriterion("created_time >", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeLessThan(Date value) {
            addCriterion("created_time <", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIn(List<Date> values) {
            addCriterion("created_time in", values, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "created_time");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModified_timeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModified_timeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModified_timeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeLessThan(Date value) {
            addCriterion("modified_time <", value, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modified_time");
            return (Criteria) this;
        }

        public Criteria andModified_timeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modified_time");
            return (Criteria) this;
        }

        public Criteria andExt_field_1IsNull() {
            addCriterion("ext_field_1 is null");
            return (Criteria) this;
        }

        public Criteria andExt_field_1IsNotNull() {
            addCriterion("ext_field_1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt_field_1EqualTo(String value) {
            addCriterion("ext_field_1 =", value, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1NotEqualTo(String value) {
            addCriterion("ext_field_1 <>", value, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1GreaterThan(String value) {
            addCriterion("ext_field_1 >", value, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1GreaterThanOrEqualTo(String value) {
            addCriterion("ext_field_1 >=", value, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1LessThan(String value) {
            addCriterion("ext_field_1 <", value, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1LessThanOrEqualTo(String value) {
            addCriterion("ext_field_1 <=", value, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1Like(String value) {
            addCriterion("ext_field_1 like", value, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1NotLike(String value) {
            addCriterion("ext_field_1 not like", value, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1In(List<String> values) {
            addCriterion("ext_field_1 in", values, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1NotIn(List<String> values) {
            addCriterion("ext_field_1 not in", values, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1Between(String value1, String value2) {
            addCriterion("ext_field_1 between", value1, value2, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_1NotBetween(String value1, String value2) {
            addCriterion("ext_field_1 not between", value1, value2, "ext_field_1");
            return (Criteria) this;
        }

        public Criteria andExt_field_2IsNull() {
            addCriterion("ext_field_2 is null");
            return (Criteria) this;
        }

        public Criteria andExt_field_2IsNotNull() {
            addCriterion("ext_field_2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt_field_2EqualTo(String value) {
            addCriterion("ext_field_2 =", value, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2NotEqualTo(String value) {
            addCriterion("ext_field_2 <>", value, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2GreaterThan(String value) {
            addCriterion("ext_field_2 >", value, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2GreaterThanOrEqualTo(String value) {
            addCriterion("ext_field_2 >=", value, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2LessThan(String value) {
            addCriterion("ext_field_2 <", value, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2LessThanOrEqualTo(String value) {
            addCriterion("ext_field_2 <=", value, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2Like(String value) {
            addCriterion("ext_field_2 like", value, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2NotLike(String value) {
            addCriterion("ext_field_2 not like", value, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2In(List<String> values) {
            addCriterion("ext_field_2 in", values, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2NotIn(List<String> values) {
            addCriterion("ext_field_2 not in", values, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2Between(String value1, String value2) {
            addCriterion("ext_field_2 between", value1, value2, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_2NotBetween(String value1, String value2) {
            addCriterion("ext_field_2 not between", value1, value2, "ext_field_2");
            return (Criteria) this;
        }

        public Criteria andExt_field_3IsNull() {
            addCriterion("ext_field_3 is null");
            return (Criteria) this;
        }

        public Criteria andExt_field_3IsNotNull() {
            addCriterion("ext_field_3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt_field_3EqualTo(String value) {
            addCriterion("ext_field_3 =", value, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3NotEqualTo(String value) {
            addCriterion("ext_field_3 <>", value, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3GreaterThan(String value) {
            addCriterion("ext_field_3 >", value, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3GreaterThanOrEqualTo(String value) {
            addCriterion("ext_field_3 >=", value, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3LessThan(String value) {
            addCriterion("ext_field_3 <", value, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3LessThanOrEqualTo(String value) {
            addCriterion("ext_field_3 <=", value, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3Like(String value) {
            addCriterion("ext_field_3 like", value, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3NotLike(String value) {
            addCriterion("ext_field_3 not like", value, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3In(List<String> values) {
            addCriterion("ext_field_3 in", values, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3NotIn(List<String> values) {
            addCriterion("ext_field_3 not in", values, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3Between(String value1, String value2) {
            addCriterion("ext_field_3 between", value1, value2, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_3NotBetween(String value1, String value2) {
            addCriterion("ext_field_3 not between", value1, value2, "ext_field_3");
            return (Criteria) this;
        }

        public Criteria andExt_field_4IsNull() {
            addCriterion("ext_field_4 is null");
            return (Criteria) this;
        }

        public Criteria andExt_field_4IsNotNull() {
            addCriterion("ext_field_4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt_field_4EqualTo(String value) {
            addCriterion("ext_field_4 =", value, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4NotEqualTo(String value) {
            addCriterion("ext_field_4 <>", value, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4GreaterThan(String value) {
            addCriterion("ext_field_4 >", value, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4GreaterThanOrEqualTo(String value) {
            addCriterion("ext_field_4 >=", value, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4LessThan(String value) {
            addCriterion("ext_field_4 <", value, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4LessThanOrEqualTo(String value) {
            addCriterion("ext_field_4 <=", value, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4Like(String value) {
            addCriterion("ext_field_4 like", value, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4NotLike(String value) {
            addCriterion("ext_field_4 not like", value, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4In(List<String> values) {
            addCriterion("ext_field_4 in", values, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4NotIn(List<String> values) {
            addCriterion("ext_field_4 not in", values, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4Between(String value1, String value2) {
            addCriterion("ext_field_4 between", value1, value2, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_4NotBetween(String value1, String value2) {
            addCriterion("ext_field_4 not between", value1, value2, "ext_field_4");
            return (Criteria) this;
        }

        public Criteria andExt_field_5IsNull() {
            addCriterion("ext_field_5 is null");
            return (Criteria) this;
        }

        public Criteria andExt_field_5IsNotNull() {
            addCriterion("ext_field_5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt_field_5EqualTo(String value) {
            addCriterion("ext_field_5 =", value, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5NotEqualTo(String value) {
            addCriterion("ext_field_5 <>", value, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5GreaterThan(String value) {
            addCriterion("ext_field_5 >", value, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5GreaterThanOrEqualTo(String value) {
            addCriterion("ext_field_5 >=", value, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5LessThan(String value) {
            addCriterion("ext_field_5 <", value, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5LessThanOrEqualTo(String value) {
            addCriterion("ext_field_5 <=", value, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5Like(String value) {
            addCriterion("ext_field_5 like", value, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5NotLike(String value) {
            addCriterion("ext_field_5 not like", value, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5In(List<String> values) {
            addCriterion("ext_field_5 in", values, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5NotIn(List<String> values) {
            addCriterion("ext_field_5 not in", values, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5Between(String value1, String value2) {
            addCriterion("ext_field_5 between", value1, value2, "ext_field_5");
            return (Criteria) this;
        }

        public Criteria andExt_field_5NotBetween(String value1, String value2) {
            addCriterion("ext_field_5 not between", value1, value2, "ext_field_5");
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