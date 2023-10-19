/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitypackage;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "MEALS")
@NamedQueries({
    @NamedQuery(name = "Meals.findAll", query = "SELECT m FROM Meals m"),
    @NamedQuery(name = "Meals.findByMealid", query = "SELECT m FROM Meals m WHERE m.mealid = :mealid"),
    @NamedQuery(name = "Meals.findByStrmeal", query = "SELECT m FROM Meals m WHERE m.strmeal = :strmeal"),
    @NamedQuery(name = "Meals.findByStrcategory", query = "SELECT m FROM Meals m WHERE m.strcategory = :strcategory"),
    @NamedQuery(name = "Meals.findByStrarea", query = "SELECT m FROM Meals m WHERE m.strarea = :strarea"),
    @NamedQuery(name = "Meals.findByStrinstructions", query = "SELECT m FROM Meals m WHERE m.strinstructions = :strinstructions"),
    @NamedQuery(name = "Meals.findByMealprojections", query = "SELECT m FROM Meals m WHERE m.mealprojections = :mealprojections")})
public class Meals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MEALID")
    private Integer mealid;
    @Column(name = "STRMEAL")
    private String strmeal;
    @Column(name = "STRCATEGORY")
    private String strcategory;
    @Column(name = "STRAREA")
    private String strarea;
    @Column(name = "STRINSTRUCTIONS")
    private String strinstructions;
    @Column(name = "MEALPROJECTIONS")
    private Integer mealprojections;

    // Κάθε φορά που εμφανίζεται ένα γεύμα 
    //που είναι ήδη καταχωρημένο
    // αυξάνουμε την τιμή της mealprojections
    // την πληροφορία αυτή την χρησιμοποιούμε στην απάιτηση R4
    // κατά την παρουσίαση των στατιστικών στοιχείων
    public void addProjections(){
        mealprojections += 1;
    }
    
    public Meals() {
    }

    public Meals(Integer mealid) {
        this.mealid = mealid;
    }

    public Integer getMealid() {
        return mealid;
    }

    public void setMealid(Integer mealid) {
        this.mealid = mealid;
    }

    public String getStrmeal() {
        return strmeal;
    }

    public void setStrmeal(String strmeal) {
        this.strmeal = strmeal;
    }

    public String getStrcategory() {
        return strcategory;
    }

    public void setStrcategory(String strcategory) {
        this.strcategory = strcategory;
    }

    public String getStrarea() {
        return strarea;
    }

    public void setStrarea(String strarea) {
        this.strarea = strarea;
    }

    public String getStrinstructions() {
        return strinstructions;
    }

    public void setStrinstructions(String strinstructions) {
        this.strinstructions = strinstructions;
    }

    public Integer getMealprojections() {
        return mealprojections;
    }

    public void setMealprojections(Integer mealprojections) {
        this.mealprojections = mealprojections;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mealid != null ? mealid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meals)) {
            return false;
        }
        Meals other = (Meals) object;
        if ((this.mealid == null && other.mealid != null) || (this.mealid != null && !this.mealid.equals(other.mealid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitypackage.Meals[ mealid=" + mealid + " ]";
    }
    
}
