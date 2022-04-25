package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/RepositoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u202/12323/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, December 15, 2018 7:56:49 PM PST
*/

public interface RepositoryOperations
{

  // always uninstalled.
  int registerServer (com.sun.corba.se.spi.activation.RepositoryPackage.ServerDef serverDef) throws ServerAlreadyRegistered, BadServerDefinition;

  // unregister server definition
  void unregisterServer (int serverId) throws ServerNotRegistered;

  // get server definition
  com.sun.corba.se.spi.activation.RepositoryPackage.ServerDef getServer (int serverId) throws ServerNotRegistered;

  // Return whether the server has been installed
  boolean isInstalled (int serverId) throws ServerNotRegistered;

  // if the server is currently marked as installed.
  void install (int serverId) throws ServerNotRegistered, ServerAlreadyInstalled;

  // if the server is currently marked as uninstalled.
  void uninstall (int serverId) throws ServerNotRegistered, ServerAlreadyUninstalled;

  // list registered servers
  int[] listRegisteredServers ();

  // servers.
  String[] getApplicationNames ();

  // Find the ServerID associated with the given application name.
  int getServerID (String applicationName) throws ServerNotRegistered;
} // interface RepositoryOperations
