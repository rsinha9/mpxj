//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.09.22 at 04:49:17 PM BST
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

@SuppressWarnings("all") public class Adapter4 extends XmlAdapter<String, Boolean>
{

   public Boolean unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseBoolean(value));
   }

   public String marshal(Boolean value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printBoolean(value));
   }

}
