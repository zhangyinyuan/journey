package mapper;

import com.yuan.ngu.spring.boot.oracle.pojo.po.CtocOrder;
import com.yuan.ngu.spring.boot.oracle.pojo.po.CtocOrderExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtocOrderMapper {

    int deleteByPrimaryKey(BigDecimal orderId);

    int insert(CtocOrder record);

    int insertSelective(CtocOrder record);


    CtocOrder selectByPrimaryKey(BigDecimal orderId);

    int updateByPrimaryKeySelective(CtocOrder record);

    int updateByPrimaryKey(CtocOrder record);
}