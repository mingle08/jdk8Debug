package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ORBProxyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u202/12323/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Saturday, December 15, 2018 7:56:49 PM PST
*/


/** ORB callback interface, passed to Activator in registerORB method.
    */
public final class ORBProxyHolder implements org.omg.CORBA.portable.Streamable
{
  public ORBProxy value = null;

  public ORBProxyHolder ()
  {
  }

  public ORBProxyHolder (ORBProxy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ORBProxyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ORBProxyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ORBProxyHelper.type ();
  }

}
