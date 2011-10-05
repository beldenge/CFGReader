package com.ciphertool.cfgreader.util;
import java.io.File;

import javax.xml.bind.JAXBException;

import org.junit.Before;
import org.junit.Test;

import com.ciphertool.cfgreader.datastructures.Tree;
import com.ciphertool.cfgreader.generated.ProductionType;

public class ContextFreeGrammarHelperTest {
	
	ContextFreeGrammarHelper cfgHelper;
	
	@Before
	public void setUp() throws Exception {
		File grammarFile = new File("src\\data\\xml\\EnglishSentenceCFG.xml");
		cfgHelper = new ContextFreeGrammarHelper(grammarFile);
	}
	
	@Test
	public void testGenerateRandomSyntaxTree() throws JAXBException {
		Tree<ProductionType> syntaxTree = cfgHelper.generateRandomSyntaxTree();
		System.out.println(syntaxTree.toString());
	}
}