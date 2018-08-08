/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmanagmentsystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author shevindi
 */
@Entity
@Table(name = "attendance_details", catalog = "classmanagement", schema = "")
@NamedQueries({
    @NamedQuery(name = "AttendanceDetails.findAll", query = "SELECT a FROM AttendanceDetails a")
    , @NamedQuery(name = "AttendanceDetails.findByStudentNo", query = "SELECT a FROM AttendanceDetails a WHERE a.studentNo = :studentNo")
    , @NamedQuery(name = "AttendanceDetails.findByStudentName", query = "SELECT a FROM AttendanceDetails a WHERE a.studentName = :studentName")
    , @NamedQuery(name = "AttendanceDetails.findByAddress", query = "SELECT a FROM AttendanceDetails a WHERE a.address = :address")
    , @NamedQuery(name = "AttendanceDetails.findByTelNo", query = "SELECT a FROM AttendanceDetails a WHERE a.telNo = :telNo")
    , @NamedQuery(name = "AttendanceDetails.findByDate", query = "SELECT a FROM AttendanceDetails a WHERE a.date = :date")
    , @NamedQuery(name = "AttendanceDetails.findByCourseID", query = "SELECT a FROM AttendanceDetails a WHERE a.courseID = :courseID")
    , @NamedQuery(name = "AttendanceDetails.findByUserID", query = "SELECT a FROM AttendanceDetails a WHERE a.userID = :userID")})
public class AttendanceDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "StudentNo")
    private Integer studentNo;
    @Basic(optional = false)
    @Column(name = "StudentName")
    private String studentName;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "TelNo")
    private int telNo;
    @Column(name = "Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @Column(name = "CourseID")
    private String courseID;
    @Basic(optional = false)
    @Column(name = "UserID")
    private String userID;

    public AttendanceDetails() {
    }

    public AttendanceDetails(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public AttendanceDetails(Integer studentNo, String studentName, String address, int telNo, String courseID, String userID) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.address = address;
        this.telNo = telNo;
        this.courseID = courseID;
        this.userID = userID;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        Integer oldStudentNo = this.studentNo;
        this.studentNo = studentNo;
        changeSupport.firePropertyChange("studentNo", oldStudentNo, studentNo);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        String oldStudentName = this.studentName;
        this.studentName = studentName;
        changeSupport.firePropertyChange("studentName", oldStudentName, studentName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public int getTelNo() {
        return telNo;
    }

    public void setTelNo(int telNo) {
        int oldTelNo = this.telNo;
        this.telNo = telNo;
        changeSupport.firePropertyChange("telNo", oldTelNo, telNo);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        String oldCourseID = this.courseID;
        this.courseID = courseID;
        changeSupport.firePropertyChange("courseID", oldCourseID, courseID);
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        String oldUserID = this.userID;
        this.userID = userID;
        changeSupport.firePropertyChange("userID", oldUserID, userID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentNo != null ? studentNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AttendanceDetails)) {
            return false;
        }
        AttendanceDetails other = (AttendanceDetails) object;
        if ((this.studentNo == null && other.studentNo != null) || (this.studentNo != null && !this.studentNo.equals(other.studentNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classmanagmentsystem.AttendanceDetails[ studentNo=" + studentNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
