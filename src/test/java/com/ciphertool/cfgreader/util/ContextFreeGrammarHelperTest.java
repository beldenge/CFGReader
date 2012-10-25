/**
 * Copyright 2012 George Belden
 * 
 * This file is part of CFGReader.
 * 
 * CFGReader is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * CFGReader is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * CFGReader. If not, see <http://www.gnu.org/licenses/>.
 */

package com.ciphertool.cfgreader.util;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ciphertool.cfgreader.datastructures.Tree;
import com.ciphertool.cfgreader.generated.ProductionType;

public class ContextFreeGrammarHelperTest {

	static Logger log = Logger.getLogger(ContextFreeGrammarHelperTest.class);
	ContextFreeGrammarHelper cfgHelper;

	@Before
	public void setUp() throws Exception {
		File grammarFile = new File("src\\data\\xml\\EnglishSentenceCFG.xml");
		cfgHelper = new ContextFreeGrammarHelper(grammarFile);
	}

	@Test
	public void testGenerateRandomSyntaxTree() throws JAXBException {
		Tree<ProductionType> syntaxTree = cfgHelper.generateRandomSyntaxTree();
		log.info(syntaxTree.toString());
	}
}