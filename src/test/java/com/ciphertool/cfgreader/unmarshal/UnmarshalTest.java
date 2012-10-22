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
		ContextFreeGrammar cfg = (ContextFreeGrammar) unmarshaller.unmarshal(new File(
				"src\\data\\xml\\EnglishSentenceCFG.xml"));
		assertEquals("Sentence", cfg.getFirstRule());
		RuleType rt = cfg.getRule().get(0);
		assertEquals("Sentence", rt.getNonTerminal());
	}
}