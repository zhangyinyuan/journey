package mapper;

import com.yuan.ngu.spring.boot.oracle.pojo.po.CtocOrder;
import java.math.BigDecimal;
import java.util.List;

public interface CtocOrderMapper {
    int deleteByPrimaryKey(BigDecimal orderId);

    int insert(CtocOrder record);

    CtocOrder selectByPrimaryKey(BigDecimal orderId);

    List<CtocOrder> selectAll();

    int updateByPrimaryKey(CtocOrder record);
}