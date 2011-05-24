/*
 * $Header: /home/cvs/jakarta-struts/src/share/org/apache/struts/tiles/UntyppedAttribute.java,v 1.2 2003/02/27 19:20:50 cedric Exp $
 * $Revision: 1.2 $
 * $Date: 2003/02/27 19:20:50 $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Struts", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */


package org.apache.struts.tiles;

/**
 * Common implementation of attribute definition. 
 */
public class UntyppedAttribute implements AttributeDefinition {

    /**
     * Role associated to this attribute.
     */
  protected String role;
  protected Object value;

    /**
     * Constructor.
     * @param value Object to store.
     */
  public UntyppedAttribute( Object value )
    {
    this.value = value;
    }

    /**
     * Constructor.
     * @param value Object to store.
     * @param role Asociated role.
     */
  public UntyppedAttribute( Object value, String role )
    {
    this.value = value;
    this.role = role;
    }

    /**
     * Get role.
     */
  public String getRole()
    {
    return role;
    }

    /**
     * Set role.
     * @param role Associated role.
     */
  public void setRole(String role)
    {
    this.role = role;
    }

  /**
   * Get value.
   */
  public Object getValue()
    {
    return value;
    }

  /**
   * Set value.
   * @param value New value.
   */
  public void setValue( Object value )
    {
    this.value = value;
    }
    
    /**
     * Get String representation of this object.
     */
  public String toString()
    {
    return value.toString();
    }

}