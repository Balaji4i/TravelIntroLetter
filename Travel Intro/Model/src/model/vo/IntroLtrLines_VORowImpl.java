package model.vo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import model.eo.IntroLtrLines_EOImpl;
import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 12 11:25:13 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class IntroLtrLines_VORowImpl extends ViewRowImpl {


    public static final int ENTITY_INTROLTRLINES = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CreatedBy,
        CreationDate,
        DateOfBirth,
        ExpReturnDate,
        IntroLtrHdrId,
        IntroLtrLineId,
        LastUpdateDate,
        LastUpdateLogin,
        LastUpdatedBy,
        PassportEndDate,
        PassportIssueDate,
        PassportNo,
        PersonId,
        PlaceBirth,
        ProTravelDate,
        ReleationTypeCode,
        Remarks,
        Activeyn,
        Dob,
        DependentFullName,
        EmployeeFullName,
        Relation,
        Name,
        Trans_Select,
        Relationship_View_ROVO1,
        Relationship_View_Ref,
        ContactType_View_ROVO,
        RelationShip_ROVO,
        Lookup_Relationship_View_ROVO;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DATEOFBIRTH = AttributesEnum.DateOfBirth.index();
    public static final int EXPRETURNDATE = AttributesEnum.ExpReturnDate.index();
    public static final int INTROLTRHDRID = AttributesEnum.IntroLtrHdrId.index();
    public static final int INTROLTRLINEID = AttributesEnum.IntroLtrLineId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int PASSPORTENDDATE = AttributesEnum.PassportEndDate.index();
    public static final int PASSPORTISSUEDATE = AttributesEnum.PassportIssueDate.index();
    public static final int PASSPORTNO = AttributesEnum.PassportNo.index();
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int PLACEBIRTH = AttributesEnum.PlaceBirth.index();
    public static final int PROTRAVELDATE = AttributesEnum.ProTravelDate.index();
    public static final int RELEATIONTYPECODE = AttributesEnum.ReleationTypeCode.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int ACTIVEYN = AttributesEnum.Activeyn.index();
    public static final int DOB = AttributesEnum.Dob.index();
    public static final int DEPENDENTFULLNAME = AttributesEnum.DependentFullName.index();
    public static final int EMPLOYEEFULLNAME = AttributesEnum.EmployeeFullName.index();
    public static final int RELATION = AttributesEnum.Relation.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int TRANS_SELECT = AttributesEnum.Trans_Select.index();
    public static final int RELATIONSHIP_VIEW_ROVO1 = AttributesEnum.Relationship_View_ROVO1.index();
    public static final int RELATIONSHIP_VIEW_REF = AttributesEnum.Relationship_View_Ref.index();
    public static final int CONTACTTYPE_VIEW_ROVO = AttributesEnum.ContactType_View_ROVO.index();
    public static final int RELATIONSHIP_ROVO = AttributesEnum.RelationShip_ROVO.index();
    public static final int LOOKUP_RELATIONSHIP_VIEW_ROVO = AttributesEnum.Lookup_Relationship_View_ROVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public IntroLtrLines_VORowImpl() {
    }

    /**
     * Gets IntroLtrLines entity object.
     * @return the IntroLtrLines
     */
    public IntroLtrLines_EOImpl getIntroLtrLines() {
        return (IntroLtrLines_EOImpl) getEntity(ENTITY_INTROLTRLINES);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for DATE_OF_BIRTH using the alias name DateOfBirth.
     * @return the DATE_OF_BIRTH
     */
    public Timestamp getDateOfBirth() {
        return (Timestamp) getAttributeInternal(DATEOFBIRTH);
    }

    /**
     * Sets <code>value</code> as attribute value for DATE_OF_BIRTH using the alias name DateOfBirth.
     * @param value value to set the DATE_OF_BIRTH
     */
    public void setDateOfBirth(Timestamp value) {
        setAttributeInternal(DATEOFBIRTH, value);
    }

    /**
     * Gets the attribute value for EXP_RETURN_DATE using the alias name ExpReturnDate.
     * @return the EXP_RETURN_DATE
     */
    public Timestamp getExpReturnDate() {
        return (Timestamp) getAttributeInternal(EXPRETURNDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for EXP_RETURN_DATE using the alias name ExpReturnDate.
     * @param value value to set the EXP_RETURN_DATE
     */
    public void setExpReturnDate(Timestamp value) {
        setAttributeInternal(EXPRETURNDATE, value);
    }

    /**
     * Gets the attribute value for INTRO_LTR_HDR_ID using the alias name IntroLtrHdrId.
     * @return the INTRO_LTR_HDR_ID
     */
    public BigDecimal getIntroLtrHdrId() {
        return (BigDecimal) getAttributeInternal(INTROLTRHDRID);
    }

    /**
     * Sets <code>value</code> as attribute value for INTRO_LTR_HDR_ID using the alias name IntroLtrHdrId.
     * @param value value to set the INTRO_LTR_HDR_ID
     */
    public void setIntroLtrHdrId(BigDecimal value) {
        setAttributeInternal(INTROLTRHDRID, value);
    }

    /**
     * Gets the attribute value for INTRO_LTR_LINE_ID using the alias name IntroLtrLineId.
     * @return the INTRO_LTR_LINE_ID
     */
    public BigDecimal getIntroLtrLineId() {
        return (BigDecimal) getAttributeInternal(INTROLTRLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for INTRO_LTR_LINE_ID using the alias name IntroLtrLineId.
     * @param value value to set the INTRO_LTR_LINE_ID
     */
    public void setIntroLtrLineId(BigDecimal value) {
        setAttributeInternal(INTROLTRLINEID, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for PASSPORT_END_DATE using the alias name PassportEndDate.
     * @return the PASSPORT_END_DATE
     */
    public Timestamp getPassportEndDate() {
        return (Timestamp) getAttributeInternal(PASSPORTENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSPORT_END_DATE using the alias name PassportEndDate.
     * @param value value to set the PASSPORT_END_DATE
     */
    public void setPassportEndDate(Timestamp value) {
        setAttributeInternal(PASSPORTENDDATE, value);
    }

    /**
     * Gets the attribute value for PASSPORT_ISSUE_DATE using the alias name PassportIssueDate.
     * @return the PASSPORT_ISSUE_DATE
     */
    public Timestamp getPassportIssueDate() {
        return (Timestamp) getAttributeInternal(PASSPORTISSUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSPORT_ISSUE_DATE using the alias name PassportIssueDate.
     * @param value value to set the PASSPORT_ISSUE_DATE
     */
    public void setPassportIssueDate(Timestamp value) {
        setAttributeInternal(PASSPORTISSUEDATE, value);
    }

    /**
     * Gets the attribute value for PASSPORT_NO using the alias name PassportNo.
     * @return the PASSPORT_NO
     */
    public String getPassportNo() {
        return (String) getAttributeInternal(PASSPORTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSPORT_NO using the alias name PassportNo.
     * @param value value to set the PASSPORT_NO
     */
    public void setPassportNo(String value) {
        setAttributeInternal(PASSPORTNO, value);
    }

    /**
     * Gets the attribute value for PERSON_ID using the alias name PersonId.
     * @return the PERSON_ID
     */
    public BigDecimal getPersonId() {
        return (BigDecimal) getAttributeInternal(PERSONID);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_ID using the alias name PersonId.
     * @param value value to set the PERSON_ID
     */
    public void setPersonId(BigDecimal value) {
        setAttributeInternal(PERSONID, value);
    }

    /**
     * Gets the attribute value for PLACE_BIRTH using the alias name PlaceBirth.
     * @return the PLACE_BIRTH
     */
    public String getPlaceBirth() {
        return (String) getAttributeInternal(PLACEBIRTH);
    }

    /**
     * Sets <code>value</code> as attribute value for PLACE_BIRTH using the alias name PlaceBirth.
     * @param value value to set the PLACE_BIRTH
     */
    public void setPlaceBirth(String value) {
        setAttributeInternal(PLACEBIRTH, value);
    }

    /**
     * Gets the attribute value for PRO_TRAVEL_DATE using the alias name ProTravelDate.
     * @return the PRO_TRAVEL_DATE
     */
    public Timestamp getProTravelDate() {
        return (Timestamp) getAttributeInternal(PROTRAVELDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for PRO_TRAVEL_DATE using the alias name ProTravelDate.
     * @param value value to set the PRO_TRAVEL_DATE
     */
    public void setProTravelDate(Timestamp value) {
        setAttributeInternal(PROTRAVELDATE, value);
    }

    /**
     * Gets the attribute value for RELEATION_TYPE_CODE using the alias name ReleationTypeCode.
     * @return the RELEATION_TYPE_CODE
     */
    public String getReleationTypeCode() {
        return (String) getAttributeInternal(RELEATIONTYPECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for RELEATION_TYPE_CODE using the alias name ReleationTypeCode.
     * @param value value to set the RELEATION_TYPE_CODE
     */
    public void setReleationTypeCode(String value) {
        setAttributeInternal(RELEATIONTYPECODE, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }


    /**
     * Gets the attribute value for the calculated attribute DependentFullName.
     * @return the DependentFullName
     */
    public String getDependentFullName() {
        return (String) getAttributeInternal(DEPENDENTFULLNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DependentFullName.
     * @param value value to set the  DependentFullName
     */
    public void setDependentFullName(String value) {
        setAttributeInternal(DEPENDENTFULLNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeFullName.
     * @return the EmployeeFullName
     */
    public String getEmployeeFullName() {
        return (String) getAttributeInternal(EMPLOYEEFULLNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EmployeeFullName.
     * @param value value to set the  EmployeeFullName
     */
    public void setEmployeeFullName(String value) {
        setAttributeInternal(EMPLOYEEFULLNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Relation.
     * @return the Relation
     */
    public String getRelation() {
        return (String) getAttributeInternal(RELATION);
    }

    /**
     * Gets the attribute value for the calculated attribute Name.
     * @return the Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Gets the attribute value for the calculated attribute Trans_Select.
     * @return the Trans_Select
     */
    public Boolean getTrans_Select() {
        String primaryYn = getActiveyn();
                if ("Y".equals(primaryYn)) {
                    return true;
                } else {
                    return false;
                }
       // return (Boolean) getAttributeInternal(TRANS_SELECT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_Select.
     * @param value value to set the  Trans_Select
     */
    public void setTrans_Select(Boolean value) {
        if (value) {
                    setAttributeInternal(ACTIVEYN, "Y");
                } else {
                    setAttributeInternal(ACTIVEYN, "N");
                }
       // setAttributeInternal(TRANS_SELECT, value);
    }

    /**
     * Gets the attribute value for ACTIVEYN using the alias name Activeyn.
     * @return the ACTIVEYN
     */
    public String getActiveyn() {
        
        return (String) getAttributeInternal(ACTIVEYN);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVEYN using the alias name Activeyn.
     * @param value value to set the ACTIVEYN
     */
    public void setActiveyn(String value) {
        setAttributeInternal(ACTIVEYN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Dob.
     * @return the Dob
     */
    public String getDob() {
        return (String) getAttributeInternal(DOB);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Relationship_View_ROVO1.
     */
    public RowSet getRelationship_View_ROVO1() {
        return (RowSet) getAttributeInternal(RELATIONSHIP_VIEW_ROVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Relationship_View_Ref.
     */
    public RowSet getRelationship_View_Ref() {
        return (RowSet) getAttributeInternal(RELATIONSHIP_VIEW_REF);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ContactType_View_ROVO.
     */
    public RowSet getContactType_View_ROVO() {
        return (RowSet) getAttributeInternal(CONTACTTYPE_VIEW_ROVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RelationShip_ROVO.
     */
    public RowSet getRelationShip_ROVO() {
        return (RowSet) getAttributeInternal(RELATIONSHIP_ROVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Lookup_Relationship_View_ROVO.
     */
    public RowSet getLookup_Relationship_View_ROVO() {
        return (RowSet) getAttributeInternal(LOOKUP_RELATIONSHIP_VIEW_ROVO);
    }
}
