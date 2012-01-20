
/* First created by JCasGen Thu Jan 19 17:46:26 EST 2012 */
package edu.mayo.bmi.uima.core.type.relation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** A UMLS relation between an attribute and an entity/event.
 * Updated by JCasGen Fri Jan 20 10:31:37 EST 2012
 * @generated */
public class DegreeOf_Type extends AttributeRelation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DegreeOf_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DegreeOf_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DegreeOf(addr, DegreeOf_Type.this);
  			   DegreeOf_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DegreeOf(addr, DegreeOf_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = DegreeOf.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.mayo.bmi.uima.core.type.relation.DegreeOf");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DegreeOf_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    