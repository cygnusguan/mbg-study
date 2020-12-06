package example.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CompanyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source Table: COMPANY")
    public static final Company company = new Company();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source field: COMPANY.ID")
    public static final SqlColumn<Integer> id = company.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source field: COMPANY.COMPANY_NAME")
    public static final SqlColumn<String> companyName = company.companyName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.655+08:00", comments="Source Table: COMPANY")
    public static final class Company extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> companyName = column("COMPANY_NAME", JDBCType.VARCHAR);

        public Company() {
            super("COMPANY");
        }
    }
}