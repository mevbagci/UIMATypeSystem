
/* First created by JCasGen Fri Mar 20 09:14:29 CET 2020 */
package de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** Numerals
 * Updated by JCasGen Fri Mar 20 09:14:29 CET 2020
 * @generated */
public class CARD_Type extends POS_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CARD.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.CARD");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CARD_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    