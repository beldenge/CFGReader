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
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ciphertool.cfgreader.datastructures.Node;
import com.ciphertool.cfgreader.datastructures.Tree;
import com.ciphertool.cfgreader.generated.ContextFreeGrammar;
import com.ciphertool.cfgreader.generated.ExpansionType;
import com.ciphertool.cfgreader.generated.ProductionType;
import com.ciphertool.cfgreader.generated.RuleType;

public class ContextFreeGrammarHelper {

	private static final String JAXBPackage = "com.ciphertool.cfgreader.generated";
	private ContextFreeGrammar contextFreeGrammar;

	public ContextFreeGrammarHelper(File file) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(JAXBPackage);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		contextFreeGrammar = (ContextFreeGrammar) unmarshaller.unmarshal(file);
	}

	public Tree<ProductionType> generateRandomSyntaxTree() {
		RuleType firstRule = getFirstRuleType();
		ExpansionType firstExpansion = getRandomExpansion(firstRule);
		Node<ProductionType> rootNode = expand(firstExpansion);
		ProductionType firstProduction = new ProductionType();
		firstProduction.setSymbol(firstRule.getNonTerminal());
		firstProduction.setType("NonTerminal");
		rootNode.setData(firstProduction);
		Tree<ProductionType> syntaxTree = new Tree<ProductionType>();
		syntaxTree.setRootElement(rootNode);
		return syntaxTree;
	}

	public Node<ProductionType> expand(ExpansionType expansion) {
		Node<ProductionType> productions = new Node<ProductionType>();
		for (ProductionType production : expansion.getProduction()) {
			Node<ProductionType> newChild;
			if (production.getType().equals("Terminal")) {
				newChild = new Node<ProductionType>();
				newChild.setData(production);
				productions.addChild(newChild);
			} else if (production.getType().equals("NonTerminal")) {
				newChild = expand(getRandomExpansion(getRuleByName(production.getSymbol())));
				newChild.setData(production);
				productions.addChild(newChild);
			}
		}
		return productions;
	}

	public ExpansionType getRandomExpansion(RuleType rule) {
		List<ExpansionType> expansions = rule.getExpansion();
		int randomIndex = (int) (Math.random() * expansions.size());
		return expansions.get(randomIndex);
	}

	public RuleType getFirstRuleType() {
		String firstRuleName = contextFreeGrammar.getFirstRule();
		return getRuleByName(firstRuleName);
	}

	public RuleType getRuleByName(String name) {
		for (RuleType rt : contextFreeGrammar.getRule()) {
			if (rt.getNonTerminal().equals(name))
				return rt;
		}
		return null;
	}

	public void setContextFreeGrammar(ContextFreeGrammar contextFreeGrammar) {
		this.contextFreeGrammar = contextFreeGrammar;
	}

	public String printSyntaxTree(Tree<ProductionType> syntaxTree) {
		return syntaxTree.toString();
	}
}
