/**
 * Created by Talon on 2/10/2017.
 */
public class Player {
    private String Fname;
    private String Lname;
    private Integer age;
    private double BattAvg;
    public String BattClass;

    public void Player(){}

    public String getFname(){
       return this.Fname=Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname(){
        return this.Lname=Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public Integer getAge() {
        return this.age=age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getBattAvg() {
        return this.BattAvg=BattAvg;
    }

    public void setBattAvg(double battAvg) {
        BattAvg = battAvg;
    }
}




