# Spring事务的传播行为
> REQUIRED(0)
1) 在事务中执行.如果存在事务就在当前事务执行;如果不存在事务就创建新的事务
2) ServiceA中methodA调用ServiceB中的methodB,如果两个方法都使用REQUIRED,methodB出现异常但是自己捕获了,methodA会正常提交,methodB ???
3) 继1),如果methodB出现异常,没有捕获,则异常会传递到methodA
> SUPPORTS(1)
- 有事务则在事务中执行,没有事务则以非事务方式执行
> MANDATORY(2)
- 只能在事务中执行,如果当前没有事务,则抛出异常 
> REQUIRES_NEW(3)
- 总是在创建新的事务
> NOT_SUPPORTED(4)
- 非事务方式执行.如果当前存在事务,则挂起当前事务
> NEVER(5)
- 非事务方式执行.存在事务,则抛出异常
> NESTED(6)
- Nested的事务和他的父事务是相依的，他的提交是要等和他的父事务一块提交的。也就是说，假设父事务最后回滚,他也要回滚的。

---

> *** 手动回滚当前事务,Spring内部使用异常处理.不会传递异常到外层的事务
```
TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
``` 

====
 ---
# 事务的隔离级别