package top.sharehome.javaee.bean;

public class Major {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_major.major_id
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    private Integer majorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_major.major_name
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    private String majorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_major.major_college
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    private String majorCollege;

    public Major() {
    }

    public Major(Integer majorId, String majorName, String majorCollege) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.majorCollege = majorCollege;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "majorId=" + majorId +
                ", majorName='" + majorName + '\'' +
                ", majorCollege='" + majorCollege + '\'' +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_major.major_id
     *
     * @return the value of t_major.major_id
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    public Integer getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_major.major_id
     *
     * @param majorId the value for t_major.major_id
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_major.major_name
     *
     * @return the value of t_major.major_name
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_major.major_name
     *
     * @param majorName the value for t_major.major_name
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_major.major_college
     *
     * @return the value of t_major.major_college
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    public String getMajorCollege() {
        return majorCollege;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_major.major_college
     *
     * @param majorCollege the value for t_major.major_college
     *
     * @mbg.generated Sat Nov 05 18:10:11 CST 2022
     */
    public void setMajorCollege(String majorCollege) {
        this.majorCollege = majorCollege == null ? null : majorCollege.trim();
    }

}