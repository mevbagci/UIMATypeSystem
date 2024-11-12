

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation.type;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.AnnotationBase;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Coordinate extends AnnotationBase {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.type.Coordinate";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Coordinate.class);
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

    public final static String _FeatName_x = "x";
    public final static String _FeatName_y = "y";


    /* Feature Adjusted Offsets */
    private final static CallSite _FC_x = TypeSystemImpl.createCallSite(Coordinate.class, "x");
    private final static MethodHandle _FH_x = _FC_x.dynamicInvoker();
    private final static CallSite _FC_y = TypeSystemImpl.createCallSite(Coordinate.class, "y");
    private final static MethodHandle _FH_y = _FC_y.dynamicInvoker();


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected Coordinate() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public Coordinate(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Coordinate(JCas jcas) {
        super(jcas);
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
    //* Feature: x

    /**
     * getter for x - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getX() {
        return _getIntValueNc(wrapGetIntCatchException(_FH_x));
    }

    /**
     * setter for x - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setX(int v) {
        _setIntValueNfc(wrapGetIntCatchException(_FH_x), v);
    }


    //*--------------*
    //* Feature: y

    /**
     * getter for y - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getY() {
        return _getIntValueNc(wrapGetIntCatchException(_FH_y));
    }

    /** setter for y - sets
     * @generated
     * @param v value to set into the feature
   */
  public void setY(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_y), v);
  }    
    
  }

    