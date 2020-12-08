package example.mapper;

import example.model.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.util.Buildable;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.function.BiFunction;

import static example.mapper.EmployeeDynamicSqlSupport.*;
import static example.mapper.CompanyDynamicSqlSupport.*;

import static org.mybatis.dynamic.sql.SqlBuilder.*;


import static org.junit.Assert.*;
public class EmployeeMapperTest {
    private EmployeeMapper mapper ;

    @Before
    public void before() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
         mapper = session.getMapper(EmployeeMapper.class);
    }


    @Test
    public void testSelect(){



        BiFunction<Buildable<SelectModel>,RowBounds,SelectDSLCompleter> cf =
                (c,r) ->{
            if (c instanceof QueryExpressionDSL.QueryExpressionWhereBuilder){
                return a -> ((QueryExpressionDSL.QueryExpressionWhereBuilder)c).limit(r.getLimit()).offset(r.getOffset());
            } else if (c instanceof SelectDSL){
                return a -> ((SelectDSL)c).limit(r.getLimit()).offset(r.getOffset());
            } else{
                throw new IllegalArgumentException("Cannot extract row bound for " + c.getClass().getName());
            }
                };

        SelectDSLCompleter dslCompleter = c -> c.where(firstName,isNotNull()).orderBy(lastName);
        RowBounds rr = new RowBounds(1,10);

         dslCompleter.andThen( r -> cf).apply( select(employee.allColumns()).from(employee));




        List<Employee> list = mapper.select(dslCompleter);






    }
  
}