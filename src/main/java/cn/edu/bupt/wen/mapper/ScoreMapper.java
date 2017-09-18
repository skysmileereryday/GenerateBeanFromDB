package cn.edu.bupt.wen.mapper;

import cn.edu.bupt.wen.model.Score;
import cn.edu.bupt.wen.model.ScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    int countByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    int deleteByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    int insert(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    int insertSelective(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    List<Score> selectByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);
}