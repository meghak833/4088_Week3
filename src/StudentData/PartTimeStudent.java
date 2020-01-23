package StudentData;

/**
 * This class +++Insert Description Here+++
 *
 * @author Ha Neul Moon
 */
public class PartTimeStudent {
    
    private int studId;
    private String name;
    private String programName;
    private int programLength; // mth/yr[number]
    
    public PartTimeStudent(){
        
    }

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
     * @return the programLength
     */
    public int getProgramLength() {
        return programLength;
    }

    /**
     * @param programLength the programLength to set
     */
    public void setProgramLength(int programLength) {
        this.programLength = programLength;
    }

    
}
