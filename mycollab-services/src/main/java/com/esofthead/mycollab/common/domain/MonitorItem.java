/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_monitor_item*/
package com.esofthead.mycollab.common.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_monitor_item")
public class MonitorItem extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.id
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.user
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("user")
    private String user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.monitor_date
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    @Column("monitor_date")
    private Date monitorDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.type
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.typeid
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    @Column("typeid")
    private Integer typeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.extraTypeId
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    @Column("extraTypeId")
    private Integer extratypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.sAccountId
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (obj.getClass() != getClass()) { return false;}
        MonitorItem item = (MonitorItem)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1457, 357).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.id
     *
     * @return the value of m_monitor_item.id
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.id
     *
     * @param id the value for m_monitor_item.id
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.user
     *
     * @return the value of m_monitor_item.user
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.user
     *
     * @param user the value for m_monitor_item.user
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.monitor_date
     *
     * @return the value of m_monitor_item.monitor_date
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public Date getMonitorDate() {
        return monitorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.monitor_date
     *
     * @param monitorDate the value for m_monitor_item.monitor_date
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public void setMonitorDate(Date monitorDate) {
        this.monitorDate = monitorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.type
     *
     * @return the value of m_monitor_item.type
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.type
     *
     * @param type the value for m_monitor_item.type
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.typeid
     *
     * @return the value of m_monitor_item.typeid
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.typeid
     *
     * @param typeid the value for m_monitor_item.typeid
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.extraTypeId
     *
     * @return the value of m_monitor_item.extraTypeId
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public Integer getExtratypeid() {
        return extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.extraTypeId
     *
     * @param extratypeid the value for m_monitor_item.extraTypeId
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public void setExtratypeid(Integer extratypeid) {
        this.extratypeid = extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.sAccountId
     *
     * @return the value of m_monitor_item.sAccountId
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.sAccountId
     *
     * @param saccountid the value for m_monitor_item.sAccountId
     *
     * @mbggenerated Mon Jan 25 19:26:08 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    public enum Field {
        id,
        user,
        monitorDate,
        type,
        typeid,
        extratypeid,
        saccountid;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}