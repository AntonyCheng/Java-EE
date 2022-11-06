package top.sharehome.javaee.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.sharehome.javaee.bean.Student;
import top.sharehome.javaee.bean.StudentExample;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int deleteByPrimaryKey(Integer studentOne);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    Student selectByPrimaryKey(Integer studentOne);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    int updateByPrimaryKey(Student record);
}