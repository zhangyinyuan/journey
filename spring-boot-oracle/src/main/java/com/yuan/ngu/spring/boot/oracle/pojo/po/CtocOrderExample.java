package com.yuan.ngu.spring.boot.oracle.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtocOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtocOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(BigDecimal value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(BigDecimal value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(BigDecimal value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<BigDecimal> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andEscOrderidIsNull() {
            addCriterion("ESC_ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andEscOrderidIsNotNull() {
            addCriterion("ESC_ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andEscOrderidEqualTo(String value) {
            addCriterion("ESC_ORDERID =", value, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidNotEqualTo(String value) {
            addCriterion("ESC_ORDERID <>", value, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidGreaterThan(String value) {
            addCriterion("ESC_ORDERID >", value, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ESC_ORDERID >=", value, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidLessThan(String value) {
            addCriterion("ESC_ORDERID <", value, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidLessThanOrEqualTo(String value) {
            addCriterion("ESC_ORDERID <=", value, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidLike(String value) {
            addCriterion("ESC_ORDERID like", value, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidNotLike(String value) {
            addCriterion("ESC_ORDERID not like", value, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidIn(List<String> values) {
            addCriterion("ESC_ORDERID in", values, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidNotIn(List<String> values) {
            addCriterion("ESC_ORDERID not in", values, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidBetween(String value1, String value2) {
            addCriterion("ESC_ORDERID between", value1, value2, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andEscOrderidNotBetween(String value1, String value2) {
            addCriterion("ESC_ORDERID not between", value1, value2, "escOrderid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidIsNull() {
            addCriterion("SELLER_ONLYID is null");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidIsNotNull() {
            addCriterion("SELLER_ONLYID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidEqualTo(BigDecimal value) {
            addCriterion("SELLER_ONLYID =", value, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidNotEqualTo(BigDecimal value) {
            addCriterion("SELLER_ONLYID <>", value, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidGreaterThan(BigDecimal value) {
            addCriterion("SELLER_ONLYID >", value, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLER_ONLYID >=", value, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidLessThan(BigDecimal value) {
            addCriterion("SELLER_ONLYID <", value, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLER_ONLYID <=", value, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidIn(List<BigDecimal> values) {
            addCriterion("SELLER_ONLYID in", values, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidNotIn(List<BigDecimal> values) {
            addCriterion("SELLER_ONLYID not in", values, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLER_ONLYID between", value1, value2, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerOnlyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLER_ONLYID not between", value1, value2, "sellerOnlyid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidIsNull() {
            addCriterion("SELLER_LOGINID is null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidIsNotNull() {
            addCriterion("SELLER_LOGINID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidEqualTo(String value) {
            addCriterion("SELLER_LOGINID =", value, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidNotEqualTo(String value) {
            addCriterion("SELLER_LOGINID <>", value, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidGreaterThan(String value) {
            addCriterion("SELLER_LOGINID >", value, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_LOGINID >=", value, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidLessThan(String value) {
            addCriterion("SELLER_LOGINID <", value, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidLessThanOrEqualTo(String value) {
            addCriterion("SELLER_LOGINID <=", value, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidLike(String value) {
            addCriterion("SELLER_LOGINID like", value, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidNotLike(String value) {
            addCriterion("SELLER_LOGINID not like", value, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidIn(List<String> values) {
            addCriterion("SELLER_LOGINID in", values, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidNotIn(List<String> values) {
            addCriterion("SELLER_LOGINID not in", values, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidBetween(String value1, String value2) {
            addCriterion("SELLER_LOGINID between", value1, value2, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andSellerLoginidNotBetween(String value1, String value2) {
            addCriterion("SELLER_LOGINID not between", value1, value2, "sellerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidIsNull() {
            addCriterion("BUYER_ONLYID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidIsNotNull() {
            addCriterion("BUYER_ONLYID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidEqualTo(BigDecimal value) {
            addCriterion("BUYER_ONLYID =", value, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidNotEqualTo(BigDecimal value) {
            addCriterion("BUYER_ONLYID <>", value, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidGreaterThan(BigDecimal value) {
            addCriterion("BUYER_ONLYID >", value, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUYER_ONLYID >=", value, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidLessThan(BigDecimal value) {
            addCriterion("BUYER_ONLYID <", value, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUYER_ONLYID <=", value, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidIn(List<BigDecimal> values) {
            addCriterion("BUYER_ONLYID in", values, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidNotIn(List<BigDecimal> values) {
            addCriterion("BUYER_ONLYID not in", values, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUYER_ONLYID between", value1, value2, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerOnlyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUYER_ONLYID not between", value1, value2, "buyerOnlyid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidIsNull() {
            addCriterion("BUYER_LOGINID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidIsNotNull() {
            addCriterion("BUYER_LOGINID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidEqualTo(String value) {
            addCriterion("BUYER_LOGINID =", value, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidNotEqualTo(String value) {
            addCriterion("BUYER_LOGINID <>", value, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidGreaterThan(String value) {
            addCriterion("BUYER_LOGINID >", value, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_LOGINID >=", value, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidLessThan(String value) {
            addCriterion("BUYER_LOGINID <", value, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidLessThanOrEqualTo(String value) {
            addCriterion("BUYER_LOGINID <=", value, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidLike(String value) {
            addCriterion("BUYER_LOGINID like", value, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidNotLike(String value) {
            addCriterion("BUYER_LOGINID not like", value, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidIn(List<String> values) {
            addCriterion("BUYER_LOGINID in", values, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidNotIn(List<String> values) {
            addCriterion("BUYER_LOGINID not in", values, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidBetween(String value1, String value2) {
            addCriterion("BUYER_LOGINID between", value1, value2, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginidNotBetween(String value1, String value2) {
            addCriterion("BUYER_LOGINID not between", value1, value2, "buyerLoginid");
            return (Criteria) this;
        }

        public Criteria andProductSerialIsNull() {
            addCriterion("PRODUCT_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andProductSerialIsNotNull() {
            addCriterion("PRODUCT_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andProductSerialEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SERIAL =", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SERIAL <>", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_SERIAL >", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SERIAL >=", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialLessThan(BigDecimal value) {
            addCriterion("PRODUCT_SERIAL <", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SERIAL <=", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_SERIAL in", values, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_SERIAL not in", values, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_SERIAL between", value1, value2, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_SERIAL not between", value1, value2, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(BigDecimal value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductVersionIsNull() {
            addCriterion("PRODUCT_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andProductVersionIsNotNull() {
            addCriterion("PRODUCT_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andProductVersionEqualTo(Long value) {
            addCriterion("PRODUCT_VERSION =", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotEqualTo(Long value) {
            addCriterion("PRODUCT_VERSION <>", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionGreaterThan(Long value) {
            addCriterion("PRODUCT_VERSION >", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_VERSION >=", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionLessThan(Long value) {
            addCriterion("PRODUCT_VERSION <", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_VERSION <=", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionIn(List<Long> values) {
            addCriterion("PRODUCT_VERSION in", values, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotIn(List<Long> values) {
            addCriterion("PRODUCT_VERSION not in", values, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_VERSION between", value1, value2, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_VERSION not between", value1, value2, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductClassidIsNull() {
            addCriterion("PRODUCT_CLASSID is null");
            return (Criteria) this;
        }

        public Criteria andProductClassidIsNotNull() {
            addCriterion("PRODUCT_CLASSID is not null");
            return (Criteria) this;
        }

        public Criteria andProductClassidEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_CLASSID =", value, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_CLASSID <>", value, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_CLASSID >", value, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_CLASSID >=", value, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidLessThan(BigDecimal value) {
            addCriterion("PRODUCT_CLASSID <", value, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_CLASSID <=", value, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_CLASSID in", values, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_CLASSID not in", values, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_CLASSID between", value1, value2, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductClassidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_CLASSID not between", value1, value2, "productClassid");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNull() {
            addCriterion("PRODUCT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNotNull() {
            addCriterion("PRODUCT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andProductInfoEqualTo(String value) {
            addCriterion("PRODUCT_INFO =", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotEqualTo(String value) {
            addCriterion("PRODUCT_INFO <>", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThan(String value) {
            addCriterion("PRODUCT_INFO >", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_INFO >=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThan(String value) {
            addCriterion("PRODUCT_INFO <", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_INFO <=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLike(String value) {
            addCriterion("PRODUCT_INFO like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotLike(String value) {
            addCriterion("PRODUCT_INFO not like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoIn(List<String> values) {
            addCriterion("PRODUCT_INFO in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotIn(List<String> values) {
            addCriterion("PRODUCT_INFO not in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoBetween(String value1, String value2) {
            addCriterion("PRODUCT_INFO between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_INFO not between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNull() {
            addCriterion("PRODUCT_PIC is null");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNotNull() {
            addCriterion("PRODUCT_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicEqualTo(String value) {
            addCriterion("PRODUCT_PIC =", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotEqualTo(String value) {
            addCriterion("PRODUCT_PIC <>", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThan(String value) {
            addCriterion("PRODUCT_PIC >", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PIC >=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThan(String value) {
            addCriterion("PRODUCT_PIC <", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PIC <=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLike(String value) {
            addCriterion("PRODUCT_PIC like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotLike(String value) {
            addCriterion("PRODUCT_PIC not like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicIn(List<String> values) {
            addCriterion("PRODUCT_PIC in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotIn(List<String> values) {
            addCriterion("PRODUCT_PIC not in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicBetween(String value1, String value2) {
            addCriterion("PRODUCT_PIC between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PIC not between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("PRODUCT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("PRODUCT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_PRICE >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PRICE in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PRICE not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PRICE between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PRICE not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("PRODUCT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("PRODUCT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Long value) {
            addCriterion("PRODUCT_NUM =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Long value) {
            addCriterion("PRODUCT_NUM <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Long value) {
            addCriterion("PRODUCT_NUM >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_NUM >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Long value) {
            addCriterion("PRODUCT_NUM <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_NUM <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Long> values) {
            addCriterion("PRODUCT_NUM in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Long> values) {
            addCriterion("PRODUCT_NUM not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_NUM between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_NUM not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNull() {
            addCriterion("PRODUCT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNotNull() {
            addCriterion("PRODUCT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProductAmountEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT =", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT <>", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT >", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT >=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThan(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT <", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT <=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_AMOUNT in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_AMOUNT not in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_AMOUNT between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_AMOUNT not between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusIsNull() {
            addCriterion("PRODUCT_POINT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusIsNotNull() {
            addCriterion("PRODUCT_POINT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusEqualTo(Short value) {
            addCriterion("PRODUCT_POINT_STATUS =", value, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusNotEqualTo(Short value) {
            addCriterion("PRODUCT_POINT_STATUS <>", value, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusGreaterThan(Short value) {
            addCriterion("PRODUCT_POINT_STATUS >", value, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("PRODUCT_POINT_STATUS >=", value, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusLessThan(Short value) {
            addCriterion("PRODUCT_POINT_STATUS <", value, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusLessThanOrEqualTo(Short value) {
            addCriterion("PRODUCT_POINT_STATUS <=", value, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusIn(List<Short> values) {
            addCriterion("PRODUCT_POINT_STATUS in", values, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusNotIn(List<Short> values) {
            addCriterion("PRODUCT_POINT_STATUS not in", values, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusBetween(Short value1, Short value2) {
            addCriterion("PRODUCT_POINT_STATUS between", value1, value2, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductPointStatusNotBetween(Short value1, Short value2) {
            addCriterion("PRODUCT_POINT_STATUS not between", value1, value2, "productPointStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusIsNull() {
            addCriterion("PRODUCT_COUPON_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusIsNotNull() {
            addCriterion("PRODUCT_COUPON_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusEqualTo(Short value) {
            addCriterion("PRODUCT_COUPON_STATUS =", value, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusNotEqualTo(Short value) {
            addCriterion("PRODUCT_COUPON_STATUS <>", value, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusGreaterThan(Short value) {
            addCriterion("PRODUCT_COUPON_STATUS >", value, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("PRODUCT_COUPON_STATUS >=", value, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusLessThan(Short value) {
            addCriterion("PRODUCT_COUPON_STATUS <", value, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusLessThanOrEqualTo(Short value) {
            addCriterion("PRODUCT_COUPON_STATUS <=", value, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusIn(List<Short> values) {
            addCriterion("PRODUCT_COUPON_STATUS in", values, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusNotIn(List<Short> values) {
            addCriterion("PRODUCT_COUPON_STATUS not in", values, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusBetween(Short value1, Short value2) {
            addCriterion("PRODUCT_COUPON_STATUS between", value1, value2, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andProductCouponStatusNotBetween(Short value1, Short value2) {
            addCriterion("PRODUCT_COUPON_STATUS not between", value1, value2, "productCouponStatus");
            return (Criteria) this;
        }

        public Criteria andTradeDescIsNull() {
            addCriterion("TRADE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTradeDescIsNotNull() {
            addCriterion("TRADE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDescEqualTo(String value) {
            addCriterion("TRADE_DESC =", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotEqualTo(String value) {
            addCriterion("TRADE_DESC <>", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescGreaterThan(String value) {
            addCriterion("TRADE_DESC >", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_DESC >=", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLessThan(String value) {
            addCriterion("TRADE_DESC <", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLessThanOrEqualTo(String value) {
            addCriterion("TRADE_DESC <=", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLike(String value) {
            addCriterion("TRADE_DESC like", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotLike(String value) {
            addCriterion("TRADE_DESC not like", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescIn(List<String> values) {
            addCriterion("TRADE_DESC in", values, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotIn(List<String> values) {
            addCriterion("TRADE_DESC not in", values, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescBetween(String value1, String value2) {
            addCriterion("TRADE_DESC between", value1, value2, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotBetween(String value1, String value2) {
            addCriterion("TRADE_DESC not between", value1, value2, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueIsNull() {
            addCriterion("TRANS_TYPE1_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueIsNotNull() {
            addCriterion("TRANS_TYPE1_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_VALUE =", value, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_VALUE <>", value, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE1_VALUE >", value, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_VALUE >=", value, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE1_VALUE <", value, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_VALUE <=", value, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE1_VALUE in", values, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE1_VALUE not in", values, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE1_VALUE between", value1, value2, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1ValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE1_VALUE not between", value1, value2, "transType1Value");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueIsNull() {
            addCriterion("TRANS_TYPE1_ADDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueIsNotNull() {
            addCriterion("TRANS_TYPE1_ADDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_ADDVALUE =", value, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_ADDVALUE <>", value, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE1_ADDVALUE >", value, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_ADDVALUE >=", value, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE1_ADDVALUE <", value, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_ADDVALUE <=", value, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE1_ADDVALUE in", values, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE1_ADDVALUE not in", values, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE1_ADDVALUE between", value1, value2, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AddvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE1_ADDVALUE not between", value1, value2, "transType1Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountIsNull() {
            addCriterion("TRANS_TYPE1_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountIsNotNull() {
            addCriterion("TRANS_TYPE1_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_AMOUNT =", value, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_AMOUNT <>", value, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE1_AMOUNT >", value, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_AMOUNT >=", value, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE1_AMOUNT <", value, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE1_AMOUNT <=", value, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE1_AMOUNT in", values, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE1_AMOUNT not in", values, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE1_AMOUNT between", value1, value2, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType1AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE1_AMOUNT not between", value1, value2, "transType1Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueIsNull() {
            addCriterion("TRANS_TYPE2_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueIsNotNull() {
            addCriterion("TRANS_TYPE2_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_VALUE =", value, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_VALUE <>", value, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE2_VALUE >", value, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_VALUE >=", value, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE2_VALUE <", value, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_VALUE <=", value, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE2_VALUE in", values, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE2_VALUE not in", values, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE2_VALUE between", value1, value2, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2ValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE2_VALUE not between", value1, value2, "transType2Value");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueIsNull() {
            addCriterion("TRANS_TYPE2_ADDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueIsNotNull() {
            addCriterion("TRANS_TYPE2_ADDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_ADDVALUE =", value, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_ADDVALUE <>", value, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE2_ADDVALUE >", value, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_ADDVALUE >=", value, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE2_ADDVALUE <", value, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_ADDVALUE <=", value, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE2_ADDVALUE in", values, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE2_ADDVALUE not in", values, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE2_ADDVALUE between", value1, value2, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AddvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE2_ADDVALUE not between", value1, value2, "transType2Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountIsNull() {
            addCriterion("TRANS_TYPE2_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountIsNotNull() {
            addCriterion("TRANS_TYPE2_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_AMOUNT =", value, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_AMOUNT <>", value, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE2_AMOUNT >", value, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_AMOUNT >=", value, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE2_AMOUNT <", value, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE2_AMOUNT <=", value, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE2_AMOUNT in", values, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE2_AMOUNT not in", values, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE2_AMOUNT between", value1, value2, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType2AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE2_AMOUNT not between", value1, value2, "transType2Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueIsNull() {
            addCriterion("TRANS_TYPE3_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueIsNotNull() {
            addCriterion("TRANS_TYPE3_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_VALUE =", value, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_VALUE <>", value, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE3_VALUE >", value, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_VALUE >=", value, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE3_VALUE <", value, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_VALUE <=", value, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE3_VALUE in", values, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE3_VALUE not in", values, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE3_VALUE between", value1, value2, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3ValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE3_VALUE not between", value1, value2, "transType3Value");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueIsNull() {
            addCriterion("TRANS_TYPE3_ADDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueIsNotNull() {
            addCriterion("TRANS_TYPE3_ADDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_ADDVALUE =", value, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_ADDVALUE <>", value, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE3_ADDVALUE >", value, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_ADDVALUE >=", value, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE3_ADDVALUE <", value, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_ADDVALUE <=", value, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE3_ADDVALUE in", values, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE3_ADDVALUE not in", values, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE3_ADDVALUE between", value1, value2, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AddvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE3_ADDVALUE not between", value1, value2, "transType3Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountIsNull() {
            addCriterion("TRANS_TYPE3_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountIsNotNull() {
            addCriterion("TRANS_TYPE3_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_AMOUNT =", value, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_AMOUNT <>", value, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE3_AMOUNT >", value, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_AMOUNT >=", value, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE3_AMOUNT <", value, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE3_AMOUNT <=", value, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE3_AMOUNT in", values, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE3_AMOUNT not in", values, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE3_AMOUNT between", value1, value2, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType3AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE3_AMOUNT not between", value1, value2, "transType3Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueIsNull() {
            addCriterion("TRANS_TYPE4_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueIsNotNull() {
            addCriterion("TRANS_TYPE4_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_VALUE =", value, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_VALUE <>", value, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE4_VALUE >", value, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_VALUE >=", value, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE4_VALUE <", value, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_VALUE <=", value, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE4_VALUE in", values, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE4_VALUE not in", values, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE4_VALUE between", value1, value2, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4ValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE4_VALUE not between", value1, value2, "transType4Value");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueIsNull() {
            addCriterion("TRANS_TYPE4_ADDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueIsNotNull() {
            addCriterion("TRANS_TYPE4_ADDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_ADDVALUE =", value, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_ADDVALUE <>", value, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE4_ADDVALUE >", value, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_ADDVALUE >=", value, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE4_ADDVALUE <", value, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_ADDVALUE <=", value, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE4_ADDVALUE in", values, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE4_ADDVALUE not in", values, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE4_ADDVALUE between", value1, value2, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AddvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE4_ADDVALUE not between", value1, value2, "transType4Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountIsNull() {
            addCriterion("TRANS_TYPE4_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountIsNotNull() {
            addCriterion("TRANS_TYPE4_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_AMOUNT =", value, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_AMOUNT <>", value, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE4_AMOUNT >", value, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_AMOUNT >=", value, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE4_AMOUNT <", value, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE4_AMOUNT <=", value, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE4_AMOUNT in", values, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE4_AMOUNT not in", values, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE4_AMOUNT between", value1, value2, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType4AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE4_AMOUNT not between", value1, value2, "transType4Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueIsNull() {
            addCriterion("TRANS_TYPE5_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueIsNotNull() {
            addCriterion("TRANS_TYPE5_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_VALUE =", value, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_VALUE <>", value, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE5_VALUE >", value, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_VALUE >=", value, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE5_VALUE <", value, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_VALUE <=", value, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE5_VALUE in", values, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE5_VALUE not in", values, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE5_VALUE between", value1, value2, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5ValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE5_VALUE not between", value1, value2, "transType5Value");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueIsNull() {
            addCriterion("TRANS_TYPE5_ADDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueIsNotNull() {
            addCriterion("TRANS_TYPE5_ADDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_ADDVALUE =", value, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_ADDVALUE <>", value, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE5_ADDVALUE >", value, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_ADDVALUE >=", value, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE5_ADDVALUE <", value, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_ADDVALUE <=", value, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE5_ADDVALUE in", values, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE5_ADDVALUE not in", values, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE5_ADDVALUE between", value1, value2, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AddvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE5_ADDVALUE not between", value1, value2, "transType5Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountIsNull() {
            addCriterion("TRANS_TYPE5_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountIsNotNull() {
            addCriterion("TRANS_TYPE5_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_AMOUNT =", value, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_AMOUNT <>", value, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE5_AMOUNT >", value, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_AMOUNT >=", value, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE5_AMOUNT <", value, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE5_AMOUNT <=", value, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE5_AMOUNT in", values, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE5_AMOUNT not in", values, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE5_AMOUNT between", value1, value2, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType5AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE5_AMOUNT not between", value1, value2, "transType5Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueIsNull() {
            addCriterion("TRANS_TYPE6_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueIsNotNull() {
            addCriterion("TRANS_TYPE6_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_VALUE =", value, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_VALUE <>", value, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE6_VALUE >", value, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_VALUE >=", value, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE6_VALUE <", value, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_VALUE <=", value, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE6_VALUE in", values, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE6_VALUE not in", values, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE6_VALUE between", value1, value2, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6ValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE6_VALUE not between", value1, value2, "transType6Value");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueIsNull() {
            addCriterion("TRANS_TYPE6_ADDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueIsNotNull() {
            addCriterion("TRANS_TYPE6_ADDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_ADDVALUE =", value, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_ADDVALUE <>", value, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE6_ADDVALUE >", value, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_ADDVALUE >=", value, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE6_ADDVALUE <", value, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_ADDVALUE <=", value, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE6_ADDVALUE in", values, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE6_ADDVALUE not in", values, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE6_ADDVALUE between", value1, value2, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AddvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE6_ADDVALUE not between", value1, value2, "transType6Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountIsNull() {
            addCriterion("TRANS_TYPE6_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountIsNotNull() {
            addCriterion("TRANS_TYPE6_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT =", value, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT <>", value, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT >", value, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT >=", value, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT <", value, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT <=", value, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE6_AMOUNT in", values, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE6_AMOUNT not in", values, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE6_AMOUNT between", value1, value2, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE6_AMOUNT not between", value1, value2, "transType6Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueIsNull() {
            addCriterion("TRANS_TYPE7_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueIsNotNull() {
            addCriterion("TRANS_TYPE7_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_VALUE =", value, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_VALUE <>", value, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE7_VALUE >", value, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_VALUE >=", value, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE7_VALUE <", value, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_VALUE <=", value, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE7_VALUE in", values, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE7_VALUE not in", values, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE7_VALUE between", value1, value2, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7ValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE7_VALUE not between", value1, value2, "transType7Value");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueIsNull() {
            addCriterion("TRANS_TYPE7_ADDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueIsNotNull() {
            addCriterion("TRANS_TYPE7_ADDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_ADDVALUE =", value, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_ADDVALUE <>", value, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE7_ADDVALUE >", value, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_ADDVALUE >=", value, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE7_ADDVALUE <", value, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_ADDVALUE <=", value, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE7_ADDVALUE in", values, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE7_ADDVALUE not in", values, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE7_ADDVALUE between", value1, value2, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AddvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE7_ADDVALUE not between", value1, value2, "transType7Addvalue");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountIsNull() {
            addCriterion("TRANS_TYPE7_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountIsNotNull() {
            addCriterion("TRANS_TYPE7_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_AMOUNT =", value, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_AMOUNT <>", value, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE7_AMOUNT >", value, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_AMOUNT >=", value, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE7_AMOUNT <", value, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE7_AMOUNT <=", value, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE7_AMOUNT in", values, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE7_AMOUNT not in", values, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE7_AMOUNT between", value1, value2, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andTransType7AmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE7_AMOUNT not between", value1, value2, "transType7Amount");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("SALE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("SALE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(Short value) {
            addCriterion("SALE_TYPE =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(Short value) {
            addCriterion("SALE_TYPE <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(Short value) {
            addCriterion("SALE_TYPE >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("SALE_TYPE >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(Short value) {
            addCriterion("SALE_TYPE <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(Short value) {
            addCriterion("SALE_TYPE <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<Short> values) {
            addCriterion("SALE_TYPE in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<Short> values) {
            addCriterion("SALE_TYPE not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(Short value1, Short value2) {
            addCriterion("SALE_TYPE between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(Short value1, Short value2) {
            addCriterion("SALE_TYPE not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIsNull() {
            addCriterion("BUY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIsNotNull() {
            addCriterion("BUY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTypeEqualTo(Integer value) {
            addCriterion("BUY_TYPE =", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotEqualTo(Integer value) {
            addCriterion("BUY_TYPE <>", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeGreaterThan(Integer value) {
            addCriterion("BUY_TYPE >", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUY_TYPE >=", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeLessThan(Integer value) {
            addCriterion("BUY_TYPE <", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BUY_TYPE <=", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIn(List<Integer> values) {
            addCriterion("BUY_TYPE in", values, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotIn(List<Integer> values) {
            addCriterion("BUY_TYPE not in", values, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeBetween(Integer value1, Integer value2) {
            addCriterion("BUY_TYPE between", value1, value2, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BUY_TYPE not between", value1, value2, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeIsNull() {
            addCriterion("BUY_SUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeIsNotNull() {
            addCriterion("BUY_SUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeEqualTo(BigDecimal value) {
            addCriterion("BUY_SUBTYPE =", value, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeNotEqualTo(BigDecimal value) {
            addCriterion("BUY_SUBTYPE <>", value, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeGreaterThan(BigDecimal value) {
            addCriterion("BUY_SUBTYPE >", value, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_SUBTYPE >=", value, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeLessThan(BigDecimal value) {
            addCriterion("BUY_SUBTYPE <", value, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_SUBTYPE <=", value, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeIn(List<BigDecimal> values) {
            addCriterion("BUY_SUBTYPE in", values, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeNotIn(List<BigDecimal> values) {
            addCriterion("BUY_SUBTYPE not in", values, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_SUBTYPE between", value1, value2, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andBuySubtypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_SUBTYPE not between", value1, value2, "buySubtype");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("COUPON_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("COUPON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("COUPON_ID =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("COUPON_ID <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("COUPON_ID >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_ID >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("COUPON_ID <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("COUPON_ID <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("COUPON_ID like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("COUPON_ID not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("COUPON_ID in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("COUPON_ID not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("COUPON_ID between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("COUPON_ID not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("COUPON_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("COUPON_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(BigDecimal value) {
            addCriterion("COUPON_AMOUNT =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("COUPON_AMOUNT <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("COUPON_AMOUNT >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_AMOUNT >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(BigDecimal value) {
            addCriterion("COUPON_AMOUNT <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_AMOUNT <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<BigDecimal> values) {
            addCriterion("COUPON_AMOUNT in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("COUPON_AMOUNT not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_AMOUNT between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_AMOUNT not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeIsNull() {
            addCriterion("COUPON_USE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeIsNotNull() {
            addCriterion("COUPON_USE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeEqualTo(Date value) {
            addCriterion("COUPON_USE_TIME =", value, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeNotEqualTo(Date value) {
            addCriterion("COUPON_USE_TIME <>", value, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeGreaterThan(Date value) {
            addCriterion("COUPON_USE_TIME >", value, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COUPON_USE_TIME >=", value, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeLessThan(Date value) {
            addCriterion("COUPON_USE_TIME <", value, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeLessThanOrEqualTo(Date value) {
            addCriterion("COUPON_USE_TIME <=", value, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeIn(List<Date> values) {
            addCriterion("COUPON_USE_TIME in", values, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeNotIn(List<Date> values) {
            addCriterion("COUPON_USE_TIME not in", values, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeBetween(Date value1, Date value2) {
            addCriterion("COUPON_USE_TIME between", value1, value2, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponUseTimeNotBetween(Date value1, Date value2) {
            addCriterion("COUPON_USE_TIME not between", value1, value2, "couponUseTime");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(Short value) {
            addCriterion("TRANS_TYPE =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(Short value) {
            addCriterion("TRANS_TYPE <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(Short value) {
            addCriterion("TRANS_TYPE >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANS_TYPE >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(Short value) {
            addCriterion("TRANS_TYPE <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(Short value) {
            addCriterion("TRANS_TYPE <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<Short> values) {
            addCriterion("TRANS_TYPE in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<Short> values) {
            addCriterion("TRANS_TYPE not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(Short value1, Short value2) {
            addCriterion("TRANS_TYPE between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(Short value1, Short value2) {
            addCriterion("TRANS_TYPE not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeIsNull() {
            addCriterion("TRANS_SUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeIsNotNull() {
            addCriterion("TRANS_SUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeEqualTo(String value) {
            addCriterion("TRANS_SUBTYPE =", value, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeNotEqualTo(String value) {
            addCriterion("TRANS_SUBTYPE <>", value, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeGreaterThan(String value) {
            addCriterion("TRANS_SUBTYPE >", value, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_SUBTYPE >=", value, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeLessThan(String value) {
            addCriterion("TRANS_SUBTYPE <", value, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_SUBTYPE <=", value, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeLike(String value) {
            addCriterion("TRANS_SUBTYPE like", value, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeNotLike(String value) {
            addCriterion("TRANS_SUBTYPE not like", value, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeIn(List<String> values) {
            addCriterion("TRANS_SUBTYPE in", values, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeNotIn(List<String> values) {
            addCriterion("TRANS_SUBTYPE not in", values, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeBetween(String value1, String value2) {
            addCriterion("TRANS_SUBTYPE between", value1, value2, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransSubtypeNotBetween(String value1, String value2) {
            addCriterion("TRANS_SUBTYPE not between", value1, value2, "transSubtype");
            return (Criteria) this;
        }

        public Criteria andTransContactIsNull() {
            addCriterion("TRANS_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andTransContactIsNotNull() {
            addCriterion("TRANS_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andTransContactEqualTo(String value) {
            addCriterion("TRANS_CONTACT =", value, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactNotEqualTo(String value) {
            addCriterion("TRANS_CONTACT <>", value, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactGreaterThan(String value) {
            addCriterion("TRANS_CONTACT >", value, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CONTACT >=", value, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactLessThan(String value) {
            addCriterion("TRANS_CONTACT <", value, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CONTACT <=", value, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactLike(String value) {
            addCriterion("TRANS_CONTACT like", value, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactNotLike(String value) {
            addCriterion("TRANS_CONTACT not like", value, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactIn(List<String> values) {
            addCriterion("TRANS_CONTACT in", values, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactNotIn(List<String> values) {
            addCriterion("TRANS_CONTACT not in", values, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactBetween(String value1, String value2) {
            addCriterion("TRANS_CONTACT between", value1, value2, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransContactNotBetween(String value1, String value2) {
            addCriterion("TRANS_CONTACT not between", value1, value2, "transContact");
            return (Criteria) this;
        }

        public Criteria andTransInfoIsNull() {
            addCriterion("TRANS_INFO is null");
            return (Criteria) this;
        }

        public Criteria andTransInfoIsNotNull() {
            addCriterion("TRANS_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andTransInfoEqualTo(String value) {
            addCriterion("TRANS_INFO =", value, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoNotEqualTo(String value) {
            addCriterion("TRANS_INFO <>", value, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoGreaterThan(String value) {
            addCriterion("TRANS_INFO >", value, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_INFO >=", value, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoLessThan(String value) {
            addCriterion("TRANS_INFO <", value, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoLessThanOrEqualTo(String value) {
            addCriterion("TRANS_INFO <=", value, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoLike(String value) {
            addCriterion("TRANS_INFO like", value, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoNotLike(String value) {
            addCriterion("TRANS_INFO not like", value, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoIn(List<String> values) {
            addCriterion("TRANS_INFO in", values, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoNotIn(List<String> values) {
            addCriterion("TRANS_INFO not in", values, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoBetween(String value1, String value2) {
            addCriterion("TRANS_INFO between", value1, value2, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransInfoNotBetween(String value1, String value2) {
            addCriterion("TRANS_INFO not between", value1, value2, "transInfo");
            return (Criteria) this;
        }

        public Criteria andTransAddressIsNull() {
            addCriterion("TRANS_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTransAddressIsNotNull() {
            addCriterion("TRANS_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTransAddressEqualTo(String value) {
            addCriterion("TRANS_ADDRESS =", value, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressNotEqualTo(String value) {
            addCriterion("TRANS_ADDRESS <>", value, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressGreaterThan(String value) {
            addCriterion("TRANS_ADDRESS >", value, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_ADDRESS >=", value, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressLessThan(String value) {
            addCriterion("TRANS_ADDRESS <", value, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressLessThanOrEqualTo(String value) {
            addCriterion("TRANS_ADDRESS <=", value, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressLike(String value) {
            addCriterion("TRANS_ADDRESS like", value, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressNotLike(String value) {
            addCriterion("TRANS_ADDRESS not like", value, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressIn(List<String> values) {
            addCriterion("TRANS_ADDRESS in", values, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressNotIn(List<String> values) {
            addCriterion("TRANS_ADDRESS not in", values, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressBetween(String value1, String value2) {
            addCriterion("TRANS_ADDRESS between", value1, value2, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransAddressNotBetween(String value1, String value2) {
            addCriterion("TRANS_ADDRESS not between", value1, value2, "transAddress");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeIsNull() {
            addCriterion("TRANS_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeIsNotNull() {
            addCriterion("TRANS_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeEqualTo(String value) {
            addCriterion("TRANS_POSTAL_CODE =", value, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeNotEqualTo(String value) {
            addCriterion("TRANS_POSTAL_CODE <>", value, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeGreaterThan(String value) {
            addCriterion("TRANS_POSTAL_CODE >", value, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_POSTAL_CODE >=", value, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeLessThan(String value) {
            addCriterion("TRANS_POSTAL_CODE <", value, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_POSTAL_CODE <=", value, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeLike(String value) {
            addCriterion("TRANS_POSTAL_CODE like", value, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeNotLike(String value) {
            addCriterion("TRANS_POSTAL_CODE not like", value, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeIn(List<String> values) {
            addCriterion("TRANS_POSTAL_CODE in", values, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeNotIn(List<String> values) {
            addCriterion("TRANS_POSTAL_CODE not in", values, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeBetween(String value1, String value2) {
            addCriterion("TRANS_POSTAL_CODE between", value1, value2, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransPostalCodeNotBetween(String value1, String value2) {
            addCriterion("TRANS_POSTAL_CODE not between", value1, value2, "transPostalCode");
            return (Criteria) this;
        }

        public Criteria andTransCountryIsNull() {
            addCriterion("TRANS_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andTransCountryIsNotNull() {
            addCriterion("TRANS_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andTransCountryEqualTo(String value) {
            addCriterion("TRANS_COUNTRY =", value, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryNotEqualTo(String value) {
            addCriterion("TRANS_COUNTRY <>", value, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryGreaterThan(String value) {
            addCriterion("TRANS_COUNTRY >", value, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_COUNTRY >=", value, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryLessThan(String value) {
            addCriterion("TRANS_COUNTRY <", value, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryLessThanOrEqualTo(String value) {
            addCriterion("TRANS_COUNTRY <=", value, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryLike(String value) {
            addCriterion("TRANS_COUNTRY like", value, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryNotLike(String value) {
            addCriterion("TRANS_COUNTRY not like", value, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryIn(List<String> values) {
            addCriterion("TRANS_COUNTRY in", values, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryNotIn(List<String> values) {
            addCriterion("TRANS_COUNTRY not in", values, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryBetween(String value1, String value2) {
            addCriterion("TRANS_COUNTRY between", value1, value2, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransCountryNotBetween(String value1, String value2) {
            addCriterion("TRANS_COUNTRY not between", value1, value2, "transCountry");
            return (Criteria) this;
        }

        public Criteria andTransProvinceIsNull() {
            addCriterion("TRANS_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andTransProvinceIsNotNull() {
            addCriterion("TRANS_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andTransProvinceEqualTo(String value) {
            addCriterion("TRANS_PROVINCE =", value, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceNotEqualTo(String value) {
            addCriterion("TRANS_PROVINCE <>", value, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceGreaterThan(String value) {
            addCriterion("TRANS_PROVINCE >", value, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_PROVINCE >=", value, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceLessThan(String value) {
            addCriterion("TRANS_PROVINCE <", value, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceLessThanOrEqualTo(String value) {
            addCriterion("TRANS_PROVINCE <=", value, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceLike(String value) {
            addCriterion("TRANS_PROVINCE like", value, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceNotLike(String value) {
            addCriterion("TRANS_PROVINCE not like", value, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceIn(List<String> values) {
            addCriterion("TRANS_PROVINCE in", values, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceNotIn(List<String> values) {
            addCriterion("TRANS_PROVINCE not in", values, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceBetween(String value1, String value2) {
            addCriterion("TRANS_PROVINCE between", value1, value2, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransProvinceNotBetween(String value1, String value2) {
            addCriterion("TRANS_PROVINCE not between", value1, value2, "transProvince");
            return (Criteria) this;
        }

        public Criteria andTransCityIsNull() {
            addCriterion("TRANS_CITY is null");
            return (Criteria) this;
        }

        public Criteria andTransCityIsNotNull() {
            addCriterion("TRANS_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andTransCityEqualTo(String value) {
            addCriterion("TRANS_CITY =", value, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityNotEqualTo(String value) {
            addCriterion("TRANS_CITY <>", value, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityGreaterThan(String value) {
            addCriterion("TRANS_CITY >", value, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CITY >=", value, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityLessThan(String value) {
            addCriterion("TRANS_CITY <", value, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CITY <=", value, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityLike(String value) {
            addCriterion("TRANS_CITY like", value, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityNotLike(String value) {
            addCriterion("TRANS_CITY not like", value, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityIn(List<String> values) {
            addCriterion("TRANS_CITY in", values, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityNotIn(List<String> values) {
            addCriterion("TRANS_CITY not in", values, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityBetween(String value1, String value2) {
            addCriterion("TRANS_CITY between", value1, value2, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransCityNotBetween(String value1, String value2) {
            addCriterion("TRANS_CITY not between", value1, value2, "transCity");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameIsNull() {
            addCriterion("TRANS_USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameIsNotNull() {
            addCriterion("TRANS_USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameEqualTo(String value) {
            addCriterion("TRANS_USR_NAME =", value, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameNotEqualTo(String value) {
            addCriterion("TRANS_USR_NAME <>", value, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameGreaterThan(String value) {
            addCriterion("TRANS_USR_NAME >", value, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_USR_NAME >=", value, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameLessThan(String value) {
            addCriterion("TRANS_USR_NAME <", value, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameLessThanOrEqualTo(String value) {
            addCriterion("TRANS_USR_NAME <=", value, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameLike(String value) {
            addCriterion("TRANS_USR_NAME like", value, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameNotLike(String value) {
            addCriterion("TRANS_USR_NAME not like", value, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameIn(List<String> values) {
            addCriterion("TRANS_USR_NAME in", values, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameNotIn(List<String> values) {
            addCriterion("TRANS_USR_NAME not in", values, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameBetween(String value1, String value2) {
            addCriterion("TRANS_USR_NAME between", value1, value2, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrNameNotBetween(String value1, String value2) {
            addCriterion("TRANS_USR_NAME not between", value1, value2, "transUsrName");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneIsNull() {
            addCriterion("TRANS_USR_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneIsNotNull() {
            addCriterion("TRANS_USR_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneEqualTo(String value) {
            addCriterion("TRANS_USR_PHONE =", value, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneNotEqualTo(String value) {
            addCriterion("TRANS_USR_PHONE <>", value, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneGreaterThan(String value) {
            addCriterion("TRANS_USR_PHONE >", value, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_USR_PHONE >=", value, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneLessThan(String value) {
            addCriterion("TRANS_USR_PHONE <", value, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneLessThanOrEqualTo(String value) {
            addCriterion("TRANS_USR_PHONE <=", value, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneLike(String value) {
            addCriterion("TRANS_USR_PHONE like", value, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneNotLike(String value) {
            addCriterion("TRANS_USR_PHONE not like", value, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneIn(List<String> values) {
            addCriterion("TRANS_USR_PHONE in", values, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneNotIn(List<String> values) {
            addCriterion("TRANS_USR_PHONE not in", values, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneBetween(String value1, String value2) {
            addCriterion("TRANS_USR_PHONE between", value1, value2, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransUsrPhoneNotBetween(String value1, String value2) {
            addCriterion("TRANS_USR_PHONE not between", value1, value2, "transUsrPhone");
            return (Criteria) this;
        }

        public Criteria andTransAmountIsNull() {
            addCriterion("TRANS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransAmountIsNotNull() {
            addCriterion("TRANS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmountEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMOUNT =", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMOUNT <>", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountGreaterThan(BigDecimal value) {
            addCriterion("TRANS_AMOUNT >", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMOUNT >=", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountLessThan(BigDecimal value) {
            addCriterion("TRANS_AMOUNT <", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMOUNT <=", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountIn(List<BigDecimal> values) {
            addCriterion("TRANS_AMOUNT in", values, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_AMOUNT not in", values, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_AMOUNT between", value1, value2, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_AMOUNT not between", value1, value2, "transAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNull() {
            addCriterion("REBATE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNotNull() {
            addCriterion("REBATE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountEqualTo(BigDecimal value) {
            addCriterion("REBATE_AMOUNT =", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("REBATE_AMOUNT <>", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("REBATE_AMOUNT >", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REBATE_AMOUNT >=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThan(BigDecimal value) {
            addCriterion("REBATE_AMOUNT <", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REBATE_AMOUNT <=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIn(List<BigDecimal> values) {
            addCriterion("REBATE_AMOUNT in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("REBATE_AMOUNT not in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REBATE_AMOUNT between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REBATE_AMOUNT not between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountIsNull() {
            addCriterion("GROUPBUY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountIsNotNull() {
            addCriterion("GROUPBUY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountEqualTo(BigDecimal value) {
            addCriterion("GROUPBUY_AMOUNT =", value, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountNotEqualTo(BigDecimal value) {
            addCriterion("GROUPBUY_AMOUNT <>", value, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountGreaterThan(BigDecimal value) {
            addCriterion("GROUPBUY_AMOUNT >", value, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GROUPBUY_AMOUNT >=", value, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountLessThan(BigDecimal value) {
            addCriterion("GROUPBUY_AMOUNT <", value, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GROUPBUY_AMOUNT <=", value, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountIn(List<BigDecimal> values) {
            addCriterion("GROUPBUY_AMOUNT in", values, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountNotIn(List<BigDecimal> values) {
            addCriterion("GROUPBUY_AMOUNT not in", values, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROUPBUY_AMOUNT between", value1, value2, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andGroupbuyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROUPBUY_AMOUNT not between", value1, value2, "groupbuyAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("PAYMENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("PAYMENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_AMOUNT <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_AMOUNT in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_AMOUNT not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_AMOUNT between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_AMOUNT not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("REFUND_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("REFUND_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("REFUND_AMOUNT =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("REFUND_AMOUNT <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("REFUND_AMOUNT >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_AMOUNT >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("REFUND_AMOUNT <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_AMOUNT <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("REFUND_AMOUNT in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("REFUND_AMOUNT not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_AMOUNT between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_AMOUNT not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountIsNull() {
            addCriterion("RELEASE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountIsNotNull() {
            addCriterion("RELEASE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountEqualTo(BigDecimal value) {
            addCriterion("RELEASE_AMOUNT =", value, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountNotEqualTo(BigDecimal value) {
            addCriterion("RELEASE_AMOUNT <>", value, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountGreaterThan(BigDecimal value) {
            addCriterion("RELEASE_AMOUNT >", value, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASE_AMOUNT >=", value, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountLessThan(BigDecimal value) {
            addCriterion("RELEASE_AMOUNT <", value, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASE_AMOUNT <=", value, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountIn(List<BigDecimal> values) {
            addCriterion("RELEASE_AMOUNT in", values, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountNotIn(List<BigDecimal> values) {
            addCriterion("RELEASE_AMOUNT not in", values, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASE_AMOUNT between", value1, value2, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andReleaseAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASE_AMOUNT not between", value1, value2, "releaseAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidIsNull() {
            addCriterion("ORDER_PAYMENTID is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidIsNotNull() {
            addCriterion("ORDER_PAYMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidEqualTo(BigDecimal value) {
            addCriterion("ORDER_PAYMENTID =", value, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_PAYMENTID <>", value, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidGreaterThan(BigDecimal value) {
            addCriterion("ORDER_PAYMENTID >", value, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_PAYMENTID >=", value, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidLessThan(BigDecimal value) {
            addCriterion("ORDER_PAYMENTID <", value, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_PAYMENTID <=", value, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidIn(List<BigDecimal> values) {
            addCriterion("ORDER_PAYMENTID in", values, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_PAYMENTID not in", values, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_PAYMENTID between", value1, value2, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_PAYMENTID not between", value1, value2, "orderPaymentid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidIsNull() {
            addCriterion("ORDER_REFUNDID is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidIsNotNull() {
            addCriterion("ORDER_REFUNDID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidEqualTo(BigDecimal value) {
            addCriterion("ORDER_REFUNDID =", value, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_REFUNDID <>", value, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidGreaterThan(BigDecimal value) {
            addCriterion("ORDER_REFUNDID >", value, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_REFUNDID >=", value, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidLessThan(BigDecimal value) {
            addCriterion("ORDER_REFUNDID <", value, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_REFUNDID <=", value, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidIn(List<BigDecimal> values) {
            addCriterion("ORDER_REFUNDID in", values, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_REFUNDID not in", values, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_REFUNDID between", value1, value2, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderRefundidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_REFUNDID not between", value1, value2, "orderRefundid");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("ORDER_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("ORDER_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("ORDER_CREATE_TIME =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("ORDER_CREATE_TIME <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("ORDER_CREATE_TIME >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_CREATE_TIME >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("ORDER_CREATE_TIME <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_CREATE_TIME <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("ORDER_CREATE_TIME in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("ORDER_CREATE_TIME not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_CREATE_TIME between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_CREATE_TIME not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeIsNull() {
            addCriterion("BANKPAY_ACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeIsNotNull() {
            addCriterion("BANKPAY_ACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeEqualTo(Date value) {
            addCriterion("BANKPAY_ACTIVE_TIME =", value, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeNotEqualTo(Date value) {
            addCriterion("BANKPAY_ACTIVE_TIME <>", value, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeGreaterThan(Date value) {
            addCriterion("BANKPAY_ACTIVE_TIME >", value, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BANKPAY_ACTIVE_TIME >=", value, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeLessThan(Date value) {
            addCriterion("BANKPAY_ACTIVE_TIME <", value, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("BANKPAY_ACTIVE_TIME <=", value, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeIn(List<Date> values) {
            addCriterion("BANKPAY_ACTIVE_TIME in", values, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeNotIn(List<Date> values) {
            addCriterion("BANKPAY_ACTIVE_TIME not in", values, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeBetween(Date value1, Date value2) {
            addCriterion("BANKPAY_ACTIVE_TIME between", value1, value2, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andBankpayActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("BANKPAY_ACTIVE_TIME not between", value1, value2, "bankpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeIsNull() {
            addCriterion("POSTPAY_ACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeIsNotNull() {
            addCriterion("POSTPAY_ACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeEqualTo(Date value) {
            addCriterion("POSTPAY_ACTIVE_TIME =", value, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeNotEqualTo(Date value) {
            addCriterion("POSTPAY_ACTIVE_TIME <>", value, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeGreaterThan(Date value) {
            addCriterion("POSTPAY_ACTIVE_TIME >", value, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("POSTPAY_ACTIVE_TIME >=", value, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeLessThan(Date value) {
            addCriterion("POSTPAY_ACTIVE_TIME <", value, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("POSTPAY_ACTIVE_TIME <=", value, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeIn(List<Date> values) {
            addCriterion("POSTPAY_ACTIVE_TIME in", values, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeNotIn(List<Date> values) {
            addCriterion("POSTPAY_ACTIVE_TIME not in", values, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeBetween(Date value1, Date value2) {
            addCriterion("POSTPAY_ACTIVE_TIME between", value1, value2, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andPostpayActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("POSTPAY_ACTIVE_TIME not between", value1, value2, "postpayActiveTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeIsNull() {
            addCriterion("SELLER_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeIsNotNull() {
            addCriterion("SELLER_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeEqualTo(Date value) {
            addCriterion("SELLER_MODIFY_TIME =", value, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeNotEqualTo(Date value) {
            addCriterion("SELLER_MODIFY_TIME <>", value, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeGreaterThan(Date value) {
            addCriterion("SELLER_MODIFY_TIME >", value, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SELLER_MODIFY_TIME >=", value, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeLessThan(Date value) {
            addCriterion("SELLER_MODIFY_TIME <", value, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("SELLER_MODIFY_TIME <=", value, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeIn(List<Date> values) {
            addCriterion("SELLER_MODIFY_TIME in", values, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeNotIn(List<Date> values) {
            addCriterion("SELLER_MODIFY_TIME not in", values, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeBetween(Date value1, Date value2) {
            addCriterion("SELLER_MODIFY_TIME between", value1, value2, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andSellerModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("SELLER_MODIFY_TIME not between", value1, value2, "sellerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeIsNull() {
            addCriterion("BUYER_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeIsNotNull() {
            addCriterion("BUYER_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeEqualTo(Date value) {
            addCriterion("BUYER_MODIFY_TIME =", value, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeNotEqualTo(Date value) {
            addCriterion("BUYER_MODIFY_TIME <>", value, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeGreaterThan(Date value) {
            addCriterion("BUYER_MODIFY_TIME >", value, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_MODIFY_TIME >=", value, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeLessThan(Date value) {
            addCriterion("BUYER_MODIFY_TIME <", value, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_MODIFY_TIME <=", value, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeIn(List<Date> values) {
            addCriterion("BUYER_MODIFY_TIME in", values, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeNotIn(List<Date> values) {
            addCriterion("BUYER_MODIFY_TIME not in", values, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_MODIFY_TIME between", value1, value2, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_MODIFY_TIME not between", value1, value2, "buyerModifyTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeIsNull() {
            addCriterion("BUYER_REQUEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeIsNotNull() {
            addCriterion("BUYER_REQUEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeEqualTo(Date value) {
            addCriterion("BUYER_REQUEST_TIME =", value, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeNotEqualTo(Date value) {
            addCriterion("BUYER_REQUEST_TIME <>", value, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeGreaterThan(Date value) {
            addCriterion("BUYER_REQUEST_TIME >", value, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_REQUEST_TIME >=", value, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeLessThan(Date value) {
            addCriterion("BUYER_REQUEST_TIME <", value, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_REQUEST_TIME <=", value, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeIn(List<Date> values) {
            addCriterion("BUYER_REQUEST_TIME in", values, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeNotIn(List<Date> values) {
            addCriterion("BUYER_REQUEST_TIME not in", values, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_REQUEST_TIME between", value1, value2, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_REQUEST_TIME not between", value1, value2, "buyerRequestTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeIsNull() {
            addCriterion("SELLER_RESPOND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeIsNotNull() {
            addCriterion("SELLER_RESPOND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeEqualTo(Date value) {
            addCriterion("SELLER_RESPOND_TIME =", value, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeNotEqualTo(Date value) {
            addCriterion("SELLER_RESPOND_TIME <>", value, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeGreaterThan(Date value) {
            addCriterion("SELLER_RESPOND_TIME >", value, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SELLER_RESPOND_TIME >=", value, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeLessThan(Date value) {
            addCriterion("SELLER_RESPOND_TIME <", value, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeLessThanOrEqualTo(Date value) {
            addCriterion("SELLER_RESPOND_TIME <=", value, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeIn(List<Date> values) {
            addCriterion("SELLER_RESPOND_TIME in", values, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeNotIn(List<Date> values) {
            addCriterion("SELLER_RESPOND_TIME not in", values, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeBetween(Date value1, Date value2) {
            addCriterion("SELLER_RESPOND_TIME between", value1, value2, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andSellerRespondTimeNotBetween(Date value1, Date value2) {
            addCriterion("SELLER_RESPOND_TIME not between", value1, value2, "sellerRespondTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeIsNull() {
            addCriterion("BUYER_PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeIsNotNull() {
            addCriterion("BUYER_PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeEqualTo(Date value) {
            addCriterion("BUYER_PAY_TIME =", value, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeNotEqualTo(Date value) {
            addCriterion("BUYER_PAY_TIME <>", value, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeGreaterThan(Date value) {
            addCriterion("BUYER_PAY_TIME >", value, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_PAY_TIME >=", value, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeLessThan(Date value) {
            addCriterion("BUYER_PAY_TIME <", value, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_PAY_TIME <=", value, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeIn(List<Date> values) {
            addCriterion("BUYER_PAY_TIME in", values, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeNotIn(List<Date> values) {
            addCriterion("BUYER_PAY_TIME not in", values, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_PAY_TIME between", value1, value2, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_PAY_TIME not between", value1, value2, "buyerPayTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeIsNull() {
            addCriterion("BUYER_RELEASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeIsNotNull() {
            addCriterion("BUYER_RELEASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeEqualTo(Date value) {
            addCriterion("BUYER_RELEASE_TIME =", value, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeNotEqualTo(Date value) {
            addCriterion("BUYER_RELEASE_TIME <>", value, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeGreaterThan(Date value) {
            addCriterion("BUYER_RELEASE_TIME >", value, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_RELEASE_TIME >=", value, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeLessThan(Date value) {
            addCriterion("BUYER_RELEASE_TIME <", value, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_RELEASE_TIME <=", value, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeIn(List<Date> values) {
            addCriterion("BUYER_RELEASE_TIME in", values, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeNotIn(List<Date> values) {
            addCriterion("BUYER_RELEASE_TIME not in", values, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_RELEASE_TIME between", value1, value2, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andBuyerReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_RELEASE_TIME not between", value1, value2, "buyerReleaseTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeIsNull() {
            addCriterion("SELLER_SHIP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeIsNotNull() {
            addCriterion("SELLER_SHIP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeEqualTo(Date value) {
            addCriterion("SELLER_SHIP_TIME =", value, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeNotEqualTo(Date value) {
            addCriterion("SELLER_SHIP_TIME <>", value, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeGreaterThan(Date value) {
            addCriterion("SELLER_SHIP_TIME >", value, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SELLER_SHIP_TIME >=", value, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeLessThan(Date value) {
            addCriterion("SELLER_SHIP_TIME <", value, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeLessThanOrEqualTo(Date value) {
            addCriterion("SELLER_SHIP_TIME <=", value, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeIn(List<Date> values) {
            addCriterion("SELLER_SHIP_TIME in", values, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeNotIn(List<Date> values) {
            addCriterion("SELLER_SHIP_TIME not in", values, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeBetween(Date value1, Date value2) {
            addCriterion("SELLER_SHIP_TIME between", value1, value2, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andSellerShipTimeNotBetween(Date value1, Date value2) {
            addCriterion("SELLER_SHIP_TIME not between", value1, value2, "sellerShipTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeIsNull() {
            addCriterion("ORDER_TERMINAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeIsNotNull() {
            addCriterion("ORDER_TERMINAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeEqualTo(Date value) {
            addCriterion("ORDER_TERMINAL_TIME =", value, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TERMINAL_TIME <>", value, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeGreaterThan(Date value) {
            addCriterion("ORDER_TERMINAL_TIME >", value, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TERMINAL_TIME >=", value, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeLessThan(Date value) {
            addCriterion("ORDER_TERMINAL_TIME <", value, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TERMINAL_TIME <=", value, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeIn(List<Date> values) {
            addCriterion("ORDER_TERMINAL_TIME in", values, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TERMINAL_TIME not in", values, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TERMINAL_TIME between", value1, value2, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderTerminalTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TERMINAL_TIME not between", value1, value2, "orderTerminalTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeIsNull() {
            addCriterion("ORDER_ACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeIsNotNull() {
            addCriterion("ORDER_ACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeEqualTo(Date value) {
            addCriterion("ORDER_ACTIVE_TIME =", value, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeNotEqualTo(Date value) {
            addCriterion("ORDER_ACTIVE_TIME <>", value, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeGreaterThan(Date value) {
            addCriterion("ORDER_ACTIVE_TIME >", value, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_ACTIVE_TIME >=", value, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeLessThan(Date value) {
            addCriterion("ORDER_ACTIVE_TIME <", value, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_ACTIVE_TIME <=", value, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeIn(List<Date> values) {
            addCriterion("ORDER_ACTIVE_TIME in", values, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeNotIn(List<Date> values) {
            addCriterion("ORDER_ACTIVE_TIME not in", values, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_ACTIVE_TIME between", value1, value2, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_ACTIVE_TIME not between", value1, value2, "orderActiveTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeIsNull() {
            addCriterion("BUYER_REFUND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeIsNotNull() {
            addCriterion("BUYER_REFUND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeEqualTo(Date value) {
            addCriterion("BUYER_REFUND_TIME =", value, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeNotEqualTo(Date value) {
            addCriterion("BUYER_REFUND_TIME <>", value, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeGreaterThan(Date value) {
            addCriterion("BUYER_REFUND_TIME >", value, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_REFUND_TIME >=", value, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeLessThan(Date value) {
            addCriterion("BUYER_REFUND_TIME <", value, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_REFUND_TIME <=", value, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeIn(List<Date> values) {
            addCriterion("BUYER_REFUND_TIME in", values, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeNotIn(List<Date> values) {
            addCriterion("BUYER_REFUND_TIME not in", values, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_REFUND_TIME between", value1, value2, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_REFUND_TIME not between", value1, value2, "buyerRefundTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeIsNull() {
            addCriterion("REFUND_ACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeIsNotNull() {
            addCriterion("REFUND_ACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeEqualTo(Date value) {
            addCriterion("REFUND_ACTIVE_TIME =", value, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeNotEqualTo(Date value) {
            addCriterion("REFUND_ACTIVE_TIME <>", value, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeGreaterThan(Date value) {
            addCriterion("REFUND_ACTIVE_TIME >", value, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUND_ACTIVE_TIME >=", value, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeLessThan(Date value) {
            addCriterion("REFUND_ACTIVE_TIME <", value, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUND_ACTIVE_TIME <=", value, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeIn(List<Date> values) {
            addCriterion("REFUND_ACTIVE_TIME in", values, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeNotIn(List<Date> values) {
            addCriterion("REFUND_ACTIVE_TIME not in", values, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeBetween(Date value1, Date value2) {
            addCriterion("REFUND_ACTIVE_TIME between", value1, value2, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andRefundActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUND_ACTIVE_TIME not between", value1, value2, "refundActiveTime");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedIsNull() {
            addCriterion("ORDER_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedIsNotNull() {
            addCriterion("ORDER_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedEqualTo(Short value) {
            addCriterion("ORDER_DELETED =", value, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedNotEqualTo(Short value) {
            addCriterion("ORDER_DELETED <>", value, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedGreaterThan(Short value) {
            addCriterion("ORDER_DELETED >", value, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_DELETED >=", value, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedLessThan(Short value) {
            addCriterion("ORDER_DELETED <", value, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_DELETED <=", value, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedIn(List<Short> values) {
            addCriterion("ORDER_DELETED in", values, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedNotIn(List<Short> values) {
            addCriterion("ORDER_DELETED not in", values, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedBetween(Short value1, Short value2) {
            addCriterion("ORDER_DELETED between", value1, value2, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andOrderDeletedNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_DELETED not between", value1, value2, "orderDeleted");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackIsNull() {
            addCriterion("BUYER_FEEDBACK is null");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackIsNotNull() {
            addCriterion("BUYER_FEEDBACK is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackEqualTo(Short value) {
            addCriterion("BUYER_FEEDBACK =", value, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackNotEqualTo(Short value) {
            addCriterion("BUYER_FEEDBACK <>", value, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackGreaterThan(Short value) {
            addCriterion("BUYER_FEEDBACK >", value, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackGreaterThanOrEqualTo(Short value) {
            addCriterion("BUYER_FEEDBACK >=", value, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackLessThan(Short value) {
            addCriterion("BUYER_FEEDBACK <", value, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackLessThanOrEqualTo(Short value) {
            addCriterion("BUYER_FEEDBACK <=", value, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackIn(List<Short> values) {
            addCriterion("BUYER_FEEDBACK in", values, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackNotIn(List<Short> values) {
            addCriterion("BUYER_FEEDBACK not in", values, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackBetween(Short value1, Short value2) {
            addCriterion("BUYER_FEEDBACK between", value1, value2, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackNotBetween(Short value1, Short value2) {
            addCriterion("BUYER_FEEDBACK not between", value1, value2, "buyerFeedback");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeIsNull() {
            addCriterion("BUYER_FEEDBACK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeIsNotNull() {
            addCriterion("BUYER_FEEDBACK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeEqualTo(Date value) {
            addCriterion("BUYER_FEEDBACK_TIME =", value, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeNotEqualTo(Date value) {
            addCriterion("BUYER_FEEDBACK_TIME <>", value, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeGreaterThan(Date value) {
            addCriterion("BUYER_FEEDBACK_TIME >", value, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_FEEDBACK_TIME >=", value, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeLessThan(Date value) {
            addCriterion("BUYER_FEEDBACK_TIME <", value, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_FEEDBACK_TIME <=", value, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeIn(List<Date> values) {
            addCriterion("BUYER_FEEDBACK_TIME in", values, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeNotIn(List<Date> values) {
            addCriterion("BUYER_FEEDBACK_TIME not in", values, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_FEEDBACK_TIME between", value1, value2, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andBuyerFeedbackTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_FEEDBACK_TIME not between", value1, value2, "buyerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackIsNull() {
            addCriterion("SELLER_FEEDBACK is null");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackIsNotNull() {
            addCriterion("SELLER_FEEDBACK is not null");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackEqualTo(Short value) {
            addCriterion("SELLER_FEEDBACK =", value, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackNotEqualTo(Short value) {
            addCriterion("SELLER_FEEDBACK <>", value, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackGreaterThan(Short value) {
            addCriterion("SELLER_FEEDBACK >", value, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackGreaterThanOrEqualTo(Short value) {
            addCriterion("SELLER_FEEDBACK >=", value, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackLessThan(Short value) {
            addCriterion("SELLER_FEEDBACK <", value, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackLessThanOrEqualTo(Short value) {
            addCriterion("SELLER_FEEDBACK <=", value, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackIn(List<Short> values) {
            addCriterion("SELLER_FEEDBACK in", values, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackNotIn(List<Short> values) {
            addCriterion("SELLER_FEEDBACK not in", values, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackBetween(Short value1, Short value2) {
            addCriterion("SELLER_FEEDBACK between", value1, value2, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackNotBetween(Short value1, Short value2) {
            addCriterion("SELLER_FEEDBACK not between", value1, value2, "sellerFeedback");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeIsNull() {
            addCriterion("SELLER_FEEDBACK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeIsNotNull() {
            addCriterion("SELLER_FEEDBACK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeEqualTo(Date value) {
            addCriterion("SELLER_FEEDBACK_TIME =", value, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeNotEqualTo(Date value) {
            addCriterion("SELLER_FEEDBACK_TIME <>", value, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeGreaterThan(Date value) {
            addCriterion("SELLER_FEEDBACK_TIME >", value, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SELLER_FEEDBACK_TIME >=", value, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeLessThan(Date value) {
            addCriterion("SELLER_FEEDBACK_TIME <", value, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeLessThanOrEqualTo(Date value) {
            addCriterion("SELLER_FEEDBACK_TIME <=", value, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeIn(List<Date> values) {
            addCriterion("SELLER_FEEDBACK_TIME in", values, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeNotIn(List<Date> values) {
            addCriterion("SELLER_FEEDBACK_TIME not in", values, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeBetween(Date value1, Date value2) {
            addCriterion("SELLER_FEEDBACK_TIME between", value1, value2, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andSellerFeedbackTimeNotBetween(Date value1, Date value2) {
            addCriterion("SELLER_FEEDBACK_TIME not between", value1, value2, "sellerFeedbackTime");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Short value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Short value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Short value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Short value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Short> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Short> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Short value1, Short value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusIsNull() {
            addCriterion("ORDER_SUBSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusIsNotNull() {
            addCriterion("ORDER_SUBSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusEqualTo(Short value) {
            addCriterion("ORDER_SUBSTATUS =", value, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusNotEqualTo(Short value) {
            addCriterion("ORDER_SUBSTATUS <>", value, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusGreaterThan(Short value) {
            addCriterion("ORDER_SUBSTATUS >", value, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_SUBSTATUS >=", value, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusLessThan(Short value) {
            addCriterion("ORDER_SUBSTATUS <", value, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_SUBSTATUS <=", value, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusIn(List<Short> values) {
            addCriterion("ORDER_SUBSTATUS in", values, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusNotIn(List<Short> values) {
            addCriterion("ORDER_SUBSTATUS not in", values, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusBetween(Short value1, Short value2) {
            addCriterion("ORDER_SUBSTATUS between", value1, value2, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andOrderSubstatusNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_SUBSTATUS not between", value1, value2, "orderSubstatus");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteIsNull() {
            addCriterion("BUYER_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteIsNotNull() {
            addCriterion("BUYER_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteEqualTo(String value) {
            addCriterion("BUYER_NOTE =", value, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteNotEqualTo(String value) {
            addCriterion("BUYER_NOTE <>", value, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteGreaterThan(String value) {
            addCriterion("BUYER_NOTE >", value, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NOTE >=", value, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteLessThan(String value) {
            addCriterion("BUYER_NOTE <", value, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NOTE <=", value, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteLike(String value) {
            addCriterion("BUYER_NOTE like", value, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteNotLike(String value) {
            addCriterion("BUYER_NOTE not like", value, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteIn(List<String> values) {
            addCriterion("BUYER_NOTE in", values, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteNotIn(List<String> values) {
            addCriterion("BUYER_NOTE not in", values, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteBetween(String value1, String value2) {
            addCriterion("BUYER_NOTE between", value1, value2, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteNotBetween(String value1, String value2) {
            addCriterion("BUYER_NOTE not between", value1, value2, "buyerNote");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeIsNull() {
            addCriterion("BUYER_NOTE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeIsNotNull() {
            addCriterion("BUYER_NOTE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeEqualTo(Date value) {
            addCriterion("BUYER_NOTE_TIME =", value, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeNotEqualTo(Date value) {
            addCriterion("BUYER_NOTE_TIME <>", value, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeGreaterThan(Date value) {
            addCriterion("BUYER_NOTE_TIME >", value, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_NOTE_TIME >=", value, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeLessThan(Date value) {
            addCriterion("BUYER_NOTE_TIME <", value, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_NOTE_TIME <=", value, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeIn(List<Date> values) {
            addCriterion("BUYER_NOTE_TIME in", values, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeNotIn(List<Date> values) {
            addCriterion("BUYER_NOTE_TIME not in", values, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_NOTE_TIME between", value1, value2, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andBuyerNoteTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_NOTE_TIME not between", value1, value2, "buyerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteIsNull() {
            addCriterion("SELLER_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andSellerNoteIsNotNull() {
            addCriterion("SELLER_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNoteEqualTo(String value) {
            addCriterion("SELLER_NOTE =", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteNotEqualTo(String value) {
            addCriterion("SELLER_NOTE <>", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteGreaterThan(String value) {
            addCriterion("SELLER_NOTE >", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE >=", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteLessThan(String value) {
            addCriterion("SELLER_NOTE <", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteLessThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE <=", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteLike(String value) {
            addCriterion("SELLER_NOTE like", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteNotLike(String value) {
            addCriterion("SELLER_NOTE not like", value, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteIn(List<String> values) {
            addCriterion("SELLER_NOTE in", values, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteNotIn(List<String> values) {
            addCriterion("SELLER_NOTE not in", values, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteBetween(String value1, String value2) {
            addCriterion("SELLER_NOTE between", value1, value2, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteNotBetween(String value1, String value2) {
            addCriterion("SELLER_NOTE not between", value1, value2, "sellerNote");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeIsNull() {
            addCriterion("SELLER_NOTE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeIsNotNull() {
            addCriterion("SELLER_NOTE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeEqualTo(Date value) {
            addCriterion("SELLER_NOTE_TIME =", value, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeNotEqualTo(Date value) {
            addCriterion("SELLER_NOTE_TIME <>", value, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeGreaterThan(Date value) {
            addCriterion("SELLER_NOTE_TIME >", value, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SELLER_NOTE_TIME >=", value, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeLessThan(Date value) {
            addCriterion("SELLER_NOTE_TIME <", value, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeLessThanOrEqualTo(Date value) {
            addCriterion("SELLER_NOTE_TIME <=", value, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeIn(List<Date> values) {
            addCriterion("SELLER_NOTE_TIME in", values, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeNotIn(List<Date> values) {
            addCriterion("SELLER_NOTE_TIME not in", values, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeBetween(Date value1, Date value2) {
            addCriterion("SELLER_NOTE_TIME between", value1, value2, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andSellerNoteTimeNotBetween(Date value1, Date value2) {
            addCriterion("SELLER_NOTE_TIME not between", value1, value2, "sellerNoteTime");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIsNull() {
            addCriterion("CANCEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIsNotNull() {
            addCriterion("CANCEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTypeEqualTo(Short value) {
            addCriterion("CANCEL_TYPE =", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotEqualTo(Short value) {
            addCriterion("CANCEL_TYPE <>", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeGreaterThan(Short value) {
            addCriterion("CANCEL_TYPE >", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CANCEL_TYPE >=", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeLessThan(Short value) {
            addCriterion("CANCEL_TYPE <", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeLessThanOrEqualTo(Short value) {
            addCriterion("CANCEL_TYPE <=", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIn(List<Short> values) {
            addCriterion("CANCEL_TYPE in", values, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotIn(List<Short> values) {
            addCriterion("CANCEL_TYPE not in", values, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeBetween(Short value1, Short value2) {
            addCriterion("CANCEL_TYPE between", value1, value2, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotBetween(Short value1, Short value2) {
            addCriterion("CANCEL_TYPE not between", value1, value2, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelNoteIsNull() {
            addCriterion("CANCEL_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andCancelNoteIsNotNull() {
            addCriterion("CANCEL_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelNoteEqualTo(String value) {
            addCriterion("CANCEL_NOTE =", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteNotEqualTo(String value) {
            addCriterion("CANCEL_NOTE <>", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteGreaterThan(String value) {
            addCriterion("CANCEL_NOTE >", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_NOTE >=", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteLessThan(String value) {
            addCriterion("CANCEL_NOTE <", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_NOTE <=", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteLike(String value) {
            addCriterion("CANCEL_NOTE like", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteNotLike(String value) {
            addCriterion("CANCEL_NOTE not like", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteIn(List<String> values) {
            addCriterion("CANCEL_NOTE in", values, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteNotIn(List<String> values) {
            addCriterion("CANCEL_NOTE not in", values, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteBetween(String value1, String value2) {
            addCriterion("CANCEL_NOTE between", value1, value2, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteNotBetween(String value1, String value2) {
            addCriterion("CANCEL_NOTE not between", value1, value2, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("CANCEL_TIME =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("CANCEL_TIME <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("CANCEL_TIME >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_TIME >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("CANCEL_TIME <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_TIME <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("CANCEL_TIME in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("CANCEL_TIME not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("CANCEL_TIME between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_TIME not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusIsNull() {
            addCriterion("REQUEST_CS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusIsNotNull() {
            addCriterion("REQUEST_CS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusEqualTo(Short value) {
            addCriterion("REQUEST_CS_STATUS =", value, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusNotEqualTo(Short value) {
            addCriterion("REQUEST_CS_STATUS <>", value, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusGreaterThan(Short value) {
            addCriterion("REQUEST_CS_STATUS >", value, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("REQUEST_CS_STATUS >=", value, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusLessThan(Short value) {
            addCriterion("REQUEST_CS_STATUS <", value, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusLessThanOrEqualTo(Short value) {
            addCriterion("REQUEST_CS_STATUS <=", value, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusIn(List<Short> values) {
            addCriterion("REQUEST_CS_STATUS in", values, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusNotIn(List<Short> values) {
            addCriterion("REQUEST_CS_STATUS not in", values, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusBetween(Short value1, Short value2) {
            addCriterion("REQUEST_CS_STATUS between", value1, value2, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsStatusNotBetween(Short value1, Short value2) {
            addCriterion("REQUEST_CS_STATUS not between", value1, value2, "requestCsStatus");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeIsNull() {
            addCriterion("REQUEST_CS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeIsNotNull() {
            addCriterion("REQUEST_CS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeEqualTo(Date value) {
            addCriterion("REQUEST_CS_TIME =", value, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeNotEqualTo(Date value) {
            addCriterion("REQUEST_CS_TIME <>", value, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeGreaterThan(Date value) {
            addCriterion("REQUEST_CS_TIME >", value, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REQUEST_CS_TIME >=", value, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeLessThan(Date value) {
            addCriterion("REQUEST_CS_TIME <", value, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeLessThanOrEqualTo(Date value) {
            addCriterion("REQUEST_CS_TIME <=", value, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeIn(List<Date> values) {
            addCriterion("REQUEST_CS_TIME in", values, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeNotIn(List<Date> values) {
            addCriterion("REQUEST_CS_TIME not in", values, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeBetween(Date value1, Date value2) {
            addCriterion("REQUEST_CS_TIME between", value1, value2, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andRequestCsTimeNotBetween(Date value1, Date value2) {
            addCriterion("REQUEST_CS_TIME not between", value1, value2, "requestCsTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusIsNull() {
            addCriterion("FREEZE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusIsNotNull() {
            addCriterion("FREEZE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusEqualTo(Short value) {
            addCriterion("FREEZE_STATUS =", value, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusNotEqualTo(Short value) {
            addCriterion("FREEZE_STATUS <>", value, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusGreaterThan(Short value) {
            addCriterion("FREEZE_STATUS >", value, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("FREEZE_STATUS >=", value, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusLessThan(Short value) {
            addCriterion("FREEZE_STATUS <", value, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusLessThanOrEqualTo(Short value) {
            addCriterion("FREEZE_STATUS <=", value, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusIn(List<Short> values) {
            addCriterion("FREEZE_STATUS in", values, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusNotIn(List<Short> values) {
            addCriterion("FREEZE_STATUS not in", values, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusBetween(Short value1, Short value2) {
            addCriterion("FREEZE_STATUS between", value1, value2, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStatusNotBetween(Short value1, Short value2) {
            addCriterion("FREEZE_STATUS not between", value1, value2, "freezeStatus");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeIsNull() {
            addCriterion("FREEZE_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeIsNotNull() {
            addCriterion("FREEZE_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeEqualTo(Date value) {
            addCriterion("FREEZE_START_TIME =", value, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeNotEqualTo(Date value) {
            addCriterion("FREEZE_START_TIME <>", value, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeGreaterThan(Date value) {
            addCriterion("FREEZE_START_TIME >", value, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FREEZE_START_TIME >=", value, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeLessThan(Date value) {
            addCriterion("FREEZE_START_TIME <", value, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("FREEZE_START_TIME <=", value, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeIn(List<Date> values) {
            addCriterion("FREEZE_START_TIME in", values, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeNotIn(List<Date> values) {
            addCriterion("FREEZE_START_TIME not in", values, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeBetween(Date value1, Date value2) {
            addCriterion("FREEZE_START_TIME between", value1, value2, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("FREEZE_START_TIME not between", value1, value2, "freezeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeIsNull() {
            addCriterion("FREEZE_CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeIsNotNull() {
            addCriterion("FREEZE_CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeEqualTo(Date value) {
            addCriterion("FREEZE_CANCEL_TIME =", value, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeNotEqualTo(Date value) {
            addCriterion("FREEZE_CANCEL_TIME <>", value, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeGreaterThan(Date value) {
            addCriterion("FREEZE_CANCEL_TIME >", value, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FREEZE_CANCEL_TIME >=", value, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeLessThan(Date value) {
            addCriterion("FREEZE_CANCEL_TIME <", value, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("FREEZE_CANCEL_TIME <=", value, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeIn(List<Date> values) {
            addCriterion("FREEZE_CANCEL_TIME in", values, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeNotIn(List<Date> values) {
            addCriterion("FREEZE_CANCEL_TIME not in", values, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeBetween(Date value1, Date value2) {
            addCriterion("FREEZE_CANCEL_TIME between", value1, value2, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andFreezeCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("FREEZE_CANCEL_TIME not between", value1, value2, "freezeCancelTime");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailIsNull() {
            addCriterion("PAYMENT_NOTIFY_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailIsNotNull() {
            addCriterion("PAYMENT_NOTIFY_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailEqualTo(Short value) {
            addCriterion("PAYMENT_NOTIFY_EMAIL =", value, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailNotEqualTo(Short value) {
            addCriterion("PAYMENT_NOTIFY_EMAIL <>", value, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailGreaterThan(Short value) {
            addCriterion("PAYMENT_NOTIFY_EMAIL >", value, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_NOTIFY_EMAIL >=", value, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailLessThan(Short value) {
            addCriterion("PAYMENT_NOTIFY_EMAIL <", value, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailLessThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_NOTIFY_EMAIL <=", value, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailIn(List<Short> values) {
            addCriterion("PAYMENT_NOTIFY_EMAIL in", values, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailNotIn(List<Short> values) {
            addCriterion("PAYMENT_NOTIFY_EMAIL not in", values, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_NOTIFY_EMAIL between", value1, value2, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNotifyEmailNotBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_NOTIFY_EMAIL not between", value1, value2, "paymentNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailIsNull() {
            addCriterion("PAYMENT_CLOSE_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailIsNotNull() {
            addCriterion("PAYMENT_CLOSE_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailEqualTo(Short value) {
            addCriterion("PAYMENT_CLOSE_EMAIL =", value, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailNotEqualTo(Short value) {
            addCriterion("PAYMENT_CLOSE_EMAIL <>", value, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailGreaterThan(Short value) {
            addCriterion("PAYMENT_CLOSE_EMAIL >", value, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_CLOSE_EMAIL >=", value, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailLessThan(Short value) {
            addCriterion("PAYMENT_CLOSE_EMAIL <", value, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailLessThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_CLOSE_EMAIL <=", value, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailIn(List<Short> values) {
            addCriterion("PAYMENT_CLOSE_EMAIL in", values, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailNotIn(List<Short> values) {
            addCriterion("PAYMENT_CLOSE_EMAIL not in", values, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_CLOSE_EMAIL between", value1, value2, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentCloseEmailNotBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_CLOSE_EMAIL not between", value1, value2, "paymentCloseEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailIsNull() {
            addCriterion("SHIPITEM_NOTIFY_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailIsNotNull() {
            addCriterion("SHIPITEM_NOTIFY_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailEqualTo(Short value) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL =", value, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailNotEqualTo(Short value) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL <>", value, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailGreaterThan(Short value) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL >", value, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailGreaterThanOrEqualTo(Short value) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL >=", value, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailLessThan(Short value) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL <", value, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailLessThanOrEqualTo(Short value) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL <=", value, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailIn(List<Short> values) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL in", values, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailNotIn(List<Short> values) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL not in", values, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailBetween(Short value1, Short value2) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL between", value1, value2, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andShipitemNotifyEmailNotBetween(Short value1, Short value2) {
            addCriterion("SHIPITEM_NOTIFY_EMAIL not between", value1, value2, "shipitemNotifyEmail");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1IsNull() {
            addCriterion("RELEASE_NOTIFY_EMAIL1 is null");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1IsNotNull() {
            addCriterion("RELEASE_NOTIFY_EMAIL1 is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1EqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 =", value, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1NotEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 <>", value, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1GreaterThan(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 >", value, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1GreaterThanOrEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 >=", value, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1LessThan(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 <", value, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1LessThanOrEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 <=", value, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1In(List<Short> values) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 in", values, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1NotIn(List<Short> values) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 not in", values, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1Between(Short value1, Short value2) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 between", value1, value2, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail1NotBetween(Short value1, Short value2) {
            addCriterion("RELEASE_NOTIFY_EMAIL1 not between", value1, value2, "releaseNotifyEmail1");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2IsNull() {
            addCriterion("RELEASE_NOTIFY_EMAIL2 is null");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2IsNotNull() {
            addCriterion("RELEASE_NOTIFY_EMAIL2 is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2EqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 =", value, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2NotEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 <>", value, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2GreaterThan(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 >", value, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2GreaterThanOrEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 >=", value, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2LessThan(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 <", value, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2LessThanOrEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 <=", value, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2In(List<Short> values) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 in", values, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2NotIn(List<Short> values) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 not in", values, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2Between(Short value1, Short value2) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 between", value1, value2, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail2NotBetween(Short value1, Short value2) {
            addCriterion("RELEASE_NOTIFY_EMAIL2 not between", value1, value2, "releaseNotifyEmail2");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3IsNull() {
            addCriterion("RELEASE_NOTIFY_EMAIL3 is null");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3IsNotNull() {
            addCriterion("RELEASE_NOTIFY_EMAIL3 is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3EqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 =", value, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3NotEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 <>", value, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3GreaterThan(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 >", value, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3GreaterThanOrEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 >=", value, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3LessThan(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 <", value, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3LessThanOrEqualTo(Short value) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 <=", value, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3In(List<Short> values) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 in", values, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3NotIn(List<Short> values) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 not in", values, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3Between(Short value1, Short value2) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 between", value1, value2, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andReleaseNotifyEmail3NotBetween(Short value1, Short value2) {
            addCriterion("RELEASE_NOTIFY_EMAIL3 not between", value1, value2, "releaseNotifyEmail3");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdIsNull() {
            addCriterion("CREATE_SP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdIsNotNull() {
            addCriterion("CREATE_SP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdEqualTo(Long value) {
            addCriterion("CREATE_SP_ID =", value, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdNotEqualTo(Long value) {
            addCriterion("CREATE_SP_ID <>", value, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdGreaterThan(Long value) {
            addCriterion("CREATE_SP_ID >", value, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_SP_ID >=", value, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdLessThan(Long value) {
            addCriterion("CREATE_SP_ID <", value, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_SP_ID <=", value, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdIn(List<Long> values) {
            addCriterion("CREATE_SP_ID in", values, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdNotIn(List<Long> values) {
            addCriterion("CREATE_SP_ID not in", values, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_SP_ID between", value1, value2, "createSpId");
            return (Criteria) this;
        }

        public Criteria andCreateSpIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_SP_ID not between", value1, value2, "createSpId");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrIsNull() {
            addCriterion("BUYER_IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrIsNotNull() {
            addCriterion("BUYER_IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrEqualTo(String value) {
            addCriterion("BUYER_IP_ADDR =", value, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrNotEqualTo(String value) {
            addCriterion("BUYER_IP_ADDR <>", value, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrGreaterThan(String value) {
            addCriterion("BUYER_IP_ADDR >", value, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_IP_ADDR >=", value, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrLessThan(String value) {
            addCriterion("BUYER_IP_ADDR <", value, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrLessThanOrEqualTo(String value) {
            addCriterion("BUYER_IP_ADDR <=", value, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrLike(String value) {
            addCriterion("BUYER_IP_ADDR like", value, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrNotLike(String value) {
            addCriterion("BUYER_IP_ADDR not like", value, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrIn(List<String> values) {
            addCriterion("BUYER_IP_ADDR in", values, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrNotIn(List<String> values) {
            addCriterion("BUYER_IP_ADDR not in", values, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrBetween(String value1, String value2) {
            addCriterion("BUYER_IP_ADDR between", value1, value2, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerIpAddrNotBetween(String value1, String value2) {
            addCriterion("BUYER_IP_ADDR not between", value1, value2, "buyerIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdIsNull() {
            addCriterion("BUYER_HD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdIsNotNull() {
            addCriterion("BUYER_HD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdEqualTo(String value) {
            addCriterion("BUYER_HD_ID =", value, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdNotEqualTo(String value) {
            addCriterion("BUYER_HD_ID <>", value, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdGreaterThan(String value) {
            addCriterion("BUYER_HD_ID >", value, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_HD_ID >=", value, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdLessThan(String value) {
            addCriterion("BUYER_HD_ID <", value, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdLessThanOrEqualTo(String value) {
            addCriterion("BUYER_HD_ID <=", value, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdLike(String value) {
            addCriterion("BUYER_HD_ID like", value, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdNotLike(String value) {
            addCriterion("BUYER_HD_ID not like", value, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdIn(List<String> values) {
            addCriterion("BUYER_HD_ID in", values, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdNotIn(List<String> values) {
            addCriterion("BUYER_HD_ID not in", values, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdBetween(String value1, String value2) {
            addCriterion("BUYER_HD_ID between", value1, value2, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerHdIdNotBetween(String value1, String value2) {
            addCriterion("BUYER_HD_ID not between", value1, value2, "buyerHdId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdIsNull() {
            addCriterion("BUYER_CPU_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdIsNotNull() {
            addCriterion("BUYER_CPU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdEqualTo(String value) {
            addCriterion("BUYER_CPU_ID =", value, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdNotEqualTo(String value) {
            addCriterion("BUYER_CPU_ID <>", value, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdGreaterThan(String value) {
            addCriterion("BUYER_CPU_ID >", value, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_CPU_ID >=", value, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdLessThan(String value) {
            addCriterion("BUYER_CPU_ID <", value, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdLessThanOrEqualTo(String value) {
            addCriterion("BUYER_CPU_ID <=", value, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdLike(String value) {
            addCriterion("BUYER_CPU_ID like", value, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdNotLike(String value) {
            addCriterion("BUYER_CPU_ID not like", value, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdIn(List<String> values) {
            addCriterion("BUYER_CPU_ID in", values, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdNotIn(List<String> values) {
            addCriterion("BUYER_CPU_ID not in", values, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdBetween(String value1, String value2) {
            addCriterion("BUYER_CPU_ID between", value1, value2, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerCpuIdNotBetween(String value1, String value2) {
            addCriterion("BUYER_CPU_ID not between", value1, value2, "buyerCpuId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdIsNull() {
            addCriterion("BUYER_MAC_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdIsNotNull() {
            addCriterion("BUYER_MAC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdEqualTo(String value) {
            addCriterion("BUYER_MAC_ID =", value, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdNotEqualTo(String value) {
            addCriterion("BUYER_MAC_ID <>", value, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdGreaterThan(String value) {
            addCriterion("BUYER_MAC_ID >", value, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_MAC_ID >=", value, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdLessThan(String value) {
            addCriterion("BUYER_MAC_ID <", value, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdLessThanOrEqualTo(String value) {
            addCriterion("BUYER_MAC_ID <=", value, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdLike(String value) {
            addCriterion("BUYER_MAC_ID like", value, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdNotLike(String value) {
            addCriterion("BUYER_MAC_ID not like", value, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdIn(List<String> values) {
            addCriterion("BUYER_MAC_ID in", values, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdNotIn(List<String> values) {
            addCriterion("BUYER_MAC_ID not in", values, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdBetween(String value1, String value2) {
            addCriterion("BUYER_MAC_ID between", value1, value2, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerMacIdNotBetween(String value1, String value2) {
            addCriterion("BUYER_MAC_ID not between", value1, value2, "buyerMacId");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoIsNull() {
            addCriterion("BUYER_COOKIE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoIsNotNull() {
            addCriterion("BUYER_COOKIE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoEqualTo(String value) {
            addCriterion("BUYER_COOKIE_INFO =", value, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoNotEqualTo(String value) {
            addCriterion("BUYER_COOKIE_INFO <>", value, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoGreaterThan(String value) {
            addCriterion("BUYER_COOKIE_INFO >", value, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_COOKIE_INFO >=", value, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoLessThan(String value) {
            addCriterion("BUYER_COOKIE_INFO <", value, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoLessThanOrEqualTo(String value) {
            addCriterion("BUYER_COOKIE_INFO <=", value, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoLike(String value) {
            addCriterion("BUYER_COOKIE_INFO like", value, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoNotLike(String value) {
            addCriterion("BUYER_COOKIE_INFO not like", value, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoIn(List<String> values) {
            addCriterion("BUYER_COOKIE_INFO in", values, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoNotIn(List<String> values) {
            addCriterion("BUYER_COOKIE_INFO not in", values, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoBetween(String value1, String value2) {
            addCriterion("BUYER_COOKIE_INFO between", value1, value2, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andBuyerCookieInfoNotBetween(String value1, String value2) {
            addCriterion("BUYER_COOKIE_INFO not between", value1, value2, "buyerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrIsNull() {
            addCriterion("SELLER_IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrIsNotNull() {
            addCriterion("SELLER_IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrEqualTo(String value) {
            addCriterion("SELLER_IP_ADDR =", value, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrNotEqualTo(String value) {
            addCriterion("SELLER_IP_ADDR <>", value, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrGreaterThan(String value) {
            addCriterion("SELLER_IP_ADDR >", value, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_IP_ADDR >=", value, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrLessThan(String value) {
            addCriterion("SELLER_IP_ADDR <", value, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrLessThanOrEqualTo(String value) {
            addCriterion("SELLER_IP_ADDR <=", value, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrLike(String value) {
            addCriterion("SELLER_IP_ADDR like", value, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrNotLike(String value) {
            addCriterion("SELLER_IP_ADDR not like", value, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrIn(List<String> values) {
            addCriterion("SELLER_IP_ADDR in", values, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrNotIn(List<String> values) {
            addCriterion("SELLER_IP_ADDR not in", values, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrBetween(String value1, String value2) {
            addCriterion("SELLER_IP_ADDR between", value1, value2, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerIpAddrNotBetween(String value1, String value2) {
            addCriterion("SELLER_IP_ADDR not between", value1, value2, "sellerIpAddr");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdIsNull() {
            addCriterion("SELLER_HD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdIsNotNull() {
            addCriterion("SELLER_HD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdEqualTo(String value) {
            addCriterion("SELLER_HD_ID =", value, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdNotEqualTo(String value) {
            addCriterion("SELLER_HD_ID <>", value, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdGreaterThan(String value) {
            addCriterion("SELLER_HD_ID >", value, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_HD_ID >=", value, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdLessThan(String value) {
            addCriterion("SELLER_HD_ID <", value, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdLessThanOrEqualTo(String value) {
            addCriterion("SELLER_HD_ID <=", value, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdLike(String value) {
            addCriterion("SELLER_HD_ID like", value, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdNotLike(String value) {
            addCriterion("SELLER_HD_ID not like", value, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdIn(List<String> values) {
            addCriterion("SELLER_HD_ID in", values, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdNotIn(List<String> values) {
            addCriterion("SELLER_HD_ID not in", values, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdBetween(String value1, String value2) {
            addCriterion("SELLER_HD_ID between", value1, value2, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerHdIdNotBetween(String value1, String value2) {
            addCriterion("SELLER_HD_ID not between", value1, value2, "sellerHdId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdIsNull() {
            addCriterion("SELLER_CPU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdIsNotNull() {
            addCriterion("SELLER_CPU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdEqualTo(String value) {
            addCriterion("SELLER_CPU_ID =", value, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdNotEqualTo(String value) {
            addCriterion("SELLER_CPU_ID <>", value, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdGreaterThan(String value) {
            addCriterion("SELLER_CPU_ID >", value, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_CPU_ID >=", value, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdLessThan(String value) {
            addCriterion("SELLER_CPU_ID <", value, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdLessThanOrEqualTo(String value) {
            addCriterion("SELLER_CPU_ID <=", value, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdLike(String value) {
            addCriterion("SELLER_CPU_ID like", value, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdNotLike(String value) {
            addCriterion("SELLER_CPU_ID not like", value, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdIn(List<String> values) {
            addCriterion("SELLER_CPU_ID in", values, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdNotIn(List<String> values) {
            addCriterion("SELLER_CPU_ID not in", values, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdBetween(String value1, String value2) {
            addCriterion("SELLER_CPU_ID between", value1, value2, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerCpuIdNotBetween(String value1, String value2) {
            addCriterion("SELLER_CPU_ID not between", value1, value2, "sellerCpuId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdIsNull() {
            addCriterion("SELLER_MAC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdIsNotNull() {
            addCriterion("SELLER_MAC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdEqualTo(String value) {
            addCriterion("SELLER_MAC_ID =", value, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdNotEqualTo(String value) {
            addCriterion("SELLER_MAC_ID <>", value, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdGreaterThan(String value) {
            addCriterion("SELLER_MAC_ID >", value, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_MAC_ID >=", value, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdLessThan(String value) {
            addCriterion("SELLER_MAC_ID <", value, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdLessThanOrEqualTo(String value) {
            addCriterion("SELLER_MAC_ID <=", value, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdLike(String value) {
            addCriterion("SELLER_MAC_ID like", value, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdNotLike(String value) {
            addCriterion("SELLER_MAC_ID not like", value, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdIn(List<String> values) {
            addCriterion("SELLER_MAC_ID in", values, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdNotIn(List<String> values) {
            addCriterion("SELLER_MAC_ID not in", values, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdBetween(String value1, String value2) {
            addCriterion("SELLER_MAC_ID between", value1, value2, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerMacIdNotBetween(String value1, String value2) {
            addCriterion("SELLER_MAC_ID not between", value1, value2, "sellerMacId");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoIsNull() {
            addCriterion("SELLER_COOKIE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoIsNotNull() {
            addCriterion("SELLER_COOKIE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoEqualTo(String value) {
            addCriterion("SELLER_COOKIE_INFO =", value, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoNotEqualTo(String value) {
            addCriterion("SELLER_COOKIE_INFO <>", value, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoGreaterThan(String value) {
            addCriterion("SELLER_COOKIE_INFO >", value, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_COOKIE_INFO >=", value, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoLessThan(String value) {
            addCriterion("SELLER_COOKIE_INFO <", value, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoLessThanOrEqualTo(String value) {
            addCriterion("SELLER_COOKIE_INFO <=", value, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoLike(String value) {
            addCriterion("SELLER_COOKIE_INFO like", value, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoNotLike(String value) {
            addCriterion("SELLER_COOKIE_INFO not like", value, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoIn(List<String> values) {
            addCriterion("SELLER_COOKIE_INFO in", values, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoNotIn(List<String> values) {
            addCriterion("SELLER_COOKIE_INFO not in", values, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoBetween(String value1, String value2) {
            addCriterion("SELLER_COOKIE_INFO between", value1, value2, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andSellerCookieInfoNotBetween(String value1, String value2) {
            addCriterion("SELLER_COOKIE_INFO not between", value1, value2, "sellerCookieInfo");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteIsNull() {
            addCriterion("TRANS_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteIsNotNull() {
            addCriterion("TRANS_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteEqualTo(String value) {
            addCriterion("TRANS_WEBSITE =", value, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteNotEqualTo(String value) {
            addCriterion("TRANS_WEBSITE <>", value, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteGreaterThan(String value) {
            addCriterion("TRANS_WEBSITE >", value, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_WEBSITE >=", value, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteLessThan(String value) {
            addCriterion("TRANS_WEBSITE <", value, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteLessThanOrEqualTo(String value) {
            addCriterion("TRANS_WEBSITE <=", value, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteLike(String value) {
            addCriterion("TRANS_WEBSITE like", value, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteNotLike(String value) {
            addCriterion("TRANS_WEBSITE not like", value, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteIn(List<String> values) {
            addCriterion("TRANS_WEBSITE in", values, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteNotIn(List<String> values) {
            addCriterion("TRANS_WEBSITE not in", values, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteBetween(String value1, String value2) {
            addCriterion("TRANS_WEBSITE between", value1, value2, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andTransWebsiteNotBetween(String value1, String value2) {
            addCriterion("TRANS_WEBSITE not between", value1, value2, "transWebsite");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2IsNull() {
            addCriterion("BUYER_NOTE2 is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2IsNotNull() {
            addCriterion("BUYER_NOTE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2EqualTo(String value) {
            addCriterion("BUYER_NOTE2 =", value, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2NotEqualTo(String value) {
            addCriterion("BUYER_NOTE2 <>", value, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2GreaterThan(String value) {
            addCriterion("BUYER_NOTE2 >", value, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2GreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NOTE2 >=", value, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2LessThan(String value) {
            addCriterion("BUYER_NOTE2 <", value, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2LessThanOrEqualTo(String value) {
            addCriterion("BUYER_NOTE2 <=", value, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2Like(String value) {
            addCriterion("BUYER_NOTE2 like", value, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2NotLike(String value) {
            addCriterion("BUYER_NOTE2 not like", value, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2In(List<String> values) {
            addCriterion("BUYER_NOTE2 in", values, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2NotIn(List<String> values) {
            addCriterion("BUYER_NOTE2 not in", values, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2Between(String value1, String value2) {
            addCriterion("BUYER_NOTE2 between", value1, value2, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2NotBetween(String value1, String value2) {
            addCriterion("BUYER_NOTE2 not between", value1, value2, "buyerNote2");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeIsNull() {
            addCriterion("BUYER_NOTE2_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeIsNotNull() {
            addCriterion("BUYER_NOTE2_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeEqualTo(Date value) {
            addCriterion("BUYER_NOTE2_TIME =", value, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeNotEqualTo(Date value) {
            addCriterion("BUYER_NOTE2_TIME <>", value, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeGreaterThan(Date value) {
            addCriterion("BUYER_NOTE2_TIME >", value, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_NOTE2_TIME >=", value, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeLessThan(Date value) {
            addCriterion("BUYER_NOTE2_TIME <", value, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_NOTE2_TIME <=", value, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeIn(List<Date> values) {
            addCriterion("BUYER_NOTE2_TIME in", values, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeNotIn(List<Date> values) {
            addCriterion("BUYER_NOTE2_TIME not in", values, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_NOTE2_TIME between", value1, value2, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote2TimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_NOTE2_TIME not between", value1, value2, "buyerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2IsNull() {
            addCriterion("SELLER_NOTE2 is null");
            return (Criteria) this;
        }

        public Criteria andSellerNote2IsNotNull() {
            addCriterion("SELLER_NOTE2 is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNote2EqualTo(String value) {
            addCriterion("SELLER_NOTE2 =", value, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2NotEqualTo(String value) {
            addCriterion("SELLER_NOTE2 <>", value, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2GreaterThan(String value) {
            addCriterion("SELLER_NOTE2 >", value, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2GreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE2 >=", value, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2LessThan(String value) {
            addCriterion("SELLER_NOTE2 <", value, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2LessThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE2 <=", value, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2Like(String value) {
            addCriterion("SELLER_NOTE2 like", value, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2NotLike(String value) {
            addCriterion("SELLER_NOTE2 not like", value, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2In(List<String> values) {
            addCriterion("SELLER_NOTE2 in", values, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2NotIn(List<String> values) {
            addCriterion("SELLER_NOTE2 not in", values, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2Between(String value1, String value2) {
            addCriterion("SELLER_NOTE2 between", value1, value2, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2NotBetween(String value1, String value2) {
            addCriterion("SELLER_NOTE2 not between", value1, value2, "sellerNote2");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeIsNull() {
            addCriterion("SELLER_NOTE2_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeIsNotNull() {
            addCriterion("SELLER_NOTE2_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeEqualTo(Date value) {
            addCriterion("SELLER_NOTE2_TIME =", value, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeNotEqualTo(Date value) {
            addCriterion("SELLER_NOTE2_TIME <>", value, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeGreaterThan(Date value) {
            addCriterion("SELLER_NOTE2_TIME >", value, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SELLER_NOTE2_TIME >=", value, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeLessThan(Date value) {
            addCriterion("SELLER_NOTE2_TIME <", value, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeLessThanOrEqualTo(Date value) {
            addCriterion("SELLER_NOTE2_TIME <=", value, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeIn(List<Date> values) {
            addCriterion("SELLER_NOTE2_TIME in", values, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeNotIn(List<Date> values) {
            addCriterion("SELLER_NOTE2_TIME not in", values, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeBetween(Date value1, Date value2) {
            addCriterion("SELLER_NOTE2_TIME between", value1, value2, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andSellerNote2TimeNotBetween(Date value1, Date value2) {
            addCriterion("SELLER_NOTE2_TIME not between", value1, value2, "sellerNote2Time");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusIsNull() {
            addCriterion("FEEDBACK_INVOKE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusIsNotNull() {
            addCriterion("FEEDBACK_INVOKE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusEqualTo(Short value) {
            addCriterion("FEEDBACK_INVOKE_STATUS =", value, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusNotEqualTo(Short value) {
            addCriterion("FEEDBACK_INVOKE_STATUS <>", value, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusGreaterThan(Short value) {
            addCriterion("FEEDBACK_INVOKE_STATUS >", value, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("FEEDBACK_INVOKE_STATUS >=", value, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusLessThan(Short value) {
            addCriterion("FEEDBACK_INVOKE_STATUS <", value, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusLessThanOrEqualTo(Short value) {
            addCriterion("FEEDBACK_INVOKE_STATUS <=", value, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusIn(List<Short> values) {
            addCriterion("FEEDBACK_INVOKE_STATUS in", values, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusNotIn(List<Short> values) {
            addCriterion("FEEDBACK_INVOKE_STATUS not in", values, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusBetween(Short value1, Short value2) {
            addCriterion("FEEDBACK_INVOKE_STATUS between", value1, value2, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackInvokeStatusNotBetween(Short value1, Short value2) {
            addCriterion("FEEDBACK_INVOKE_STATUS not between", value1, value2, "feedbackInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusIsNull() {
            addCriterion("POINT_INVOKE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusIsNotNull() {
            addCriterion("POINT_INVOKE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusEqualTo(Short value) {
            addCriterion("POINT_INVOKE_STATUS =", value, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusNotEqualTo(Short value) {
            addCriterion("POINT_INVOKE_STATUS <>", value, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusGreaterThan(Short value) {
            addCriterion("POINT_INVOKE_STATUS >", value, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("POINT_INVOKE_STATUS >=", value, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusLessThan(Short value) {
            addCriterion("POINT_INVOKE_STATUS <", value, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusLessThanOrEqualTo(Short value) {
            addCriterion("POINT_INVOKE_STATUS <=", value, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusIn(List<Short> values) {
            addCriterion("POINT_INVOKE_STATUS in", values, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusNotIn(List<Short> values) {
            addCriterion("POINT_INVOKE_STATUS not in", values, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusBetween(Short value1, Short value2) {
            addCriterion("POINT_INVOKE_STATUS between", value1, value2, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andPointInvokeStatusNotBetween(Short value1, Short value2) {
            addCriterion("POINT_INVOKE_STATUS not between", value1, value2, "pointInvokeStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIsNull() {
            addCriterion("MERCHANT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIsNotNull() {
            addCriterion("MERCHANT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderEqualTo(String value) {
            addCriterion("MERCHANT_ORDER =", value, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNotEqualTo(String value) {
            addCriterion("MERCHANT_ORDER <>", value, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderGreaterThan(String value) {
            addCriterion("MERCHANT_ORDER >", value, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER >=", value, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLessThan(String value) {
            addCriterion("MERCHANT_ORDER <", value, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER <=", value, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLike(String value) {
            addCriterion("MERCHANT_ORDER like", value, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNotLike(String value) {
            addCriterion("MERCHANT_ORDER not like", value, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIn(List<String> values) {
            addCriterion("MERCHANT_ORDER in", values, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNotIn(List<String> values) {
            addCriterion("MERCHANT_ORDER not in", values, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER between", value1, value2, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER not between", value1, value2, "merchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameIsNull() {
            addCriterion("MERCHANT_USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameIsNotNull() {
            addCriterion("MERCHANT_USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameEqualTo(String value) {
            addCriterion("MERCHANT_USR_NAME =", value, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameNotEqualTo(String value) {
            addCriterion("MERCHANT_USR_NAME <>", value, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameGreaterThan(String value) {
            addCriterion("MERCHANT_USR_NAME >", value, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_USR_NAME >=", value, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameLessThan(String value) {
            addCriterion("MERCHANT_USR_NAME <", value, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_USR_NAME <=", value, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameLike(String value) {
            addCriterion("MERCHANT_USR_NAME like", value, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameNotLike(String value) {
            addCriterion("MERCHANT_USR_NAME not like", value, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameIn(List<String> values) {
            addCriterion("MERCHANT_USR_NAME in", values, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameNotIn(List<String> values) {
            addCriterion("MERCHANT_USR_NAME not in", values, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameBetween(String value1, String value2) {
            addCriterion("MERCHANT_USR_NAME between", value1, value2, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrNameNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_USR_NAME not between", value1, value2, "merchantUsrName");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailIsNull() {
            addCriterion("MERCHANT_USR_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailIsNotNull() {
            addCriterion("MERCHANT_USR_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailEqualTo(String value) {
            addCriterion("MERCHANT_USR_EMAIL =", value, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailNotEqualTo(String value) {
            addCriterion("MERCHANT_USR_EMAIL <>", value, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailGreaterThan(String value) {
            addCriterion("MERCHANT_USR_EMAIL >", value, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_USR_EMAIL >=", value, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailLessThan(String value) {
            addCriterion("MERCHANT_USR_EMAIL <", value, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_USR_EMAIL <=", value, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailLike(String value) {
            addCriterion("MERCHANT_USR_EMAIL like", value, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailNotLike(String value) {
            addCriterion("MERCHANT_USR_EMAIL not like", value, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailIn(List<String> values) {
            addCriterion("MERCHANT_USR_EMAIL in", values, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailNotIn(List<String> values) {
            addCriterion("MERCHANT_USR_EMAIL not in", values, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailBetween(String value1, String value2) {
            addCriterion("MERCHANT_USR_EMAIL between", value1, value2, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantUsrEmailNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_USR_EMAIL not between", value1, value2, "merchantUsrEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlIsNull() {
            addCriterion("MERCHANT_BACKURL is null");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlIsNotNull() {
            addCriterion("MERCHANT_BACKURL is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlEqualTo(String value) {
            addCriterion("MERCHANT_BACKURL =", value, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlNotEqualTo(String value) {
            addCriterion("MERCHANT_BACKURL <>", value, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlGreaterThan(String value) {
            addCriterion("MERCHANT_BACKURL >", value, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_BACKURL >=", value, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlLessThan(String value) {
            addCriterion("MERCHANT_BACKURL <", value, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_BACKURL <=", value, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlLike(String value) {
            addCriterion("MERCHANT_BACKURL like", value, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlNotLike(String value) {
            addCriterion("MERCHANT_BACKURL not like", value, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlIn(List<String> values) {
            addCriterion("MERCHANT_BACKURL in", values, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlNotIn(List<String> values) {
            addCriterion("MERCHANT_BACKURL not in", values, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlBetween(String value1, String value2) {
            addCriterion("MERCHANT_BACKURL between", value1, value2, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantBackurlNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_BACKURL not between", value1, value2, "merchantBackurl");
            return (Criteria) this;
        }

        public Criteria andMerchantDateIsNull() {
            addCriterion("MERCHANT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMerchantDateIsNotNull() {
            addCriterion("MERCHANT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantDateEqualTo(String value) {
            addCriterion("MERCHANT_DATE =", value, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateNotEqualTo(String value) {
            addCriterion("MERCHANT_DATE <>", value, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateGreaterThan(String value) {
            addCriterion("MERCHANT_DATE >", value, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_DATE >=", value, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateLessThan(String value) {
            addCriterion("MERCHANT_DATE <", value, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_DATE <=", value, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateLike(String value) {
            addCriterion("MERCHANT_DATE like", value, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateNotLike(String value) {
            addCriterion("MERCHANT_DATE not like", value, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateIn(List<String> values) {
            addCriterion("MERCHANT_DATE in", values, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateNotIn(List<String> values) {
            addCriterion("MERCHANT_DATE not in", values, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateBetween(String value1, String value2) {
            addCriterion("MERCHANT_DATE between", value1, value2, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantDateNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_DATE not between", value1, value2, "merchantDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusIsNull() {
            addCriterion("MERCHANT_RESPOND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusIsNotNull() {
            addCriterion("MERCHANT_RESPOND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusEqualTo(Short value) {
            addCriterion("MERCHANT_RESPOND_STATUS =", value, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusNotEqualTo(Short value) {
            addCriterion("MERCHANT_RESPOND_STATUS <>", value, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusGreaterThan(Short value) {
            addCriterion("MERCHANT_RESPOND_STATUS >", value, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("MERCHANT_RESPOND_STATUS >=", value, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusLessThan(Short value) {
            addCriterion("MERCHANT_RESPOND_STATUS <", value, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusLessThanOrEqualTo(Short value) {
            addCriterion("MERCHANT_RESPOND_STATUS <=", value, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusIn(List<Short> values) {
            addCriterion("MERCHANT_RESPOND_STATUS in", values, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusNotIn(List<Short> values) {
            addCriterion("MERCHANT_RESPOND_STATUS not in", values, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusBetween(Short value1, Short value2) {
            addCriterion("MERCHANT_RESPOND_STATUS between", value1, value2, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantRespondStatusNotBetween(Short value1, Short value2) {
            addCriterion("MERCHANT_RESPOND_STATUS not between", value1, value2, "merchantRespondStatus");
            return (Criteria) this;
        }

        public Criteria andChargesAmountIsNull() {
            addCriterion("CHARGES_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChargesAmountIsNotNull() {
            addCriterion("CHARGES_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChargesAmountEqualTo(BigDecimal value) {
            addCriterion("CHARGES_AMOUNT =", value, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountNotEqualTo(BigDecimal value) {
            addCriterion("CHARGES_AMOUNT <>", value, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountGreaterThan(BigDecimal value) {
            addCriterion("CHARGES_AMOUNT >", value, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGES_AMOUNT >=", value, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountLessThan(BigDecimal value) {
            addCriterion("CHARGES_AMOUNT <", value, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGES_AMOUNT <=", value, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountIn(List<BigDecimal> values) {
            addCriterion("CHARGES_AMOUNT in", values, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountNotIn(List<BigDecimal> values) {
            addCriterion("CHARGES_AMOUNT not in", values, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGES_AMOUNT between", value1, value2, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andChargesAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGES_AMOUNT not between", value1, value2, "chargesAmount");
            return (Criteria) this;
        }

        public Criteria andSearchSiteIsNull() {
            addCriterion("SEARCH_SITE is null");
            return (Criteria) this;
        }

        public Criteria andSearchSiteIsNotNull() {
            addCriterion("SEARCH_SITE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchSiteEqualTo(Short value) {
            addCriterion("SEARCH_SITE =", value, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteNotEqualTo(Short value) {
            addCriterion("SEARCH_SITE <>", value, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteGreaterThan(Short value) {
            addCriterion("SEARCH_SITE >", value, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteGreaterThanOrEqualTo(Short value) {
            addCriterion("SEARCH_SITE >=", value, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteLessThan(Short value) {
            addCriterion("SEARCH_SITE <", value, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteLessThanOrEqualTo(Short value) {
            addCriterion("SEARCH_SITE <=", value, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteIn(List<Short> values) {
            addCriterion("SEARCH_SITE in", values, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteNotIn(List<Short> values) {
            addCriterion("SEARCH_SITE not in", values, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteBetween(Short value1, Short value2) {
            addCriterion("SEARCH_SITE between", value1, value2, "searchSite");
            return (Criteria) this;
        }

        public Criteria andSearchSiteNotBetween(Short value1, Short value2) {
            addCriterion("SEARCH_SITE not between", value1, value2, "searchSite");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryIsNull() {
            addCriterion("PRD_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryIsNotNull() {
            addCriterion("PRD_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryEqualTo(String value) {
            addCriterion("PRD_CATEGORY =", value, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryNotEqualTo(String value) {
            addCriterion("PRD_CATEGORY <>", value, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryGreaterThan(String value) {
            addCriterion("PRD_CATEGORY >", value, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_CATEGORY >=", value, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryLessThan(String value) {
            addCriterion("PRD_CATEGORY <", value, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryLessThanOrEqualTo(String value) {
            addCriterion("PRD_CATEGORY <=", value, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryLike(String value) {
            addCriterion("PRD_CATEGORY like", value, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryNotLike(String value) {
            addCriterion("PRD_CATEGORY not like", value, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryIn(List<String> values) {
            addCriterion("PRD_CATEGORY in", values, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryNotIn(List<String> values) {
            addCriterion("PRD_CATEGORY not in", values, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryBetween(String value1, String value2) {
            addCriterion("PRD_CATEGORY between", value1, value2, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdCategoryNotBetween(String value1, String value2) {
            addCriterion("PRD_CATEGORY not between", value1, value2, "prdCategory");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdIsNull() {
            addCriterion("PRD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdIsNotNull() {
            addCriterion("PRD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdEqualTo(String value) {
            addCriterion("PRD_ITEM_ID =", value, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdNotEqualTo(String value) {
            addCriterion("PRD_ITEM_ID <>", value, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdGreaterThan(String value) {
            addCriterion("PRD_ITEM_ID >", value, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_ITEM_ID >=", value, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdLessThan(String value) {
            addCriterion("PRD_ITEM_ID <", value, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdLessThanOrEqualTo(String value) {
            addCriterion("PRD_ITEM_ID <=", value, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdLike(String value) {
            addCriterion("PRD_ITEM_ID like", value, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdNotLike(String value) {
            addCriterion("PRD_ITEM_ID not like", value, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdIn(List<String> values) {
            addCriterion("PRD_ITEM_ID in", values, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdNotIn(List<String> values) {
            addCriterion("PRD_ITEM_ID not in", values, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdBetween(String value1, String value2) {
            addCriterion("PRD_ITEM_ID between", value1, value2, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdItemIdNotBetween(String value1, String value2) {
            addCriterion("PRD_ITEM_ID not between", value1, value2, "prdItemId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIsNull() {
            addCriterion("PRD_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIsNotNull() {
            addCriterion("PRD_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyEqualTo(String value) {
            addCriterion("PRD_CURRENCY =", value, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyNotEqualTo(String value) {
            addCriterion("PRD_CURRENCY <>", value, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyGreaterThan(String value) {
            addCriterion("PRD_CURRENCY >", value, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_CURRENCY >=", value, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyLessThan(String value) {
            addCriterion("PRD_CURRENCY <", value, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyLessThanOrEqualTo(String value) {
            addCriterion("PRD_CURRENCY <=", value, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyLike(String value) {
            addCriterion("PRD_CURRENCY like", value, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyNotLike(String value) {
            addCriterion("PRD_CURRENCY not like", value, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIn(List<String> values) {
            addCriterion("PRD_CURRENCY in", values, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyNotIn(List<String> values) {
            addCriterion("PRD_CURRENCY not in", values, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyBetween(String value1, String value2) {
            addCriterion("PRD_CURRENCY between", value1, value2, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyNotBetween(String value1, String value2) {
            addCriterion("PRD_CURRENCY not between", value1, value2, "prdCurrency");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceIsNull() {
            addCriterion("PRD_SAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceIsNotNull() {
            addCriterion("PRD_SAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceEqualTo(BigDecimal value) {
            addCriterion("PRD_SAL_PRICE =", value, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRD_SAL_PRICE <>", value, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceGreaterThan(BigDecimal value) {
            addCriterion("PRD_SAL_PRICE >", value, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRD_SAL_PRICE >=", value, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceLessThan(BigDecimal value) {
            addCriterion("PRD_SAL_PRICE <", value, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRD_SAL_PRICE <=", value, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceIn(List<BigDecimal> values) {
            addCriterion("PRD_SAL_PRICE in", values, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRD_SAL_PRICE not in", values, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRD_SAL_PRICE between", value1, value2, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRD_SAL_PRICE not between", value1, value2, "prdSalPrice");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeIsNull() {
            addCriterion("PRD_SAL_SHIPPING_FEE is null");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeIsNotNull() {
            addCriterion("PRD_SAL_SHIPPING_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeEqualTo(BigDecimal value) {
            addCriterion("PRD_SAL_SHIPPING_FEE =", value, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeNotEqualTo(BigDecimal value) {
            addCriterion("PRD_SAL_SHIPPING_FEE <>", value, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeGreaterThan(BigDecimal value) {
            addCriterion("PRD_SAL_SHIPPING_FEE >", value, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRD_SAL_SHIPPING_FEE >=", value, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeLessThan(BigDecimal value) {
            addCriterion("PRD_SAL_SHIPPING_FEE <", value, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRD_SAL_SHIPPING_FEE <=", value, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeIn(List<BigDecimal> values) {
            addCriterion("PRD_SAL_SHIPPING_FEE in", values, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeNotIn(List<BigDecimal> values) {
            addCriterion("PRD_SAL_SHIPPING_FEE not in", values, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRD_SAL_SHIPPING_FEE between", value1, value2, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPrdSalShippingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRD_SAL_SHIPPING_FEE not between", value1, value2, "prdSalShippingFee");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusIsNull() {
            addCriterion("PARTNER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusIsNotNull() {
            addCriterion("PARTNER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusEqualTo(Short value) {
            addCriterion("PARTNER_STATUS =", value, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusNotEqualTo(Short value) {
            addCriterion("PARTNER_STATUS <>", value, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusGreaterThan(Short value) {
            addCriterion("PARTNER_STATUS >", value, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("PARTNER_STATUS >=", value, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusLessThan(Short value) {
            addCriterion("PARTNER_STATUS <", value, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusLessThanOrEqualTo(Short value) {
            addCriterion("PARTNER_STATUS <=", value, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusIn(List<Short> values) {
            addCriterion("PARTNER_STATUS in", values, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusNotIn(List<Short> values) {
            addCriterion("PARTNER_STATUS not in", values, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusBetween(Short value1, Short value2) {
            addCriterion("PARTNER_STATUS between", value1, value2, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerStatusNotBetween(Short value1, Short value2) {
            addCriterion("PARTNER_STATUS not between", value1, value2, "partnerStatus");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeIsNull() {
            addCriterion("PARTNER_CONFIRM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeIsNotNull() {
            addCriterion("PARTNER_CONFIRM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeEqualTo(Date value) {
            addCriterion("PARTNER_CONFIRM_TIME =", value, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeNotEqualTo(Date value) {
            addCriterion("PARTNER_CONFIRM_TIME <>", value, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeGreaterThan(Date value) {
            addCriterion("PARTNER_CONFIRM_TIME >", value, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PARTNER_CONFIRM_TIME >=", value, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeLessThan(Date value) {
            addCriterion("PARTNER_CONFIRM_TIME <", value, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("PARTNER_CONFIRM_TIME <=", value, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeIn(List<Date> values) {
            addCriterion("PARTNER_CONFIRM_TIME in", values, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeNotIn(List<Date> values) {
            addCriterion("PARTNER_CONFIRM_TIME not in", values, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("PARTNER_CONFIRM_TIME between", value1, value2, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("PARTNER_CONFIRM_TIME not between", value1, value2, "partnerConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteIsNull() {
            addCriterion("PARTNER_CONFIRM_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteIsNotNull() {
            addCriterion("PARTNER_CONFIRM_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteEqualTo(String value) {
            addCriterion("PARTNER_CONFIRM_NOTE =", value, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteNotEqualTo(String value) {
            addCriterion("PARTNER_CONFIRM_NOTE <>", value, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteGreaterThan(String value) {
            addCriterion("PARTNER_CONFIRM_NOTE >", value, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNER_CONFIRM_NOTE >=", value, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteLessThan(String value) {
            addCriterion("PARTNER_CONFIRM_NOTE <", value, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteLessThanOrEqualTo(String value) {
            addCriterion("PARTNER_CONFIRM_NOTE <=", value, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteLike(String value) {
            addCriterion("PARTNER_CONFIRM_NOTE like", value, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteNotLike(String value) {
            addCriterion("PARTNER_CONFIRM_NOTE not like", value, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteIn(List<String> values) {
            addCriterion("PARTNER_CONFIRM_NOTE in", values, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteNotIn(List<String> values) {
            addCriterion("PARTNER_CONFIRM_NOTE not in", values, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteBetween(String value1, String value2) {
            addCriterion("PARTNER_CONFIRM_NOTE between", value1, value2, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerConfirmNoteNotBetween(String value1, String value2) {
            addCriterion("PARTNER_CONFIRM_NOTE not between", value1, value2, "partnerConfirmNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeIsNull() {
            addCriterion("PARTNER_PURCHASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeIsNotNull() {
            addCriterion("PARTNER_PURCHASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeEqualTo(Date value) {
            addCriterion("PARTNER_PURCHASE_TIME =", value, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeNotEqualTo(Date value) {
            addCriterion("PARTNER_PURCHASE_TIME <>", value, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeGreaterThan(Date value) {
            addCriterion("PARTNER_PURCHASE_TIME >", value, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PARTNER_PURCHASE_TIME >=", value, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeLessThan(Date value) {
            addCriterion("PARTNER_PURCHASE_TIME <", value, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("PARTNER_PURCHASE_TIME <=", value, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeIn(List<Date> values) {
            addCriterion("PARTNER_PURCHASE_TIME in", values, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeNotIn(List<Date> values) {
            addCriterion("PARTNER_PURCHASE_TIME not in", values, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeBetween(Date value1, Date value2) {
            addCriterion("PARTNER_PURCHASE_TIME between", value1, value2, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("PARTNER_PURCHASE_TIME not between", value1, value2, "partnerPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteIsNull() {
            addCriterion("PARTNER_PURCHASE_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteIsNotNull() {
            addCriterion("PARTNER_PURCHASE_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteEqualTo(String value) {
            addCriterion("PARTNER_PURCHASE_NOTE =", value, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteNotEqualTo(String value) {
            addCriterion("PARTNER_PURCHASE_NOTE <>", value, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteGreaterThan(String value) {
            addCriterion("PARTNER_PURCHASE_NOTE >", value, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNER_PURCHASE_NOTE >=", value, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteLessThan(String value) {
            addCriterion("PARTNER_PURCHASE_NOTE <", value, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteLessThanOrEqualTo(String value) {
            addCriterion("PARTNER_PURCHASE_NOTE <=", value, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteLike(String value) {
            addCriterion("PARTNER_PURCHASE_NOTE like", value, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteNotLike(String value) {
            addCriterion("PARTNER_PURCHASE_NOTE not like", value, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteIn(List<String> values) {
            addCriterion("PARTNER_PURCHASE_NOTE in", values, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteNotIn(List<String> values) {
            addCriterion("PARTNER_PURCHASE_NOTE not in", values, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteBetween(String value1, String value2) {
            addCriterion("PARTNER_PURCHASE_NOTE between", value1, value2, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerPurchaseNoteNotBetween(String value1, String value2) {
            addCriterion("PARTNER_PURCHASE_NOTE not between", value1, value2, "partnerPurchaseNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeIsNull() {
            addCriterion("PARTNER_SHIPPING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeIsNotNull() {
            addCriterion("PARTNER_SHIPPING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeEqualTo(Date value) {
            addCriterion("PARTNER_SHIPPING_TIME =", value, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeNotEqualTo(Date value) {
            addCriterion("PARTNER_SHIPPING_TIME <>", value, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeGreaterThan(Date value) {
            addCriterion("PARTNER_SHIPPING_TIME >", value, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PARTNER_SHIPPING_TIME >=", value, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeLessThan(Date value) {
            addCriterion("PARTNER_SHIPPING_TIME <", value, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeLessThanOrEqualTo(Date value) {
            addCriterion("PARTNER_SHIPPING_TIME <=", value, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeIn(List<Date> values) {
            addCriterion("PARTNER_SHIPPING_TIME in", values, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeNotIn(List<Date> values) {
            addCriterion("PARTNER_SHIPPING_TIME not in", values, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeBetween(Date value1, Date value2) {
            addCriterion("PARTNER_SHIPPING_TIME between", value1, value2, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingTimeNotBetween(Date value1, Date value2) {
            addCriterion("PARTNER_SHIPPING_TIME not between", value1, value2, "partnerShippingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteIsNull() {
            addCriterion("PARTNER_SHIPPING_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteIsNotNull() {
            addCriterion("PARTNER_SHIPPING_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteEqualTo(String value) {
            addCriterion("PARTNER_SHIPPING_NOTE =", value, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteNotEqualTo(String value) {
            addCriterion("PARTNER_SHIPPING_NOTE <>", value, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteGreaterThan(String value) {
            addCriterion("PARTNER_SHIPPING_NOTE >", value, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNER_SHIPPING_NOTE >=", value, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteLessThan(String value) {
            addCriterion("PARTNER_SHIPPING_NOTE <", value, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteLessThanOrEqualTo(String value) {
            addCriterion("PARTNER_SHIPPING_NOTE <=", value, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteLike(String value) {
            addCriterion("PARTNER_SHIPPING_NOTE like", value, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteNotLike(String value) {
            addCriterion("PARTNER_SHIPPING_NOTE not like", value, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteIn(List<String> values) {
            addCriterion("PARTNER_SHIPPING_NOTE in", values, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteNotIn(List<String> values) {
            addCriterion("PARTNER_SHIPPING_NOTE not in", values, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteBetween(String value1, String value2) {
            addCriterion("PARTNER_SHIPPING_NOTE between", value1, value2, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andPartnerShippingNoteNotBetween(String value1, String value2) {
            addCriterion("PARTNER_SHIPPING_NOTE not between", value1, value2, "partnerShippingNote");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("INVOICE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("INVOICE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("INVOICE_TITLE =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("INVOICE_TITLE <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("INVOICE_TITLE >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TITLE >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("INVOICE_TITLE <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TITLE <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("INVOICE_TITLE like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("INVOICE_TITLE not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("INVOICE_TITLE in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("INVOICE_TITLE not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("INVOICE_TITLE between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TITLE not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNull() {
            addCriterion("INVOICE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNotNull() {
            addCriterion("INVOICE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentEqualTo(String value) {
            addCriterion("INVOICE_CONTENT =", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotEqualTo(String value) {
            addCriterion("INVOICE_CONTENT <>", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThan(String value) {
            addCriterion("INVOICE_CONTENT >", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTENT >=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThan(String value) {
            addCriterion("INVOICE_CONTENT <", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTENT <=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLike(String value) {
            addCriterion("INVOICE_CONTENT like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotLike(String value) {
            addCriterion("INVOICE_CONTENT not like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIn(List<String> values) {
            addCriterion("INVOICE_CONTENT in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotIn(List<String> values) {
            addCriterion("INVOICE_CONTENT not in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTENT between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTENT not between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Short value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Short value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Short value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Short value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Short> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Short> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Short value1, Short value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdIsNull() {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdIsNotNull() {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdEqualTo(Short value) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID =", value, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdNotEqualTo(Short value) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID <>", value, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdGreaterThan(Short value) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID >", value, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdGreaterThanOrEqualTo(Short value) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID >=", value, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdLessThan(Short value) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID <", value, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdLessThanOrEqualTo(Short value) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID <=", value, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdIn(List<Short> values) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID in", values, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdNotIn(List<Short> values) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID not in", values, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdBetween(Short value1, Short value2) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID between", value1, value2, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andCheckoutMerchantPrivsIdNotBetween(Short value1, Short value2) {
            addCriterion("CHECKOUT_MERCHANT_PRIVS_ID not between", value1, value2, "checkoutMerchantPrivsId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("MERCHANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("MERCHANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Short value) {
            addCriterion("MERCHANT_ID =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Short value) {
            addCriterion("MERCHANT_ID <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Short value) {
            addCriterion("MERCHANT_ID >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Short value) {
            addCriterion("MERCHANT_ID >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Short value) {
            addCriterion("MERCHANT_ID <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Short value) {
            addCriterion("MERCHANT_ID <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Short> values) {
            addCriterion("MERCHANT_ID in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Short> values) {
            addCriterion("MERCHANT_ID not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Short value1, Short value2) {
            addCriterion("MERCHANT_ID between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Short value1, Short value2) {
            addCriterion("MERCHANT_ID not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseIsNull() {
            addCriterion("INVOICE_IN_USE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseIsNotNull() {
            addCriterion("INVOICE_IN_USE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseEqualTo(Short value) {
            addCriterion("INVOICE_IN_USE =", value, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseNotEqualTo(Short value) {
            addCriterion("INVOICE_IN_USE <>", value, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseGreaterThan(Short value) {
            addCriterion("INVOICE_IN_USE >", value, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_IN_USE >=", value, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseLessThan(Short value) {
            addCriterion("INVOICE_IN_USE <", value, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_IN_USE <=", value, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseIn(List<Short> values) {
            addCriterion("INVOICE_IN_USE in", values, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseNotIn(List<Short> values) {
            addCriterion("INVOICE_IN_USE not in", values, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseBetween(Short value1, Short value2) {
            addCriterion("INVOICE_IN_USE between", value1, value2, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andInvoiceInUseNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_IN_USE not between", value1, value2, "invoiceInUse");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("DELIVER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("DELIVER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Short value) {
            addCriterion("DELIVER_TIME =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Short value) {
            addCriterion("DELIVER_TIME <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Short value) {
            addCriterion("DELIVER_TIME >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Short value) {
            addCriterion("DELIVER_TIME >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Short value) {
            addCriterion("DELIVER_TIME <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Short value) {
            addCriterion("DELIVER_TIME <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Short> values) {
            addCriterion("DELIVER_TIME in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Short> values) {
            addCriterion("DELIVER_TIME not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Short value1, Short value2) {
            addCriterion("DELIVER_TIME between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Short value1, Short value2) {
            addCriterion("DELIVER_TIME not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagIsNull() {
            addCriterion("DELIVER_CONFIM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagIsNotNull() {
            addCriterion("DELIVER_CONFIM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagEqualTo(Short value) {
            addCriterion("DELIVER_CONFIM_FLAG =", value, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagNotEqualTo(Short value) {
            addCriterion("DELIVER_CONFIM_FLAG <>", value, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagGreaterThan(Short value) {
            addCriterion("DELIVER_CONFIM_FLAG >", value, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("DELIVER_CONFIM_FLAG >=", value, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagLessThan(Short value) {
            addCriterion("DELIVER_CONFIM_FLAG <", value, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagLessThanOrEqualTo(Short value) {
            addCriterion("DELIVER_CONFIM_FLAG <=", value, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagIn(List<Short> values) {
            addCriterion("DELIVER_CONFIM_FLAG in", values, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagNotIn(List<Short> values) {
            addCriterion("DELIVER_CONFIM_FLAG not in", values, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagBetween(Short value1, Short value2) {
            addCriterion("DELIVER_CONFIM_FLAG between", value1, value2, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverConfimFlagNotBetween(Short value1, Short value2) {
            addCriterion("DELIVER_CONFIM_FLAG not between", value1, value2, "deliverConfimFlag");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdIsNull() {
            addCriterion("POSTOFFICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdIsNotNull() {
            addCriterion("POSTOFFICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdEqualTo(BigDecimal value) {
            addCriterion("POSTOFFICE_ID =", value, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdNotEqualTo(BigDecimal value) {
            addCriterion("POSTOFFICE_ID <>", value, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdGreaterThan(BigDecimal value) {
            addCriterion("POSTOFFICE_ID >", value, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POSTOFFICE_ID >=", value, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdLessThan(BigDecimal value) {
            addCriterion("POSTOFFICE_ID <", value, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POSTOFFICE_ID <=", value, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdIn(List<BigDecimal> values) {
            addCriterion("POSTOFFICE_ID in", values, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdNotIn(List<BigDecimal> values) {
            addCriterion("POSTOFFICE_ID not in", values, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSTOFFICE_ID between", value1, value2, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSTOFFICE_ID not between", value1, value2, "postofficeId");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameIsNull() {
            addCriterion("POSTOFFICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameIsNotNull() {
            addCriterion("POSTOFFICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameEqualTo(String value) {
            addCriterion("POSTOFFICE_NAME =", value, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameNotEqualTo(String value) {
            addCriterion("POSTOFFICE_NAME <>", value, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameGreaterThan(String value) {
            addCriterion("POSTOFFICE_NAME >", value, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameGreaterThanOrEqualTo(String value) {
            addCriterion("POSTOFFICE_NAME >=", value, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameLessThan(String value) {
            addCriterion("POSTOFFICE_NAME <", value, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameLessThanOrEqualTo(String value) {
            addCriterion("POSTOFFICE_NAME <=", value, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameLike(String value) {
            addCriterion("POSTOFFICE_NAME like", value, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameNotLike(String value) {
            addCriterion("POSTOFFICE_NAME not like", value, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameIn(List<String> values) {
            addCriterion("POSTOFFICE_NAME in", values, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameNotIn(List<String> values) {
            addCriterion("POSTOFFICE_NAME not in", values, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameBetween(String value1, String value2) {
            addCriterion("POSTOFFICE_NAME between", value1, value2, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPostofficeNameNotBetween(String value1, String value2) {
            addCriterion("POSTOFFICE_NAME not between", value1, value2, "postofficeName");
            return (Criteria) this;
        }

        public Criteria andPayedAmountIsNull() {
            addCriterion("PAYED_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayedAmountIsNotNull() {
            addCriterion("PAYED_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayedAmountEqualTo(BigDecimal value) {
            addCriterion("PAYED_AMOUNT =", value, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountNotEqualTo(BigDecimal value) {
            addCriterion("PAYED_AMOUNT <>", value, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountGreaterThan(BigDecimal value) {
            addCriterion("PAYED_AMOUNT >", value, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYED_AMOUNT >=", value, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountLessThan(BigDecimal value) {
            addCriterion("PAYED_AMOUNT <", value, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYED_AMOUNT <=", value, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountIn(List<BigDecimal> values) {
            addCriterion("PAYED_AMOUNT in", values, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountNotIn(List<BigDecimal> values) {
            addCriterion("PAYED_AMOUNT not in", values, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYED_AMOUNT between", value1, value2, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andPayedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYED_AMOUNT not between", value1, value2, "payedAmount");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andTelNumberIsNull() {
            addCriterion("TEL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTelNumberIsNotNull() {
            addCriterion("TEL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTelNumberEqualTo(String value) {
            addCriterion("TEL_NUMBER =", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotEqualTo(String value) {
            addCriterion("TEL_NUMBER <>", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberGreaterThan(String value) {
            addCriterion("TEL_NUMBER >", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_NUMBER >=", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLessThan(String value) {
            addCriterion("TEL_NUMBER <", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLessThanOrEqualTo(String value) {
            addCriterion("TEL_NUMBER <=", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLike(String value) {
            addCriterion("TEL_NUMBER like", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotLike(String value) {
            addCriterion("TEL_NUMBER not like", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberIn(List<String> values) {
            addCriterion("TEL_NUMBER in", values, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotIn(List<String> values) {
            addCriterion("TEL_NUMBER not in", values, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberBetween(String value1, String value2) {
            addCriterion("TEL_NUMBER between", value1, value2, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotBetween(String value1, String value2) {
            addCriterion("TEL_NUMBER not between", value1, value2, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeIsNull() {
            addCriterion("TEL_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeIsNotNull() {
            addCriterion("TEL_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeEqualTo(String value) {
            addCriterion("TEL_AREA_CODE =", value, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeNotEqualTo(String value) {
            addCriterion("TEL_AREA_CODE <>", value, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeGreaterThan(String value) {
            addCriterion("TEL_AREA_CODE >", value, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_AREA_CODE >=", value, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeLessThan(String value) {
            addCriterion("TEL_AREA_CODE <", value, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("TEL_AREA_CODE <=", value, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeLike(String value) {
            addCriterion("TEL_AREA_CODE like", value, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeNotLike(String value) {
            addCriterion("TEL_AREA_CODE not like", value, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeIn(List<String> values) {
            addCriterion("TEL_AREA_CODE in", values, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeNotIn(List<String> values) {
            addCriterion("TEL_AREA_CODE not in", values, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeBetween(String value1, String value2) {
            addCriterion("TEL_AREA_CODE between", value1, value2, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andTelAreaCodeNotBetween(String value1, String value2) {
            addCriterion("TEL_AREA_CODE not between", value1, value2, "telAreaCode");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("COST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("COST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("COST_PRICE >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("COST_PRICE <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountIsNull() {
            addCriterion("REFER_TRANS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountIsNotNull() {
            addCriterion("REFER_TRANS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountEqualTo(BigDecimal value) {
            addCriterion("REFER_TRANS_AMOUNT =", value, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountNotEqualTo(BigDecimal value) {
            addCriterion("REFER_TRANS_AMOUNT <>", value, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountGreaterThan(BigDecimal value) {
            addCriterion("REFER_TRANS_AMOUNT >", value, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFER_TRANS_AMOUNT >=", value, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountLessThan(BigDecimal value) {
            addCriterion("REFER_TRANS_AMOUNT <", value, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFER_TRANS_AMOUNT <=", value, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountIn(List<BigDecimal> values) {
            addCriterion("REFER_TRANS_AMOUNT in", values, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountNotIn(List<BigDecimal> values) {
            addCriterion("REFER_TRANS_AMOUNT not in", values, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFER_TRANS_AMOUNT between", value1, value2, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andReferTransAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFER_TRANS_AMOUNT not between", value1, value2, "referTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountIsNull() {
            addCriterion("ACTUAL_TRANS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountIsNotNull() {
            addCriterion("ACTUAL_TRANS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TRANS_AMOUNT =", value, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TRANS_AMOUNT <>", value, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_TRANS_AMOUNT >", value, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TRANS_AMOUNT >=", value, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountLessThan(BigDecimal value) {
            addCriterion("ACTUAL_TRANS_AMOUNT <", value, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TRANS_AMOUNT <=", value, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_TRANS_AMOUNT in", values, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_TRANS_AMOUNT not in", values, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_TRANS_AMOUNT between", value1, value2, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andActualTransAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_TRANS_AMOUNT not between", value1, value2, "actualTransAmount");
            return (Criteria) this;
        }

        public Criteria andUsedpointIsNull() {
            addCriterion("USEDPOINT is null");
            return (Criteria) this;
        }

        public Criteria andUsedpointIsNotNull() {
            addCriterion("USEDPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedpointEqualTo(BigDecimal value) {
            addCriterion("USEDPOINT =", value, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointNotEqualTo(BigDecimal value) {
            addCriterion("USEDPOINT <>", value, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointGreaterThan(BigDecimal value) {
            addCriterion("USEDPOINT >", value, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDPOINT >=", value, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointLessThan(BigDecimal value) {
            addCriterion("USEDPOINT <", value, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDPOINT <=", value, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointIn(List<BigDecimal> values) {
            addCriterion("USEDPOINT in", values, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointNotIn(List<BigDecimal> values) {
            addCriterion("USEDPOINT not in", values, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDPOINT between", value1, value2, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDPOINT not between", value1, value2, "usedpoint");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeIsNull() {
            addCriterion("USEDPOINTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeIsNotNull() {
            addCriterion("USEDPOINTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeEqualTo(BigDecimal value) {
            addCriterion("USEDPOINTTYPE =", value, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeNotEqualTo(BigDecimal value) {
            addCriterion("USEDPOINTTYPE <>", value, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeGreaterThan(BigDecimal value) {
            addCriterion("USEDPOINTTYPE >", value, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDPOINTTYPE >=", value, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeLessThan(BigDecimal value) {
            addCriterion("USEDPOINTTYPE <", value, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDPOINTTYPE <=", value, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeIn(List<BigDecimal> values) {
            addCriterion("USEDPOINTTYPE in", values, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeNotIn(List<BigDecimal> values) {
            addCriterion("USEDPOINTTYPE not in", values, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDPOINTTYPE between", value1, value2, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andUsedpointtypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDPOINTTYPE not between", value1, value2, "usedpointtype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeIsNull() {
            addCriterion("COUPONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCoupontypeIsNotNull() {
            addCriterion("COUPONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCoupontypeEqualTo(BigDecimal value) {
            addCriterion("COUPONTYPE =", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeNotEqualTo(BigDecimal value) {
            addCriterion("COUPONTYPE <>", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeGreaterThan(BigDecimal value) {
            addCriterion("COUPONTYPE >", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPONTYPE >=", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeLessThan(BigDecimal value) {
            addCriterion("COUPONTYPE <", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPONTYPE <=", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeIn(List<BigDecimal> values) {
            addCriterion("COUPONTYPE in", values, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeNotIn(List<BigDecimal> values) {
            addCriterion("COUPONTYPE not in", values, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPONTYPE between", value1, value2, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPONTYPE not between", value1, value2, "coupontype");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountIsNull() {
            addCriterion("USEDPOINTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountIsNotNull() {
            addCriterion("USEDPOINTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountEqualTo(BigDecimal value) {
            addCriterion("USEDPOINTAMOUNT =", value, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountNotEqualTo(BigDecimal value) {
            addCriterion("USEDPOINTAMOUNT <>", value, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountGreaterThan(BigDecimal value) {
            addCriterion("USEDPOINTAMOUNT >", value, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDPOINTAMOUNT >=", value, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountLessThan(BigDecimal value) {
            addCriterion("USEDPOINTAMOUNT <", value, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDPOINTAMOUNT <=", value, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountIn(List<BigDecimal> values) {
            addCriterion("USEDPOINTAMOUNT in", values, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountNotIn(List<BigDecimal> values) {
            addCriterion("USEDPOINTAMOUNT not in", values, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDPOINTAMOUNT between", value1, value2, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andUsedpointamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDPOINTAMOUNT not between", value1, value2, "usedpointamount");
            return (Criteria) this;
        }

        public Criteria andReserveFlagIsNull() {
            addCriterion("RESERVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReserveFlagIsNotNull() {
            addCriterion("RESERVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReserveFlagEqualTo(Short value) {
            addCriterion("RESERVE_FLAG =", value, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagNotEqualTo(Short value) {
            addCriterion("RESERVE_FLAG <>", value, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagGreaterThan(Short value) {
            addCriterion("RESERVE_FLAG >", value, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("RESERVE_FLAG >=", value, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagLessThan(Short value) {
            addCriterion("RESERVE_FLAG <", value, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagLessThanOrEqualTo(Short value) {
            addCriterion("RESERVE_FLAG <=", value, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagIn(List<Short> values) {
            addCriterion("RESERVE_FLAG in", values, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagNotIn(List<Short> values) {
            addCriterion("RESERVE_FLAG not in", values, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagBetween(Short value1, Short value2) {
            addCriterion("RESERVE_FLAG between", value1, value2, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andReserveFlagNotBetween(Short value1, Short value2) {
            addCriterion("RESERVE_FLAG not between", value1, value2, "reserveFlag");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeIsNull() {
            addCriterion("PAYMENT_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeIsNotNull() {
            addCriterion("PAYMENT_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeEqualTo(Date value) {
            addCriterion("PAYMENT_START_TIME =", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeNotEqualTo(Date value) {
            addCriterion("PAYMENT_START_TIME <>", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeGreaterThan(Date value) {
            addCriterion("PAYMENT_START_TIME >", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_START_TIME >=", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeLessThan(Date value) {
            addCriterion("PAYMENT_START_TIME <", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_START_TIME <=", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeIn(List<Date> values) {
            addCriterion("PAYMENT_START_TIME in", values, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeNotIn(List<Date> values) {
            addCriterion("PAYMENT_START_TIME not in", values, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_START_TIME between", value1, value2, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_START_TIME not between", value1, value2, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPointNameIsNull() {
            addCriterion("POINT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPointNameIsNotNull() {
            addCriterion("POINT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPointNameEqualTo(String value) {
            addCriterion("POINT_NAME =", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotEqualTo(String value) {
            addCriterion("POINT_NAME <>", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameGreaterThan(String value) {
            addCriterion("POINT_NAME >", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameGreaterThanOrEqualTo(String value) {
            addCriterion("POINT_NAME >=", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLessThan(String value) {
            addCriterion("POINT_NAME <", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLessThanOrEqualTo(String value) {
            addCriterion("POINT_NAME <=", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLike(String value) {
            addCriterion("POINT_NAME like", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotLike(String value) {
            addCriterion("POINT_NAME not like", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameIn(List<String> values) {
            addCriterion("POINT_NAME in", values, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotIn(List<String> values) {
            addCriterion("POINT_NAME not in", values, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameBetween(String value1, String value2) {
            addCriterion("POINT_NAME between", value1, value2, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotBetween(String value1, String value2) {
            addCriterion("POINT_NAME not between", value1, value2, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteIsNull() {
            addCriterion("POINT_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteIsNotNull() {
            addCriterion("POINT_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteEqualTo(String value) {
            addCriterion("POINT_WEBSITE =", value, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteNotEqualTo(String value) {
            addCriterion("POINT_WEBSITE <>", value, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteGreaterThan(String value) {
            addCriterion("POINT_WEBSITE >", value, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("POINT_WEBSITE >=", value, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteLessThan(String value) {
            addCriterion("POINT_WEBSITE <", value, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteLessThanOrEqualTo(String value) {
            addCriterion("POINT_WEBSITE <=", value, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteLike(String value) {
            addCriterion("POINT_WEBSITE like", value, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteNotLike(String value) {
            addCriterion("POINT_WEBSITE not like", value, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteIn(List<String> values) {
            addCriterion("POINT_WEBSITE in", values, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteNotIn(List<String> values) {
            addCriterion("POINT_WEBSITE not in", values, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteBetween(String value1, String value2) {
            addCriterion("POINT_WEBSITE between", value1, value2, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andPointWebsiteNotBetween(String value1, String value2) {
            addCriterion("POINT_WEBSITE not between", value1, value2, "pointWebsite");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceIsNull() {
            addCriterion("EXTRA_RECEIVE_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceIsNotNull() {
            addCriterion("EXTRA_RECEIVE_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceEqualTo(String value) {
            addCriterion("EXTRA_RECEIVE_INVOICE =", value, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceNotEqualTo(String value) {
            addCriterion("EXTRA_RECEIVE_INVOICE <>", value, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceGreaterThan(String value) {
            addCriterion("EXTRA_RECEIVE_INVOICE >", value, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA_RECEIVE_INVOICE >=", value, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceLessThan(String value) {
            addCriterion("EXTRA_RECEIVE_INVOICE <", value, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceLessThanOrEqualTo(String value) {
            addCriterion("EXTRA_RECEIVE_INVOICE <=", value, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceLike(String value) {
            addCriterion("EXTRA_RECEIVE_INVOICE like", value, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceNotLike(String value) {
            addCriterion("EXTRA_RECEIVE_INVOICE not like", value, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceIn(List<String> values) {
            addCriterion("EXTRA_RECEIVE_INVOICE in", values, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceNotIn(List<String> values) {
            addCriterion("EXTRA_RECEIVE_INVOICE not in", values, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceBetween(String value1, String value2) {
            addCriterion("EXTRA_RECEIVE_INVOICE between", value1, value2, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andExtraReceiveInvoiceNotBetween(String value1, String value2) {
            addCriterion("EXTRA_RECEIVE_INVOICE not between", value1, value2, "extraReceiveInvoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIsNull() {
            addCriterion("INVOICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIsNotNull() {
            addCriterion("INVOICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameEqualTo(String value) {
            addCriterion("INVOICE_NAME =", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotEqualTo(String value) {
            addCriterion("INVOICE_NAME <>", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameGreaterThan(String value) {
            addCriterion("INVOICE_NAME >", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NAME >=", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLessThan(String value) {
            addCriterion("INVOICE_NAME <", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NAME <=", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLike(String value) {
            addCriterion("INVOICE_NAME like", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotLike(String value) {
            addCriterion("INVOICE_NAME not like", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIn(List<String> values) {
            addCriterion("INVOICE_NAME in", values, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotIn(List<String> values) {
            addCriterion("INVOICE_NAME not in", values, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameBetween(String value1, String value2) {
            addCriterion("INVOICE_NAME between", value1, value2, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NAME not between", value1, value2, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIsNull() {
            addCriterion("INVOICE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIsNotNull() {
            addCriterion("INVOICE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelEqualTo(String value) {
            addCriterion("INVOICE_TEL =", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotEqualTo(String value) {
            addCriterion("INVOICE_TEL <>", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelGreaterThan(String value) {
            addCriterion("INVOICE_TEL >", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TEL >=", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLessThan(String value) {
            addCriterion("INVOICE_TEL <", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TEL <=", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLike(String value) {
            addCriterion("INVOICE_TEL like", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotLike(String value) {
            addCriterion("INVOICE_TEL not like", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIn(List<String> values) {
            addCriterion("INVOICE_TEL in", values, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotIn(List<String> values) {
            addCriterion("INVOICE_TEL not in", values, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelBetween(String value1, String value2) {
            addCriterion("INVOICE_TEL between", value1, value2, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TEL not between", value1, value2, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileIsNull() {
            addCriterion("INVOICE_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileIsNotNull() {
            addCriterion("INVOICE_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileEqualTo(String value) {
            addCriterion("INVOICE_MOBILE =", value, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileNotEqualTo(String value) {
            addCriterion("INVOICE_MOBILE <>", value, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileGreaterThan(String value) {
            addCriterion("INVOICE_MOBILE >", value, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_MOBILE >=", value, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileLessThan(String value) {
            addCriterion("INVOICE_MOBILE <", value, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_MOBILE <=", value, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileLike(String value) {
            addCriterion("INVOICE_MOBILE like", value, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileNotLike(String value) {
            addCriterion("INVOICE_MOBILE not like", value, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileIn(List<String> values) {
            addCriterion("INVOICE_MOBILE in", values, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileNotIn(List<String> values) {
            addCriterion("INVOICE_MOBILE not in", values, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileBetween(String value1, String value2) {
            addCriterion("INVOICE_MOBILE between", value1, value2, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceMobileNotBetween(String value1, String value2) {
            addCriterion("INVOICE_MOBILE not between", value1, value2, "invoiceMobile");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIsNull() {
            addCriterion("INVOICE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIsNotNull() {
            addCriterion("INVOICE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressEqualTo(String value) {
            addCriterion("INVOICE_ADDRESS =", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotEqualTo(String value) {
            addCriterion("INVOICE_ADDRESS <>", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressGreaterThan(String value) {
            addCriterion("INVOICE_ADDRESS >", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDRESS >=", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLessThan(String value) {
            addCriterion("INVOICE_ADDRESS <", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDRESS <=", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLike(String value) {
            addCriterion("INVOICE_ADDRESS like", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotLike(String value) {
            addCriterion("INVOICE_ADDRESS not like", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIn(List<String> values) {
            addCriterion("INVOICE_ADDRESS in", values, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotIn(List<String> values) {
            addCriterion("INVOICE_ADDRESS not in", values, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDRESS between", value1, value2, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDRESS not between", value1, value2, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeIsNull() {
            addCriterion("INVOICE_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeIsNotNull() {
            addCriterion("INVOICE_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeEqualTo(String value) {
            addCriterion("INVOICE_POSTCODE =", value, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeNotEqualTo(String value) {
            addCriterion("INVOICE_POSTCODE <>", value, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeGreaterThan(String value) {
            addCriterion("INVOICE_POSTCODE >", value, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_POSTCODE >=", value, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeLessThan(String value) {
            addCriterion("INVOICE_POSTCODE <", value, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_POSTCODE <=", value, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeLike(String value) {
            addCriterion("INVOICE_POSTCODE like", value, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeNotLike(String value) {
            addCriterion("INVOICE_POSTCODE not like", value, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeIn(List<String> values) {
            addCriterion("INVOICE_POSTCODE in", values, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeNotIn(List<String> values) {
            addCriterion("INVOICE_POSTCODE not in", values, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeBetween(String value1, String value2) {
            addCriterion("INVOICE_POSTCODE between", value1, value2, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andInvoicePostcodeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_POSTCODE not between", value1, value2, "invoicePostcode");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("BUYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("BUYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("BUYER_NAME =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("BUYER_NAME <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("BUYER_NAME >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("BUYER_NAME <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("BUYER_NAME like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("BUYER_NAME not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("BUYER_NAME in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("BUYER_NAME not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("BUYER_NAME between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("BUYER_NAME not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNull() {
            addCriterion("BUYER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNotNull() {
            addCriterion("BUYER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneEqualTo(String value) {
            addCriterion("BUYER_PHONE =", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotEqualTo(String value) {
            addCriterion("BUYER_PHONE <>", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThan(String value) {
            addCriterion("BUYER_PHONE >", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_PHONE >=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThan(String value) {
            addCriterion("BUYER_PHONE <", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThanOrEqualTo(String value) {
            addCriterion("BUYER_PHONE <=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLike(String value) {
            addCriterion("BUYER_PHONE like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotLike(String value) {
            addCriterion("BUYER_PHONE not like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIn(List<String> values) {
            addCriterion("BUYER_PHONE in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotIn(List<String> values) {
            addCriterion("BUYER_PHONE not in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneBetween(String value1, String value2) {
            addCriterion("BUYER_PHONE between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotBetween(String value1, String value2) {
            addCriterion("BUYER_PHONE not between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileIsNull() {
            addCriterion("BUYER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileIsNotNull() {
            addCriterion("BUYER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileEqualTo(String value) {
            addCriterion("BUYER_MOBILE =", value, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileNotEqualTo(String value) {
            addCriterion("BUYER_MOBILE <>", value, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileGreaterThan(String value) {
            addCriterion("BUYER_MOBILE >", value, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_MOBILE >=", value, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileLessThan(String value) {
            addCriterion("BUYER_MOBILE <", value, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileLessThanOrEqualTo(String value) {
            addCriterion("BUYER_MOBILE <=", value, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileLike(String value) {
            addCriterion("BUYER_MOBILE like", value, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileNotLike(String value) {
            addCriterion("BUYER_MOBILE not like", value, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileIn(List<String> values) {
            addCriterion("BUYER_MOBILE in", values, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileNotIn(List<String> values) {
            addCriterion("BUYER_MOBILE not in", values, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileBetween(String value1, String value2) {
            addCriterion("BUYER_MOBILE between", value1, value2, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerMobileNotBetween(String value1, String value2) {
            addCriterion("BUYER_MOBILE not between", value1, value2, "buyerMobile");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIsNull() {
            addCriterion("BUYER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIsNotNull() {
            addCriterion("BUYER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailEqualTo(String value) {
            addCriterion("BUYER_EMAIL =", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotEqualTo(String value) {
            addCriterion("BUYER_EMAIL <>", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailGreaterThan(String value) {
            addCriterion("BUYER_EMAIL >", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_EMAIL >=", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLessThan(String value) {
            addCriterion("BUYER_EMAIL <", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLessThanOrEqualTo(String value) {
            addCriterion("BUYER_EMAIL <=", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLike(String value) {
            addCriterion("BUYER_EMAIL like", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotLike(String value) {
            addCriterion("BUYER_EMAIL not like", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIn(List<String> values) {
            addCriterion("BUYER_EMAIL in", values, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotIn(List<String> values) {
            addCriterion("BUYER_EMAIL not in", values, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailBetween(String value1, String value2) {
            addCriterion("BUYER_EMAIL between", value1, value2, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotBetween(String value1, String value2) {
            addCriterion("BUYER_EMAIL not between", value1, value2, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeIsNull() {
            addCriterion("BUYER_POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeIsNotNull() {
            addCriterion("BUYER_POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeEqualTo(String value) {
            addCriterion("BUYER_POST_CODE =", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeNotEqualTo(String value) {
            addCriterion("BUYER_POST_CODE <>", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeGreaterThan(String value) {
            addCriterion("BUYER_POST_CODE >", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_POST_CODE >=", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeLessThan(String value) {
            addCriterion("BUYER_POST_CODE <", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeLessThanOrEqualTo(String value) {
            addCriterion("BUYER_POST_CODE <=", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeLike(String value) {
            addCriterion("BUYER_POST_CODE like", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeNotLike(String value) {
            addCriterion("BUYER_POST_CODE not like", value, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeIn(List<String> values) {
            addCriterion("BUYER_POST_CODE in", values, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeNotIn(List<String> values) {
            addCriterion("BUYER_POST_CODE not in", values, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeBetween(String value1, String value2) {
            addCriterion("BUYER_POST_CODE between", value1, value2, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerPostCodeNotBetween(String value1, String value2) {
            addCriterion("BUYER_POST_CODE not between", value1, value2, "buyerPostCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("BUYER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("BUYER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("BUYER_ADDRESS =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("BUYER_ADDRESS <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("BUYER_ADDRESS >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_ADDRESS >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("BUYER_ADDRESS <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("BUYER_ADDRESS <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("BUYER_ADDRESS like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("BUYER_ADDRESS not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("BUYER_ADDRESS in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("BUYER_ADDRESS not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("BUYER_ADDRESS between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("BUYER_ADDRESS not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeIsNull() {
            addCriterion("TRANS_PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeIsNotNull() {
            addCriterion("TRANS_PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeEqualTo(String value) {
            addCriterion("TRANS_PROVINCE_CODE =", value, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeNotEqualTo(String value) {
            addCriterion("TRANS_PROVINCE_CODE <>", value, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeGreaterThan(String value) {
            addCriterion("TRANS_PROVINCE_CODE >", value, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_PROVINCE_CODE >=", value, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeLessThan(String value) {
            addCriterion("TRANS_PROVINCE_CODE <", value, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_PROVINCE_CODE <=", value, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeLike(String value) {
            addCriterion("TRANS_PROVINCE_CODE like", value, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeNotLike(String value) {
            addCriterion("TRANS_PROVINCE_CODE not like", value, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeIn(List<String> values) {
            addCriterion("TRANS_PROVINCE_CODE in", values, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeNotIn(List<String> values) {
            addCriterion("TRANS_PROVINCE_CODE not in", values, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeBetween(String value1, String value2) {
            addCriterion("TRANS_PROVINCE_CODE between", value1, value2, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("TRANS_PROVINCE_CODE not between", value1, value2, "transProvinceCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeIsNull() {
            addCriterion("TRANS_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeIsNotNull() {
            addCriterion("TRANS_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeEqualTo(String value) {
            addCriterion("TRANS_CITY_CODE =", value, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeNotEqualTo(String value) {
            addCriterion("TRANS_CITY_CODE <>", value, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeGreaterThan(String value) {
            addCriterion("TRANS_CITY_CODE >", value, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CITY_CODE >=", value, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeLessThan(String value) {
            addCriterion("TRANS_CITY_CODE <", value, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CITY_CODE <=", value, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeLike(String value) {
            addCriterion("TRANS_CITY_CODE like", value, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeNotLike(String value) {
            addCriterion("TRANS_CITY_CODE not like", value, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeIn(List<String> values) {
            addCriterion("TRANS_CITY_CODE in", values, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeNotIn(List<String> values) {
            addCriterion("TRANS_CITY_CODE not in", values, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeBetween(String value1, String value2) {
            addCriterion("TRANS_CITY_CODE between", value1, value2, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andTransCityCodeNotBetween(String value1, String value2) {
            addCriterion("TRANS_CITY_CODE not between", value1, value2, "transCityCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketIsNull() {
            addCriterion("PROMOTION_TICKET is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketIsNotNull() {
            addCriterion("PROMOTION_TICKET is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketEqualTo(String value) {
            addCriterion("PROMOTION_TICKET =", value, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketNotEqualTo(String value) {
            addCriterion("PROMOTION_TICKET <>", value, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketGreaterThan(String value) {
            addCriterion("PROMOTION_TICKET >", value, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketGreaterThanOrEqualTo(String value) {
            addCriterion("PROMOTION_TICKET >=", value, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketLessThan(String value) {
            addCriterion("PROMOTION_TICKET <", value, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketLessThanOrEqualTo(String value) {
            addCriterion("PROMOTION_TICKET <=", value, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketLike(String value) {
            addCriterion("PROMOTION_TICKET like", value, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketNotLike(String value) {
            addCriterion("PROMOTION_TICKET not like", value, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketIn(List<String> values) {
            addCriterion("PROMOTION_TICKET in", values, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketNotIn(List<String> values) {
            addCriterion("PROMOTION_TICKET not in", values, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketBetween(String value1, String value2) {
            addCriterion("PROMOTION_TICKET between", value1, value2, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andPromotionTicketNotBetween(String value1, String value2) {
            addCriterion("PROMOTION_TICKET not between", value1, value2, "promotionTicket");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeIsNull() {
            addCriterion("SUPPORTED_BUYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeIsNotNull() {
            addCriterion("SUPPORTED_BUYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeEqualTo(String value) {
            addCriterion("SUPPORTED_BUYTYPE =", value, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeNotEqualTo(String value) {
            addCriterion("SUPPORTED_BUYTYPE <>", value, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeGreaterThan(String value) {
            addCriterion("SUPPORTED_BUYTYPE >", value, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORTED_BUYTYPE >=", value, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeLessThan(String value) {
            addCriterion("SUPPORTED_BUYTYPE <", value, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeLessThanOrEqualTo(String value) {
            addCriterion("SUPPORTED_BUYTYPE <=", value, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeLike(String value) {
            addCriterion("SUPPORTED_BUYTYPE like", value, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeNotLike(String value) {
            addCriterion("SUPPORTED_BUYTYPE not like", value, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeIn(List<String> values) {
            addCriterion("SUPPORTED_BUYTYPE in", values, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeNotIn(List<String> values) {
            addCriterion("SUPPORTED_BUYTYPE not in", values, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeBetween(String value1, String value2) {
            addCriterion("SUPPORTED_BUYTYPE between", value1, value2, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andSupportedBuytypeNotBetween(String value1, String value2) {
            addCriterion("SUPPORTED_BUYTYPE not between", value1, value2, "supportedBuytype");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMOUNT in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMOUNT not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMOUNT between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMOUNT not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateIsNull() {
            addCriterion("PAYMENT_DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateIsNotNull() {
            addCriterion("PAYMENT_DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateEqualTo(Date value) {
            addCriterion("PAYMENT_DUE_DATE =", value, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateNotEqualTo(Date value) {
            addCriterion("PAYMENT_DUE_DATE <>", value, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateGreaterThan(Date value) {
            addCriterion("PAYMENT_DUE_DATE >", value, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_DUE_DATE >=", value, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateLessThan(Date value) {
            addCriterion("PAYMENT_DUE_DATE <", value, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateLessThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_DUE_DATE <=", value, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateIn(List<Date> values) {
            addCriterion("PAYMENT_DUE_DATE in", values, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateNotIn(List<Date> values) {
            addCriterion("PAYMENT_DUE_DATE not in", values, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_DUE_DATE between", value1, value2, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDueDateNotBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_DUE_DATE not between", value1, value2, "paymentDueDate");
            return (Criteria) this;
        }

        public Criteria andCardCashPayIsNull() {
            addCriterion("CARD_CASH_PAY is null");
            return (Criteria) this;
        }

        public Criteria andCardCashPayIsNotNull() {
            addCriterion("CARD_CASH_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andCardCashPayEqualTo(BigDecimal value) {
            addCriterion("CARD_CASH_PAY =", value, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayNotEqualTo(BigDecimal value) {
            addCriterion("CARD_CASH_PAY <>", value, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayGreaterThan(BigDecimal value) {
            addCriterion("CARD_CASH_PAY >", value, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARD_CASH_PAY >=", value, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayLessThan(BigDecimal value) {
            addCriterion("CARD_CASH_PAY <", value, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARD_CASH_PAY <=", value, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayIn(List<BigDecimal> values) {
            addCriterion("CARD_CASH_PAY in", values, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayNotIn(List<BigDecimal> values) {
            addCriterion("CARD_CASH_PAY not in", values, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARD_CASH_PAY between", value1, value2, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andCardCashPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARD_CASH_PAY not between", value1, value2, "cardCashPay");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredIsNull() {
            addCriterion("INVOICE_REQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredIsNotNull() {
            addCriterion("INVOICE_REQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredEqualTo(String value) {
            addCriterion("INVOICE_REQUIRED =", value, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredNotEqualTo(String value) {
            addCriterion("INVOICE_REQUIRED <>", value, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredGreaterThan(String value) {
            addCriterion("INVOICE_REQUIRED >", value, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_REQUIRED >=", value, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredLessThan(String value) {
            addCriterion("INVOICE_REQUIRED <", value, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_REQUIRED <=", value, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredLike(String value) {
            addCriterion("INVOICE_REQUIRED like", value, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredNotLike(String value) {
            addCriterion("INVOICE_REQUIRED not like", value, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredIn(List<String> values) {
            addCriterion("INVOICE_REQUIRED in", values, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredNotIn(List<String> values) {
            addCriterion("INVOICE_REQUIRED not in", values, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredBetween(String value1, String value2) {
            addCriterion("INVOICE_REQUIRED between", value1, value2, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceRequiredNotBetween(String value1, String value2) {
            addCriterion("INVOICE_REQUIRED not between", value1, value2, "invoiceRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(Short value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(Short value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(Short value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(Short value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<Short> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<Short> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(Short value1, Short value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2IsNull() {
            addCriterion("INVOICE_TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2IsNotNull() {
            addCriterion("INVOICE_TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2EqualTo(String value) {
            addCriterion("INVOICE_TYPE2 =", value, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2NotEqualTo(String value) {
            addCriterion("INVOICE_TYPE2 <>", value, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2GreaterThan(String value) {
            addCriterion("INVOICE_TYPE2 >", value, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2GreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE2 >=", value, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2LessThan(String value) {
            addCriterion("INVOICE_TYPE2 <", value, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2LessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE2 <=", value, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2Like(String value) {
            addCriterion("INVOICE_TYPE2 like", value, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2NotLike(String value) {
            addCriterion("INVOICE_TYPE2 not like", value, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2In(List<String> values) {
            addCriterion("INVOICE_TYPE2 in", values, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2NotIn(List<String> values) {
            addCriterion("INVOICE_TYPE2 not in", values, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2Between(String value1, String value2) {
            addCriterion("INVOICE_TYPE2 between", value1, value2, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceType2NotBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE2 not between", value1, value2, "invoiceType2");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailIsNull() {
            addCriterion("INVOICE_BY_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailIsNotNull() {
            addCriterion("INVOICE_BY_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailEqualTo(String value) {
            addCriterion("INVOICE_BY_DETAIL =", value, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailNotEqualTo(String value) {
            addCriterion("INVOICE_BY_DETAIL <>", value, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailGreaterThan(String value) {
            addCriterion("INVOICE_BY_DETAIL >", value, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_BY_DETAIL >=", value, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailLessThan(String value) {
            addCriterion("INVOICE_BY_DETAIL <", value, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_BY_DETAIL <=", value, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailLike(String value) {
            addCriterion("INVOICE_BY_DETAIL like", value, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailNotLike(String value) {
            addCriterion("INVOICE_BY_DETAIL not like", value, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailIn(List<String> values) {
            addCriterion("INVOICE_BY_DETAIL in", values, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailNotIn(List<String> values) {
            addCriterion("INVOICE_BY_DETAIL not in", values, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailBetween(String value1, String value2) {
            addCriterion("INVOICE_BY_DETAIL between", value1, value2, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceByDetailNotBetween(String value1, String value2) {
            addCriterion("INVOICE_BY_DETAIL not between", value1, value2, "invoiceByDetail");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyIsNull() {
            addCriterion("INVOICE_TAX_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyIsNotNull() {
            addCriterion("INVOICE_TAX_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyEqualTo(String value) {
            addCriterion("INVOICE_TAX_COMPANY =", value, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_COMPANY <>", value, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyGreaterThan(String value) {
            addCriterion("INVOICE_TAX_COMPANY >", value, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_COMPANY >=", value, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyLessThan(String value) {
            addCriterion("INVOICE_TAX_COMPANY <", value, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_COMPANY <=", value, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyLike(String value) {
            addCriterion("INVOICE_TAX_COMPANY like", value, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyNotLike(String value) {
            addCriterion("INVOICE_TAX_COMPANY not like", value, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyIn(List<String> values) {
            addCriterion("INVOICE_TAX_COMPANY in", values, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_COMPANY not in", values, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_COMPANY between", value1, value2, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxCompanyNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_COMPANY not between", value1, value2, "invoiceTaxCompany");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoIsNull() {
            addCriterion("INVOICE_TAX_REG_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoIsNotNull() {
            addCriterion("INVOICE_TAX_REG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_NO =", value, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_NO <>", value, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoGreaterThan(String value) {
            addCriterion("INVOICE_TAX_REG_NO >", value, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_NO >=", value, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoLessThan(String value) {
            addCriterion("INVOICE_TAX_REG_NO <", value, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_NO <=", value, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoLike(String value) {
            addCriterion("INVOICE_TAX_REG_NO like", value, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoNotLike(String value) {
            addCriterion("INVOICE_TAX_REG_NO not like", value, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_NO in", values, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_NO not in", values, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_NO between", value1, value2, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_NO not between", value1, value2, "invoiceTaxRegNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrIsNull() {
            addCriterion("INVOICE_TAX_REG_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrIsNotNull() {
            addCriterion("INVOICE_TAX_REG_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_ADDR =", value, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_ADDR <>", value, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrGreaterThan(String value) {
            addCriterion("INVOICE_TAX_REG_ADDR >", value, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_ADDR >=", value, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrLessThan(String value) {
            addCriterion("INVOICE_TAX_REG_ADDR <", value, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_ADDR <=", value, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrLike(String value) {
            addCriterion("INVOICE_TAX_REG_ADDR like", value, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrNotLike(String value) {
            addCriterion("INVOICE_TAX_REG_ADDR not like", value, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_ADDR in", values, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_ADDR not in", values, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_ADDR between", value1, value2, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAddrNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_ADDR not between", value1, value2, "invoiceTaxRegAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelIsNull() {
            addCriterion("INVOICE_TAX_REG_TEL is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelIsNotNull() {
            addCriterion("INVOICE_TAX_REG_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_TEL =", value, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_TEL <>", value, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelGreaterThan(String value) {
            addCriterion("INVOICE_TAX_REG_TEL >", value, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_TEL >=", value, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelLessThan(String value) {
            addCriterion("INVOICE_TAX_REG_TEL <", value, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_TEL <=", value, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelLike(String value) {
            addCriterion("INVOICE_TAX_REG_TEL like", value, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelNotLike(String value) {
            addCriterion("INVOICE_TAX_REG_TEL not like", value, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_TEL in", values, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_TEL not in", values, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_TEL between", value1, value2, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegTelNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_TEL not between", value1, value2, "invoiceTaxRegTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankIsNull() {
            addCriterion("INVOICE_TAX_REG_BANK is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankIsNotNull() {
            addCriterion("INVOICE_TAX_REG_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_BANK =", value, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_BANK <>", value, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankGreaterThan(String value) {
            addCriterion("INVOICE_TAX_REG_BANK >", value, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_BANK >=", value, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankLessThan(String value) {
            addCriterion("INVOICE_TAX_REG_BANK <", value, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_BANK <=", value, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankLike(String value) {
            addCriterion("INVOICE_TAX_REG_BANK like", value, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankNotLike(String value) {
            addCriterion("INVOICE_TAX_REG_BANK not like", value, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_BANK in", values, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_BANK not in", values, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_BANK between", value1, value2, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegBankNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_BANK not between", value1, value2, "invoiceTaxRegBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccIsNull() {
            addCriterion("INVOICE_TAX_REG_ACC is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccIsNotNull() {
            addCriterion("INVOICE_TAX_REG_ACC is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_ACC =", value, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_ACC <>", value, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccGreaterThan(String value) {
            addCriterion("INVOICE_TAX_REG_ACC >", value, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_ACC >=", value, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccLessThan(String value) {
            addCriterion("INVOICE_TAX_REG_ACC <", value, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_REG_ACC <=", value, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccLike(String value) {
            addCriterion("INVOICE_TAX_REG_ACC like", value, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccNotLike(String value) {
            addCriterion("INVOICE_TAX_REG_ACC not like", value, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_ACC in", values, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_REG_ACC not in", values, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_ACC between", value1, value2, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxRegAccNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_REG_ACC not between", value1, value2, "invoiceTaxRegAcc");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusIsNull() {
            addCriterion("INVOICE_ISSUE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusIsNotNull() {
            addCriterion("INVOICE_ISSUE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusEqualTo(Short value) {
            addCriterion("INVOICE_ISSUE_STATUS =", value, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusNotEqualTo(Short value) {
            addCriterion("INVOICE_ISSUE_STATUS <>", value, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusGreaterThan(Short value) {
            addCriterion("INVOICE_ISSUE_STATUS >", value, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_ISSUE_STATUS >=", value, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusLessThan(Short value) {
            addCriterion("INVOICE_ISSUE_STATUS <", value, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_ISSUE_STATUS <=", value, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusIn(List<Short> values) {
            addCriterion("INVOICE_ISSUE_STATUS in", values, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusNotIn(List<Short> values) {
            addCriterion("INVOICE_ISSUE_STATUS not in", values, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusBetween(Short value1, Short value2) {
            addCriterion("INVOICE_ISSUE_STATUS between", value1, value2, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIssueStatusNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_ISSUE_STATUS not between", value1, value2, "invoiceIssueStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesIsNull() {
            addCriterion("INVOICE_REISSUE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesIsNotNull() {
            addCriterion("INVOICE_REISSUE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesEqualTo(Short value) {
            addCriterion("INVOICE_REISSUE_TIMES =", value, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesNotEqualTo(Short value) {
            addCriterion("INVOICE_REISSUE_TIMES <>", value, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesGreaterThan(Short value) {
            addCriterion("INVOICE_REISSUE_TIMES >", value, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_REISSUE_TIMES >=", value, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesLessThan(Short value) {
            addCriterion("INVOICE_REISSUE_TIMES <", value, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_REISSUE_TIMES <=", value, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesIn(List<Short> values) {
            addCriterion("INVOICE_REISSUE_TIMES in", values, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesNotIn(List<Short> values) {
            addCriterion("INVOICE_REISSUE_TIMES not in", values, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesBetween(Short value1, Short value2) {
            addCriterion("INVOICE_REISSUE_TIMES between", value1, value2, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimesNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_REISSUE_TIMES not between", value1, value2, "invoiceReissueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeIsNull() {
            addCriterion("INVOICE_REISSUE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeIsNotNull() {
            addCriterion("INVOICE_REISSUE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeEqualTo(Date value) {
            addCriterion("INVOICE_REISSUE_TIME =", value, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeNotEqualTo(Date value) {
            addCriterion("INVOICE_REISSUE_TIME <>", value, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeGreaterThan(Date value) {
            addCriterion("INVOICE_REISSUE_TIME >", value, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICE_REISSUE_TIME >=", value, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeLessThan(Date value) {
            addCriterion("INVOICE_REISSUE_TIME <", value, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeLessThanOrEqualTo(Date value) {
            addCriterion("INVOICE_REISSUE_TIME <=", value, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeIn(List<Date> values) {
            addCriterion("INVOICE_REISSUE_TIME in", values, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeNotIn(List<Date> values) {
            addCriterion("INVOICE_REISSUE_TIME not in", values, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeBetween(Date value1, Date value2) {
            addCriterion("INVOICE_REISSUE_TIME between", value1, value2, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceReissueTimeNotBetween(Date value1, Date value2) {
            addCriterion("INVOICE_REISSUE_TIME not between", value1, value2, "invoiceReissueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesIsNull() {
            addCriterion("INVOICE_DUP_ISSUE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesIsNotNull() {
            addCriterion("INVOICE_DUP_ISSUE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesEqualTo(Short value) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES =", value, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesNotEqualTo(Short value) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES <>", value, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesGreaterThan(Short value) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES >", value, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES >=", value, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesLessThan(Short value) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES <", value, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES <=", value, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesIn(List<Short> values) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES in", values, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesNotIn(List<Short> values) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES not in", values, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesBetween(Short value1, Short value2) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES between", value1, value2, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimesNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_DUP_ISSUE_TIMES not between", value1, value2, "invoiceDupIssueTimes");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeIsNull() {
            addCriterion("INVOICE_DUP_ISSUE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeIsNotNull() {
            addCriterion("INVOICE_DUP_ISSUE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeEqualTo(Date value) {
            addCriterion("INVOICE_DUP_ISSUE_TIME =", value, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeNotEqualTo(Date value) {
            addCriterion("INVOICE_DUP_ISSUE_TIME <>", value, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeGreaterThan(Date value) {
            addCriterion("INVOICE_DUP_ISSUE_TIME >", value, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICE_DUP_ISSUE_TIME >=", value, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeLessThan(Date value) {
            addCriterion("INVOICE_DUP_ISSUE_TIME <", value, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeLessThanOrEqualTo(Date value) {
            addCriterion("INVOICE_DUP_ISSUE_TIME <=", value, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeIn(List<Date> values) {
            addCriterion("INVOICE_DUP_ISSUE_TIME in", values, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeNotIn(List<Date> values) {
            addCriterion("INVOICE_DUP_ISSUE_TIME not in", values, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeBetween(Date value1, Date value2) {
            addCriterion("INVOICE_DUP_ISSUE_TIME between", value1, value2, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceDupIssueTimeNotBetween(Date value1, Date value2) {
            addCriterion("INVOICE_DUP_ISSUE_TIME not between", value1, value2, "invoiceDupIssueTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedIsNull() {
            addCriterion("INVOICE_STATUS_LOCKED is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedIsNotNull() {
            addCriterion("INVOICE_STATUS_LOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedEqualTo(String value) {
            addCriterion("INVOICE_STATUS_LOCKED =", value, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedNotEqualTo(String value) {
            addCriterion("INVOICE_STATUS_LOCKED <>", value, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedGreaterThan(String value) {
            addCriterion("INVOICE_STATUS_LOCKED >", value, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_STATUS_LOCKED >=", value, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedLessThan(String value) {
            addCriterion("INVOICE_STATUS_LOCKED <", value, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_STATUS_LOCKED <=", value, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedLike(String value) {
            addCriterion("INVOICE_STATUS_LOCKED like", value, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedNotLike(String value) {
            addCriterion("INVOICE_STATUS_LOCKED not like", value, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedIn(List<String> values) {
            addCriterion("INVOICE_STATUS_LOCKED in", values, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedNotIn(List<String> values) {
            addCriterion("INVOICE_STATUS_LOCKED not in", values, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedBetween(String value1, String value2) {
            addCriterion("INVOICE_STATUS_LOCKED between", value1, value2, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedNotBetween(String value1, String value2) {
            addCriterion("INVOICE_STATUS_LOCKED not between", value1, value2, "invoiceStatusLocked");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeIsNull() {
            addCriterion("INVOICE_STATUS_LOCKED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeIsNotNull() {
            addCriterion("INVOICE_STATUS_LOCKED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeEqualTo(Date value) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME =", value, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeNotEqualTo(Date value) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME <>", value, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeGreaterThan(Date value) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME >", value, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME >=", value, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeLessThan(Date value) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME <", value, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeLessThanOrEqualTo(Date value) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME <=", value, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeIn(List<Date> values) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME in", values, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeNotIn(List<Date> values) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME not in", values, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeBetween(Date value1, Date value2) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME between", value1, value2, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLockedTimeNotBetween(Date value1, Date value2) {
            addCriterion("INVOICE_STATUS_LOCKED_TIME not between", value1, value2, "invoiceStatusLockedTime");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeIsNull() {
            addCriterion("INVOICE_POST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeIsNotNull() {
            addCriterion("INVOICE_POST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeEqualTo(Short value) {
            addCriterion("INVOICE_POST_TYPE =", value, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeNotEqualTo(Short value) {
            addCriterion("INVOICE_POST_TYPE <>", value, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeGreaterThan(Short value) {
            addCriterion("INVOICE_POST_TYPE >", value, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_POST_TYPE >=", value, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeLessThan(Short value) {
            addCriterion("INVOICE_POST_TYPE <", value, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_POST_TYPE <=", value, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeIn(List<Short> values) {
            addCriterion("INVOICE_POST_TYPE in", values, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeNotIn(List<Short> values) {
            addCriterion("INVOICE_POST_TYPE not in", values, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeBetween(Short value1, Short value2) {
            addCriterion("INVOICE_POST_TYPE between", value1, value2, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andInvoicePostTypeNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_POST_TYPE not between", value1, value2, "invoicePostType");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("SERVICE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("SERVICE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(BigDecimal value) {
            addCriterion("SERVICE_FEE =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("SERVICE_FEE <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("SERVICE_FEE >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICE_FEE >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(BigDecimal value) {
            addCriterion("SERVICE_FEE <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICE_FEE <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<BigDecimal> values) {
            addCriterion("SERVICE_FEE in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("SERVICE_FEE not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICE_FEE between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICE_FEE not between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("UNION_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("UNION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(BigDecimal value) {
            addCriterion("UNION_ID =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(BigDecimal value) {
            addCriterion("UNION_ID <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(BigDecimal value) {
            addCriterion("UNION_ID >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNION_ID >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(BigDecimal value) {
            addCriterion("UNION_ID <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNION_ID <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<BigDecimal> values) {
            addCriterion("UNION_ID in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<BigDecimal> values) {
            addCriterion("UNION_ID not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNION_ID between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNION_ID not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionRefIsNull() {
            addCriterion("UNION_REF is null");
            return (Criteria) this;
        }

        public Criteria andUnionRefIsNotNull() {
            addCriterion("UNION_REF is not null");
            return (Criteria) this;
        }

        public Criteria andUnionRefEqualTo(String value) {
            addCriterion("UNION_REF =", value, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefNotEqualTo(String value) {
            addCriterion("UNION_REF <>", value, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefGreaterThan(String value) {
            addCriterion("UNION_REF >", value, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefGreaterThanOrEqualTo(String value) {
            addCriterion("UNION_REF >=", value, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefLessThan(String value) {
            addCriterion("UNION_REF <", value, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefLessThanOrEqualTo(String value) {
            addCriterion("UNION_REF <=", value, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefLike(String value) {
            addCriterion("UNION_REF like", value, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefNotLike(String value) {
            addCriterion("UNION_REF not like", value, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefIn(List<String> values) {
            addCriterion("UNION_REF in", values, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefNotIn(List<String> values) {
            addCriterion("UNION_REF not in", values, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefBetween(String value1, String value2) {
            addCriterion("UNION_REF between", value1, value2, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionRefNotBetween(String value1, String value2) {
            addCriterion("UNION_REF not between", value1, value2, "unionRef");
            return (Criteria) this;
        }

        public Criteria andUnionStatusIsNull() {
            addCriterion("UNION_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUnionStatusIsNotNull() {
            addCriterion("UNION_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUnionStatusEqualTo(Short value) {
            addCriterion("UNION_STATUS =", value, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusNotEqualTo(Short value) {
            addCriterion("UNION_STATUS <>", value, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusGreaterThan(Short value) {
            addCriterion("UNION_STATUS >", value, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("UNION_STATUS >=", value, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusLessThan(Short value) {
            addCriterion("UNION_STATUS <", value, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusLessThanOrEqualTo(Short value) {
            addCriterion("UNION_STATUS <=", value, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusIn(List<Short> values) {
            addCriterion("UNION_STATUS in", values, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusNotIn(List<Short> values) {
            addCriterion("UNION_STATUS not in", values, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusBetween(Short value1, Short value2) {
            addCriterion("UNION_STATUS between", value1, value2, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andUnionStatusNotBetween(Short value1, Short value2) {
            addCriterion("UNION_STATUS not between", value1, value2, "unionStatus");
            return (Criteria) this;
        }

        public Criteria andSalesChannelIsNull() {
            addCriterion("SALES_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andSalesChannelIsNotNull() {
            addCriterion("SALES_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andSalesChannelEqualTo(String value) {
            addCriterion("SALES_CHANNEL =", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelNotEqualTo(String value) {
            addCriterion("SALES_CHANNEL <>", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelGreaterThan(String value) {
            addCriterion("SALES_CHANNEL >", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_CHANNEL >=", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelLessThan(String value) {
            addCriterion("SALES_CHANNEL <", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelLessThanOrEqualTo(String value) {
            addCriterion("SALES_CHANNEL <=", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelLike(String value) {
            addCriterion("SALES_CHANNEL like", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelNotLike(String value) {
            addCriterion("SALES_CHANNEL not like", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelIn(List<String> values) {
            addCriterion("SALES_CHANNEL in", values, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelNotIn(List<String> values) {
            addCriterion("SALES_CHANNEL not in", values, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelBetween(String value1, String value2) {
            addCriterion("SALES_CHANNEL between", value1, value2, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelNotBetween(String value1, String value2) {
            addCriterion("SALES_CHANNEL not between", value1, value2, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSellerNote3IsNull() {
            addCriterion("SELLER_NOTE3 is null");
            return (Criteria) this;
        }

        public Criteria andSellerNote3IsNotNull() {
            addCriterion("SELLER_NOTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNote3EqualTo(String value) {
            addCriterion("SELLER_NOTE3 =", value, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3NotEqualTo(String value) {
            addCriterion("SELLER_NOTE3 <>", value, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3GreaterThan(String value) {
            addCriterion("SELLER_NOTE3 >", value, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3GreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE3 >=", value, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3LessThan(String value) {
            addCriterion("SELLER_NOTE3 <", value, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3LessThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE3 <=", value, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3Like(String value) {
            addCriterion("SELLER_NOTE3 like", value, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3NotLike(String value) {
            addCriterion("SELLER_NOTE3 not like", value, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3In(List<String> values) {
            addCriterion("SELLER_NOTE3 in", values, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3NotIn(List<String> values) {
            addCriterion("SELLER_NOTE3 not in", values, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3Between(String value1, String value2) {
            addCriterion("SELLER_NOTE3 between", value1, value2, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote3NotBetween(String value1, String value2) {
            addCriterion("SELLER_NOTE3 not between", value1, value2, "sellerNote3");
            return (Criteria) this;
        }

        public Criteria andSellerNote4IsNull() {
            addCriterion("SELLER_NOTE4 is null");
            return (Criteria) this;
        }

        public Criteria andSellerNote4IsNotNull() {
            addCriterion("SELLER_NOTE4 is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNote4EqualTo(String value) {
            addCriterion("SELLER_NOTE4 =", value, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4NotEqualTo(String value) {
            addCriterion("SELLER_NOTE4 <>", value, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4GreaterThan(String value) {
            addCriterion("SELLER_NOTE4 >", value, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4GreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE4 >=", value, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4LessThan(String value) {
            addCriterion("SELLER_NOTE4 <", value, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4LessThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE4 <=", value, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4Like(String value) {
            addCriterion("SELLER_NOTE4 like", value, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4NotLike(String value) {
            addCriterion("SELLER_NOTE4 not like", value, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4In(List<String> values) {
            addCriterion("SELLER_NOTE4 in", values, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4NotIn(List<String> values) {
            addCriterion("SELLER_NOTE4 not in", values, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4Between(String value1, String value2) {
            addCriterion("SELLER_NOTE4 between", value1, value2, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote4NotBetween(String value1, String value2) {
            addCriterion("SELLER_NOTE4 not between", value1, value2, "sellerNote4");
            return (Criteria) this;
        }

        public Criteria andSellerNote5IsNull() {
            addCriterion("SELLER_NOTE5 is null");
            return (Criteria) this;
        }

        public Criteria andSellerNote5IsNotNull() {
            addCriterion("SELLER_NOTE5 is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNote5EqualTo(String value) {
            addCriterion("SELLER_NOTE5 =", value, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5NotEqualTo(String value) {
            addCriterion("SELLER_NOTE5 <>", value, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5GreaterThan(String value) {
            addCriterion("SELLER_NOTE5 >", value, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5GreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE5 >=", value, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5LessThan(String value) {
            addCriterion("SELLER_NOTE5 <", value, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5LessThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE5 <=", value, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5Like(String value) {
            addCriterion("SELLER_NOTE5 like", value, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5NotLike(String value) {
            addCriterion("SELLER_NOTE5 not like", value, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5In(List<String> values) {
            addCriterion("SELLER_NOTE5 in", values, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5NotIn(List<String> values) {
            addCriterion("SELLER_NOTE5 not in", values, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5Between(String value1, String value2) {
            addCriterion("SELLER_NOTE5 between", value1, value2, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote5NotBetween(String value1, String value2) {
            addCriterion("SELLER_NOTE5 not between", value1, value2, "sellerNote5");
            return (Criteria) this;
        }

        public Criteria andSellerNote6IsNull() {
            addCriterion("SELLER_NOTE6 is null");
            return (Criteria) this;
        }

        public Criteria andSellerNote6IsNotNull() {
            addCriterion("SELLER_NOTE6 is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNote6EqualTo(String value) {
            addCriterion("SELLER_NOTE6 =", value, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6NotEqualTo(String value) {
            addCriterion("SELLER_NOTE6 <>", value, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6GreaterThan(String value) {
            addCriterion("SELLER_NOTE6 >", value, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6GreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE6 >=", value, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6LessThan(String value) {
            addCriterion("SELLER_NOTE6 <", value, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6LessThanOrEqualTo(String value) {
            addCriterion("SELLER_NOTE6 <=", value, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6Like(String value) {
            addCriterion("SELLER_NOTE6 like", value, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6NotLike(String value) {
            addCriterion("SELLER_NOTE6 not like", value, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6In(List<String> values) {
            addCriterion("SELLER_NOTE6 in", values, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6NotIn(List<String> values) {
            addCriterion("SELLER_NOTE6 not in", values, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6Between(String value1, String value2) {
            addCriterion("SELLER_NOTE6 between", value1, value2, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andSellerNote6NotBetween(String value1, String value2) {
            addCriterion("SELLER_NOTE6 not between", value1, value2, "sellerNote6");
            return (Criteria) this;
        }

        public Criteria andOrderPointIsNull() {
            addCriterion("ORDER_POINT is null");
            return (Criteria) this;
        }

        public Criteria andOrderPointIsNotNull() {
            addCriterion("ORDER_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPointEqualTo(BigDecimal value) {
            addCriterion("ORDER_POINT =", value, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_POINT <>", value, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointGreaterThan(BigDecimal value) {
            addCriterion("ORDER_POINT >", value, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_POINT >=", value, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointLessThan(BigDecimal value) {
            addCriterion("ORDER_POINT <", value, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_POINT <=", value, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointIn(List<BigDecimal> values) {
            addCriterion("ORDER_POINT in", values, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_POINT not in", values, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_POINT between", value1, value2, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andOrderPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_POINT not between", value1, value2, "orderPoint");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountIsNull() {
            addCriterion("CASH_TRANS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountIsNotNull() {
            addCriterion("CASH_TRANS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountEqualTo(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT =", value, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountNotEqualTo(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT <>", value, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountGreaterThan(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT >", value, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT >=", value, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountLessThan(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT <", value, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT <=", value, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountIn(List<BigDecimal> values) {
            addCriterion("CASH_TRANS_AMOUNT in", values, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountNotIn(List<BigDecimal> values) {
            addCriterion("CASH_TRANS_AMOUNT not in", values, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_TRANS_AMOUNT between", value1, value2, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_TRANS_AMOUNT not between", value1, value2, "cashTransAmount");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedIsNull() {
            addCriterion("CASH_TRANS_AMOUNT_PAYED is null");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedIsNotNull() {
            addCriterion("CASH_TRANS_AMOUNT_PAYED is not null");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedEqualTo(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED =", value, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedNotEqualTo(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED <>", value, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedGreaterThan(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED >", value, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED >=", value, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedLessThan(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED <", value, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED <=", value, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedIn(List<BigDecimal> values) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED in", values, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedNotIn(List<BigDecimal> values) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED not in", values, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED between", value1, value2, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andCashTransAmountPayedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_TRANS_AMOUNT_PAYED not between", value1, value2, "cashTransAmountPayed");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3IsNull() {
            addCriterion("BUYER_NOTE3 is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3IsNotNull() {
            addCriterion("BUYER_NOTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3EqualTo(String value) {
            addCriterion("BUYER_NOTE3 =", value, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3NotEqualTo(String value) {
            addCriterion("BUYER_NOTE3 <>", value, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3GreaterThan(String value) {
            addCriterion("BUYER_NOTE3 >", value, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3GreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NOTE3 >=", value, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3LessThan(String value) {
            addCriterion("BUYER_NOTE3 <", value, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3LessThanOrEqualTo(String value) {
            addCriterion("BUYER_NOTE3 <=", value, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3Like(String value) {
            addCriterion("BUYER_NOTE3 like", value, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3NotLike(String value) {
            addCriterion("BUYER_NOTE3 not like", value, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3In(List<String> values) {
            addCriterion("BUYER_NOTE3 in", values, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3NotIn(List<String> values) {
            addCriterion("BUYER_NOTE3 not in", values, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3Between(String value1, String value2) {
            addCriterion("BUYER_NOTE3 between", value1, value2, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3NotBetween(String value1, String value2) {
            addCriterion("BUYER_NOTE3 not between", value1, value2, "buyerNote3");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeIsNull() {
            addCriterion("BUYER_NOTE3_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeIsNotNull() {
            addCriterion("BUYER_NOTE3_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeEqualTo(Date value) {
            addCriterion("BUYER_NOTE3_TIME =", value, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeNotEqualTo(Date value) {
            addCriterion("BUYER_NOTE3_TIME <>", value, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeGreaterThan(Date value) {
            addCriterion("BUYER_NOTE3_TIME >", value, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYER_NOTE3_TIME >=", value, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeLessThan(Date value) {
            addCriterion("BUYER_NOTE3_TIME <", value, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeLessThanOrEqualTo(Date value) {
            addCriterion("BUYER_NOTE3_TIME <=", value, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeIn(List<Date> values) {
            addCriterion("BUYER_NOTE3_TIME in", values, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeNotIn(List<Date> values) {
            addCriterion("BUYER_NOTE3_TIME not in", values, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeBetween(Date value1, Date value2) {
            addCriterion("BUYER_NOTE3_TIME between", value1, value2, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andBuyerNote3TimeNotBetween(Date value1, Date value2) {
            addCriterion("BUYER_NOTE3_TIME not between", value1, value2, "buyerNote3Time");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeIsNull() {
            addCriterion("TRANS_TOWN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeIsNotNull() {
            addCriterion("TRANS_TOWN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeEqualTo(String value) {
            addCriterion("TRANS_TOWN_CODE =", value, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeNotEqualTo(String value) {
            addCriterion("TRANS_TOWN_CODE <>", value, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeGreaterThan(String value) {
            addCriterion("TRANS_TOWN_CODE >", value, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TOWN_CODE >=", value, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeLessThan(String value) {
            addCriterion("TRANS_TOWN_CODE <", value, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TOWN_CODE <=", value, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeLike(String value) {
            addCriterion("TRANS_TOWN_CODE like", value, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeNotLike(String value) {
            addCriterion("TRANS_TOWN_CODE not like", value, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeIn(List<String> values) {
            addCriterion("TRANS_TOWN_CODE in", values, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeNotIn(List<String> values) {
            addCriterion("TRANS_TOWN_CODE not in", values, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeBetween(String value1, String value2) {
            addCriterion("TRANS_TOWN_CODE between", value1, value2, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownCodeNotBetween(String value1, String value2) {
            addCriterion("TRANS_TOWN_CODE not between", value1, value2, "transTownCode");
            return (Criteria) this;
        }

        public Criteria andTransTownIsNull() {
            addCriterion("TRANS_TOWN is null");
            return (Criteria) this;
        }

        public Criteria andTransTownIsNotNull() {
            addCriterion("TRANS_TOWN is not null");
            return (Criteria) this;
        }

        public Criteria andTransTownEqualTo(String value) {
            addCriterion("TRANS_TOWN =", value, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownNotEqualTo(String value) {
            addCriterion("TRANS_TOWN <>", value, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownGreaterThan(String value) {
            addCriterion("TRANS_TOWN >", value, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TOWN >=", value, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownLessThan(String value) {
            addCriterion("TRANS_TOWN <", value, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TOWN <=", value, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownLike(String value) {
            addCriterion("TRANS_TOWN like", value, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownNotLike(String value) {
            addCriterion("TRANS_TOWN not like", value, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownIn(List<String> values) {
            addCriterion("TRANS_TOWN in", values, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownNotIn(List<String> values) {
            addCriterion("TRANS_TOWN not in", values, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownBetween(String value1, String value2) {
            addCriterion("TRANS_TOWN between", value1, value2, "transTown");
            return (Criteria) this;
        }

        public Criteria andTransTownNotBetween(String value1, String value2) {
            addCriterion("TRANS_TOWN not between", value1, value2, "transTown");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagIsNull() {
            addCriterion("SETTLEMENT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagIsNotNull() {
            addCriterion("SETTLEMENT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagEqualTo(Short value) {
            addCriterion("SETTLEMENT_FLAG =", value, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagNotEqualTo(Short value) {
            addCriterion("SETTLEMENT_FLAG <>", value, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagGreaterThan(Short value) {
            addCriterion("SETTLEMENT_FLAG >", value, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("SETTLEMENT_FLAG >=", value, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagLessThan(Short value) {
            addCriterion("SETTLEMENT_FLAG <", value, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagLessThanOrEqualTo(Short value) {
            addCriterion("SETTLEMENT_FLAG <=", value, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagIn(List<Short> values) {
            addCriterion("SETTLEMENT_FLAG in", values, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagNotIn(List<Short> values) {
            addCriterion("SETTLEMENT_FLAG not in", values, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagBetween(Short value1, Short value2) {
            addCriterion("SETTLEMENT_FLAG between", value1, value2, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementFlagNotBetween(Short value1, Short value2) {
            addCriterion("SETTLEMENT_FLAG not between", value1, value2, "settlementFlag");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdIsNull() {
            addCriterion("POSTAL_CLERK_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdIsNotNull() {
            addCriterion("POSTAL_CLERK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdEqualTo(String value) {
            addCriterion("POSTAL_CLERK_ID =", value, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdNotEqualTo(String value) {
            addCriterion("POSTAL_CLERK_ID <>", value, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdGreaterThan(String value) {
            addCriterion("POSTAL_CLERK_ID >", value, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdGreaterThanOrEqualTo(String value) {
            addCriterion("POSTAL_CLERK_ID >=", value, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdLessThan(String value) {
            addCriterion("POSTAL_CLERK_ID <", value, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdLessThanOrEqualTo(String value) {
            addCriterion("POSTAL_CLERK_ID <=", value, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdLike(String value) {
            addCriterion("POSTAL_CLERK_ID like", value, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdNotLike(String value) {
            addCriterion("POSTAL_CLERK_ID not like", value, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdIn(List<String> values) {
            addCriterion("POSTAL_CLERK_ID in", values, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdNotIn(List<String> values) {
            addCriterion("POSTAL_CLERK_ID not in", values, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdBetween(String value1, String value2) {
            addCriterion("POSTAL_CLERK_ID between", value1, value2, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andPostalClerkIdNotBetween(String value1, String value2) {
            addCriterion("POSTAL_CLERK_ID not between", value1, value2, "postalClerkId");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIsNull() {
            addCriterion("ORDER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIsNotNull() {
            addCriterion("ORDER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFlagEqualTo(String value) {
            addCriterion("ORDER_FLAG =", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotEqualTo(String value) {
            addCriterion("ORDER_FLAG <>", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagGreaterThan(String value) {
            addCriterion("ORDER_FLAG >", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_FLAG >=", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagLessThan(String value) {
            addCriterion("ORDER_FLAG <", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagLessThanOrEqualTo(String value) {
            addCriterion("ORDER_FLAG <=", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagLike(String value) {
            addCriterion("ORDER_FLAG like", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotLike(String value) {
            addCriterion("ORDER_FLAG not like", value, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagIn(List<String> values) {
            addCriterion("ORDER_FLAG in", values, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotIn(List<String> values) {
            addCriterion("ORDER_FLAG not in", values, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagBetween(String value1, String value2) {
            addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFlagNotBetween(String value1, String value2) {
            addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(BigDecimal value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(BigDecimal value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<BigDecimal> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<BigDecimal> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyIsNull() {
            addCriterion("POINT_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyIsNotNull() {
            addCriterion("POINT_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyEqualTo(BigDecimal value) {
            addCriterion("POINT_CURRENCY =", value, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyNotEqualTo(BigDecimal value) {
            addCriterion("POINT_CURRENCY <>", value, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyGreaterThan(BigDecimal value) {
            addCriterion("POINT_CURRENCY >", value, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POINT_CURRENCY >=", value, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyLessThan(BigDecimal value) {
            addCriterion("POINT_CURRENCY <", value, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POINT_CURRENCY <=", value, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyIn(List<BigDecimal> values) {
            addCriterion("POINT_CURRENCY in", values, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyNotIn(List<BigDecimal> values) {
            addCriterion("POINT_CURRENCY not in", values, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POINT_CURRENCY between", value1, value2, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointCurrencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POINT_CURRENCY not between", value1, value2, "pointCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalIsNull() {
            addCriterion("POINT_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andPointTotalIsNotNull() {
            addCriterion("POINT_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andPointTotalEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL =", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalNotEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL <>", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalGreaterThan(BigDecimal value) {
            addCriterion("POINT_TOTAL >", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL >=", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalLessThan(BigDecimal value) {
            addCriterion("POINT_TOTAL <", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL <=", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalIn(List<BigDecimal> values) {
            addCriterion("POINT_TOTAL in", values, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalNotIn(List<BigDecimal> values) {
            addCriterion("POINT_TOTAL not in", values, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POINT_TOTAL between", value1, value2, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POINT_TOTAL not between", value1, value2, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyIsNull() {
            addCriterion("POINT_TOTAL_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyIsNotNull() {
            addCriterion("POINT_TOTAL_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL_CURRENCY =", value, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyNotEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL_CURRENCY <>", value, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyGreaterThan(BigDecimal value) {
            addCriterion("POINT_TOTAL_CURRENCY >", value, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL_CURRENCY >=", value, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyLessThan(BigDecimal value) {
            addCriterion("POINT_TOTAL_CURRENCY <", value, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL_CURRENCY <=", value, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyIn(List<BigDecimal> values) {
            addCriterion("POINT_TOTAL_CURRENCY in", values, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyNotIn(List<BigDecimal> values) {
            addCriterion("POINT_TOTAL_CURRENCY not in", values, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POINT_TOTAL_CURRENCY between", value1, value2, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalCurrencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POINT_TOTAL_CURRENCY not between", value1, value2, "pointTotalCurrency");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedIsNull() {
            addCriterion("POINT_TOTAL_PAYED is null");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedIsNotNull() {
            addCriterion("POINT_TOTAL_PAYED is not null");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL_PAYED =", value, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedNotEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL_PAYED <>", value, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedGreaterThan(BigDecimal value) {
            addCriterion("POINT_TOTAL_PAYED >", value, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL_PAYED >=", value, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedLessThan(BigDecimal value) {
            addCriterion("POINT_TOTAL_PAYED <", value, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POINT_TOTAL_PAYED <=", value, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedIn(List<BigDecimal> values) {
            addCriterion("POINT_TOTAL_PAYED in", values, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedNotIn(List<BigDecimal> values) {
            addCriterion("POINT_TOTAL_PAYED not in", values, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POINT_TOTAL_PAYED between", value1, value2, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andPointTotalPayedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POINT_TOTAL_PAYED not between", value1, value2, "pointTotalPayed");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalIsNull() {
            addCriterion("TRANS_POINT_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalIsNotNull() {
            addCriterion("TRANS_POINT_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalEqualTo(BigDecimal value) {
            addCriterion("TRANS_POINT_TOTAL =", value, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_POINT_TOTAL <>", value, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalGreaterThan(BigDecimal value) {
            addCriterion("TRANS_POINT_TOTAL >", value, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_POINT_TOTAL >=", value, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalLessThan(BigDecimal value) {
            addCriterion("TRANS_POINT_TOTAL <", value, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_POINT_TOTAL <=", value, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalIn(List<BigDecimal> values) {
            addCriterion("TRANS_POINT_TOTAL in", values, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_POINT_TOTAL not in", values, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_POINT_TOTAL between", value1, value2, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransPointTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_POINT_TOTAL not between", value1, value2, "transPointTotal");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyIsNull() {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyIsNotNull() {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY =", value, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY <>", value, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyGreaterThan(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY >", value, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY >=", value, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyLessThan(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY <", value, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY <=", value, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY in", values, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY not in", values, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY between", value1, value2, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andTransType6AmountCurrencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_TYPE6_AMOUNT_CURRENCY not between", value1, value2, "transType6AmountCurrency");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIsNull() {
            addCriterion("COMMISSION_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIsNotNull() {
            addCriterion("COMMISSION_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountEqualTo(BigDecimal value) {
            addCriterion("COMMISSION_AMOUNT =", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotEqualTo(BigDecimal value) {
            addCriterion("COMMISSION_AMOUNT <>", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountGreaterThan(BigDecimal value) {
            addCriterion("COMMISSION_AMOUNT >", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSION_AMOUNT >=", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountLessThan(BigDecimal value) {
            addCriterion("COMMISSION_AMOUNT <", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSION_AMOUNT <=", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIn(List<BigDecimal> values) {
            addCriterion("COMMISSION_AMOUNT in", values, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotIn(List<BigDecimal> values) {
            addCriterion("COMMISSION_AMOUNT not in", values, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSION_AMOUNT between", value1, value2, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSION_AMOUNT not between", value1, value2, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTagIsNull() {
            addCriterion("ORDER_TAG is null");
            return (Criteria) this;
        }

        public Criteria andOrderTagIsNotNull() {
            addCriterion("ORDER_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTagEqualTo(String value) {
            addCriterion("ORDER_TAG =", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagNotEqualTo(String value) {
            addCriterion("ORDER_TAG <>", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagGreaterThan(String value) {
            addCriterion("ORDER_TAG >", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TAG >=", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagLessThan(String value) {
            addCriterion("ORDER_TAG <", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TAG <=", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagLike(String value) {
            addCriterion("ORDER_TAG like", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagNotLike(String value) {
            addCriterion("ORDER_TAG not like", value, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagIn(List<String> values) {
            addCriterion("ORDER_TAG in", values, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagNotIn(List<String> values) {
            addCriterion("ORDER_TAG not in", values, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagBetween(String value1, String value2) {
            addCriterion("ORDER_TAG between", value1, value2, "orderTag");
            return (Criteria) this;
        }

        public Criteria andOrderTagNotBetween(String value1, String value2) {
            addCriterion("ORDER_TAG not between", value1, value2, "orderTag");
            return (Criteria) this;
        }

        public Criteria andPayVersionIsNull() {
            addCriterion("PAY_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andPayVersionIsNotNull() {
            addCriterion("PAY_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andPayVersionEqualTo(Short value) {
            addCriterion("PAY_VERSION =", value, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionNotEqualTo(Short value) {
            addCriterion("PAY_VERSION <>", value, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionGreaterThan(Short value) {
            addCriterion("PAY_VERSION >", value, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_VERSION >=", value, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionLessThan(Short value) {
            addCriterion("PAY_VERSION <", value, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionLessThanOrEqualTo(Short value) {
            addCriterion("PAY_VERSION <=", value, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionIn(List<Short> values) {
            addCriterion("PAY_VERSION in", values, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionNotIn(List<Short> values) {
            addCriterion("PAY_VERSION not in", values, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionBetween(Short value1, Short value2) {
            addCriterion("PAY_VERSION between", value1, value2, "payVersion");
            return (Criteria) this;
        }

        public Criteria andPayVersionNotBetween(Short value1, Short value2) {
            addCriterion("PAY_VERSION not between", value1, value2, "payVersion");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeIsNull() {
            addCriterion("MERCHANT_SITE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeIsNotNull() {
            addCriterion("MERCHANT_SITE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeEqualTo(String value) {
            addCriterion("MERCHANT_SITE_CODE =", value, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeNotEqualTo(String value) {
            addCriterion("MERCHANT_SITE_CODE <>", value, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeGreaterThan(String value) {
            addCriterion("MERCHANT_SITE_CODE >", value, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_SITE_CODE >=", value, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeLessThan(String value) {
            addCriterion("MERCHANT_SITE_CODE <", value, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_SITE_CODE <=", value, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeLike(String value) {
            addCriterion("MERCHANT_SITE_CODE like", value, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeNotLike(String value) {
            addCriterion("MERCHANT_SITE_CODE not like", value, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeIn(List<String> values) {
            addCriterion("MERCHANT_SITE_CODE in", values, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeNotIn(List<String> values) {
            addCriterion("MERCHANT_SITE_CODE not in", values, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeBetween(String value1, String value2) {
            addCriterion("MERCHANT_SITE_CODE between", value1, value2, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andMerchantSiteCodeNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_SITE_CODE not between", value1, value2, "merchantSiteCode");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionIsNull() {
            addCriterion("SETTLEMENT_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionIsNotNull() {
            addCriterion("SETTLEMENT_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionEqualTo(String value) {
            addCriterion("SETTLEMENT_VERSION =", value, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionNotEqualTo(String value) {
            addCriterion("SETTLEMENT_VERSION <>", value, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionGreaterThan(String value) {
            addCriterion("SETTLEMENT_VERSION >", value, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_VERSION >=", value, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionLessThan(String value) {
            addCriterion("SETTLEMENT_VERSION <", value, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_VERSION <=", value, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionLike(String value) {
            addCriterion("SETTLEMENT_VERSION like", value, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionNotLike(String value) {
            addCriterion("SETTLEMENT_VERSION not like", value, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionIn(List<String> values) {
            addCriterion("SETTLEMENT_VERSION in", values, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionNotIn(List<String> values) {
            addCriterion("SETTLEMENT_VERSION not in", values, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_VERSION between", value1, value2, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andSettlementVersionNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_VERSION not between", value1, value2, "settlementVersion");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoIsNull() {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoIsNotNull() {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO =", value, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoNotEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO <>", value, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoGreaterThan(String value) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO >", value, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO >=", value, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoLessThan(String value) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO <", value, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO <=", value, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoLike(String value) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO like", value, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoNotLike(String value) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO not like", value, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO in", values, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoNotIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO not in", values, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO between", value1, value2, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountPayLimitInfoNotBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_PAY_LIMIT_INFO not between", value1, value2, "orderAmountPayLimitInfo");
            return (Criteria) this;
        }

        public Criteria andDonationAmountIsNull() {
            addCriterion("DONATION_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDonationAmountIsNotNull() {
            addCriterion("DONATION_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDonationAmountEqualTo(BigDecimal value) {
            addCriterion("DONATION_AMOUNT =", value, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountNotEqualTo(BigDecimal value) {
            addCriterion("DONATION_AMOUNT <>", value, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountGreaterThan(BigDecimal value) {
            addCriterion("DONATION_AMOUNT >", value, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DONATION_AMOUNT >=", value, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountLessThan(BigDecimal value) {
            addCriterion("DONATION_AMOUNT <", value, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DONATION_AMOUNT <=", value, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountIn(List<BigDecimal> values) {
            addCriterion("DONATION_AMOUNT in", values, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountNotIn(List<BigDecimal> values) {
            addCriterion("DONATION_AMOUNT not in", values, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DONATION_AMOUNT between", value1, value2, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andDonationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DONATION_AMOUNT not between", value1, value2, "donationAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkIsNull() {
            addCriterion("MERCHANT_ORDER_LINK is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkIsNotNull() {
            addCriterion("MERCHANT_ORDER_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_LINK =", value, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkNotEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_LINK <>", value, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkGreaterThan(String value) {
            addCriterion("MERCHANT_ORDER_LINK >", value, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_LINK >=", value, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkLessThan(String value) {
            addCriterion("MERCHANT_ORDER_LINK <", value, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_LINK <=", value, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkLike(String value) {
            addCriterion("MERCHANT_ORDER_LINK like", value, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkNotLike(String value) {
            addCriterion("MERCHANT_ORDER_LINK not like", value, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_LINK in", values, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkNotIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_LINK not in", values, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_LINK between", value1, value2, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderLinkNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_LINK not between", value1, value2, "merchantOrderLink");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdIsNull() {
            addCriterion("MERCHANT_ORDER_REQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdIsNotNull() {
            addCriterion("MERCHANT_ORDER_REQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_REQ_ID =", value, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdNotEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_REQ_ID <>", value, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdGreaterThan(String value) {
            addCriterion("MERCHANT_ORDER_REQ_ID >", value, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_REQ_ID >=", value, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdLessThan(String value) {
            addCriterion("MERCHANT_ORDER_REQ_ID <", value, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_REQ_ID <=", value, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdLike(String value) {
            addCriterion("MERCHANT_ORDER_REQ_ID like", value, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdNotLike(String value) {
            addCriterion("MERCHANT_ORDER_REQ_ID not like", value, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_REQ_ID in", values, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdNotIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_REQ_ID not in", values, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_REQ_ID between", value1, value2, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderReqIdNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_REQ_ID not between", value1, value2, "merchantOrderReqId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusIsNull() {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusIsNotNull() {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusEqualTo(Short value) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS =", value, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusNotEqualTo(Short value) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS <>", value, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusGreaterThan(Short value) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS >", value, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS >=", value, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusLessThan(Short value) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS <", value, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusLessThanOrEqualTo(Short value) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS <=", value, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusIn(List<Short> values) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS in", values, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusNotIn(List<Short> values) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS not in", values, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusBetween(Short value1, Short value2) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS between", value1, value2, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andGroupBuyingDispatchStatusNotBetween(Short value1, Short value2) {
            addCriterion("GROUP_BUYING_DISPATCH_STATUS not between", value1, value2, "groupBuyingDispatchStatus");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumIsNull() {
            addCriterion("TAXPAYER_IDENTITY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumIsNotNull() {
            addCriterion("TAXPAYER_IDENTITY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumEqualTo(String value) {
            addCriterion("TAXPAYER_IDENTITY_NUM =", value, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumNotEqualTo(String value) {
            addCriterion("TAXPAYER_IDENTITY_NUM <>", value, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumGreaterThan(String value) {
            addCriterion("TAXPAYER_IDENTITY_NUM >", value, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_IDENTITY_NUM >=", value, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumLessThan(String value) {
            addCriterion("TAXPAYER_IDENTITY_NUM <", value, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_IDENTITY_NUM <=", value, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumLike(String value) {
            addCriterion("TAXPAYER_IDENTITY_NUM like", value, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumNotLike(String value) {
            addCriterion("TAXPAYER_IDENTITY_NUM not like", value, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumIn(List<String> values) {
            addCriterion("TAXPAYER_IDENTITY_NUM in", values, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumNotIn(List<String> values) {
            addCriterion("TAXPAYER_IDENTITY_NUM not in", values, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumBetween(String value1, String value2) {
            addCriterion("TAXPAYER_IDENTITY_NUM between", value1, value2, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentityNumNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER_IDENTITY_NUM not between", value1, value2, "taxpayerIdentityNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailIsNull() {
            addCriterion("INVOICE_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailIsNotNull() {
            addCriterion("INVOICE_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailEqualTo(String value) {
            addCriterion("INVOICE_EMAIL =", value, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailNotEqualTo(String value) {
            addCriterion("INVOICE_EMAIL <>", value, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailGreaterThan(String value) {
            addCriterion("INVOICE_EMAIL >", value, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_EMAIL >=", value, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailLessThan(String value) {
            addCriterion("INVOICE_EMAIL <", value, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_EMAIL <=", value, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailLike(String value) {
            addCriterion("INVOICE_EMAIL like", value, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailNotLike(String value) {
            addCriterion("INVOICE_EMAIL not like", value, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailIn(List<String> values) {
            addCriterion("INVOICE_EMAIL in", values, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailNotIn(List<String> values) {
            addCriterion("INVOICE_EMAIL not in", values, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailBetween(String value1, String value2) {
            addCriterion("INVOICE_EMAIL between", value1, value2, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andInvoiceEmailNotBetween(String value1, String value2) {
            addCriterion("INVOICE_EMAIL not between", value1, value2, "invoiceEmail");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIsNull() {
            addCriterion("DISPATCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIsNotNull() {
            addCriterion("DISPATCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeEqualTo(Short value) {
            addCriterion("DISPATCH_TYPE =", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotEqualTo(Short value) {
            addCriterion("DISPATCH_TYPE <>", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeGreaterThan(Short value) {
            addCriterion("DISPATCH_TYPE >", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("DISPATCH_TYPE >=", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeLessThan(Short value) {
            addCriterion("DISPATCH_TYPE <", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeLessThanOrEqualTo(Short value) {
            addCriterion("DISPATCH_TYPE <=", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIn(List<Short> values) {
            addCriterion("DISPATCH_TYPE in", values, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotIn(List<Short> values) {
            addCriterion("DISPATCH_TYPE not in", values, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeBetween(Short value1, Short value2) {
            addCriterion("DISPATCH_TYPE between", value1, value2, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotBetween(Short value1, Short value2) {
            addCriterion("DISPATCH_TYPE not between", value1, value2, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedIsNull() {
            addCriterion("RISK_CONTROL_PASSED is null");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedIsNotNull() {
            addCriterion("RISK_CONTROL_PASSED is not null");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedEqualTo(Short value) {
            addCriterion("RISK_CONTROL_PASSED =", value, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedNotEqualTo(Short value) {
            addCriterion("RISK_CONTROL_PASSED <>", value, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedGreaterThan(Short value) {
            addCriterion("RISK_CONTROL_PASSED >", value, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedGreaterThanOrEqualTo(Short value) {
            addCriterion("RISK_CONTROL_PASSED >=", value, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedLessThan(Short value) {
            addCriterion("RISK_CONTROL_PASSED <", value, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedLessThanOrEqualTo(Short value) {
            addCriterion("RISK_CONTROL_PASSED <=", value, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedIn(List<Short> values) {
            addCriterion("RISK_CONTROL_PASSED in", values, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedNotIn(List<Short> values) {
            addCriterion("RISK_CONTROL_PASSED not in", values, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedBetween(Short value1, Short value2) {
            addCriterion("RISK_CONTROL_PASSED between", value1, value2, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andRiskControlPassedNotBetween(Short value1, Short value2) {
            addCriterion("RISK_CONTROL_PASSED not between", value1, value2, "riskControlPassed");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNull() {
            addCriterion("SETTLEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNotNull() {
            addCriterion("SETTLEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE =", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE <>", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThan(String value) {
            addCriterion("SETTLEMENT_TYPE >", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE >=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThan(String value) {
            addCriterion("SETTLEMENT_TYPE <", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE <=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLike(String value) {
            addCriterion("SETTLEMENT_TYPE like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotLike(String value) {
            addCriterion("SETTLEMENT_TYPE not like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIn(List<String> values) {
            addCriterion("SETTLEMENT_TYPE in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotIn(List<String> values) {
            addCriterion("SETTLEMENT_TYPE not in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_TYPE between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_TYPE not between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidIsNull() {
            addCriterion("SALEMAN_ONLYID is null");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidIsNotNull() {
            addCriterion("SALEMAN_ONLYID is not null");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidEqualTo(BigDecimal value) {
            addCriterion("SALEMAN_ONLYID =", value, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidNotEqualTo(BigDecimal value) {
            addCriterion("SALEMAN_ONLYID <>", value, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidGreaterThan(BigDecimal value) {
            addCriterion("SALEMAN_ONLYID >", value, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALEMAN_ONLYID >=", value, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidLessThan(BigDecimal value) {
            addCriterion("SALEMAN_ONLYID <", value, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALEMAN_ONLYID <=", value, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidIn(List<BigDecimal> values) {
            addCriterion("SALEMAN_ONLYID in", values, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidNotIn(List<BigDecimal> values) {
            addCriterion("SALEMAN_ONLYID not in", values, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALEMAN_ONLYID between", value1, value2, "salemanOnlyid");
            return (Criteria) this;
        }

        public Criteria andSalemanOnlyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALEMAN_ONLYID not between", value1, value2, "salemanOnlyid");
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