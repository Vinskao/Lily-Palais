package Domain;
import java.text.SimpleDateFormat;
import java.util.*;
public class Bean {
    private Integer id;
    private String codeName;
    private String nameOriginal;
    private String race;
    private java.util.Date dob;
    private String attribute;
    private Integer gender;
    private String assSize;
    private String boobsSize;
    private Integer heightCm;
    private Integer weightKg;
    private String command;
    private String group;
    private String profession;
    private String combat;
    private String favoriteFoods;

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDob = (dob != null) ? dateFormat.format(dob) : null;
        return "Bean{" +
                "id=" + id +
                ", codeName='" + codeName + '\'' +
                ", nameOriginal='" + nameOriginal + '\'' +
                ", race='" + race + '\'' +
                ", dob=" + formattedDob +
                ", attribute='" + attribute + '\'' +
                ", gender=" + gender +
                ", assSize='" + assSize + '\'' +
                ", boobsSize='" + boobsSize + '\'' +
                ", heightCm=" + heightCm +
                ", weightKg=" + weightKg +
                ", command='" + command + '\'' +
                ", group='" + group + '\'' +
                ", profession='" + profession + '\'' +
                ", combat='" + combat + '\'' +
                ", favoriteFoods='" + favoriteFoods + '\'' +
                '}';
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public void setNameOriginal(String nameOriginal) {
        this.nameOriginal = nameOriginal;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setAssSize(String assSize) {
        this.assSize = assSize;
    }

    public void setBoobsSize(String boobsSize) {
        this.boobsSize = boobsSize;
    }

    public void setHeightCm(Integer heightCm) {
        this.heightCm = heightCm;
    }

    public void setWeightKg(Integer weightKg) {
        this.weightKg = weightKg;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setCombat(String combat) {
        this.combat = combat;
    }

    public void setFavoriteFoods(String favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }
}
