package demo

import scalanative.native._, stdlib._
import objc.runtime._

@extern object Foundation {
  def NSLog(format: Ptr[_], args: Ptr[_]*): Unit = extern
}

@extern object CoreFoundation {
  def __CFStringMakeConstantString(str: CString): Ptr[_] = extern
}

object Main {
  def main(args: Array[String]): Unit = {
    import Foundation._, CoreFoundation._

    def CFSTR(str: CString) = __CFStringMakeConstantString(str)

    NSLog(CFSTR(c"Scala %@"), CFSTR(c"Native"))
  }
}
