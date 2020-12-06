package example.model;

import javax.annotation.Generated;

public class Company {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.654+08:00", comments="Source field: COMPANY.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.654+08:00", comments="Source field: COMPANY.COMPANY_NAME")
    private String companyName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.654+08:00", comments="Source field: COMPANY.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.654+08:00", comments="Source field: COMPANY.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.654+08:00", comments="Source field: COMPANY.COMPANY_NAME")
    public String getCompanyName() {
        return companyName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.654+08:00", comments="Source field: COMPANY.COMPANY_NAME")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}