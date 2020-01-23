
package StudentData;

/** This class represents model class for student
 *
 * @author Megha Patel
 */
public class Student {
    private int studId;
    private String name;
    private String programName;
    private int semNumber;
    private int hrsWeek;

    /**
     * @return the studId
     */
    public int getStudId() {
        return studId;
    }

    /**
     * @param studId the studId to set
     */
    public void setStudId(int studId) {
        this.studId = studId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the programName
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * @param programName the programName to set
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * @return the semNumber
     */
    public int getSemNumber() {
        return semNumber;
    }

    /**
     * @param semNumber the semNumber to set
     */
    public void setSemNumber(int semNumber) {
        this.semNumber = semNumber;
    }

    /**
     * @return the hrsWeek
     */
    public int getHrsWeek() {
        return hrsWeek;
    }

    /**
     * @param hrsWeek the hrsWeek to set
     */
    public void setHrsWeek(int hrsWeek) {
        this.hrsWeek = hrsWeek;
    }

}
