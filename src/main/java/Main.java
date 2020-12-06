
import static example.mapper.EmployeeDynamicSqlSupport.*;
import static example.mapper.CompanyDynamicSqlSupport.*;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import example.mapper.CompanyDynamicSqlSupport;
import example.mapper.EmployeeDynamicSqlSupport;
import example.mapper.EmployeeMapper;
import example.mapper.MyMapper;
import example.model.Employee;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.dynamic.sql.SqlCriterion;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.*;
import org.mybatis.dynamic.sql.select.aggregate.Count;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.Buildable;
import org.mybatis.dynamic.sql.where.WhereModel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        MyMapper m2 = session.getMapper(MyMapper.class);


        SelectDSLCompleter dsl = c-> c
                .leftJoin(company).on(companyId , equalTo(CompanyDynamicSqlSupport.id))
                .where(lastName,isNotNull())
                .and(firstName,isNotLike("%a%"))
                .and(companyName,isEqualTo("Intel"))
                ;

        List<Employee> list = mapper.select(dsl);
        System.out.println("m0 get : " + list);

        WhereModel wm = where(lastName,isNotNull())
                .and(firstName,isNotIn("F1"))

                .build();

        QueryExpressionModel.Builder qb = new QueryExpressionModel.Builder()
                .withTable(employee)
                .withWhereModel(wm);

        SelectModel.Builder smb = new SelectModel.Builder()
                .withQueryExpression(qb.withSelectColumn(Count.of(EmployeeDynamicSqlSupport.id)).build());

        SelectStatementProvider sp3 = smb.build().render(RenderingStrategies.MYBATIS3);
        SelectStatementProvider sp4 = new SelectModel.Builder()
                .withQueryExpression(
                        qb.withSelectList(Arrays.asList(mapper.selectList)).build())
                .withPagingModel(new PagingModel.Builder().withLimit(1L).withOffset(1L).build())
                .build().render(RenderingStrategies.MYBATIS3);

        SelectDSLCompleter s1 = c -> c
                .leftJoin(company).on(companyId,equalTo(CompanyDynamicSqlSupport.id))
                .where(lastName,isNotNull())
                .and(firstName,isNotEqualTo("a"))
                ;

        RowBounds rows = new RowBounds(1,1);
        MyFunction mm = (a,b) -> a..limit(b.getLimit()).offset(b.getOffset());
        List<Employee> result = mapper.select(s1,rows,mm);



        long count = mapper.selectCount(s1);
        System.out.println("LOng count is : " + count);



        SelectStatementProvider sp = select( Count.of(EmployeeDynamicSqlSupport.id))
                .from(employee)
                .where(lastName,isNotNull())
                .build().render(RenderingStrategies.MYBATIS3);

        Object sel = select(Count.of(firstName))
                .from(employee)
                .leftJoin(company).on(companyId,equalTo(CompanyDynamicSqlSupport.id))
                .where(companyId,isEqualTo(2));


        SelectDSLCompleter ssl = c -> c.where(firstName,isLike("%F%")).and(lastName,isNotNull())
                .limit(1).offset(1);




        List<Employee> list2 = mapper.selectMany(sp4);

        Employee ee = mapper.selectByPrimaryKey(1).orElseThrow( RuntimeException::new);
        System.out.println(ee.getFirstName() + ee.getBirthDate());
    }

    public static void main2(String[] args) throws Exception{

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        MyMapper m2 = session.getMapper(MyMapper.class);


        SelectDSLCompleter dsl = c-> c
                .leftJoin(company).on(companyId , equalTo(CompanyDynamicSqlSupport.id))
                .where(lastName,isNotNull())
                .and(firstName,isNotLike("%a%"))
                .and(companyName,isEqualTo("Intel"))
                ;

        List<Employee> list = mapper.select(dsl);
        System.out.println("m0 get : " + list);

        WhereModel wm = where(lastName,isNotNull())
                .and(firstName,isNotIn("F1"))

                .build();

        QueryExpressionModel.Builder qb = new QueryExpressionModel.Builder()
                .withTable(employee)
                .withWhereModel(wm);

        SelectModel.Builder smb = new SelectModel.Builder()
                .withQueryExpression(qb.withSelectColumn(Count.of(EmployeeDynamicSqlSupport.id)).build());

        SelectStatementProvider sp3 = smb.build().render(RenderingStrategies.MYBATIS3);
        SelectStatementProvider sp4 = new SelectModel.Builder()
                .withQueryExpression(
                        qb.withSelectList(Arrays.asList(mapper.selectList)).build())
                .withPagingModel(new PagingModel.Builder().withLimit(1L).withOffset(1L).build())
                .build().render(RenderingStrategies.MYBATIS3);

        SelectDSLCompleter s1 = c -> c.where(lastName,isNotNull());


        long count = mapper.selectCount(s1);
        System.out.println("LOng count is : " + count);






        SelectStatementProvider sp = select( Count.of(EmployeeDynamicSqlSupport.id))
                .from(employee)
                .where(lastName,isNotNull())
                .build().render(RenderingStrategies.MYBATIS3);

        Object sel = select(Count.of(firstName))
                .from(employee)
                .leftJoin(company).on(companyId,equalTo(CompanyDynamicSqlSupport.id))
                .where(companyId,isEqualTo(2));


        SelectDSLCompleter ssl = c -> c.where(firstName,isLike("%F%")).and(lastName,isNotNull())
                .limit(1).offset(1);




        List<Employee> list2 = mapper.selectMany(sp4);

        Employee ee = mapper.selectByPrimaryKey(1).orElseThrow( RuntimeException::new);
        System.out.println(ee.getFirstName() + ee.getBirthDate());
    }

    void test(){
        SelectStatementProvider ss = select(count())
                .from(employee, "a")
                .where(EmployeeDynamicSqlSupport.id, isGreaterThan(2))
                .or(lastName, isNull(), and(EmployeeDynamicSqlSupport.id, isLessThan(6)))
                .build()
                .render(RenderingStrategies.MYBATIS3);

        where(EmployeeDynamicSqlSupport.id, isGreaterThan(2))
                .or(lastName, isNull(), and(EmployeeDynamicSqlSupport.id, isLessThan(6)))
        .build()
                ;

        SqlCriterion.withColumn(lastName)
                .withCondition(isNotNull())
        .withColumn(lastName).withCondition(isNotNull());

    }

    void insert() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setFirstName("F2");
        e2.setLastName("L3");
        e2.setBirthDate(new Date());
        e2.setOccupation("a");
        e2.setEmployed("Y");

        Employee e3 = new Employee();
        e3.setId(3);
        e3.setFirstName("F3");
        e3.setLastName("L3");
        e3.setBirthDate(new Date());
        e3.setOccupation("a");
        e3.setEmployed("Y");

        mapper.insertMultiple(Arrays.asList(e2,e3));

        session.commit();

    }

    public static interface MyFunction extends
            BiFunction<SelectDSLCompleter,RowBounds, SelectDSLCompleter> {

    }
}

