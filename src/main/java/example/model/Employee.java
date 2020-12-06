package example.model;

import java.util.Date;
import javax.annotation.Generated;

public class Employee {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.572+08:00", comments="Source field: EMPLOYEE.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.FIRST_NAME")
    private String firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.LAST_NAME")
    private String lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.BIRTH_DATE")
    private Date birthDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.EMPLOYED")
    private String employed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.58+08:00", comments="Source field: EMPLOYEE.OCCUPATION")
    private String occupation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.58+08:00", comments="Source field: EMPLOYEE.COMPANY_ID")
    private Integer companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.578+08:00", comments="Source field: EMPLOYEE.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.FIRST_NAME")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.LAST_NAME")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.BIRTH_DATE")
    public Date getBirthDate() {
        return birthDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.BIRTH_DATE")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.579+08:00", comments="Source field: EMPLOYEE.EMPLOYED")
    public String getEmployed() {
        return employed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.58+08:00", comments="Source field: EMPLOYEE.EMPLOYED")
    public void setEmployed(String employed) {
        this.employed = employed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.58+08:00", comments="Source field: EMPLOYEE.OCCUPATION")
    public String getOccupation() {
        return occupation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.58+08:00", comments="Source field: EMPLOYEE.OCCUPATION")
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.58+08:00", comments="Source field: EMPLOYEE.COMPANY_ID")
    public Integer getCompanyId() {
        return companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T17:03:49.58+08:00", comments="Source field: EMPLOYEE.COMPANY_ID")
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}