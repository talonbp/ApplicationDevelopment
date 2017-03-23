/**
 * Created by Talon on 2/22/2017.
 */
import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.GeneratedValue;

import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;

import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity

@Table(name = "app_user")
public class User {
    @Id

    @GeneratedValue

    private Integer id;

    private String uname;

    private String pword;

    private int active;

    private int manager_level;

    private String session;



    /*

     * one User can have many phone numbers.  CascadeType.ALL causes associated

     * phone numbers to be deleted when a User is deleted.

     */

    @ManyToMany(cascade=CascadeType.ALL)

    @JoinTable(

            name="user_number",

            joinColumns = { @JoinColumn( name="user_id") },

            inverseJoinColumns = @JoinColumn( name="phone_id")

    )

    private Set<PhoneNumber> phoneNumbers;

    public User() {

        this.active = 1;

        this.manager_level = 0;

        this.session = "";

    }



    @Override

    public String toString() {

        return "User{" +

                "id=" + id +

                ", uname='" + uname + '\'' +

                ", pword='" + pword + '\'' +

                ", active=" + active +

                ", manager_level=" + manager_level +

                ", session='" + session + '\'' +

                ", phoneNumbers=" + phoneNumbers +

                '}';

    }



    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getUname() {

        return uname;

    }

    public void setUname(String uname) {

        this.uname = uname;

    }

    public String getPword() {

        return pword;

    }

    public void setPword(String pword) {

        this.pword = pword;

    }

    public Set<PhoneNumber> getPhoneNumbers() {

        return phoneNumbers;

    }



    public int getManager_level() {

        return manager_level;

    }



    public void setManager_level(int manager_level) {

        this.manager_level = manager_level;

    }



    public String getSession() {

        return session;

    }



    public void setSession(String session) {

        this.session = session;

    }



    public void setActive(int anIndicator){

        this.active = anIndicator;

    }



    public int getActive(){

        return this.active;

    }

}
