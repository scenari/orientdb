/*
 *
 * Copyright 2012 Luca Molino (molino.luca--AT--gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.orientechnologies.orient.test.domain.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.Version;

import com.orientechnologies.orient.core.record.impl.ODocument;
import com.orientechnologies.orient.core.record.impl.ORecordBytes;
import com.orientechnologies.orient.test.domain.business.Child;

/**
 * @author luca.molino
 * 
 */
public class JavaComplexTestClass {
	@Id
	private String								id;
	@Version
	private Object								version;

	@Embedded
	private ODocument							embeddedDocument;
	private ODocument							document;
	private ORecordBytes					byteArray;
	private String								name;
	private Map<String, Child>		children	= new HashMap<String, Child>();
	private List<EnumTest>				enumList	= new ArrayList<EnumTest>();
	private Set<EnumTest>					enumSet		= new HashSet<EnumTest>();
	private Map<String, EnumTest>	enumMap		= new HashMap<String, EnumTest>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Child> getChildren() {
		return children;
	}

	public void setChildren(Map<String, Child> children) {
		this.children = children;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getVersion() {
		return version;
	}

	public void setVersion(Object version) {
		this.version = version;
	}

	public List<EnumTest> getEnumList() {
		return enumList;
	}

	public void setEnumList(List<EnumTest> enumList) {
		this.enumList = enumList;
	}

	public Map<String, EnumTest> getEnumMap() {
		return enumMap;
	}

	public void setEnumMap(Map<String, EnumTest> enumMap) {
		this.enumMap = enumMap;
	}

	public Set<EnumTest> getEnumSet() {
		return enumSet;
	}

	public void setEnumSet(Set<EnumTest> enumSet) {
		this.enumSet = enumSet;
	}

	public ODocument getEmbeddedDocument() {
		return embeddedDocument;
	}

	public void setEmbeddedDocument(ODocument embeddedDocument) {
		this.embeddedDocument = embeddedDocument;
	}

	public ORecordBytes getByteArray() {
		return byteArray;
	}

	public void setByteArray(ORecordBytes byteArray) {
		this.byteArray = byteArray;
	}

	public ODocument getDocument() {
		return document;
	}

	public void setDocument(ODocument document) {
		this.document = document;
	}
}