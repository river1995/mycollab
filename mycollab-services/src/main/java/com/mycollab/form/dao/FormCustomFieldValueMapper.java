package com.mycollab.form.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.form.domain.FormCustomFieldValueExample;
import com.mycollab.form.domain.FormCustomFieldValueWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface FormCustomFieldValueMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    long countByExample(FormCustomFieldValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    int deleteByExample(FormCustomFieldValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    int insert(FormCustomFieldValueWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    int insertSelective(FormCustomFieldValueWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    List<FormCustomFieldValueWithBLOBs> selectByExampleWithBLOBs(FormCustomFieldValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    FormCustomFieldValueWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    int updateByExampleSelective(@Param("record") FormCustomFieldValueWithBLOBs record, @Param("example") FormCustomFieldValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    int updateByExampleWithBLOBs(@Param("record") FormCustomFieldValueWithBLOBs record, @Param("example") FormCustomFieldValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    int updateByPrimaryKeySelective(FormCustomFieldValueWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    int updateByPrimaryKeyWithBLOBs(FormCustomFieldValueWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    Integer insertAndReturnKey(FormCustomFieldValueWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_custom_field_value
     *
     * @mbg.generated Fri Jun 01 14:16:26 ICT 2018
     */
    void massUpdateWithSession(@Param("record") FormCustomFieldValueWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}