package example.mapper;


import static example.mapper.CompanyDynamicSqlSupport.*;
import static example.mapper.EmployeeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import example.ResultCountWrapper;
import example.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.*;

import java.util.List;

@Mapper
public interface MyMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<EmployeeDynamicSqlSupport.Employee>, CommonSelectMapper,
        CommonUpdateMapper {
    BasicColumn[] selectList = EmployeeMapper.selectList;

    @SelectProvider(type= SqlProviderAdapter.class, method="select")
    @ResultMap("example.mapper.myEmployee")
    List<Employee> select(SelectStatementProvider statement);

    default ResultCountWrapper<Employee> selectWithRowCount(SelectStatementProvider statement){
        String sql = statement.getSelectStatement();

        return null;

    }


}