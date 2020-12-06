package example.mapper;

import static example.mapper.EmployeeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import example.ResultCountWrapper;
import example.model.Employee;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.aggregate.Count;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface EmployeeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.643+08:00", comments="Source Table: EMPLOYEE")
    BasicColumn[] selectList = BasicColumn.columnList(id, firstName, lastName, birthDate, employed, occupation, companyId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.594+08:00", comments="Source Table: EMPLOYEE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.599+08:00", comments="Source Table: EMPLOYEE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.602+08:00", comments="Source Table: EMPLOYEE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Employee> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.608+08:00", comments="Source Table: EMPLOYEE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Employee> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.611+08:00", comments="Source Table: EMPLOYEE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EmployeeResult")
    Optional<Employee> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.615+08:00", comments="Source Table: EMPLOYEE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EmployeeResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="BIRTH_DATE", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="EMPLOYED", property="employed", jdbcType=JdbcType.VARCHAR),
        @Result(column="OCCUPATION", property="occupation", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPANY_ID", property="companyId", jdbcType=JdbcType.INTEGER)
    })
    List<Employee> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.621+08:00", comments="Source Table: EMPLOYEE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.622+08:00", comments="Source Table: EMPLOYEE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, employee, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.626+08:00", comments="Source Table: EMPLOYEE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, employee, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.627+08:00", comments="Source Table: EMPLOYEE")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.629+08:00", comments="Source Table: EMPLOYEE")
    default int insert(Employee record) {
        return MyBatis3Utils.insert(this::insert, record, employee, c ->
            c.map(id).toProperty("id")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(birthDate).toProperty("birthDate")
            .map(employed).toProperty("employed")
            .map(occupation).toProperty("occupation")
            .map(companyId).toProperty("companyId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.634+08:00", comments="Source Table: EMPLOYEE")
    default int insertMultiple(Collection<Employee> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, employee, c ->
            c.map(id).toProperty("id")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(birthDate).toProperty("birthDate")
            .map(employed).toProperty("employed")
            .map(occupation).toProperty("occupation")
            .map(companyId).toProperty("companyId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.635+08:00", comments="Source Table: EMPLOYEE")
    default int insertSelective(Employee record) {
        return MyBatis3Utils.insert(this::insert, record, employee, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(firstName).toPropertyWhenPresent("firstName", record::getFirstName)
            .map(lastName).toPropertyWhenPresent("lastName", record::getLastName)
            .map(birthDate).toPropertyWhenPresent("birthDate", record::getBirthDate)
            .map(employed).toPropertyWhenPresent("employed", record::getEmployed)
            .map(occupation).toPropertyWhenPresent("occupation", record::getOccupation)
            .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.645+08:00", comments="Source Table: EMPLOYEE")
    default Optional<Employee> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, employee, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.646+08:00", comments="Source Table: EMPLOYEE")
    default List<Employee> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, employee, completer);
    }

    default List<Employee> select(ResultCountWrapper.SelectDSLCompleterExt completer, RowBounds rb) {

        return selectMany(completer.apply(SqlBuilder.select(selectList).from(employee),rb).
                build().render(RenderingStrategies.MYBATIS3));
    }


    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long selectForCount(SelectStatementProvider selectStatement);

    default long selectCount(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectForCount, new BasicColumn[]{Count.of(employee.allColumns())},
                employee, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.647+08:00", comments="Source Table: EMPLOYEE")
    default List<Employee> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, employee, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.647+08:00", comments="Source Table: EMPLOYEE")
    default Optional<Employee> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.648+08:00", comments="Source Table: EMPLOYEE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, employee, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.649+08:00", comments="Source Table: EMPLOYEE")
    static UpdateDSL<UpdateModel> updateAllColumns(Employee record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(firstName).equalTo(record::getFirstName)
                .set(lastName).equalTo(record::getLastName)
                .set(birthDate).equalTo(record::getBirthDate)
                .set(employed).equalTo(record::getEmployed)
                .set(occupation).equalTo(record::getOccupation)
                .set(companyId).equalTo(record::getCompanyId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.649+08:00", comments="Source Table: EMPLOYEE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Employee record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(firstName).equalToWhenPresent(record::getFirstName)
                .set(lastName).equalToWhenPresent(record::getLastName)
                .set(birthDate).equalToWhenPresent(record::getBirthDate)
                .set(employed).equalToWhenPresent(record::getEmployed)
                .set(occupation).equalToWhenPresent(record::getOccupation)
                .set(companyId).equalToWhenPresent(record::getCompanyId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.65+08:00", comments="Source Table: EMPLOYEE")
    default int updateByPrimaryKey(Employee record) {
        return update(c ->
            c.set(firstName).equalTo(record::getFirstName)
            .set(lastName).equalTo(record::getLastName)
            .set(birthDate).equalTo(record::getBirthDate)
            .set(employed).equalTo(record::getEmployed)
            .set(occupation).equalTo(record::getOccupation)
            .set(companyId).equalTo(record::getCompanyId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.651+08:00", comments="Source Table: EMPLOYEE")
    default int updateByPrimaryKeySelective(Employee record) {
        return update(c ->
            c.set(firstName).equalToWhenPresent(record::getFirstName)
            .set(lastName).equalToWhenPresent(record::getLastName)
            .set(birthDate).equalToWhenPresent(record::getBirthDate)
            .set(employed).equalToWhenPresent(record::getEmployed)
            .set(occupation).equalToWhenPresent(record::getOccupation)
            .set(companyId).equalToWhenPresent(record::getCompanyId)
            .where(id, isEqualTo(record::getId))
        );
    }
}