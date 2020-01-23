
package StudentData;

/** This class model class for part time students
 *
 * @author Megha Patel
 */
public class ParttimeStudent {
    private int studId;
    private String name;
    private String programName;
    private int programLegnth;//in month/year[number]

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
     * @return the programLegnth
     */
    public int getProgramLegnth() {
        return programLegnth;
    }

    /**
     * @param programLegnth the programLegnth to set
     */
    public void setProgramLegnth(int programLegnth) {
        this.programLegnth = programLegnth;
    }

}
