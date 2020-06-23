import java.io.File;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

import jdk.nashorn.api.scripting.NashornScriptEngine;
import jdk.nashorn.api.scripting.NashornScriptEngineFactory;

public class nashhorn {

	public static void main(String[] args) {
		ScriptEngineManager mg = new ScriptEngineManager();
		ScriptEngine engine = mg.getEngineByName("nashorn");
		try {
			
//**************************			Evaluating a simple script      ************************************

//			engine.eval("function sum(a, b) { return a + b; }");
//			System.out.println(engine.eval("sum(2,1)"));
			
//**************************			Evaluating a Script File    ************************************	
			
//			System.out.println(engine.eval(new FileReader("src\\test.js")));

//**************************			Script Variables   ************************************
			
//			File f = new File("C:\\Users\\Bhushan\\Desktop\\test.txt");
	        // expose File object as variable to script
//	        engine.put("file", f);

	        // evaluate a script string. The script accesses "file"
	        // variable and calls method on it
//	        engine.eval("print(file.getName())");

//**************************		Invoking Script Functions and Methods	************************************
	
//	        engine.eval(new FileReader("src\\test.js"));
//	        Invocable invoke = (Invocable) engine;
//	        invoke.invokeFunction("hello","abhishek");

//**************************		Implementing Java Interfaces by Scripts	************************************

	        // JavaScript code in a String
//	        String script = "function run() { print('run called'); }";

	        // evaluate script
//	        engine.eval(script);

//	        Invocable inv = (Invocable) engine;

	        // get Runnable interface object from engine. This interface methods
	        // are implemented by script functions with the matching name.
//	        Runnable r = inv.getInterface(Runnable.class);

	        // start a new thread that runs the script implemented
	        // runnable interface
//	        Thread th = new Thread(r);
//	        th.start();
			
//**************************		Implementing Java Interfaces by Scripts	************************************		
			
//			 	engine.put("x", "hello");
//		        // print global variable "x"
//		        engine.eval("print(x);");
//		        // the above line prints "hello"
//
//		        // Now, pass a different script context
//		        SimpleScriptContext newContext = new SimpleScriptContext();
//		        Bindings engineScope = newContext.getBindings(ScriptContext.ENGINE_SCOPE);
//
//		        // add new variable "x" to the new engineScope
//		        engineScope.put("y", "world");
//
//		        // execute the same script - but this time pass a different script context
//		        engine.eval("print(y);", newContext);
//		        // the above line prints "world"

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static String fun1(String name) {
	    System.out.format("Hi there from Java, %s", name);
	    return "greetings from java";
	}
}
