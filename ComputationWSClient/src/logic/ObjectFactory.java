
package logic;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the logic package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: logic
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Febonacci }
	 * 
	 */
	public Febonacci createFebonacci() {
		return new Febonacci();
	}

	/**
	 * Create an instance of {@link FebonacciResponse }
	 * 
	 */
	public FebonacciResponse createFebonacciResponse() {
		return new FebonacciResponse();
	}

	/**
	 * Create an instance of {@link TanFunction }
	 * 
	 */
	public TanFunction createTanFunction() {
		return new TanFunction();
	}

	/**
	 * Create an instance of {@link TanFunctionResponse }
	 * 
	 */
	public TanFunctionResponse createTanFunctionResponse() {
		return new TanFunctionResponse();
	}

	/**
	 * Create an instance of {@link Multiply }
	 * 
	 */
	public Multiply createMultiply() {
		return new Multiply();
	}

	/**
	 * Create an instance of {@link MultiplyResponse }
	 * 
	 */
	public MultiplyResponse createMultiplyResponse() {
		return new MultiplyResponse();
	}

}
