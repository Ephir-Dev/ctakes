

/* First created by JCasGen Thu Jan 19 17:46:26 EST 2012 */
package edu.mayo.bmi.uima.core.type.relation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Jan 20 10:31:38 EST 2012
 * XML source: C:/Users/CH150124/workspace_SHARPn/common-type-system/desc/common_type_system.xml
 * @generated */
public class Relation extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Relation.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Relation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Relation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Relation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated */
  public int getId() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.mayo.bmi.uima.core.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated */
  public void setId(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.mayo.bmi.uima.core.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: category

  /** getter for category - gets 
   * @generated */
  public String getCategory() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "edu.mayo.bmi.uima.core.type.relation.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets  
   * @generated */
  public void setCategory(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "edu.mayo.bmi.uima.core.type.relation.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_category, v);}    
   
    
  //*--------------*
  //* Feature: discoveryTechnique

  /** getter for discoveryTechnique - gets 
   * @generated */
  public String getDiscoveryTechnique() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "edu.mayo.bmi.uima.core.type.relation.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_discoveryTechnique);}
    
  /** setter for discoveryTechnique - sets  
   * @generated */
  public void setDiscoveryTechnique(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "edu.mayo.bmi.uima.core.type.relation.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_discoveryTechnique, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.mayo.bmi.uima.core.type.relation.Relation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Relation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.mayo.bmi.uima.core.type.relation.Relation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Relation_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated */
  public int getPolarity() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "edu.mayo.bmi.uima.core.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated */
  public void setPolarity(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "edu.mayo.bmi.uima.core.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: uncertainty

  /** getter for uncertainty - gets 
   * @generated */
  public String getUncertainty() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "edu.mayo.bmi.uima.core.type.relation.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_uncertainty);}
    
  /** setter for uncertainty - sets  
   * @generated */
  public void setUncertainty(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "edu.mayo.bmi.uima.core.type.relation.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_uncertainty, v);}    
  }

    