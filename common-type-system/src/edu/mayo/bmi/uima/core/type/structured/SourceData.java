

/* First created by JCasGen Thu Jan 19 17:46:27 EST 2012 */
package edu.mayo.bmi.uima.core.type.structured;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Jan 20 10:31:43 EST 2012
 * XML source: C:/Users/CH150124/workspace_SHARPn/common-type-system/desc/common_type_system.xml
 * @generated */
public class SourceData extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(SourceData.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SourceData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SourceData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SourceData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: noteTypeCode

  /** getter for noteTypeCode - gets 
   * @generated */
  public String getNoteTypeCode() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_noteTypeCode == null)
      jcasType.jcas.throwFeatMissing("noteTypeCode", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_noteTypeCode);}
    
  /** setter for noteTypeCode - sets  
   * @generated */
  public void setNoteTypeCode(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_noteTypeCode == null)
      jcasType.jcas.throwFeatMissing("noteTypeCode", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_noteTypeCode, v);}    
   
    
  //*--------------*
  //* Feature: noteSubTypeCode

  /** getter for noteSubTypeCode - gets 
   * @generated */
  public String getNoteSubTypeCode() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_noteSubTypeCode == null)
      jcasType.jcas.throwFeatMissing("noteSubTypeCode", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_noteSubTypeCode);}
    
  /** setter for noteSubTypeCode - sets  
   * @generated */
  public void setNoteSubTypeCode(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_noteSubTypeCode == null)
      jcasType.jcas.throwFeatMissing("noteSubTypeCode", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_noteSubTypeCode, v);}    
   
    
  //*--------------*
  //* Feature: authorSpecialty

  /** getter for authorSpecialty - gets 
   * @generated */
  public String getAuthorSpecialty() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_authorSpecialty == null)
      jcasType.jcas.throwFeatMissing("authorSpecialty", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_authorSpecialty);}
    
  /** setter for authorSpecialty - sets  
   * @generated */
  public void setAuthorSpecialty(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_authorSpecialty == null)
      jcasType.jcas.throwFeatMissing("authorSpecialty", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_authorSpecialty, v);}    
   
    
  //*--------------*
  //* Feature: documentStandard

  /** getter for documentStandard - gets 
   * @generated */
  public String getDocumentStandard() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_documentStandard == null)
      jcasType.jcas.throwFeatMissing("documentStandard", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_documentStandard);}
    
  /** setter for documentStandard - sets  
   * @generated */
  public void setDocumentStandard(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_documentStandard == null)
      jcasType.jcas.throwFeatMissing("documentStandard", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_documentStandard, v);}    
   
    
  //*--------------*
  //* Feature: sourceInstanceId

  /** getter for sourceInstanceId - gets 
   * @generated */
  public String getSourceInstanceId() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceInstanceId == null)
      jcasType.jcas.throwFeatMissing("sourceInstanceId", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceInstanceId);}
    
  /** setter for sourceInstanceId - sets  
   * @generated */
  public void setSourceInstanceId(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceInstanceId == null)
      jcasType.jcas.throwFeatMissing("sourceInstanceId", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceInstanceId, v);}    
   
    
  //*--------------*
  //* Feature: sourceRevisionNbr

  /** getter for sourceRevisionNbr - gets 
   * @generated */
  public int getSourceRevisionNbr() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceRevisionNbr == null)
      jcasType.jcas.throwFeatMissing("sourceRevisionNbr", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceRevisionNbr);}
    
  /** setter for sourceRevisionNbr - sets  
   * @generated */
  public void setSourceRevisionNbr(int v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceRevisionNbr == null)
      jcasType.jcas.throwFeatMissing("sourceRevisionNbr", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setIntValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceRevisionNbr, v);}    
   
    
  //*--------------*
  //* Feature: sourceRevisionDate

  /** getter for sourceRevisionDate - gets 
   * @generated */
  public String getSourceRevisionDate() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceRevisionDate == null)
      jcasType.jcas.throwFeatMissing("sourceRevisionDate", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceRevisionDate);}
    
  /** setter for sourceRevisionDate - sets  
   * @generated */
  public void setSourceRevisionDate(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceRevisionDate == null)
      jcasType.jcas.throwFeatMissing("sourceRevisionDate", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceRevisionDate, v);}    
   
    
  //*--------------*
  //* Feature: sourceOriginalDate

  /** getter for sourceOriginalDate - gets 
   * @generated */
  public String getSourceOriginalDate() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceOriginalDate == null)
      jcasType.jcas.throwFeatMissing("sourceOriginalDate", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceOriginalDate);}
    
  /** setter for sourceOriginalDate - sets  
   * @generated */
  public void setSourceOriginalDate(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceOriginalDate == null)
      jcasType.jcas.throwFeatMissing("sourceOriginalDate", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceOriginalDate, v);}    
   
    
  //*--------------*
  //* Feature: sourceInstitution

  /** getter for sourceInstitution - gets 
   * @generated */
  public String getSourceInstitution() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceInstitution == null)
      jcasType.jcas.throwFeatMissing("sourceInstitution", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceInstitution);}
    
  /** setter for sourceInstitution - sets  
   * @generated */
  public void setSourceInstitution(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceInstitution == null)
      jcasType.jcas.throwFeatMissing("sourceInstitution", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceInstitution, v);}    
   
    
  //*--------------*
  //* Feature: sourceEncounterId

  /** getter for sourceEncounterId - gets 
   * @generated */
  public String getSourceEncounterId() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceEncounterId == null)
      jcasType.jcas.throwFeatMissing("sourceEncounterId", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceEncounterId);}
    
  /** setter for sourceEncounterId - sets  
   * @generated */
  public void setSourceEncounterId(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceEncounterId == null)
      jcasType.jcas.throwFeatMissing("sourceEncounterId", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceEncounterId, v);}    
   
    
  //*--------------*
  //* Feature: sourceApplication

  /** getter for sourceApplication - gets 
   * @generated */
  public String getSourceApplication() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceApplication == null)
      jcasType.jcas.throwFeatMissing("sourceApplication", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceApplication);}
    
  /** setter for sourceApplication - sets  
   * @generated */
  public void setSourceApplication(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceApplication == null)
      jcasType.jcas.throwFeatMissing("sourceApplication", "edu.mayo.bmi.uima.core.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceApplication, v);}    
  }

    