package Obj7_UseExtendsImplements;

import java.awt.*;

/**
 * Created by Ki on 11/30/2016.
 */
class Foo {}
//class Bar implements Foo{}            // No  class can NOT implements class
interface Baz{}
interface Fi{}
//interface Fee implements Baz{}        // interface can NOT implements interface
//interface Zee implements Foo{}        // interface can NOT implements class
//interface Zoo extends Foo {}          // interface can NOT extends class
interface Boo extends Fi{}              // interface can extends interface
//class Toon extends Foo, Button{}      // class can NOT extends multiple class
class Zoom implements Fi, Baz{}         // class can implements multiple interfaces
interface Vroom extends Fi, Baz{}       // interface can extends multiple interfaces
class Yow1 extends Foo implements Fi{}   // class can extends (1st) class and implements interfaces
class Yow extends Foo implements Fi, Baz{}  // class can extends(1st) class and implements multiple interfaces



