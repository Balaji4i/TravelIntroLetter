package model.vo;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 18 16:50:52 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class IntroLtrHdr_VOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public IntroLtrHdr_VOImpl() {
    }

    /**
     * Returns the variable value for BV_Id.
     * @return variable value for BV_Id
     */
    public BigDecimal getBV_Id() {
        return (BigDecimal) ensureVariableManager().getVariableValue("BV_Id");
    }

    /**
     * Sets <code>value</code> for variable BV_Id.
     * @param value value to bind as BV_Id
     */
    public void setBV_Id(BigDecimal value) {
        ensureVariableManager().setVariableValue("BV_Id", value);
    }

    /**
     * Returns the variable value for pPersonId.
     * @return variable value for pPersonId
     */
    public BigDecimal getpPersonId() {
        return (BigDecimal) ensureVariableManager().getVariableValue("pPersonId");
    }

    /**
     * Sets <code>value</code> for variable pPersonId.
     * @param value value to bind as pPersonId
     */
    public void setpPersonId(BigDecimal value) {
        ensureVariableManager().setVariableValue("pPersonId", value);
    }

    /**
     * Returns the bind variable value for b_username.
     * @return bind variable value for b_username
     */
    public String getb_username() {
        return (String) getNamedWhereClauseParam("b_username");
    }

    /**
     * Sets <code>value</code> for bind variable b_username.
     * @param value value to bind as b_username
     */
    public void setb_username(String value) {
        setNamedWhereClauseParam("b_username", value);
    }
}

