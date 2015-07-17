//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.20 at 08:01:46 AM EDT 
//

/**
 * Copyright 2015 George Belden
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

package com.ciphertool.cfgreader.generated;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.ciphertool.cfgreader.generated package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.ciphertool.cfgreader.generated
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link RuleType }
	 * 
	 */
	public RuleType createRuleType() {
		return new RuleType();
	}

	/**
	 * Create an instance of {@link ExpansionType }
	 * 
	 */
	public ExpansionType createExpansionType() {
		return new ExpansionType();
	}

	/**
	 * Create an instance of {@link ProductionType }
	 * 
	 */
	public ProductionType createProductionType() {
		return new ProductionType();
	}

	/**
	 * Create an instance of {@link ContextFreeGrammar }
	 * 
	 */
	public ContextFreeGrammar createContextFreeGrammar() {
		return new ContextFreeGrammar();
	}

}
