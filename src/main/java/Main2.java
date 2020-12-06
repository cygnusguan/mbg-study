import example.mapper.EmployeeMapper;
import example.model.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.dynamic.sql.SqlCriterion;
import org.mybatis.dynamic.sql.VisitableCondition;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.WhereDSL;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

import static example.mapper.EmployeeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        SqlCriterion<String> sc = SqlCriterion.withColumn(firstName.as("aa")).withCondition(isNotNull())
                //.withSubCriteria(Arrays.asList(SqlCriterion.withColumn(lastName).withCondition(isNotNull())))
                .build();
        VisitableCondition<String> vc = sc.condition();
        System.out.println(vc);

        ;

    }

    public static SelectStatementProvider select(QueryExpressionDSL<SelectModel> start,
                                                 SelectDSLCompleter completer) {
        return completer.apply(start)
                .build()
                .render(RenderingStrategies.MYBATIS3);
    }


    public String get(Integer i){


        Function<Integer ,String> f =  c -> "HHH" +c;
        f.apply(5);

        return "hahah " + i;

    }






}
