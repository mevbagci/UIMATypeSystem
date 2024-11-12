

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation.paper;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Author extends Annotation {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.paper.Author";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Author.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {
        return typeIndexID;
    }


    /* *******************
     *   Feature Offsets *
     * *******************/

    public final static String _FeatName_firstname = "firstname";
    public final static String _FeatName_lastname = "lastname";
    public final static String _FeatName_value = "value";
    public final static String _FeatName_email = "email";
    public final static String _FeatName_location = "location";


    /* Feature Adjusted Offsets */
    private final static CallSite _FC_firstname = TypeSystemImpl.createCallSite(Author.class, "firstname");
    private final static MethodHandle _FH_firstname = _FC_firstname.dynamicInvoker();
    private final static CallSite _FC_lastname = TypeSystemImpl.createCallSite(Author.class, "lastname");
    private final static MethodHandle _FH_lastname = _FC_lastname.dynamicInvoker();
    private final static CallSite _FC_value = TypeSystemImpl.createCallSite(Author.class, "value");
    private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
    private final static CallSite _FC_email = TypeSystemImpl.createCallSite(Author.class, "email");
    private final static MethodHandle _FH_email = _FC_email.dynamicInvoker();
    private final static CallSite _FC_location = TypeSystemImpl.createCallSite(Author.class, "location");
    private final static MethodHandle _FH_location = _FC_location.dynamicInvoker();


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected Author() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public Author(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Author(JCas jcas) {
        super(jcas);
        readObject();
    }


    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Author(JCas jcas, int begin, int end) {
        super(jcas);
        setBegin(begin);
        setEnd(end);
        readObject();
    }

    /**
     * <!-- begin-user-doc -->
     * Write your own initialization here
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    private void readObject() {/*default - does nothing empty block */}


    //*--------------*
    //* Feature: firstname

    /**
     * getter for firstname - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getFirstname() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_firstname));
    }

    /**
     * setter for firstname - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setFirstname(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_firstname), v);
    }


    //*--------------*
    //* Feature: lastname

    /**
     * getter for lastname - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getLastname() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_lastname));
    }

    /**
     * setter for lastname - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setLastname(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_lastname), v);
    }


    //*--------------*
    //* Feature: value

    /**
     * getter for value - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getValue() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_value));
    }

    /** setter for value - sets
     * @generated
     * @param v value to set into the feature
     */
    public void setValue(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
    }


    //*--------------*
    //* Feature: email

    /**
     * getter for email - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getEmail() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_email));
    }

    /** setter for email - sets
     * @generated
     * @param v value to set into the feature
     */
    public void setEmail(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_email), v);
    }


    //*--------------*
    //* Feature: location

    /**
     * getter for location - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getLocation() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_location));
    }

    /** setter for location - sets
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocation(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_location), v);
  }    
    
  }

    