/*
 * Copyright 2010-2012 Luca Garulli (l.garulli--at--orientechnologies.com)
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
package com.orientechnologies.orient.core.sql;

import java.util.Locale;

import com.orientechnologies.orient.core.command.OCommandExecutorAbstract;

/**
 * SQL abstract Command Executor implementation.
 * 
 * @author Luca Garulli
 * 
 */
public abstract class OCommandExecutorSQLAbstract extends OCommandExecutorAbstract {

  public static final String KEYWORD_FROM      = "FROM";
  public static final String KEYWORD_LET       = "LET";
  public static final String KEYWORD_WHERE     = "WHERE";
  public static final String KEYWORD_LIMIT     = "LIMIT";
  public static final String KEYWORD_SKIP      = "SKIP";
  public static final String KEYWORD_KEY       = "key";
  public static final String KEYWORD_RID       = "rid";
  public static final String CLUSTER_PREFIX    = "CLUSTER:";
  public static final String CLASS_PREFIX      = "CLASS:";
  public static final String INDEX_PREFIX      = "INDEX:";
  public static final String DICTIONARY_PREFIX = "DICTIONARY:";

  protected void throwSyntaxErrorException(final String iText) {
    throw new OCommandSQLParsingException(iText + ". Use " + getSyntax(), parserText, parserGetPreviousPosition());
  }

  protected void throwParsingException(final String iText) {
    throw new OCommandSQLParsingException(iText, parserText, parserGetPreviousPosition());
  }

  @Override
  public OCommandExecutorSQLAbstract init(String iText) {
    iText = iText.trim();
    parserTextUpperCase = iText.toUpperCase(Locale.ENGLISH);
    return (OCommandExecutorSQLAbstract) super.init(iText);
  }

  public boolean isIdempotent() {
    return false;
  }
}
