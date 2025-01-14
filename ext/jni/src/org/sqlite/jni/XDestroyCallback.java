/*
** 2023-07-21
**
** The author disclaims copyright to this source code.  In place of
** a legal notice, here is a blessing:
**
**    May you do good and not evil.
**    May you find forgiveness for yourself and forgive others.
**    May you share freely, never taking more than you give.
**
*************************************************************************
** This file declares JNI bindings for the sqlite3 C API.
*/
package org.sqlite.jni;

/**
   Callback for a hook called by SQLite when certain client-provided
   state are destroyed. It gets its name from the pervasive use of
   the symbol name xDestroy() for this purpose in the C API
   documentation.
*/
public interface XDestroyCallback {
  /**
     Must perform any cleanup required by this object. Must not
     throw.
  */
  public void xDestroy();
}
