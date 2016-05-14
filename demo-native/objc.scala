package objc

import scalanative.native._, stdlib._

@extern object runtime {
  type id = Ptr[_]

  def objc_msgSend(self: id, op: Ptr[_]*): id = extern

  def sel_registerName(str: CString): Ptr[_] = extern

  def objc_getClass(name: CString): Ptr[_] = extern
}
