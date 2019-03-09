
package co.motorola.sb.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;



@Entity
@Table(name = "sysaid_user",  uniqueConstraints = {
        @UniqueConstraint(columnNames = "user_name"),
        @UniqueConstraint(columnNames = "ref_id") })
public class Users implements Serializable  {
    @Id
    @Column(name = "user_name",updatable = false, columnDefinition = "NVARCHAR(64)")
    private String userName;
    @Column(name = "login_user",updatable = false, columnDefinition = "NVARCHAR(64)")
    private String loginUser;
    @Column(name = "account_id",updatable = false, columnDefinition = "NVARCHAR(32)")
    private String accountID;
    @Column(name = "password",updatable = false, columnDefinition = "NVARCHAR(64)")
    private String password;
    @Column(name = "first_name", columnDefinition = "NVARCHAR(64)")
    private String firstName;
    @Column(name = "last_name", columnDefinition = "NVARCHAR(64)")
    private String lastName;
    @Column(name = "display_name", columnDefinition = "NVARCHAR(64)")
    private String displayName;
    @Column(name = "phone", columnDefinition = "NVARCHAR(64)")
    private String phone;
    @Column(name = "cell_phone", columnDefinition = "NVARCHAR(64)")
    private String SMS;
    @Column(name = "email_address", columnDefinition = "NVARCHAR(64)")
    private String email;
    @Version
    @Column(name = "history_version")
    private final int historyVersion = 0;
    @Column(name = "ldap",updatable = false)
    private int ldap;
    @Column(name = "ref_id",insertable = false,updatable = false)
    private int refId;

    public Users() {
         
    }
    
    public String getUserName() {
        return userName;
    } 

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }
    
    
    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSMS() {
        return SMS;
    }

    public void setSMS(String SMS) {
        this.SMS = SMS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public int getHistoryVersion() {
        return historyVersion;
    }

    public int getLdap() {
        return ldap;
    }

    public void setLdap(int ldap) {
        this.ldap = ldap;
    }

    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }
    

    
}
