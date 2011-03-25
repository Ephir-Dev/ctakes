

/* First created by JCasGen Wed Nov 10 13:27:26 CST 2010 */
package edu.mayo.bmi.uima.libsvm.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Nov 18 10:02:32 CST 2010
 * XML source: C:/general_workspace/smoking status/desc/type_system/SmokingProductionTypeSystem.xml
 * @generated */
public class NominalAttributeValue extends AttributeValue {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NominalAttributeValue.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NominalAttributeValue() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NominalAttributeValue(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NominalAttributeValue(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NominalAttributeValue(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: nominalValue

  /** getter for nominalValue - gets 
   * @generated */
  public String getNominalValue() {
    if (NominalAttributeValue_Type.featOkTst && ((NominalAttributeValue_Type)jcasType).casFeat_nominalValue == null)
      jcasType.jcas.throwFeatMissing("nominalValue", "edu.mayo.bmi.uima.libsvm.type.NominalAttributeValue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NominalAttributeValue_Type)jcasType).casFeatCode_nominalValue);}
    
  /** setter for nominalValue - sets  
   * @generated */
  public void setNominalValue(String v) {
    if (NominalAttributeValue_Type.featOkTst && ((NominalAttributeValue_Type)jcasType).casFeat_nominalValue == null)
      jcasType.jcas.throwFeatMissing("nominalValue", "edu.mayo.bmi.uima.libsvm.type.NominalAttributeValue");
    jcasType.ll_cas.ll_setStringValue(addr, ((NominalAttributeValue_Type)jcasType).casFeatCode_nominalValue, v);}    
  }

    