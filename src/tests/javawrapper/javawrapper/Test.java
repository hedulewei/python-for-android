/**
 * XXX Why long cant take large number ?
 *   -> integer number too large: 9223372036854775807
 */
package org.javawrapper;

import java.lang.String;

public class Test {
	static public boolean methodStaticZ() { return true; };
	static public byte methodStaticB() { return 127; };
	static public char methodStaticC() { return 'k'; };
	static public short methodStaticS() { return 32767; };
	static public int methodStaticI() { return 2147483467; };
	static public long methodStaticJ() { return 2147483467; };
	static public float methodStaticF() { return 1.23456789f; };
	static public double methodStaticD() { return 1.23456789; };
	static public String methodStaticString() { return new String("helloworld"); }

	public boolean methodZ() { return true; };
	public byte methodB() { return 127; };
	public char methodC() { return 'k'; };
	public short methodS() { return 32767; };
	public int methodI() { return 2147483467; };
	public long methodJ() { return 2147483467; };
	public float methodF() { return 1.23456789f; };
	public double methodD() { return 1.23456789; };
	public String methodString() { return new String("helloworld"); }

	static public boolean fieldStaticZ = true;
	static public byte fieldStaticB = 127;
	static public char fieldStaticC = 'k';
	static public short fieldStaticS = 32767;
	static public int fieldStaticI = 2147483467;
	static public long fieldStaticJ = 2147483467;
	static public float fieldStaticF = 1.23456789f;
	static public double fieldStaticD = 1.23456789;
	static public String fieldStaticString = new String("helloworld");

	public boolean fieldZ = true;
	public byte fieldB = 127;
	public char fieldC = 'k';
	public short fieldS = 32767;
	public int fieldI = 2147483467;
	public long fieldJ = 2147483467;
	public float fieldF = 1.23456789f;
	public double fieldD = 1.23456789;
	public String fieldString = new String("helloworld");
}
