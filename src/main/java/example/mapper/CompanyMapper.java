package example.mapper;

import static example.mapper.CompanyDynamicSqlSupport.*;

import example.model.Company;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface CompanyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.656+08:00", comments="Source Table: COMPANY")
    BasicColumn[] selectList = BasicColumn.columnList(id, companyName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source Table: COMPANY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source Table: COMPANY")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source Table: COMPANY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Company> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source Table: COMPANY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Company> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source Table: COMPANY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CompanyResult")
    Optional<Company> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source Table: COMPANY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CompanyResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="COMPANY_NAME", property="companyName", jdbcType=JdbcType.VARCHAR)
    })
    List<Company> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.656+08:00", comments="Source Table: COMPANY")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.656+08:00", comments="Source Table: COMPANY")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.656+08:00", comments="Source Table: COMPANY")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.656+08:00", comments="Source Table: COMPANY")
    default int insert(Company record) {
        return MyBatis3Utils.insert(this::insert, record, company, c ->
            c.map(id).toProperty("id")
            .map(companyName).toProperty("companyName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.656+08:00", comments="Source Table: COMPANY")
    default int insertMultiple(Collection<Company> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, company, c ->
            c.map(id).toProperty("id")
            .map(companyName).toProperty("companyName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.656+08:00", comments="Source Table: COMPANY")
    default int insertSelective(Company record) {
        return MyBatis3Utils.insert(this::insert, record, company, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(companyName).toPropertyWhenPresent("companyName", record::getCompanyName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.657+08:00", comments="Source Table: COMPANY")
    default Optional<Company> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.657+08:00", comments="Source Table: COMPANY")
    default List<Company> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.657+08:00", comments="Source Table: COMPANY")
    default List<Company> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.657+08:00", comments="Source Table: COMPANY")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.657+08:00", comments="Source Table: COMPANY")
    static UpdateDSL<UpdateModel> updateAllColumns(Company record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(companyName).equalTo(record::getCompanyName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.657+08:00", comments="Source Table: COMPANY")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Company record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(companyName).equalToWhenPresent(record::getCompanyName);
    }
}