package example.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmployeeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.585+08:00", comments="Source Table: EMPLOYEE")
    public static final Employee employee = new Employee();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.586+08:00", comments="Source field: EMPLOYEE.ID")
    public static final SqlColumn<Integer> id = employee.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.587+08:00", comments="Source field: EMPLOYEE.FIRST_NAME")
    public static final SqlColumn<String> firstName = employee.firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.588+08:00", comments="Source field: EMPLOYEE.LAST_NAME")
    public static final SqlColumn<String> lastName = employee.lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.589+08:00", comments="Source field: EMPLOYEE.BIRTH_DATE")
    public static final SqlColumn<Date> birthDate = employee.birthDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.589+08:00", comments="Source field: EMPLOYEE.EMPLOYED")
    public static final SqlColumn<String> employed = employee.employed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.59+08:00", comments="Source field: EMPLOYEE.OCCUPATION")
    public static final SqlColumn<String> occupation = employee.occupation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.592+08:00", comments="Source field: EMPLOYEE.COMPANY_ID")
    public static final SqlColumn<Integer> companyId = employee.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.585+08:00", comments="Source Table: EMPLOYEE")
    public static final class Employee extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> firstName = column("FIRST_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> lastName = column("LAST_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Date> birthDate = column("BIRTH_DATE", JDBCType.DATE);

        public final SqlColumn<String> employed = column("EMPLOYED", JDBCType.VARCHAR);

        public final SqlColumn<String> occupation = column("OCCUPATION", JDBCType.VARCHAR);

        public final SqlColumn<Integer> companyId = column("COMPANY_ID", JDBCType.INTEGER);

        public Employee() {
            super("EMPLOYEE");
        }
    }
}