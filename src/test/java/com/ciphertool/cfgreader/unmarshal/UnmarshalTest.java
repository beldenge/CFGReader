package com.ciphertool.cfgreader.unmarshal;


import static org.junit.Assert.assertEquals;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Before;
import org.junit.Test;

import com.ciphertool.cfgreader.generated.ContextFreeGrammar;
import com.ciphertool.cfgreader.generated.RuleType;

public class UnmarshalTest {

	private static Unmarshaller unmarshaller;
	
	@Before
	public void setUp() throws Exception {
		JAXBContext jc = JAXBContext.newInstance("com.ciphertool.cfgreader.generated");
		unmarshaller = jc.createUnmarshaller();
	}
	
	@Test
	public void testUnmarshal() throws JAXBException {
		ContextFreeGrammar cfg = (ContextFreeGrammar) unmarshaller.unmarshal(new File("src\\data\\xml\\EnglishSentenceCFG.xml"));
		assertEquals("Sentence", cfg.getFirstRule());
		RuleType rt = cfg.getRule().get(0);
		assertEquals("Sentence", rt.getNonTerminal());
	}
}