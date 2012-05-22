//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.20 at 08:01:46 AM EDT 
//

package com.ciphertool.cfgreader.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RuleType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Expansion" type="{}ExpansionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="non-terminal" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleType", propOrder = { "expansion" })
public class RuleType {

	@XmlElement(name = "Expansion", required = true)
	protected List<ExpansionType> expansion;
	@XmlAttribute(name = "non-terminal", required = true)
	protected String nonTerminal;

	/**
	 * Gets the value of the expansion property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the expansion property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExpansion().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ExpansionType }
	 * 
	 * 
	 */
	public List<ExpansionType> getExpansion() {
		if (expansion == null) {
			expansion = new ArrayList<ExpansionType>();
		}
		return this.expansion;
	}

	/**
	 * Gets the value of the nonTerminal property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNonTerminal() {
		return nonTerminal;
	}

	/**
	 * Sets the value of the nonTerminal property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNonTerminal(String value) {
		this.nonTerminal = value;
	}

}
