package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ORBPortInfoListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u202/12323/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, December 15, 2018 7:56:49 PM PST
*/

public final class ORBPortInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public ORBPortInfo value[] = null;

  public ORBPortInfoListHolder ()
  {
  }

  public ORBPortInfoListHolder (ORBPortInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ORBPortInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ORBPortInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ORBPortInfoListHelper.type ();
  }

}
